/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docuinventsolutions.util;

import java.sql.*;

public class ConexionBD {
<<<<<<< HEAD
    private static final String URL = "jdbc:mysql://localhost:3306/pruebaJdbc";
    private static final String USER = "root";
    private static final String PASSWORD = "Julianjulian0julian"; 
=======
    private static final String URL = "jdbc:mysql://localhost:3306/docuinvent";
    private static final String USER = "root";
    private static final String PASSWORD = "";
>>>>>>> 14ab748675274c7aec6141fc054c5691b329bfc8

    public static Connection obtenerConexion() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
<<<<<<< HEAD
            throw new SQLException("Error cargando el driver", e);
        }
    }
}

=======
            throw new SQLException("No se pudo cargar el driver", e);
        }
    }
}
>>>>>>> 14ab748675274c7aec6141fc054c5691b329bfc8
