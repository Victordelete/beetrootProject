/*
 * Responsável pela execuação dos comandos SQL
 */
package beetrootProject.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import beetrootProject.conexao.ConexaoMyDB;
import beetrootProject.views.frmTelaPrincipal;
import beetrootProject.views.frmTelaPrincipal;

/**
 *
 * @author Victor Hugo Marques
 */
public class LoginConexao {
    public void InserirUsuario(){
        String sql = "INSERT INTO tb_usuario (usuario, senha) VALUES (?, ?)";
        
        Connection conn = null; 

        conn = ConexaoMyDB.getConexao();
        PreparedStatement stmt = null; 
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, Login.usuario);
            stmt.setString(2, Login.senha);
            
            stmt.executeUpdate();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco de dados. Erro:");
        }
        finally{
            ConexaoMyDB.fecharConexao(conn, stmt);
        }
    }
    
    public void verificarUsuario(){
        String sql = "SELECT * FROM tb_usuario WHERE usuario = '" + Login.usuario +"'";
        
        Connection conn =  ConexaoMyDB.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            rs.next();
            
            String usuario1 = rs.getString("usuario");
            String senha1 = rs.getString("senha");
            
            //testar se o usuário é o mesmo digitado
            if(usuario1.equals(Login.usuario) && senha1.equals(Login.senha)){
                frmTelaPrincipal tp = new frmTelaPrincipal();
                tp.setVisible(true);
                ///JOptionPane.showMessageDialog(null, "Usuário liberado !!");
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco de dados. Erro:"+ex);
        }
        finally{
            ConexaoMyDB.fecharConexao(conn, stmt);
        }
    }
}
