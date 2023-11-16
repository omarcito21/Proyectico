/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.Gastos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author 123cr
 */
public class Cliente implements Serializable{
    public String nroDocumento;
    public String nombre;
    public String apellido;
    public String celular;
    public static HashMap<String, Cliente> ClientesBD = new HashMap<>();
}
