/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author wwwam
 */
public class Kata5 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        connect();
    }
        private static void connect() {
        Connection conn = null;
        try {
            // parámetros de la BD
            String url = "jdbc:sqlite:Kata5.db";
            // creamos una conexión a la BD
            conn = DriverManager.getConnection(url);
            System.out.println("Connexión a SQLite establecida");
            SelectApp app = new SelectApp();
            app.selectAll();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
