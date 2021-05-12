/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s22p6cmjs9926;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author CMJ
 */
public class G4s22p6cmjs9926 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
        lista.forEach(contenido -> {
            System.out.println("El valor contenido es "+ contenido);
        });
        
        lista.add("G");
        lista.add("H");
        
        System.out.println("\n Segunda lista de trabajar contenidos \n");
        
        for(String contenido1 : lista){
            System.out.println("El valor de contenido es " + contenido1);
        }
        lista.add("Victor");
        lista.add("Esta es una linea muy larga");
        lista.add("Hugo");
        lista.add("Segunda linea muy larga sin problemas de almacenamiento");

        
        System.out.println("\n tercer forma de trabajar recorridos de listas \n");
        
        lista.stream().forEach(contenido2 -> {
            System.out.println("El valor contenido es " + contenido2);
        });
    }
    
}
