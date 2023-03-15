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
     if( conexion.conectar()){
        new Login().setVisible(true); 
        System.out.println("Al fin nos conectamos");         
     }else{
         System.out.print("error al conectar la base de datos");
     }

    }
}
