/*
 * Responsável por conectar ao banco de dados
 */
package beetrootProject.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import beetrootProject.conexao.ConexaoMyDB;

/**
 *
 * @author Victor Hugo Marques
 */
public class CadastroClienteConexao {
    public void InserirCliente(){
        String sql = "INSERT INTO tb_cadastro (nome_cliente, sobrenome_cliente, idade_cliente, "
                + "data_nascimento_cliente, sexo_cliente, cpf_cliente, codigo_cliente)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        
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
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco de dados. Erro:" + ex);
        }
        finally{
            ConexaoMyDB.fecharConexao(conn, stmt);
        }
    }
}
