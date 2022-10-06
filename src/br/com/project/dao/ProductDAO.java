package br.com.project.dao;

import br.com.project.JDBC.ConnectionFactory;
import br.com.project.model.Product;
import br.com.project.model.Providers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
      
      public void updateProduct(Product obj){
          PreparedStatement st = null;
          try{
              st = conn.prepareStatement("UPDATE tb_produtos SET Descricao = ?, Preco = ?, Quantidade_Estoque = ?,"
                      + " Fornecedores_id = ? WHERE Id = ?");
              
              st.setString(1, obj.getDescription());
              st.setDouble(2, obj.getPrice());
              st.setInt(3, obj.getQuantity());
              st.setInt(4, obj.getProvider().getId());
              st.setInt(5, obj.getId());
              
              st.execute();
              st.close();
              
              JOptionPane.showMessageDialog(null, "Update completed!");
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, e.getMessage());
          }
      }
      
      public void deleteProduct(Product p){
          PreparedStatement st = null;
          try{
              st = conn.prepareStatement("DELETE FROM tb_produtos WHERE Id = ?");
              
              st.setInt(1, p.getId());
              
              st.execute();
              JOptionPane.showMessageDialog(null, "Deleted completed!");
          }catch(SQLException e){
              e.printStackTrace();
          }
      }
      
      public List<Product> findAllProducts(){
          ResultSet rs = null;
          PreparedStatement st = null;
           List<Product> list = new ArrayList<>();
          try{
              st = conn.prepareStatement(
              "SELECT * FROM tb_produtos INNER JOIN tb_fornecedores ON "
                      + "tb_produtos.Fornecedores_id = tb_fornecedores.Id");
              
              rs = st.executeQuery();
             
              while(rs.next()){
                  Product obj = new Product();
                  obj.setDescription(rs.getString("Descricao"));
                  obj.setPrice(rs.getDouble("Preco"));
                  obj.setQuantity(rs.getInt("Quantidade_Estoque"));
                  Providers p = new Providers();
                  p.setName(rs.getString("Nome"));
                  obj.setProvider(p);
                   obj.setId(rs.getInt("Id"));
                  
                  list.add(obj);       
              }
              return list;
          }catch(SQLException e){
              System.out.println(e.getMessage());
          }
          return list;
      }
      
      public List<Product> findProducts(String description){
          PreparedStatement st = null;
          ResultSet rs = null;
          List<Product> list = new ArrayList<>();
          try{
              st = conn.prepareStatement("SELECT * FROM tb_produtos INNER JOIN tb_fornecedores"
                      + " ON tb_produtos.Fornecedores_id = tb_fornecedores.Id WHERE Descricao like ?");
              
              st.setString(1, description);
              
              rs = st.executeQuery();
              while(rs.next()){
                  Product p = new Product();
                  p.setDescription(rs.getString("Descricao"));
                  p.setPrice(rs.getDouble("Preco"));
                  p.setQuantity(rs.getInt("Quantidade_Estoque"));
                  Providers provider = new Providers();
                 provider.setName(rs.getString("Nome"));
                 p.setProvider(provider);
                   p.setId(rs.getInt("Id"));
                  
                 list.add(p);
              }
              
              return list;
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Error not found: "+e.getMessage());
          }
          return list;
      }
      
      public Product findProduct(String description){
          PreparedStatement st = null;
          ResultSet rs = null;
          Product p = new Product();
          try{
              st = conn.prepareStatement("SELECT * FROM tb_produtos INNER JOIN tb_fornecedores ON "
                      + "tb_produtos.Fornecedores_id = tb_fornecedores.Id WHERE Descricao = ?");
              
              st.setString(1, description);
              
              rs = st.executeQuery();
              
              if(rs.next()){
                  p.setDescription(rs.getString("Descricao"));
                  p.setPrice(rs.getDouble("Preco"));
                  p.setQuantity(rs.getInt("Quantidade_Estoque"));
                  Providers pro = new Providers();
                  pro.setName(rs.getString("Nome"));
                  p.setProvider(pro);
                  p.setId(rs.getInt("Id"));
              }
              return p;
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
          }
          return p;
      }
      
      public Product findByCode(int code){
          PreparedStatement st = null;
          ResultSet rs= null;
              Product p = new Product();
          try{
              st = conn.prepareStatement("SELECT * FROM tb_produtos WHERE Id = ?");
              
               st.setInt(1, code);
              
              rs = st.executeQuery();
              
              if(rs.next()){
                  p.setDescription(rs.getString("Descricao"));
                  p.setPrice(rs.getDouble("Preco"));
                  p.setQuantity(rs.getInt("Quantidade_Estoque"));
                  p.setId(rs.getInt("Id"));
              }
              return p;
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
          }
          return p;
          }
      }

