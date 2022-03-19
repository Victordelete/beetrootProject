/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package beetrootProject.views;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import beetrootProject.conexao.ConexaoMyDB;
import beetrootProject.model.CadastroCliente;

/**
 *
 * @author Victor Hugo Marques
 */
public class frmMostrarCadastro extends javax.swing.JFrame {

    /**
     * Creates new form frmMostrarCadastro
     */
    public frmMostrarCadastro() {
        initComponents();
        
        //trocar o cabeçalho da tabela.
        JTableHeader jth = jTableCliente.getTableHeader();
        jth.setBackground(new Color(51,51,51));
        jth.setForeground(Color.WHITE);
        jth.setFont (new Font("Century Gothic", Font.BOLD, 18 ));
        
    }
    
    public Connection conn = null; 
    
    //método de poboar a jtablecliente 
    //buscando do banco de dados (VICTOR HUGO)
    public void povoarJtable(String sql){
        conn = ConexaoMyDB.getConexao();
        
        try{
            PreparedStatement stmt = conn.prepareCall(sql); 
            stmt.execute(); 
            
            ResultSet rs = stmt.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) jTableCliente.getModel();
            model.setNumRows(0); //inicializando do primeiro elemento da tabela
            
            //tratamento de data
            DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
            
            while(rs.next()){
                model.addRow(new Object []{
                    rs.getString("codigo_cliente"),
                    rs.getString("nome_cliente"),
                    rs.getString("sobrenome_cliente"),
                    rs.getInt   ("idade_cliente"),
                    rs.getString("data_nascimento_cliente"),
                    rs.getString("sexo_cliente"),
                    rs.getString("cpf_cliente"),
                    rs.getInt("id_tb_cadastro")
                });
            }
            
            ConexaoMyDB.fecharConexao(conn, stmt, rs); 
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi posível obter os dados do banco de dados. Erro: "+ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        txtPesquisaPorNome = new javax.swing.JTextField();
        txtPesquisaPorCPF = new javax.swing.JTextField();
        jLabelPesquisaPorNome = new javax.swing.JLabel();
        jLabelPesquisaPorCpf = new javax.swing.JLabel();
        jButtonDeletarCadastro = new javax.swing.JButton();
        jButtonAtualizarCadastro = new javax.swing.JButton();
        txtNomeControle = new javax.swing.JTextField();
        txtNControle = new javax.swing.JTextField();
        jLabelFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1350, 700));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jTableCliente.setBackground(new java.awt.Color(255, 153, 0));
        jTableCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTableCliente.setForeground(new java.awt.Color(255, 255, 255));
        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Sobrenome", "Idade", "Data Nascimentol", "Sexo", "Cpf", "Nº. Cadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);

        txtPesquisaPorNome.setBackground(new java.awt.Color(153, 153, 153));
        txtPesquisaPorNome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtPesquisaPorNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPesquisaPorNome.setToolTipText("Realizar pesquisa pelo Nome do Cliente.");
        txtPesquisaPorNome.setBorder(null);
        txtPesquisaPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaPorNomeActionPerformed(evt);
            }
        });
        txtPesquisaPorNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisaPorNomeKeyTyped(evt);
            }
        });

        txtPesquisaPorCPF.setBackground(new java.awt.Color(153, 153, 153));
        txtPesquisaPorCPF.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtPesquisaPorCPF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPesquisaPorCPF.setToolTipText("Realizar pesquisa pelo Cpf do Cliente.");
        txtPesquisaPorCPF.setBorder(null);
        txtPesquisaPorCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaPorCPFActionPerformed(evt);
            }
        });
        txtPesquisaPorCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisaPorCPFKeyTyped(evt);
            }
        });

        jLabelPesquisaPorNome.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPesquisaPorNome.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabelPesquisaPorNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPesquisaPorNome.setText("Pesquisa por Nome");

        jLabelPesquisaPorCpf.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPesquisaPorCpf.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabelPesquisaPorCpf.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPesquisaPorCpf.setText("Pesquisa por CPF");

        jButtonDeletarCadastro.setBackground(new java.awt.Color(255, 153, 0));
        jButtonDeletarCadastro.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonDeletarCadastro.setText("Deletar");
        jButtonDeletarCadastro.setBorder(null);
        jButtonDeletarCadastro.setFocusable(false);
        jButtonDeletarCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonDeletarCadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonDeletarCadastroMouseExited(evt);
            }
        });
        jButtonDeletarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarCadastroActionPerformed(evt);
            }
        });

        jButtonAtualizarCadastro.setBackground(new java.awt.Color(255, 153, 0));
        jButtonAtualizarCadastro.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonAtualizarCadastro.setText("Atualizar");
        jButtonAtualizarCadastro.setBorder(null);
        jButtonAtualizarCadastro.setFocusable(false);
        jButtonAtualizarCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAtualizarCadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAtualizarCadastroMouseExited(evt);
            }
        });
        jButtonAtualizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarCadastroActionPerformed(evt);
            }
        });

        txtNomeControle.setBackground(new java.awt.Color(153, 153, 153));
        txtNomeControle.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtNomeControle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNomeControle.setToolTipText("Realizar pesquisa pelo Nome do Cliente.");
        txtNomeControle.setBorder(null);
        txtNomeControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeControleActionPerformed(evt);
            }
        });
        txtNomeControle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeControleKeyTyped(evt);
            }
        });

        txtNControle.setBackground(new java.awt.Color(153, 153, 153));
        txtNControle.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtNControle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNControle.setToolTipText("Realizar pesquisa pelo Nome do Cliente.");
        txtNControle.setBorder(null);
        txtNControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNControleActionPerformed(evt);
            }
        });
        txtNControle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNControleKeyTyped(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPesquisaPorCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPesquisaPorNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPesquisaPorCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonDeletarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeControle, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPesquisaPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                                .addComponent(jButtonAtualizarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNControle, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFechar)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPesquisaPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAtualizarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNControle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPesquisaPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomeControle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonDeletarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPesquisaPorCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPesquisaPorCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaPorNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaPorNomeActionPerformed

    private void txtPesquisaPorCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaPorCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaPorCPFActionPerformed

    private void txtPesquisaPorNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaPorNomeKeyTyped
        // a cada letra digitada atualizamos a tabela
        String sql = "SELECT * FROM tb_cadastro WHERE nome_cliente LIKE '%" 
                + txtPesquisaPorNome.getText() + "%' OR sobrenome_cliente LIKE '%"
                + txtPesquisaPorNome.getText() + "%'"+ 
                "ORDER BY id_tb_cadastro  DESC";
        
        this.povoarJtable(sql);
    }//GEN-LAST:event_txtPesquisaPorNomeKeyTyped

    private void txtPesquisaPorCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaPorCPFKeyTyped
        // a cada letra digitada atualizamos a tabela
        String sql = "SELECT * FROM tb_cadastro WHERE cpf_cliente LIKE '%" 
                + txtPesquisaPorCPF.getText() + "%'" + 
                "ORDER BY id_tb_cadastro  DESC";
        
        this.povoarJtable(sql);
    }//GEN-LAST:event_txtPesquisaPorCPFKeyTyped

    private void jButtonDeletarCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeletarCadastroMouseEntered
        // Efeito na cor quando o mouse passa
        jButtonDeletarCadastro.setBackground(new Color(230,140,30));
    }//GEN-LAST:event_jButtonDeletarCadastroMouseEntered

    private void jButtonDeletarCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeletarCadastroMouseExited
        // Retiro o efeito na cor quando o mouse sai
        jButtonDeletarCadastro.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jButtonDeletarCadastroMouseExited

    private void jButtonDeletarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarCadastroActionPerformed
        // Deletar a linha escolhida
         if(txtNControle.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Não foi selecionada a linha para atualizar os dados.");
        }
        else{
            //abrir a tela frmAtualizarCadastro
            CadastroCliente.id_tb_cadastro = Integer.parseInt(txtNControle.getText());
            
            int respostaJOptionPane = JOptionPane.OK_CANCEL_OPTION;
            JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar este cadastro?", 
                    "Apagar cadastro", respostaJOptionPane);
            if(respostaJOptionPane == JOptionPane.OK_CANCEL_OPTION){
                deletarLinhaDados(); //métodos para apagar a linha selecionada
                
                //atualizar a JTable
                String sql = "SELECT * FROM tb_cadastro ORDER BY id_tb_cadastro DESC";
                povoarJtable(sql);
                
                txtNControle.setText("");
                txtNomeControle.setText(""); 
            }
        }
        
    }//GEN-LAST:event_jButtonDeletarCadastroActionPerformed
    
    //método para deletar a linha no banco de dados
    public void deletarLinhaDados(){
        conn = ConexaoMyDB.getConexao();
        
        String sql = "DELETE FROM tb_cadastro WHERE id_tb_cadastro = ? "; 
        PreparedStatement stmt = null; 
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, CadastroCliente.id_tb_cadastro);
            
            stmt.executeUpdate();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao apagar linha no banco de dados. Erro: "+ex);
        }
    }
    
    private void jButtonAtualizarCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAtualizarCadastroMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAtualizarCadastroMouseEntered

    private void jButtonAtualizarCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAtualizarCadastroMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAtualizarCadastroMouseExited

    private void jButtonAtualizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarCadastroActionPerformed
        //analiso se foi selecionado cadastro para edição
        if(txtNControle.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Não foi selecionada a linha para atualizar os dados.");
        }
        else{
            //abrir a tela frmAtualizarCadastro
            frmAtualizarCadastro frmAC = new frmAtualizarCadastro(); 
            frmAC.setVisible(true);
            CadastroCliente.id_tb_cadastro = Integer.parseInt(txtNControle.getText()); 
        }        
    }//GEN-LAST:event_jButtonAtualizarCadastroActionPerformed

    private void txtNomeControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeControleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeControleActionPerformed

    private void txtNomeControleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeControleKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeControleKeyTyped

    private void txtNControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNControleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNControleActionPerformed

    private void txtNControleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNControleKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNControleKeyTyped

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        // passar os valores da jTable para os text fields
        int linha = jTableCliente.getSelectedRow(); // selecionar a linha clicada pelo usuário
        txtNControle.setText(jTableCliente.getValueAt(linha, 7).toString());
        txtNomeControle.setText(jTableCliente.getValueAt(linha, 0).toString());
    }//GEN-LAST:event_jTableClienteMouseClicked

    private void jLabelFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFecharMouseClicked
        // fechar o form
        this.dispose();
    }//GEN-LAST:event_jLabelFecharMouseClicked

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
            java.util.logging.Logger.getLogger(frmMostrarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMostrarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMostrarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMostrarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMostrarCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizarCadastro;
    private javax.swing.JButton jButtonDeletarCadastro;
    private javax.swing.JLabel jLabelFechar;
    private javax.swing.JLabel jLabelPesquisaPorCpf;
    private javax.swing.JLabel jLabelPesquisaPorNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField txtNControle;
    private javax.swing.JTextField txtNomeControle;
    private javax.swing.JTextField txtPesquisaPorCPF;
    private javax.swing.JTextField txtPesquisaPorNome;
    // End of variables declaration//GEN-END:variables

    //private void initComponents() {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
}