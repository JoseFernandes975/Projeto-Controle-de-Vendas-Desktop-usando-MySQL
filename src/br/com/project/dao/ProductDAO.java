package br.com.project.dao;

import br.com.project.JDBC.ConnectionFactory;
import br.com.project.model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProductDAO {
    
    private Connection conn;
    
    public ProductDAO(){
        this.conn = new ConnectionFactory().getConnection();
    }
    
      public void insertProduct(Product obj){
          PreparedStatement st = null;
          try{
              st = conn.prepareStatement(
              "INSERT INTO tb_produtos (Descricao, Preco, Quantidade_Estoque, "
                      + "Fornecedores_id) VALUES (?, ?, ?, ?)");
              
              st.setString(1, obj.getDescription());
              st.setDouble(2, obj.getPrice());
              st.setInt(3, obj.getQuantity());
              st.setInt(4, obj.getProvider().getId());
              
              st.execute();
              st.close();
             
             JOptionPane.showMessageDialog(null, "Insert completed!");
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Error insert product: "+e.getMessage());
          }
      } 
}
