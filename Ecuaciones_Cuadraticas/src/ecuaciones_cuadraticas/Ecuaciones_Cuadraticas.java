/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuaciones_cuadraticas;

import java.util.Scanner;

/**
 *
 * @author syste
 */
public class Ecuaciones_Cuadraticas {

    /**
     * @param args the command line argument  s
     */
    public static void main(String[] args) {
        double cuadratico = 0;
        double lineal=0;
        double independiente = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el termino cuadratico: ");
        cuadratico = sc.nextFloat();
        System.out.println("Ingrese el termino lineal: ");
        lineal=sc.nextFloat();
        System.out.println("Ingrese el termino independiente: ");
        independiente=sc.nextFloat();
        double potencia = 0;
        double multiplicacion = 0;
        double resta=0;
        double multdenom=0;
        double raizcuadrada=0;
        double denomresta=0;
        double denomsum=0;
        double x1=0;
        double x2=0;
        potencia = Math.pow(lineal, 2);
        multiplicacion = (4*(cuadratico*independiente));
        multdenom = 2*cuadratico;
        resta=potencia-multiplicacion;
        raizcuadrada=Math.sqrt(resta);
        denomresta=(lineal*-1)+raizcuadrada;
        denomsum=(lineal*-1)-raizcuadrada;
        x1=denomresta/multdenom;
        x2=denomsum/multdenom;
        System.out.println(potencia);
        System.out.println(multiplicacion);
        System.out.println(multdenom);
        System.out.println(resta);
        
        System.out.println("Resultado No.1: "+x1+"\n"+"Resultado No.2: " +x2);
        
        
        
        
        // TODO code application logic here
    }
    
}
