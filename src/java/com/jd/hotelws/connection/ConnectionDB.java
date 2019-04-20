package com.jd.hotelws.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jeferson Camargo
 */
public class ConnectionDB {

    /**
     * Metodo con el cual establezco la conexion con la base de datos Oracle.
     *
     * @return connection
     */
    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String dataBase = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "HOTEL";
            String password = "HOTEL";
            connection = DriverManager.getConnection(dataBase, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
