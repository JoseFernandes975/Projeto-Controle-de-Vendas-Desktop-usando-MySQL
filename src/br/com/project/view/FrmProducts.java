package br.com.project.view;

import br.com.project.dao.ClientDAO;
import br.com.project.dao.ProductDAO;
import br.com.project.dao.ProviderDAO;
import br.com.project.model.Client;
import br.com.project.model.Product;
import br.com.project.model.Providers;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class FrmProducts extends javax.swing.JFrame {

    public FrmProducts() {
        initComponents();
    }
    
    public void findAll(){
        try{
        ProductDAO dao = new ProductDAO();
         List<Product> list = dao.findAllProducts();
         DefaultTableModel dados = (DefaultTableModel) tableProduct.getModel();
         dados.setNumRows(0);
       
         
         for(Product c:list){
             dados.addRow(new Object[]{
                c.getId(),
                c.getDescription(),
                c.getPrice(),
                c.getQuantity(),
                c.getProvider().getName()
         });
         }
}catch(Exception e){
   e.printStackTrace();
     }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        btnSearchDescription = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        panelData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtDescription2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbxProviders = new javax.swing.JComboBox();
        bttSearchDescription2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btNew = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        bttSave = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        label1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Cadastro de Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );

        label1.getAccessibleContext().setAccessibleName("");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Nome:");

        txtDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });
        txtDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescriptionKeyPressed(evt);
            }
        });

        btnSearchDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearchDescription.setText("Pesquisar");
        btnSearchDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDescriptionActionPerformed(evt);
            }
        });

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "C??digo", "Descri????o", "Pre??o", "Quantidade", "Fornecedores"
            }
        ));
        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduct);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchDescription)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchDescription))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta de Produtos", jPanel3);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("C??digo:");

        txtCode.setEditable(false);
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        txtDescription2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescription2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Pre??o:");

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Quantidade Estoque:");

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Fornecedores:");

        cbxProviders.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxProviders.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbxProvidersAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbxProviders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxProvidersMouseClicked(evt);
            }
        });

        bttSearchDescription2.setText("Pesquisar");
        bttSearchDescription2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSearchDescription2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Descri????o:");

        javax.swing.GroupLayout panelDataLayout = new javax.swing.GroupLayout(panelData);
        panelData.setLayout(panelDataLayout);
        panelDataLayout.setHorizontalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataLayout.createSequentialGroup()
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel2))
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDataLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDataLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxProviders, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDataLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescription2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bttSearchDescription2))
                            .addGroup(panelDataLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(357, Short.MAX_VALUE))
        );
        panelDataLayout.setVerticalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescription2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttSearchDescription2)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbxProviders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados Pessoais", panelData);

        btNew.setText("NOVO");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        btEdit.setText("EDITAR");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        bttSave.setText("SALVAR");
        bttSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSaveActionPerformed(evt);
            }
        });

        btDelete.setText("EXCLUIR");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(btNew)
                .addGap(18, 18, 18)
                .addComponent(btEdit)
                .addGap(18, 18, 18)
                .addComponent(bttSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDelete)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void txtDescription2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescription2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescription2ActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        new br.com.project.util.Util().cleanPane(panelData);
    }//GEN-LAST:event_btNewActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
      Product obj = new Product();
      obj.setId(Integer.parseInt(txtCode.getText()));
      obj.setDescription(txtDescription2.getText());
      obj.setPrice(Double.parseDouble(txtPrice.getText()));
      obj.setQuantity(Integer.parseInt(txtQuantity.getText()));
      Providers p = new Providers();
      p = (Providers) cbxProviders.getSelectedItem();
      obj.setProvider(p);
 
      ProductDAO dao = new ProductDAO();
      dao.updateProduct(obj);
            
       new br.com.project.util.Util().cleanPane(panelData);
 
    }//GEN-LAST:event_btEditActionPerformed

    private void bttSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSaveActionPerformed

            Product obj = new Product();
            obj.setDescription(txtDescription2.getText());
            obj.setPrice(Double.parseDouble(txtPrice.getText()));
            obj.setQuantity(Integer.parseInt(txtQuantity.getText()));
            Providers p = new Providers();
            p =(Providers) cbxProviders.getSelectedItem();
            obj.setProvider(p);
            
            ProductDAO objDao = new ProductDAO();
            objDao.insertProduct(obj);
            
            new br.com.project.util.Util().cleanPane(panelData);
    }//GEN-LAST:event_bttSaveActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
          Product obj =  new Product();
            
             obj.setId(Integer.parseInt(txtCode.getText()));
             ProductDAO objDao = new ProductDAO();
             objDao.deleteProduct(obj);
             
             new br.com.project.util.Util().cleanPane(panelData);
    }                                      

    private void bt(java.awt.event.ActionEvent evt) {                                       
    /*         Client obj =  new Client();
            obj.setName(txtDescription.getText());
            obj.setRg(txtRg.getText());
            obj.setCpf(txtCpf.getText());
            obj.setEmail(txtPrice.getText());
            obj.setCell(txtCell.getText());
            obj.setTelephone(txtTelephone.getText());
            obj.setCep(txtCep.getText());
            obj.setCity(txtQuantity.getText());
            obj.setAddress(txtAddress.getText());
            obj.setNeighborhood(txtNeighBorhood.getText());
            obj.setComplement(txtComplement.getText());
            obj.setNumber(Integer.parseInt(txtNumber.getText()));
            obj.setUf(cbxProviders.getSelectedItem().toString());
           
            
            ClientDAO objDao = new ClientDAO();
        objDao.insertClient(obj);
        */
    }//GEN-LAST:event_btDeleteActionPerformed

    private void tableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductMouseClicked
       jTabbedPane1.setSelectedIndex(1);
        
        txtCode.setText(tableProduct.getValueAt(tableProduct.getSelectedRow(), 0).toString());
        txtDescription2.setText(tableProduct.getValueAt(tableProduct.getSelectedRow(), 1).toString());
        txtPrice.setText(tableProduct.getValueAt(tableProduct.getSelectedRow(), 2).toString());
        txtQuantity.setText(tableProduct.getValueAt(tableProduct.getSelectedRow(), 3).toString());
        Providers p = new Providers();
        ProviderDAO dao = new ProviderDAO();
        p = dao.findProviderByName(tableProduct.getValueAt(tableProduct.getSelectedRow(), 4).toString());
        cbxProviders.removeAllItems();
        cbxProviders.getModel().setSelectedItem(p);
    
    }//GEN-LAST:event_tableProductMouseClicked
;
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         findAll();
    }//GEN-LAST:event_formWindowActivated

    private void btnSearchDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDescriptionActionPerformed
       try{
        String name = "%"+txtDescription.getText()+"%";
       
       ProductDAO dao = new ProductDAO();
       List<Product> list = dao.findProducts(name);
       DefaultTableModel dfd = (DefaultTableModel) tableProduct.getModel();
       dfd.setRowCount(0);
               
               for(Product c:list){
             dfd.addRow(new Object[]{
                 c.getId(),
                 c.getDescription(),
                 c.getPrice(),
                 c.getQuantity(),
                 c.getProvider().getId()
         });
         }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error "+e.getMessage());
       }
      
    }//GEN-LAST:event_btnSearchDescriptionActionPerformed

    private void txtDescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyPressed
        String name = "%"+txtDescription.getText()+"%";
       
       ProductDAO dao = new ProductDAO();
       List<Product> list = dao.findProducts(name);
       DefaultTableModel dfd = (DefaultTableModel) tableProduct.getModel();
       dfd.setRowCount(0);
               
               for(Product c:list){
             dfd.addRow(new Object[]{
                 c.getId(),
                 c.getDescription(),
                 c.getPrice(),
                 c.getQuantity(),
                 c.getProvider().getId()   
         });
         }
        
    }//GEN-LAST:event_txtDescriptionKeyPressed

    private void bttSearchDescription2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSearchDescription2ActionPerformed
   Product obj = new Product();
        ProductDAO dao = new ProductDAO();
        String description2 = txtDescription2.getText();
        obj = dao.findProduct(description2);
        
        cbxProviders.removeAllItems();
        
        if(obj.getDescription()!=null){
        
        txtCode.setText(String.valueOf(obj.getId()));
        txtDescription.setText(obj.getDescription());
        txtPrice.setText(String.valueOf(obj.getPrice()));
        txtQuantity.setText(String.valueOf(obj.getQuantity()));
        
        Providers p = new Providers();
        ProviderDAO prodao = new ProviderDAO();
        p = prodao.findProviderByName(obj.getProvider().getName());
        cbxProviders.getModel().setSelectedItem(p);
        }else{
            JOptionPane.showMessageDialog(null, "Not found product");
        }
      
    }//GEN-LAST:event_bttSearchDescription2ActionPerformed

    private void cbxProvidersAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbxProvidersAncestorAdded
       ProviderDAO dao = new ProviderDAO();
       List<Providers> list = dao.findAllProvider();
       
       cbxProviders.removeAll();
       for(Providers p: list){
          cbxProviders.addItem(p);
       }
    }//GEN-LAST:event_cbxProvidersAncestorAdded

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void cbxProvidersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxProvidersMouseClicked
     
    }//GEN-LAST:event_cbxProvidersMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel *
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btnSearchDescription;
    private javax.swing.JButton bttSave;
    private javax.swing.JButton bttSearchDescription2;
    private javax.swing.JComboBox cbxProviders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private javax.swing.JPanel panelData;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtDescription2;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

}
