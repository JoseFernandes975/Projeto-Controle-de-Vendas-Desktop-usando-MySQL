
package br.com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import br.com.project.JDBC.ConnectionFactory;
import br.com.project.model.Client;
import br.com.project.model.Sales;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SaleDAO {
    
    private Connection conn;
    
    public SaleDAO(){
        this.conn = new ConnectionFactory().getConnection();
    }
    
    public void insertSales(Sales obj){
        PreparedStatement st = null;
        try{
            st = conn.prepareStatement("INSERT INTO tb_vendas (Cliente_id, Data_venda, Total_venda, Observacoes) VALUES "
                    + "(?, ?, ?, ?)");
            
            st.setInt(1, obj.getClient().getId());
            st.setString(2, obj.getDate_sales());
            st.setDouble(3, obj.getTotal_sales());
            st.setString(4, obj.getObs());
            
            st.execute();
            st.close();
            
            JOptionPane.showMessageDialog(null, "Venda registrada!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error sales: "+e.getMessage());
        }
    }
    
    public int returnLastSale(){
        PreparedStatement st = null;
        ResultSet rs = null;
        int lastIdSale = 0;
        try{
            st = conn.prepareStatement("SELECT MAX(id)id FROM tb_vendas");
            
            rs = st.executeQuery();
            
            if(rs.next()){
                Sales s = new Sales();
                s.setId(rs.getInt("Id"));
                lastIdSale = s.getId();
            }
            
            return lastIdSale;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lastIdSale;
    }
    
    public void deleteSale(Sales obj){
        PreparedStatement st = null;
        try{
            st = conn.prepareStatement("DELETE FROM tb_vendas WHERE Id = ?");
            
            st.setInt(1, obj.getId());
            
            st.execute();
            st.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public List<Sales> ListSalesByPeriod(LocalDate data_begin,LocalDate data_final){
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Sales> list = new ArrayList();
        try{
            st = conn.prepareStatement("SELECT v.Id , date_format(v.Data_venda,'%d/%m/%Y') as data_formatada, c.Nome, v.Total_venda, v.Observacoes"
                    + " FROM tb_vendas AS v INNER JOIN tb_clientes AS c ON (v.Cliente_id = c.Id) "
                      + "WHERE v.Data_venda BETWEEN ? AND ?");
            
              st.setString(1, data_begin.toString());
              st.setString(2, data_final.toString());
              
              rs = st.executeQuery();
             
              while(rs.next()){
                  Sales sale = new Sales();
                  Client c =  new Client();
                  sale.setId(rs.getInt("v.Id"));
                  sale.setDate_sales(rs.getString("data_formatada"));
                  c.setName(rs.getString("c.Nome"));
                  sale.setTotal_sales(rs.getDouble("v.Total_venda"));
                  sale.setObs(rs.getString("v.Observacoes"));
                  sale.setClient(c);
                     
                  list.add(sale);
              }
              return list;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error "+e.getMessage());
        }
        return list;
    }
    
    public double returnTotal(LocalDate datee){
        PreparedStatement st = null;
        ResultSet rs = null;
        double totalsale = 0.0;
        try{
              totalsale = 0.0;
            st = conn.prepareStatement("SELECT SUM(Total_venda) AS total FROM tb_vendas WHERE Data_venda = ?");
            
            st.setString(1, datee.toString());
            
            rs = st.executeQuery();
            
            if(rs.next()){
                totalsale = rs.getDouble("total");
        }
            return totalsale;
    }catch(SQLException e){
       e.printStackTrace();
    }
        return totalsale;
    }
}
