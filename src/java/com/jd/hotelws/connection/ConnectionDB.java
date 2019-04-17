/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            System.out.println("Error al conectar a la base de datos");
            e.printStackTrace();
        }
        return connection;
    }
}
