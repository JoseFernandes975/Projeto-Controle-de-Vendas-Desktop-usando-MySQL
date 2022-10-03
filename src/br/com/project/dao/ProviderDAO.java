package br.com.project.dao;

import br.com.project.JDBC.ConnectionFactory;
import br.com.project.model.Providers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ProviderDAO {
    
   private Connection conn;
   
   public ProviderDAO(){
      this.conn = new ConnectionFactory().getConnection();
   }
    
   public void insertProvider(Providers obj){
       PreparedStatement st = null;
       try{
           st = conn.prepareStatement("INSERT INTO tb_fornecedores "
           + "(Nome, CNPJ, Email, Telefone, Celular, CEP, Endereco, Numero, "
                   + "Complemento, Bairro, Cidade, Estado) VALUE (?, ?, ?, ?,"
                   + " ?, ?, ?, ?, ?, ?, ?, ?)");
           
           st.setString(1, obj.getName());
           st.setString(2, obj.getCnpg());
           st.setString(3, obj.getEmail());
           st.setString(4, obj.getTelephone());
           st.setString(5, obj.getCell());
           st.setString(6, obj.getCep());
           st.setString(7, obj.getAddress());
           st.setInt(8, obj.getNumber());
           st.setString(9, obj.getComplement());
           st.setString(10, obj.getNeighborhood());
           st.setString(11, obj.getCity());
           st.setString(12, obj.getUf());
           
           st.execute();
           st.close();
           JOptionPane.showMessageDialog(null, "Insert provider completed!");
        
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "ERROR insert: "+e.getMessage());
       }
   }
   
   public void updateProvider(Providers obj){
       PreparedStatement st = null;
       try{
           st = conn.prepareStatement("UPDATE tb_fornecedores SET Nome = ?, CNPJ = ?,"
                   + " Email = ?, Telefone = ?, Celular = ?, CEP = ?, Endereco = ?,"
                   + " Numero = ?, Complemento = ?, Bairro = ?, Cidade = ?, Estado = ? WHERE Id = ?");
           
           st.setString(1, obj.getName());
           st.setString(2, obj.getCnpg());
           st.setString(3, obj.getEmail());
           st.setString(4, obj.getTelephone());
           st.setString(5, obj.getCell());
           st.setString(6, obj.getCep());
           st.setString(7, obj.getAddress());
           st.setInt(8, obj.getNumber());
           st.setString(9, obj.getComplement());
           st.setString(10, obj.getNeighborhood());
           st.setString(11, obj.getCity());
           st.setString(12, obj.getUf());
           st.setInt(13, obj.getId());
           
           st.executeUpdate();
           st.close();
           JOptionPane.showMessageDialog(null, "Update completed!");
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error by caused: "+e.getMessage());
       }
   }
   
   public void deleteProvider(Providers obj){
        PreparedStatement st = null;
        try{
            st = conn.prepareStatement("DELETE FROM tb_fornecedores WHERE Id = ?");
            
            st.setInt(1, obj.getId());
            st.execute();
            st.close();
            
            JOptionPane.showMessageDialog(null, "Delete provider");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
   }
   
}
