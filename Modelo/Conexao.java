package Modelo;
import java.sql.DriverManager;
import java.sql.Connection;
public class Conexao {
    Connection con;
    String url="jdbc:racle:thin:@localhost:1521:system";
    String user="system";
    String pass="system";
    
    
    public Connection conectar(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
             con=DriverManager.getConnection(url,user,pass);
        }catch (Exception e){
            
        }
        return con;
    }
    
}
