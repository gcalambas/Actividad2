/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/** Dado el valor en un triangulo equilatero, haga eun algortmo que obtenga el perimetro, elvalor de la altura y el area del triangulo.
 * **\/
 */

package com.mycompany.ejercicio19;
import java.util.Scanner;
public class Ejercicio19 {

    public static void main(String[] args) {
        double perimetro, altura, area;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del lado: ");
        double lado = entrada.nextDouble();
        
        perimetro = Triangulo_Equilatero.obtener_perimetro(lado);
        area = Triangulo_Equilatero.obtener_area(lado);
        altura = Triangulo_Equilatero.obtener_altura(lado);
        
        System.out.println("Perimetro: " + perimetro);
        
        System.out.println("Altura: "+ altura);
        
        System.out.println("Area: " + area);
    }
}
