
package br.com.project.dao;

import br.com.project.JDBC.ConnectionFactory;
import br.com.project.model.Employees;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException; 
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EmployeeDAO {
    //conexao com o banco
    private Connection conn;
    
    public EmployeeDAO(){
        this.conn = new ConnectionFactory().getConnection();
    }
    
    public void insertEmployee(Employees employ){
        PreparedStatement st = null;
        try{
            st = conn.prepareStatement(
            "INSERT INTO tb_funcionarios (Nome, RG, CPF, Email, Senha, Cargo, Nivel_acesso,"
                    + " Telefone, Celular, CEP, Endereco, Numero, Complemento, Bairro, Cidade, Estado) "
                    +"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            st.setString(1, employ.getName());
            st.setString(2, employ.getRg());
            st.setString(3,employ.getCpf());
            st.setString(4, employ.getEmail());
            st.setString(5, employ.getPassword());
            st.setString(6, employ.getOffice());
            st.setString(7, employ.getAccessLevel());
            st.setString(8, employ.getTelephone());
            st.setString(9, employ.getCell());
            st.setString(10, employ.getCep());
            st.setString(11, employ.getAddress());
            st.setInt(12, employ.getNumber());
            st.setString(13, employ.getComplement());
            st.setString(14, employ.getNeighborhood());
            st.setString(15, employ.getCity());
            st.setString(16, employ.getUf());
            
            st.execute();
            st.close();
            
            JOptionPane.showMessageDialog(null, "Insert employ completed!");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Not insert employ: "+e.getMessage());
            System.out.println(e.getMessage());
        }    
    }
    
    public void updateEmployee(Employees employ){
        PreparedStatement st = null;
        try{
            st = conn.prepareStatement("UPDATE tb_funcionarios SET Nome = ?,"
                    +" RG = ?, CPF = ?, Email = ? , Senha = ?, Cargo = ?,"
                    + "Nivel_acesso = ?, Telefone = ?, Celular = ?,"
                    + " CEP = ?, Endereco = ?, Numero = ?, Complemento = ?,"
                    + " Bairro = ?, Cidade = ?, Estado = ? WHERE Id = ?");
            
                  st.setString(1, employ.getName());
                  st.setString(2, employ.getRg());
                  st.setString(3, employ.getCpf());
                  st.setString(4, employ.getEmail());
                  st.setString(5, employ.getPassword());
                  st.setString(6, employ.getOffice());
                 st.setString(7, employ.getAccessLevel());
                 st.setString(8,employ.getTelephone());
                 st.setString(9,employ.getCell());
                 st.setString(10,employ.getCep());
                 st.setString(11,employ.getAddress());
                 st.setInt(12,employ.getNumber());
                 st.setString(13,employ.getComplement());
                 st.setString(14,employ.getNeighborhood());
                 st.setString(15,employ.getCity());
                 st.setString(16,employ.getUf());
                 st.setInt(17, employ.getId());
                 
                 st.executeUpdate();
                 st.close();
                 JOptionPane.showMessageDialog(null,"Update employee completed!");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error update employee!: "+e.getMessage());
        }
    }
    
 
    public void deleteEmployee(Employees employ){
        PreparedStatement st = null;
        try{
            st = conn.prepareStatement("DELETE FROM tb_funcionarios WHERE Id = ?");
            
            st.setInt(1, employ.getId());
            
            st.execute();
            st.close();
            JOptionPane.showMessageDialog(null, "Deleted employee completed!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    

    public List<Employees> findAllEmployees(){
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = conn.prepareStatement("SELECT * FROM tb_funcionarios");
            
            rs = st.executeQuery();
            List<Employees> list = new ArrayList<>();            
            while(rs.next()){
                Employees employ = new Employees();
                employ.setId(rs.getInt("Id"));
              employ.setName(rs.getString("Nome"));
              employ.setRg(rs.getString("RG"));
              employ.setCpf(rs.getString("CPF"));
              employ.setEmail(rs.getString("Email"));
              employ.setPassword(rs.getString("Senha"));
              employ.setOffice(rs.getString("Cargo"));
              employ.setAccessLevel(rs.getString("Nivel_acesso"));
              employ.setTelephone(rs.getString("Telefone"));
              employ.setCell(rs.getString("Celular"));
              employ.setCep(rs.getString("CEP"));
              employ.setAddress(rs.getString("Endereco"));
              employ.setNumber(rs.getInt("Numero"));
              employ.setComplement(rs.getString("Complemento"));
              employ.setNeighborhood(rs.getString("Bairro"));
              employ.setCity(rs.getString("Cidade"));
              employ.setUf(rs.getString("Estado"));
              
              list.add(employ);
            }
            return list;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error findALL: "+e.getMessage());
            return null;
        }
    }
    
    
    public Employees findEmployeeByName(String name){
        PreparedStatement st = null;
        Employees employ = new Employees();
        try{
            st = conn.prepareStatement("SELECT * FROM tb_funcionarios WHERE Nome = ?");
            
            st.setString(1, name);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                employ.setName(rs.getString("Nome"));
                employ.setRg(rs.getString("RG"));
                employ.setCpf(rs.getString("CPF"));
                employ.setEmail(rs.getString("Email"));
                employ.setPassword(rs.getString("Senha"));
                employ.setOffice(rs.getString("Cargo"));
                employ.setAccessLevel(rs.getString("Nivel_acesso"));
                employ.setTelephone(rs.getString("Telefone"));
                employ.setCell(rs.getString("Celular"));
                employ.setCep(rs.getString("CEP"));
                employ.setAddress(rs.getString("Endereco"));
                employ.setNumber(rs.getInt("Numero"));
                employ.setComplement(rs.getString("Complemento"));
                employ.setNeighborhood(rs.getString("Bairro"));
                employ.setCity(rs.getString("Cidade"));
                employ.setUf(rs.getString("Estado"));
          
            }
                return employ;  
           
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error in find employee: "+e.getMessage());
        }
        return employ;
    }
 
    
    
    public List<Employees> findEmployeesByName(String name){
        PreparedStatement st = null;
        List<Employees> list = new ArrayList<>();
         ResultSet rs = null;
        try{
            st = conn.prepareStatement("SELECT * FROM tb_funcionarios WHERE Nome like ?");
            
            st.setString(1, name);
             rs = st.executeQuery();
            
            while(rs.next()){
                 Employees employ = new Employees();
                 
                employ.setName(rs.getString("Nome"));
                employ.setRg(rs.getString("RG"));
                employ.setCpf(rs.getString("CPF"));
                employ.setEmail(rs.getString("Email"));
                employ.setPassword(rs.getString("Senha"));
                employ.setOffice(rs.getString("Cargo"));
                employ.setAccessLevel(rs.getString("Nivel_acesso"));
                employ.setTelephone(rs.getString("Telefone"));
                employ.setCell(rs.getString("Celular"));
                employ.setCep(rs.getString("CEP"));
                employ.setAddress(rs.getString("Endereco"));
                employ.setNumber(rs.getInt("Numero"));
                employ.setComplement(rs.getString("Complemento"));
                employ.setNeighborhood(rs.getString("Bairro"));
                employ.setCity(rs.getString("Cidade"));
                employ.setUf(rs.getString("Estado"));
          
                list.add(employ);
                
            }
                return list;  
           
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error in find employee: "+e.getMessage());
        }
        return list;
    }
}
