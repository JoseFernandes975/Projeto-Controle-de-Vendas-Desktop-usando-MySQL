package br.com.project.view;

import br.com.project.dao.ClientDAO;
import br.com.project.dao.EmployeeDAO;
import br.com.project.model.Client;
import br.com.project.model.Employees;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class FrmEmployees extends javax.swing.JFrame {

    private Object txtNameSearch;

    public FrmEmployees() {
        initComponents();
    }
    
    public void findAll(){
        try{
        EmployeeDAO dao = new EmployeeDAO();
         List<Employees> list = dao.findAllEmployees();
         DefaultTableModel dados = (DefaultTableModel) tableEmployee.getModel();
         dados.setNumRows(0);
       
         
         for(Employees c:list){
             dados.addRow(new Object[]{
                 c.getId(),
                 c.getName(),
                 c.getRg(),
                 c.getCpf(),
                 c.getEmail(),
                 c.getPassword(),
                 c.getOffice(),
                 c.getAccessLevel(),
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
   e.printStackTrace();
    }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttSearchCpf = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtName2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNeighBorhood = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCell = new javax.swing.JFormattedTextField();
        txtTelephone = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txtOffice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        cbxUf = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtRg = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        txtComplement = new javax.swing.JTextField();
        cbxAccessLevel = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        bttSearchname = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnSearchName = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmployee = new javax.swing.JTable();
        txtNameS = new javax.swing.JTextField();
        btNew = new javax.swing.JButton();
        btEditEmploy = new javax.swing.JButton();
        bttSaveEmploy = new javax.swing.JButton();
        btDeleteEmploy = new javax.swing.JButton();

        bttSearchCpf.setText("Pesquisar");
        bttSearchCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSearchCpfActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        label1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Cadastro de Funcionários");

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Código:");

        txtCode.setEditable(false);
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        txtName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName2ActionPerformed(evt);
            }
        });
        txtName2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtName2KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("E-mail:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Endereço:");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("CEP :");

        txtNeighBorhood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNeighBorhoodActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Bairro:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("RG:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Celular:");

        try {
            txtCell.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCell.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        try {
            txtTelephone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelephone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Telefone(fixo):");

        txtOffice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOfficeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Complemento:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Cidade:");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Nº;");

        txtNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCepKeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("UF:");

        cbxUf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "P", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("CPF:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Senha:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Cargo:");

        txtComplement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementActionPerformed(evt);
            }
        });

        cbxAccessLevel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxAccessLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário", "Administrador" }));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Nível de Acesso:");

        bttSearchname.setText("Pesquisar");
        bttSearchname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSearchnameActionPerformed(evt);
            }
        });
        bttSearchname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bttSearchnameKeyPressed(evt);
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
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxAccessLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNeighBorhood, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttSearchname))
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCell, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDataLayout.createSequentialGroup()
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDataLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDataLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtComplement, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelDataLayout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        panelDataLayout.setVerticalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttSearchname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(txtNeighBorhood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtOffice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(cbxAccessLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados Pessoais", panelData);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Nome:");

        btnSearchName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearchName.setText("Pesquisar");
        btnSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNameActionPerformed(evt);
            }
        });

        tableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "RG", "CPF", "E-mail", "Senha", "Cargo", "Nível Acesso", "Celular", "Telefone", "CEP", "Cidade", "Endereco", "Bairro", "Nº", "Comp", "UF"
            }
        ));
        tableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEmployee);

        txtNameS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameSActionPerformed(evt);
            }
        });
        txtNameS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameSKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameS, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(btnSearchName)
                    .addComponent(txtNameS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta de Funcionários", jPanel3);

        btNew.setText("NOVO");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        btEditEmploy.setText("EDITAR");
        btEditEmploy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditEmployActionPerformed(evt);
            }
        });

        bttSaveEmploy.setText("SALVAR");
        bttSaveEmploy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSaveEmployActionPerformed(evt);
            }
        });

        btDeleteEmploy.setText("EXCLUIR");
        btDeleteEmploy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteEmployActionPerformed(evt);
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
                .addGap(198, 198, 198)
                .addComponent(btNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEditEmploy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttSaveEmploy)
                .addGap(18, 18, 18)
                .addComponent(btDeleteEmploy)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDeleteEmploy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttSaveEmploy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditEmploy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void txtName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName2ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtNeighBorhoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNeighBorhoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNeighBorhoodActionPerformed

    private void txtOfficeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOfficeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOfficeActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        new br.com.project.util.Util().cleanPane(panelData);
    }//GEN-LAST:event_btNewActionPerformed

    private void btEditEmployActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditEmployActionPerformed
         Employees obj =  new Employees();
            obj.setName(txtName2.getText());
            obj.setRg(txtRg.getText());
            obj.setCpf(txtCpf.getText());
            obj.setEmail(txtEmail.getText());
            obj.setPassword(txtPassword.getText());
            obj.setOffice(txtOffice.getText());
            obj.setAccessLevel(cbxAccessLevel.getSelectedItem().toString());
            obj.setCell(txtCell.getText());
            obj.setTelephone(txtTelephone.getText());
            obj.setCep(txtCep.getText());
            obj.setCity(txtCity.getText());
            obj.setAddress(txtAddress.getText());
            obj.setNeighborhood(txtNeighBorhood.getText());
            obj.setComplement(txtOffice.getText());
            obj.setNumber(Integer.parseInt(txtNumber.getText()));
            obj.setUf(cbxUf.getSelectedItem().toString());
            obj.setId(Integer.parseInt(txtCode.getText()));
            
            
            EmployeeDAO objDao = new EmployeeDAO();
            objDao.updateEmployee(obj);
            
            new br.com.project.util.Util().cleanPane(panelData);
 
    }//GEN-LAST:event_btEditEmployActionPerformed

    private void bttSaveEmployActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSaveEmployActionPerformed

            Employees obj =  new Employees();
            obj.setName(txtName2.getText());
            obj.setRg(txtRg.getText());
            obj.setCpf(txtCpf.getText());
            obj.setEmail(txtEmail.getText());
            obj.setPassword(txtPassword.getText());
            obj.setOffice(txtOffice.getText());
            obj.setAccessLevel(cbxAccessLevel.getSelectedItem().toString());
            obj.setCell(txtCell.getText());
            obj.setTelephone(txtTelephone.getText());
            obj.setCep(txtCep.getText());
            obj.setCity(txtCity.getText());
            obj.setAddress(txtAddress.getText());
            obj.setNeighborhood(txtNeighBorhood.getText());
            obj.setComplement(txtOffice.getText());
            obj.setNumber(Integer.parseInt(txtNumber.getText()));
            obj.setUf(cbxUf.getSelectedItem().toString());
            obj.setId(Integer.parseInt(txtCode.getText()));
            
            EmployeeDAO objDao = new EmployeeDAO();
            objDao.insertEmployee(obj);
         
            new br.com.project.util.Util().cleanPane(panelData);
 
    }//GEN-LAST:event_bttSaveEmployActionPerformed

    private void btDeleteEmployActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteEmployActionPerformed
          Employees employ = new Employees();
          employ.setId(Integer.parseInt(txtCode.getText()));
          
          EmployeeDAO objDao = new EmployeeDAO();
          objDao.deleteEmployee(employ);
             
             new br.com.project.util.Util().cleanPane(panelData);
    }                                      

    private void bt(java.awt.event.ActionEvent evt) {                                       
             Client obj =  new Client();
            obj.setName(txtName2.getText());
            obj.setRg(txtRg.getText());
            obj.setCpf(txtCpf.getText());
            obj.setEmail(txtEmail.getText());
            obj.setCell(txtCell.getText());
            obj.setTelephone(txtTelephone.getText());
            obj.setCep(txtCep.getText());
            obj.setCity(txtCity.getText());
            obj.setAddress(txtAddress.getText());
            obj.setNeighborhood(txtNeighBorhood.getText());
            obj.setComplement(txtOffice.getText());
            obj.setNumber(Integer.parseInt(txtNumber.getText()));
            obj.setUf(cbxUf.getSelectedItem().toString());
           
            
            ClientDAO objDao = new ClientDAO();
            objDao.insertClient(obj);
    }//GEN-LAST:event_btDeleteEmployActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCepActionPerformed

    private void tableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEmployeeMouseClicked
        jTabbedPane1.setSelectedIndex(0);
        
        txtCode.setText(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 0).toString());
        txtName2.setText(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 1).toString());
        txtRg.setText(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 2).toString());
        txtCpf.setText(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 3).toString());
        txtEmail.setText(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 4).toString());
        txtPassword.setText(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 5).toString());
        txtOffice.setText(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 6).toString());
        cbxAccessLevel.setSelectedItem(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 7).toString());
        txtCell.setText(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 8).toString());
        txtTelephone.setText(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 9).toString());
        txtCep.setText(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 10).toString());
        txtCity.setText(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 11).toString());
        txtAddress.setText(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 12).toString());
        txtNeighBorhood.setText(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 13).toString());
        txtNumber.setText(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 14).toString());
        txtOffice.setText(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 15).toString());
        cbxUf.setSelectedItem(tableEmployee.getValueAt(tableEmployee.getSelectedRow(), 16).toString());
        
    }//GEN-LAST:event_tableEmployeeMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         findAll();
    }//GEN-LAST:event_formWindowActivated

    private void btnSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNameActionPerformed
      
        String name = "%"+txtNameS.getText()+"%";
       
       EmployeeDAO dao = new EmployeeDAO();
       List<Employees> list = dao.findEmployeesByName(name);
       DefaultTableModel dfd = (DefaultTableModel) tableEmployee.getModel();
       dfd.setRowCount(0);
               
               for(Employees c:list){
             dfd.addRow(new Object[]{
                 c.getId(),
                 c.getName(),
                 c.getRg(),
                 c.getCpf(),
                 c.getEmail(),
                 c.getPassword(),
                 c.getOffice(),
                 c.getAccessLevel(),
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
      
    }//GEN-LAST:event_btnSearchNameActionPerformed

    private void bttSearchCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSearchCpfActionPerformed
      /*  Client obj = new Client();
        ClientDAO dao = new ClientDAO();
        String cpf = txtCpf.getText();
        
        obj = dao.findByCpf(cpf);
        
        txtCode.setText(String.valueOf(obj.getId()));
        txtNamee.setText(obj.getName());
        txtRg.setText(obj.getRg());
        txtCpf.setText(obj.getCpf());
        txtEmail.setText(obj.getEmail());
        txtTelephone.setText(obj.getTelephone());
        txtCell.setText(obj.getCell());
        txtCep.setText(obj.getCep());
        txtAddress.setText(obj.getAddress());
        txtNumber.setText(String.valueOf(obj.getNumber()));
        txtOffice.setText(obj.getComplement());
        txtNeighBorhood.setText(obj.getNeighborhood());
        txtCity.setText(obj.getCity());
        cbxUf.setSelectedItem(obj.getAddress());
   */     
    }//GEN-LAST:event_bttSearchCpfActionPerformed
 
    private void txtCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyPressed
   /*   if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
         Employees obj =  new Employees();
         EmployeeDAO dao = new EmployeeDAO();
         obj = dao.buscaCep(txtCep.getText());
         
         txtAddress.setText(obj.getAddress());
         txtNeighBorhood.setText(obj.getNeighborhood());
         txtCity.setText(obj.getCity());
        cbxUf.setSelectedItem(obj.getUf());               
      }
        */
    }//GEN-LAST:event_txtCepKeyPressed

    private void txtComplementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementActionPerformed

    private void bttSearchnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSearchnameActionPerformed

     String nome = txtName2.getText();
     Employees employ = new Employees();
     EmployeeDAO dao = new EmployeeDAO();
     
     employ = dao.findEmployeeByName(nome);
     
      if(employ.getName() != null){
        txtCode.setText(String.valueOf(employ.getId()));
        txtName2.setText(employ.getName());
        txtRg.setText(employ.getRg());
        txtCpf.setText(employ.getCpf());
        txtEmail.setText(employ.getEmail());
        txtPassword.setText(employ.getPassword());
        txtOffice.setText(employ.getOffice());
        cbxAccessLevel.setSelectedItem(employ.getAccessLevel());
        txtTelephone.setText(employ.getTelephone());
        txtCell.setText(employ.getCell());
        txtCep.setText(employ.getCep());
        txtAddress.setText(employ.getAddress());
        txtNumber.setText(String.valueOf(employ.getNumber()));
        txtComplement.setText(employ.getComplement());
        txtNeighBorhood.setText(employ.getNeighborhood());
        txtCity.setText(employ.getCity());
        cbxUf.setSelectedItem(employ.getAddress());
      }
    }//GEN-LAST:event_bttSearchnameActionPerformed

    private void bttSearchnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bttSearchnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttSearchnameKeyPressed

    private void txtNameSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameSKeyPressed
     String nome = txtNameS.getText();
     Employees employ = new Employees();
     EmployeeDAO dao = new EmployeeDAO();
     
     employ = dao.findEmployeeByName(nome);
     
      if(employ.getName()!= null){
        txtCode.setText(String.valueOf(employ.getId()));
        txtName2.setText(employ.getName());
        txtRg.setText(employ.getRg());
        txtCpf.setText(employ.getCpf());
        txtEmail.setText(employ.getEmail());
        txtPassword.setText(employ.getPassword());
        txtOffice.setText(employ.getOffice());
        cbxAccessLevel.setSelectedItem(employ.getAccessLevel());
        txtTelephone.setText(employ.getTelephone());
        txtCell.setText(employ.getCell());
        txtCep.setText(employ.getCep());
        txtAddress.setText(employ.getAddress());
        txtNumber.setText(String.valueOf(employ.getNumber()));
        txtComplement.setText(employ.getComplement());
        txtNeighBorhood.setText(employ.getNeighborhood());
        txtCity.setText(employ.getCity());
        cbxUf.setSelectedItem(employ.getAddress());
        
      }
    }//GEN-LAST:event_txtNameSKeyPressed

    private void txtNameSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameSActionPerformed

    private void txtName2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtName2KeyPressed
       
    }//GEN-LAST:event_txtName2KeyPressed
   
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
            java.util.logging.Logger.getLogger(FrmEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmployees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeleteEmploy;
    private javax.swing.JButton btEditEmploy;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btnSearchName;
    private javax.swing.JButton bttSaveEmploy;
    private javax.swing.JButton bttSearchCpf;
    private javax.swing.JButton bttSearchname;
    private javax.swing.JComboBox<String> cbxAccessLevel;
    private javax.swing.JComboBox<String> cbxUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private javax.swing.JPanel panelData;
    private javax.swing.JTable tableEmployee;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JFormattedTextField txtCell;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtComplement;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtNameS;
    private javax.swing.JTextField txtNeighBorhood;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtOffice;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JFormattedTextField txtTelephone;
    // End of variables declaration//GEN-END:variables

}
