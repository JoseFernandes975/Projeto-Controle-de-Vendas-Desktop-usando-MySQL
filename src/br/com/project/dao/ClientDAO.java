package br.com.project.dao;

import br.com.project.JDBC.ConnectionFactory;
import br.com.project.model.Client;
import br.com.project.util.WebServiceCep;
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
   
   public void updateClient(Client client){
       PreparedStatement st = null;
       try{
           st = conn.prepareStatement(
             "UPDATE tb_clientes SET "
            + "Nome = ?, RG = ?, CPF = ?, Email = ? , Telefone = ?, Celular = ?,"
            + " CEP = ?, Endereco = ?, Numero = ?, Complemento = ?,"
            + " Bairro = ?, Cidade = ?, Estado = ? WHERE Id = ?");
            
           st.setString(1, client.getName());
           st.setString(2, client.getRg());
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
              st.setInt(14, client.getId());
              
              st.executeUpdate();
              st.close(); 
              
              JOptionPane.showMessageDialog(null, "Update Completed!");
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error Update!"+e.getMessage());
       }
   }

   public void deleteByIdClient(Client client){
       PreparedStatement st = null;
       try{
              st = conn.prepareStatement("Delete From tb_clientes Where Id = ?");
              
              st.setInt(1, client.getId());
              
              st.executeUpdate();
              st.close();
              JOptionPane.showMessageDialog(null, "Deleted completed!");
       }
       catch(SQLException e){
         JOptionPane.showMessageDialog(null, "Error "+e.getMessage());
       }
   }

   public List<Client> findAllClients(){
       List<Client> list = new ArrayList<>();
      
           ResultSet rs = null;
           PreparedStatement st = null;
          try {
            st = conn.prepareStatement("SELECT * FROM tb_clientes");
           
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
       }
       return list;
   }
   
    public List<Client> findClientByName(String name){
        List<Client> list = new ArrayList<>();
        
        ResultSet rs = null;
        PreparedStatement st = null;
     try{
         st = conn.prepareStatement("SELECT * FROM tb_clientes WHERE Nome like ?");
         
         st.setString(1, name);
         
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
       JOptionPane.showMessageDialog(null, "Not found name: "+e.getMessage());
   }
   return list;  
   }
    
   public Client findByCpf(String cpf){
       PreparedStatement st = null;
       Client obj = new Client();
       try{
           st = conn.prepareStatement("SELECT * FROM tb_clientes WHERE CPF = ?");
           
           st.setString(1, cpf);
           ResultSet rs = st.executeQuery();
           
           if(rs.next()){
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
           }
           return obj;
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
           return null;
       }
      
   }
   
   
	  public Client buscaCep(String cep) {
       
        WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);
       

        Client obj = new Client();

        if (webServiceCep.wasSuccessful()) {
            obj.setAddress(webServiceCep.getLogradouroFull());
            obj.setCity(webServiceCep.getCidade());
            obj.setNeighborhood(webServiceCep.getBairro());
            obj.setUf(webServiceCep.getUf());
            return obj;
        } 
        if(obj.getAddress() == null || obj.getNeighborhood() == null){
            JOptionPane.showMessageDialog(null, "O Cep que digitou n??o tem endere??o ou bairro!");
               obj.setCity(webServiceCep.getCidade());
              obj.setUf(webServiceCep.getUf());
        return obj;
        } else {
            JOptionPane.showMessageDialog(null, "Erro numero: " + webServiceCep.getResulCode());
            JOptionPane.showMessageDialog(null, "Descri????o do erro: " + webServiceCep.getResultText());
            return null;
        }

    }
   
   
   
}
