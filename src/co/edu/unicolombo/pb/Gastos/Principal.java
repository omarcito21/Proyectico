/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unicolombo.pb.Gastos;

import co.edu.unicolombo.pb.Gastos.vistas.VentanaPrincipal;

/**
 *
 * @author PC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
       //ventana.setLocationRelativeTo(null);
       ventana.setExtendedState(VentanaPrincipal.MAXIMIZED_BOTH);
       ventana.setVisible(true);
    }
    
}
