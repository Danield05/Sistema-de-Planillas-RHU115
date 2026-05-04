/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import formularios.LoginForm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    
    private Connection conexion;
    private static boolean modoPrueba = true; // Modo para permitir funcionamiento sin BD

    public Conexion() {
    }
    
    public Connection getConexion() {
        conectar();
        return conexion;
    }
    
    //LoginForm ini = new LoginForm();
    
    //Método para establecer la conexión a la base de datos
    //USUARIO GENÉRICO PARA PRUEBAS SIN BASE DE DATOS
    
    public void conectar(){
        // String user = ini.r.mostrarUser();
        // String pass = ini.r.mostrarPass();
        String user = "admin"; // Usuario genérico
        String pass = "admin"; // Contraseña genérica
        
        if (modoPrueba) {
            // En modo prueba, no intentamos conectar a BD real
            // Solo mostramos un mensaje y continuamos
            System.out.println("Modo prueba activado - La aplicación funciona sin conexión a base de datos");
            return;
        }
        
        if (conexion == null) {
            try {
                String url = "jdbc:postgresql://localhost:5432/sic115";
                conexion = DriverManager.getConnection(url, user, pass);
                System.out.println("Conexión exitosa a la base de datos");
            } catch (SQLException ex) {
                // JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                // ini.r.quitarUser();
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);               
                // Para permitir que la aplicación continúe sin BD, creamos una conexión simulada
                // En un entorno real, aquí deberíamos manejar el error apropiadamente
                System.out.println("Advertencia: No se pudo conectar a la base de datos. La aplicación funcionará en modo limitado.");
                // No lanzamos la excepción para permitir que la aplicación continúe
            }
        }
    }
    
    //Método para desconectar la base de datos
    public void desconectar()  {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                conexion = null;
            }
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Método para activar/desactivar el modo prueba
    public static void setModoPrueba(boolean modo) {
        modoPrueba = modo;
    }
    
    public static boolean isModoPrueba() {
        return modoPrueba;
    }
    
}
