package br.com.project.dao;

import br.com.project.JDBC.ConnectionFactory;
import br.com.project.model.Employees;
import br.com.project.model.Providers;
import br.com.project.util.WebServiceCep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

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
           st.setString(2, obj.getCnpj());
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
           st.setString(2, obj.getCnpj());
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
   
   public List<Providers> findAllProvider(){
       PreparedStatement st = null;
       ResultSet rs = null;
       List<Providers> list = new ArrayList<>();
       try{
          
           st = conn.prepareStatement("SELECT * FROM tb_fornecedores");
           
           rs = st.executeQuery();
           while(rs.next()){
               Providers obj = new Providers();
               obj.setName(rs.getString("Nome"));
               obj.setCnpj(rs.getString("CNPJ"));
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
              obj.setId(rs.getInt("Id"));
              
              list.add(obj);
           }
           return list;
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
       }
       return list;
   }
   
   
   
   public List<Providers> findProvidersByName(String nome){
       PreparedStatement st = null;
       ResultSet rs = null;
       List<Providers> list = new ArrayList<>();
       try{
           st = conn.prepareStatement("SELECT * FROM tb_fornecedores WHERE Nome like ?");
           
           st.setString(1, nome);
           rs = st.executeQuery();
           
           while(rs.next()){
               Providers obj = new Providers();
              obj.setName(rs.getString("Nome"));
              obj.setCnpj(rs.getString("CNPJ"));
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
              obj.setId(rs.getInt("Id"));
              
              list.add(obj);
           }
           
           return list;
           
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error not found: "+e.getMessage());
       }    
       return list;
   }
   
   
   
    public Providers findProviderByName(String nome){
       PreparedStatement st = null;
       ResultSet rs = null;
       Providers obj = new Providers();
       try{
           st = conn.prepareStatement("SELECT * FROM tb_fornecedores WHERE Nome = ?");
           
           st.setString(1, nome);
           rs = st.executeQuery();
           
           while(rs.next()){
              obj.setName(rs.getString("Nome"));
              obj.setCnpj(rs.getString("CNPJ"));
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
              obj.setId(rs.getInt("Id"));
             
           }
           
           return obj;
           
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error not found: "+e.getMessage());
       }    
       return obj;
   }
   
      public Providers buscaCep(String cep) {
       
        WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);
       

        Providers obj = new Providers();

        if (webServiceCep.wasSuccessful()) {
            obj.setAddress(webServiceCep.getLogradouroFull());
            obj.setCity(webServiceCep.getCidade());
            obj.setNeighborhood(webServiceCep.getBairro());
            obj.setUf(webServiceCep.getUf());
            return obj;
        } 
        if(obj.getAddress() == null || obj.getNeighborhood() == null){
            JOptionPane.showMessageDialog(null, "O Cep que digitou não tem endereço ou bairro!");
               obj.setCity(webServiceCep.getCidade());
              obj.setUf(webServiceCep.getUf());
        return obj;
        } else {
            JOptionPane.showMessageDialog(null, "Erro numero: " + webServiceCep.getResulCode());
            JOptionPane.showMessageDialog(null, "Descrição do erro: " + webServiceCep.getResultText());
            return null;
        }

    }
    
   
}

