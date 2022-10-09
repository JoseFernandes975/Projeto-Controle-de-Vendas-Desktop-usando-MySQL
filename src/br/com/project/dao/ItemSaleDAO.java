
package br.com.project.dao;
import br.com.project.JDBC.ConnectionFactory;
import br.com.project.model.Item_sales;
import br.com.project.model.Product;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ItemSaleDAO {
    
    private Connection conn;
    
    public ItemSaleDAO(){
      this.conn = new ConnectionFactory().getConnection();
    }
    
    public void insertItem(Item_sales obj){
        PreparedStatement st = null;
        try{
            st = conn.prepareStatement("INSERT INTO tb_itensvendas (Venda_id, Produto_id, Quantidade, Subtotal) "
                    + "VALUES (?, ?, ?, ?)");
            
            st.setInt(1, obj.getSale().getId());
            st.setInt(2, obj.getProducts().getId());
            st.setInt(3, obj.getQuantity());
            st.setDouble(4, obj.getSubtotal());
            
            st.execute();

            
            JOptionPane.showMessageDialog(null, "Item de vendas inserido com sucesso!");
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public void deleteItemSale(Item_sales obj){
        PreparedStatement st = null;
        try{
            st = conn.prepareStatement("DELETE FROM tb_itensvendas WHERE Id = ?");
            
            st.setInt(1, obj.getId());
            
            st.execute();
            st.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error delete item sale: "+e.getMessage());
        }
    }
    
    public List<Item_sales> findItemBySale(int venda_id){
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Item_sales> list = new ArrayList();
        try{
            st = conn.prepareStatement("SELECT i.Id, p.Descricao, i.Quantidade, p.Preco, i.Subtotal FROM tb_itensvendas AS i INNER "
                    + "JOIN tb_produtos AS p ON (i.Produto_id = p.Id) WHERE i.Venda_id = ?");
            
            st.setInt(1, venda_id);
            
            rs = st.executeQuery();
            
            while(rs.next()){
               Item_sales item = new Item_sales();
               Product prod = new Product();
               item.setId(rs.getInt("i.Id"));
               prod.setDescription(rs.getString("p.Descricao"));
               item.setQuantity(rs.getInt("i.Quantidade"));
               prod.setPrice(rs.getDouble("p.Preco"));
               item.setSubtotal(rs.getDouble("i.Subtotal"));
               item.setProducts(prod);
               
               
               list.add(item);
            }
            return list;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return list;
    }

    
}
