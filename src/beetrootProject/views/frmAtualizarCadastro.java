/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package beetrootProject.views;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import beetrootProject.conexao.ConexaoMyDB;
import beetrootProject.model.CadastroCliente;

/**
 *
 * @author Victor Hugo Marques
 */
public class frmAtualizarCadastro extends javax.swing.JFrame {

    /**
     * Creates new form frmAtualizarCadastro
     */
    public frmAtualizarCadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelCodigoCliente = new javax.swing.JLabel();
        jLabelSobrenome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelDataNascimento = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        txtCodigoCliente = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jFormattedTextCPF = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jButtonAtualizar = new javax.swing.JButton();
        jLabelFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 710));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        jLabelUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Cadastro de cliente");

        jLabelCodigoCliente.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCodigoCliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelCodigoCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigoCliente.setText("Código cliente");

        jLabelSobrenome.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSobrenome.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelSobrenome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSobrenome.setText("Sobrenome");

        jLabelCPF.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCPF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelCPF.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCPF.setText("CPF");

        jLabelNome.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNome.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome");

        jLabelDataNascimento.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDataNascimento.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataNascimento.setText("Data Nascimento");

        jLabelIdade.setBackground(new java.awt.Color(255, 255, 255));
        jLabelIdade.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelIdade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIdade.setText("Idade");

        jLabelSexo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSexo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelSexo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSexo.setText("Sexo");

        txtIdade.setBackground(new java.awt.Color(153, 153, 153));
        txtIdade.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtIdade.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIdade.setToolTipText("Digite seu usuário");
        txtIdade.setBorder(null);
        txtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeActionPerformed(evt);
            }
        });

        txtSobrenome.setBackground(new java.awt.Color(153, 153, 153));
        txtSobrenome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtSobrenome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSobrenome.setToolTipText("Digite seu usuário");
        txtSobrenome.setBorder(null);
        txtSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobrenomeActionPerformed(evt);
            }
        });

        txtCodigoCliente.setBackground(new java.awt.Color(153, 153, 153));
        txtCodigoCliente.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtCodigoCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigoCliente.setToolTipText("Digite seu usuário");
        txtCodigoCliente.setBorder(null);
        txtCodigoCliente.setEnabled(false);
        txtCodigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoClienteActionPerformed(evt);
            }
        });

        txtNome.setBackground(new java.awt.Color(153, 153, 153));
        txtNome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNome.setToolTipText("Digite seu usuário");
        txtNome.setBorder(null);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jFormattedTextCPF.setBackground(new java.awt.Color(153, 153, 153));
        try {
            jFormattedTextCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextCPF.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        jFormattedTextFieldDataNascimento.setBackground(new java.awt.Color(153, 153, 153));
        try {
            jFormattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataNascimento.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jFormattedTextFieldDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataNascimentoActionPerformed(evt);
            }
        });

        jComboBoxSexo.setBackground(new java.awt.Color(153, 153, 153));
        jComboBoxSexo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha seu sexo", "Feminino", "Masculino" }));
        jComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexoActionPerformed(evt);
            }
        });

        jButtonAtualizar.setBackground(new java.awt.Color(255, 153, 0));
        jButtonAtualizar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setBorder(null);
        jButtonAtualizar.setFocusable(false);
        jButtonAtualizar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButtonAtualizarAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButtonAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAtualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAtualizarMouseExited(evt);
            }
        });
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jLabelFechar.setFont(new java.awt.Font("Teko SemiBold", 1, 24)); // NOI18N
        jLabelFechar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechar.setText("X");
        jLabelFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFecharMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSobrenome))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jButtonAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextCPF))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 325, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jLabelFechar)
                .addGap(20, 20, 20)
                .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexo)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );

        getContentPane().add(jPanelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadeActionPerformed

    private void txtSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeActionPerformed

    private void txtCodigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoClienteActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jFormattedTextFieldDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataNascimentoActionPerformed

    private void jComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSexoActionPerformed

    private void jButtonAtualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAtualizarMouseEntered
        // Efeito na cor quando o mouse passa
        jButtonAtualizar.setBackground(new Color(230,140,30));
    }//GEN-LAST:event_jButtonAtualizarMouseEntered

    private void jButtonAtualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAtualizarMouseExited
        // Retiro o efeito na cor quando o mouse sai
        jButtonAtualizar.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jButtonAtualizarMouseExited

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // pegar os dados dos componentes e jogar na classe cadastro cliente
            CadastroCliente.nome_cliente = txtNome.getText();
            CadastroCliente.sobrenome_cliente = txtSobrenome.getText();
            CadastroCliente.idade_cliente = Integer.parseInt(txtIdade.getText());
                //convertendo a data
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                try{
                    java.util.Date date=  sdf.parse(jFormattedTextFieldDataNascimento.getText());
                    java.sql.Date dataSql = new java.sql.Date(date.getTime());
                    CadastroCliente.data_nascimento_cliente = dataSql;            
                }
                catch(ParseException ex){
                    Logger.getLogger(frmCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            CadastroCliente.sexo_cliente = jComboBoxSexo.getSelectedItem().toString();
            CadastroCliente.Cpf = jFormattedTextCPF.getText();
            CadastroCliente.codigo_cliente = txtCodigoCliente.getText();
            
            atualizarDados(); 
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // buscar os dados quando iniciar o formulário de alteração de cadastro
        povoarJtable();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonAtualizarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButtonAtualizarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAtualizarAncestorAdded

    private void jLabelFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFecharMouseClicked
        // fechar o form
        this.dispose();
    }//GEN-LAST:event_jLabelFecharMouseClicked
    //método para buscar os dados selecionados no frmMostrarCadastro
    public void povoarJtable(){
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement  stmt = null; 
        
        String sql = "SELECT * FROM tb_cadastro WHERE id_tb_cadastro = '" + 
                CadastroCliente.id_tb_cadastro + "'";
        System.out.println(CadastroCliente.id_tb_cadastro);
        try{
            conn = ConexaoMyDB.getConexao();
            stmt = conn.prepareStatement(sql); 
            rs = stmt.executeQuery();
            rs.next();
            
            txtCodigoCliente.setText(rs.getString("codigo_cliente"));
            txtNome.setText(rs.getString("nome_cliente" ));
            txtSobrenome.setText(rs.getString("sobrenome_cliente"));
            jFormattedTextCPF.setText(rs.getString("cpf_cliente"));
                //formatando a data de nascimento yyyy/MM/dd para dd/MM;yyyy; 
                DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
                jFormattedTextFieldDataNascimento.setText(data.format(rs.getDate("data_nascimento_cliente")));
                
            txtIdade.setText(rs.getString("idade_cliente"));
            jComboBoxSexo.setSelectedItem(rs.getString("sexo_cliente"));            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados. Erro:" + ex);
        }
        finally{
            ConexaoMyDB.fecharConexao(conn, stmt, rs);
        }
    }
    //método para atualizar dados no banco de dados 
    public void atualizarDados(){
        String sql = "UPDATE tb_cadastro SET nome_cliente = ?, sobrenome_cliente= ?, idade_cliente= ?"
                + ", data_nascimento_cliente= ?, sexo_cliente= ?, cpf_cliente= ? "
                + " WHERE codigo_cliente = ? ";
        
        Connection conn = null; 

        conn = ConexaoMyDB.getConexao();
        PreparedStatement stmt = null;
        
        try{
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, CadastroCliente.nome_cliente);
            stmt.setString(2, CadastroCliente.sobrenome_cliente);
            stmt.setInt   (3, CadastroCliente.idade_cliente);
            stmt.setDate  (4, CadastroCliente.data_nascimento_cliente);
            stmt.setString(5, CadastroCliente.sexo_cliente);
            stmt.setString(6, CadastroCliente.Cpf);
            stmt.setString(7, CadastroCliente.codigo_cliente);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!"); 
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco de dados. Erro:" + ex);
        }
        finally{
            ConexaoMyDB.fecharConexao(conn, stmt);
        }
        
        //fecho a janela se for tudo como esperado
        this.dispose();
        
    }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAtualizarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAtualizarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAtualizarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAtualizarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAtualizarCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JFormattedTextField jFormattedTextCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCodigoCliente;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelFechar;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}