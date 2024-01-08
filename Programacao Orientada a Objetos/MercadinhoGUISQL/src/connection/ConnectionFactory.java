package connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
    private static final String DRIVE = "org.postgresql.Driver";
    private static final String URL   = "jdbc:postgresql://localhost:5432/mercado";
    private static final String USER = "postgres";
    private static final String PASS = "0710";
    
    
    public static Connection getConnection() {
           
        try {
            Class.forName(DRIVE);
            return DriverManager.getConnection(URL,USER,PASS);
        } catch(ClassNotFoundException | SQLException ex){
            throw new RuntimeException("Erro na conexao: ",ex);
        }
        
        
    }
    
    public static void closeConnection(Connection con){
            try {
                if(con!=null){
                con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public static void closeConnection(Connection con,PreparedStatement stmt){
            closeConnection(con);
            try {
                if(stmt!=null){
                    stmt.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public static void closeConnection(Connection con,PreparedStatement stmt,ResultSet rs){
            closeConnection(con,stmt);
            try {
                if(rs!=null){
                    rs.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
//    public void createTable(Connection conn, String table_name){
//        Statement statement;
//        try{
//            String query = "create table "+table_name+"(id SERIAL, name varchar(200),address varchar(200),primary key(id)";
//            statement=(Statement) conn.createStatement();
//            statement.executeUpdate(query);
//            
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        
//    }
    

    
    
    
}
