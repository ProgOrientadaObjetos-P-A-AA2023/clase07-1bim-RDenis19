/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.util.ArrayList;
import java.util.Arrays;
import paquete1.Profesor2;

/**
 *
 * @author SALA H
 */
public class ManejoArrayList5 {

    public static void main(String[] args) {
        String[] lineas = {"Tara Hernandes|contratado|30",
            "Luis Andrade|factura|35", "Ana Juarez|nombramiento|40"};

        for (int i = 0; i < lineas.length; i++) {
            String me = lineas[i];
            
            ArrayList<String> linea = new ArrayList<>(
                    Arrays.asList(me.split("\\|")));
        
        String nombre = linea.get(0);
        String tipo = linea.get(1);
        String edad = linea.get(2);
        int edad2 = Integer.parseInt(edad);
        
        Profesor2 profesor = new Profesor2(nombre, tipo, edad2);
        System.out.printf("%s\n", profesor);
        }

    }

}
