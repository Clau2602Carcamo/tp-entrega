/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author maygu
 */
public class Ejercicio1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
    int n1, n2 ;
    float area ;
            
    Scanner sc = new Scanner(System.in);
    //ingresos de datos
    System.out.print("Base : ");
    n1 = sc.nextInt();
    System.out.print("Altura: ");
    n2 = sc.nextInt();
    
    //procesos
    area = (n1*n2)/2;
    
    
    //resultado
    System.out.println("El area del triangulo es: " + area);
    }
    
}
