package br.com.project.view;

import br.com.project.dao.ClientDAO;
import br.com.project.dao.ProviderDAO;
import br.com.project.model.Client;
import br.com.project.model.Providers;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class FrmProviders extends javax.swing.JFrame {

    public FrmProviders() {
        initComponents();
    }
    
    public void findAll(){
       try{
           ProviderDAO pd = new ProviderDAO();
           List<Providers> list = pd.findAllProvider();
           DefaultTableModel dtm = (DefaultTableModel) tableProvider.getModel();
           dtm.setNumRows(0);
           
           for(Providers p: list){
               dtm.addRow(new Object[]{
                 p.getId(),
                 p.getName(),
                 p.getCnpj(),
                 p.getEmail(),
                 p.getTelephone(),
                 p.getCell(),
                 p.getCep(),
                 p.getCity(),
                 p.getAddress(),
                 p.getNeighborhood(),
                 p.getNumber(),
                 p.getComplement(),
                 p.getUf()    
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
        panelData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodeP = new javax.swing.JTextField();
        txtNameP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmailP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddressP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNeighBorhoodP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCellP = new javax.swing.JFormattedTextField();
        txtTelephoneP = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txtComplementP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCityP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNumberP = new javax.swing.JTextField();
        txtCepP = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        cbxUfP = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearchName = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProvider = new javax.swing.JTable();
        btNewP = new javax.swing.JButton();
        btEditP = new javax.swing.JButton();
        bttSaveP = new javax.swing.JButton();
        btDeleteP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        label1.setBackground(new java.awt.Color(0, 0, 153));
        label1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Cadastro de Fornecedores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Código:");

        txtCodeP.setEditable(false);
        txtCodeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodePActionPerformed(evt);
            }
        });

        txtNameP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamePActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("E-mail:");

        txtEmailP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailPActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Endereço:");

        txtAddressP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressPActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("CEP :");

        txtNeighBorhoodP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNeighBorhoodPActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Bairro:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Celular:");

        try {
            txtCellP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCellP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        try {
            txtTelephoneP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelephoneP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Telefone(fixo):");

        txtComplementP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementPActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Complemento:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Cidade:");

        txtCityP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityPActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Nº;");

        txtNumberP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumberP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberPActionPerformed(evt);
            }
        });

        try {
            txtCepP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCepP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCepP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepPActionPerformed(evt);
            }
        });
        txtCepP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCepPKeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("UF:");

        cbxUfP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxUfP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "P", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("CNPJ:");

        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDataLayout = new javax.swing.GroupLayout(panelData);
        panelData.setLayout(panelDataLayout);
        panelDataLayout.setHorizontalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNameP, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailP, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCellP, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelephoneP, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDataLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCepP, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(panelDataLayout.createSequentialGroup()
                                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNeighBorhoodP, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDataLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCityP, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComplementP, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxUfP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDataLayout.createSequentialGroup()
                                .addComponent(txtAddressP, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumberP, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelDataLayout.setVerticalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNameP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmailP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCellP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtTelephoneP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(txtAddressP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtNumberP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCepP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCityP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtComplementP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtNeighBorhoodP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cbxUfP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados Pessoais", panelData);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Nome:");

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        btnSearchName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearchName.setText("Pesquisar");
        btnSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNameActionPerformed(evt);
            }
        });

        tableProvider.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CNPJ", "E-mail", "Celular", "Telefone", "CEP", "Cidade", "Endereco", "Bairro", "Nº", "Comp", "UF"
            }
        ));
        tableProvider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProviderMouseClicked(evt);
            }
        });
        tableProvider.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableProviderKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableProvider);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta de Fornecedores", jPanel3);

        btNewP.setText("NOVO");
        btNewP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewPActionPerformed(evt);
            }
        });

        btEditP.setText("EDITAR");
        btEditP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditPActionPerformed(evt);
            }
        });

        bttSaveP.setText("SALVAR");
        bttSaveP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSavePActionPerformed(evt);
            }
        });

        btDeleteP.setText("EXCLUIR");
        btDeleteP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletePActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(btNewP)
                .addGap(18, 18, 18)
                .addComponent(btEditP)
                .addGap(18, 18, 18)
                .addComponent(bttSaveP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDeleteP)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNewP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttSaveP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeleteP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodePActionPerformed

    private void txtNamePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamePActionPerformed

    private void txtEmailPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailPActionPerformed

    private void txtAddressPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressPActionPerformed

    private void txtNeighBorhoodPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNeighBorhoodPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNeighBorhoodPActionPerformed

    private void txtComplementPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementPActionPerformed

    private void txtCityPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityPActionPerformed

    private void txtNumberPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberPActionPerformed

    private void btNewPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewPActionPerformed
        new br.com.project.util.Util().cleanPane(panelData);
    }//GEN-LAST:event_btNewPActionPerformed

    private void btEditPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditPActionPerformed
         Providers obj =  new Providers();
            obj.setName(txtNameP.getText());
            obj.setCnpj(txtCnpj.getText());
            obj.setEmail(txtEmailP.getText());
            obj.setCell(txtCellP.getText());
            obj.setTelephone(txtTelephoneP.getText());
            obj.setCep(txtCepP.getText());
            obj.setCity(txtCityP.getText());
            obj.setAddress(txtAddressP.getText());
            obj.setNeighborhood(txtNeighBorhoodP.getText());
            obj.setComplement(txtComplementP.getText());
            obj.setNumber(Integer.parseInt(txtNumberP.getText()));
            obj.setUf(cbxUfP.getSelectedItem().toString());
            obj.setId(Integer.parseInt(txtCodeP.getText()));
            
            
            ProviderDAO objDao = new ProviderDAO();
            objDao.updateProvider(obj);
            
            new br.com.project.util.Util().cleanPane(panelData);

    }//GEN-LAST:event_btEditPActionPerformed

    private void bttSavePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSavePActionPerformed

             Providers obj =  new Providers();
            obj.setName(txtNameP.getText());
            obj.setCnpj(txtCnpj.getText());
            obj.setEmail(txtEmailP.getText());
            obj.setCell(txtCellP.getText());
            obj.setTelephone(txtTelephoneP.getText());
            obj.setCep(txtCepP.getText());
            obj.setCity(txtCityP.getText());
            obj.setAddress(txtAddressP.getText());
            obj.setNeighborhood(txtNeighBorhoodP.getText());
            obj.setComplement(txtComplementP.getText());
            obj.setNumber(Integer.parseInt(txtNumberP.getText()));
            obj.setUf(cbxUfP.getSelectedItem().toString());
            
            ProviderDAO objDao = new ProviderDAO();
            objDao.insertProvider(obj);
            
            new br.com.project.util.Util().cleanPane(panelData);
 
    }//GEN-LAST:event_bttSavePActionPerformed

    private void btDeletePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletePActionPerformed
          Providers obj =  new Providers();
            
             obj.setId(Integer.parseInt(txtCodeP.getText()));
             ProviderDAO objDao = new ProviderDAO();
             objDao.deleteProvider(obj);
             
             new br.com.project.util.Util().cleanPane(panelData);
    }                                      

    private void bt(java.awt.event.ActionEvent evt) {                                       
             Providers obj =  new Providers();
            obj.setName(txtNameP.getText());
            obj.setCnpj(txtCnpj.getText());
            obj.setEmail(txtEmailP.getText());
            obj.setCell(txtCellP.getText());
            obj.setTelephone(txtTelephoneP.getText());
            obj.setCep(txtCepP.getText());
            obj.setCity(txtCityP.getText());
            obj.setAddress(txtAddressP.getText());
            obj.setNeighborhood(txtNeighBorhoodP.getText());
            obj.setComplement(txtComplementP.getText());
            obj.setNumber(Integer.parseInt(txtNumberP.getText()));
            obj.setUf(cbxUfP.getSelectedItem().toString());
           
            
            ProviderDAO objDao = new ProviderDAO();
            objDao.insertProvider(obj);
    }//GEN-LAST:event_btDeletePActionPerformed

    private void txtCepPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepPActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCepPActionPerformed

    private void tableProviderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProviderMouseClicked
        jTabbedPane1.setSelectedIndex(0);
        
        txtCodeP.setText(tableProvider.getValueAt(tableProvider.getSelectedRow(), 0).toString());
        txtNameP.setText(tableProvider.getValueAt(tableProvider.getSelectedRow(), 1).toString());
        txtCnpj.setText(tableProvider.getValueAt(tableProvider.getSelectedRow(), 2).toString());
        txtEmailP.setText(tableProvider.getValueAt(tableProvider.getSelectedRow(), 3).toString());
        txtCellP.setText(tableProvider.getValueAt(tableProvider.getSelectedRow(), 4).toString());
        txtTelephoneP.setText(tableProvider.getValueAt(tableProvider.getSelectedRow(), 5).toString());
        txtCepP.setText(tableProvider.getValueAt(tableProvider.getSelectedRow(), 6).toString());
        txtCityP.setText(tableProvider.getValueAt(tableProvider.getSelectedRow(), 7).toString());
        txtAddressP.setText(tableProvider.getValueAt(tableProvider.getSelectedRow(), 8).toString());
        txtNeighBorhoodP.setText(tableProvider.getValueAt(tableProvider.getSelectedRow(), 9).toString());
        txtNumberP.setText(tableProvider.getValueAt(tableProvider.getSelectedRow(), 10).toString());
        txtComplementP.setText(tableProvider.getValueAt(tableProvider.getSelectedRow(), 11).toString());
        cbxUfP.setSelectedItem(tableProvider.getValueAt(tableProvider.getSelectedRow(), 12).toString());
    }//GEN-LAST:event_tableProviderMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         findAll();
    }//GEN-LAST:event_formWindowActivated

    private void btnSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNameActionPerformed
      try{
        String name = "%"+txtSearch.getText()+"%";
       
       ProviderDAO dao = new ProviderDAO();
       List<Providers> list = dao.findProvidersByName(name);
       DefaultTableModel dfd = (DefaultTableModel) tableProvider.getModel();
       dfd.setRowCount(0);
               
               for(Providers c:list){
             dfd.addRow(new Object[]{
                 c.getId(),
                 c.getName(),
                 c.getCnpj(),
                 c.getEmail(),
                 c.getTelephone(),
                 c.getCell(),
                 c.getCep(),
                 c.getCity(),
                 c.getAddress(),
                 c.getNeighborhood(),
                 c.getNumber(),
                 c.getComplement(),
                 c.getUf()    
         });
         }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error "+e.getMessage());
       }
      
    }//GEN-LAST:event_btnSearchNameActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        String name = "%"+txtSearch.getText()+"%";
       
       ProviderDAO dao = new ProviderDAO();
       List<Providers> list = dao.findProvidersByName(name);
       DefaultTableModel dfd = (DefaultTableModel) tableProvider.getModel();
       dfd.setRowCount(0);
               
               for(Providers c:list){
             dfd.addRow(new Object[]{
                 c.getId(),
                 c.getName(),
                 c.getRg(),
                 c.getCnpj(),
                 c.getEmail(),
                 c.getTelephone(),
                 c.getCell(),
                 c.getCep(),
                 c.getCity(),
                 c.getAddress(),
                 c.getNeighborhood(),
                 c.getNumber(),
                 c.getComplement(),
                 c.getUf()    
         });
         }
        
    }//GEN-LAST:event_txtSearchKeyPressed
 
    private void txtCepPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepPKeyPressed
    /*  if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
         Providers obj =  new Providers();
         ProviderDAO dao = new ProviderDAO();
         obj = dao.buscaCep(txtCepP.getText());
         
         txtAddressP.setText(obj.getAddress());
         txtNeighBorhoodP.setText(obj.getNeighborhood());
         txtCityP.setText(obj.getCity());
        cbxUfP.setSelectedItem(obj.getUf());               
        }
        */
    }//GEN-LAST:event_txtCepPKeyPressed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = txtNameP.getText();
        Providers obj = new Providers();
        ProviderDAO dao = new ProviderDAO();
        
        obj = dao.findProviderByName(name);
        
        if(obj.getName()!= null){
            txtCodeP.setText(String.valueOf(obj.getId()));
            txtNameP.setText(obj.getName());
            txtCnpj.setText(obj.getCnpj());
            txtEmailP.setText(obj.getEmail());
            txtTelephoneP.setText(obj.getTelephone());
            txtCellP.setText(obj.getCell());
            txtCepP.setText(obj.getCep());
            txtAddressP.setText(obj.getAddress());
            txtNumberP.setText(String.valueOf(obj.getNumber()));
            txtComplementP.setText(obj.getComplement());
            txtNeighBorhoodP.setText(obj.getNeighborhood());
            txtCityP.setText(obj.getCity());
            cbxUfP.setSelectedItem(obj.getAddress());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableProviderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableProviderKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableProviderKeyPressed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(FrmProviders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProviders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProviders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProviders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProviders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeleteP;
    private javax.swing.JButton btEditP;
    private javax.swing.JButton btNewP;
    private javax.swing.JButton btnSearchName;
    private javax.swing.JButton bttSaveP;
    private javax.swing.JComboBox<String> cbxUfP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private javax.swing.JPanel panelData;
    private javax.swing.JTable tableProvider;
    private javax.swing.JTextField txtAddressP;
    private javax.swing.JFormattedTextField txtCellP;
    private javax.swing.JFormattedTextField txtCepP;
    private javax.swing.JTextField txtCityP;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JTextField txtCodeP;
    private javax.swing.JTextField txtComplementP;
    private javax.swing.JTextField txtEmailP;
    private javax.swing.JTextField txtNameP;
    private javax.swing.JTextField txtNeighBorhoodP;
    private javax.swing.JTextField txtNumberP;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JFormattedTextField txtTelephoneP;
    // End of variables declaration//GEN-END:variables

}
