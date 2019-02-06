/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuesta;

import java.util.Scanner;

/**
 *
 * @author usuario25
 */
public class ENCUESTA {

    static Scanner leer =new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] ciudades ={0,0,0};
        String ciudad;
        String sexo;
        int cantidad=0;
        
        // TODO code application logic here
        System.out.println("Bienvenido!");
        System.out.println("ingrese cantidad de encuestados");
        cantidad=leer.nextInt();
        for (int i=0;i<cantidad;i++){
        System.out.println("ingrese sexo M=Maculino y F=Femenino");
        sexo=leer.next();
        System.out.println("ingrese su ciudad");
        ciudad=leer.next();
        if (sexo.toUpperCase().equals("F")&& ciudad.toUpperCase().equals("ARICA")){
            ciudades[0]=ciudades[0]+1;
        }
        else if (sexo.toUpperCase().equals("F")&& ciudad.toUpperCase().equals("IQUIQUE")){
            ciudades[1]=ciudades[1]+1;
        }
        else if (sexo.toUpperCase().equals("F")&& ciudad.toUpperCase().equals("CALAMA")){
            ciudades[2]=ciudades[2]+1;
        }
        }
        System.out.println("cantidad de mujeres por ciudad : Arica:"+ciudades[0]+" Iquique : "+ciudades[1]+" Calama : "+ciudades[2]);
    }
    
}
