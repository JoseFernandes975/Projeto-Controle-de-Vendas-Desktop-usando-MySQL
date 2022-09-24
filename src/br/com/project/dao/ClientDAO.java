package br.com.project.dao;

import br.com.project.JDBC.ConnectionFactory;
import br.com.project.model.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException; 
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class ClientDAO {
    
   private Connection conn;
   
   public  ClientDAO(){
       this.conn = new ConnectionFactory().getConnection();
   }
   
   public void insertClient(Client client){
        PreparedStatement st = null;
        try{
              st =  conn.prepareStatement(
        "INSERT INTO tb_clientes "
       +"(Nome, RG, CPF, Email, Telefone, Celular, CEP, Endereco, Numero, Complemento, Bairro, Cidade, Estado) "
                +"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
              
              st.setString(1, client.getName());
              st.setString(2,client.getRg());
              st.setString(3,client.getCpf());
              st.setString(4,client.getEmail());
              st.setString(5,client.getTelephone());
              st.setString(6,client.getCell());
              st.setString(7,client.getCep());
              st.setString(8,client.getAddress());
              st.setInt(9,client.getNumber());
              st.setString(10,client.getComplement());
              st.setString(11,client.getNeighborhood());
              st.setString(12,client.getCity());
              st.setString(13,client.getUf());
              
              st.execute();
               st.close();
               
              JOptionPane.showMessageDialog(null, "Insert completed!");
              
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
                   
    
       
        
   }
}
