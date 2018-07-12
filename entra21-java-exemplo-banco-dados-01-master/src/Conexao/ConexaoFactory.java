package Conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Gabriel
 */
public class ConexaoFactory {
    private static String CLASS_NAME = "com.mysql.jdbc.Driver";
    private static String HOST = "jdbc:mysql://localhost/exemplo_banco_dados_01";
    private static String LOGIN = "root";
    private static String SENHA = "";
    private static Connection conexao;
    
    /*public static void main(String[] args) {    //Para saber se conexão foi conluida
      //  ConexaoFactory.obterConexao();
    }*/
    
    public static Connection obterConexao(){
        try{
            conexao = DriverManager.getConnection(HOST, LOGIN, SENHA); 
        }catch (SQLException e){
            e.printStackTrace();
        }
        
        return conexao;       
    }
    
    public static void fecharConexao(){
        try{
            if(conexao != null){
                conexao.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
    }
        
}
}