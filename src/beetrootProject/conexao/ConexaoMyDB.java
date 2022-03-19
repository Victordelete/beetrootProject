/*
 * Classe para conectar ao banco de dado
 */
package beetrootProject.conexao;
        
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Victor Hugo Marques
 */
public class ConexaoMyDB {
    //atributos staticos e finais para conexão com o banco de dados
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/mydb_bentec";
    private static final String USER = "root";
    private static final String PASS = "3141592";
    
    //tento conectar ao banco de dados 
    public static Connection getConexao(){
        try{
            Class.forName(DRIVER);
            return (Connection) DriverManager.getConnection(URL, USER, PASS);
        }
        catch(ClassNotFoundException | SQLException ex){
            throw new RuntimeException("Algo aconteceu de errado com a conexão com o banco, veja: " + ex);
        }
    }
    
    //fechando conexão com o banco de dados
    public static void fecharConexao (Connection conn){
        if (conn != null){ //se estiver conectado
            try{
                conn.close();
            }
            catch(SQLException ex){
                throw new RuntimeException("Algo aconteceu de errado com o fechamento da conexão com o banco, veja: " + ex);
            }
        }
    }
    
    public static void fecharConexao (Connection conn, PreparedStatement stmt){
        if (stmt != null){ //se estiver conectado
            try{
                stmt.close();
            }
            catch(SQLException ex){
                throw new RuntimeException("Algo aconteceu de errado com o fechamento da conexão com o banco, veja: " + ex);
            }
        }
        //caso já esteja fechado passamos para o próximo passo
        fecharConexao(conn);
    }
    
    public static void fecharConexao (Connection conn, PreparedStatement stmt, ResultSet rs){
        if (rs != null){ //se estiver conectado
            try{
                rs.close();
            }
            catch(SQLException ex){
                throw new RuntimeException("Algo aconteceu de errado com o fechamento da conexão com o banco, veja: " + ex);
            }
        }
        //caso já esteja fechado passamos para o próximo passo
        fecharConexao(conn, stmt);
    }
    
    
    
    
    
    
    
}
