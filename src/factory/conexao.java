
package factory;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class conexao {
    
    public Connection getConnection(){
        
        try{
         
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/medicos?useTimezone=true&serverTimezone=UTC","root","");

    
} catch(SQLException excecao){
    
    throw new RuntimeException(excecao);
    
}
    }
}
    
   
     
                
    
    
    
    