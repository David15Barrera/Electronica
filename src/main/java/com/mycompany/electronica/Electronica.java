package com.mycompany.electronica;

import Visual.Login;
import conexion.Conexion;

/**
 *
 * @author david
 */
public class Electronica {

    public static void main(String[] args) {
     Conexion conexion = new Conexion();
     conexion.conectar();
     new Login().setVisible(true); 
 
    }
}
