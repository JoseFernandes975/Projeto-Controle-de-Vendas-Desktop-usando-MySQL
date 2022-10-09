
package br.com.project.dao;
import br.com.project.JDBC.ConnectionFactory;
import br.com.project.model.Item_sales;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
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

    
}
