package br.com.project.dao;

import br.com.project.JDBC.ConnectionFactory;
import br.com.project.model.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException; 
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
   
   public List<Client> findAllClients(){
       List<Client> list = new ArrayList<>();
       try{
           ResultSet rs = null;
           PreparedStatement st = conn.prepareStatement("SELECT * FROM tb_clientes");
           
           rs = st.executeQuery();
           
           while(rs.next()){
              Client obj = new Client();
              obj.setId(rs.getInt("Id"));
              obj.setName(rs.getString("Nome"));
              obj.setRg(rs.getString("RG"));
              obj.setCpf(rs.getString("CPF"));
              obj.setEmail(rs.getString("Email"));
              obj.setTelephone(rs.getString("Telefone"));
              obj.setCell(rs.getString("Celular"));
              obj.setCep(rs.getString("CEP"));
              obj.setAddress(rs.getString("Endereco"));
              obj.setNumber(rs.getInt("Numero"));
              obj.setComplement(rs.getString("Complemento"));
              obj.setNeighborhood(rs.getString("Bairro"));
              obj.setCity(rs.getString("Cidade"));
              obj.setUf(rs.getString("Estado"));
              
              list.add(obj);
           }
           return list;
           
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error find All: "+e.getMessage());
           return null;
       }
       
   }
}
