/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaexercicios;

import java.util.Scanner;

/**
 *
 * @author ufrj
 */
public class Exercicio4 {
    public static void VerificarChar(){
       Scanner scanner = new Scanner(System.in);
       
       char caracter;
       
       System.out.println("Digite um caracter: ");
       caracter = scanner.next().charAt(0); // .charAt(numero) lê apenas o caracter indicado
       
       if (caracter >= '0' && caracter <= '9'){
           System.out.println("Caracter");
       } else {
           System.out.println("Letra");
       }
       
       
       
       
 
    }
    
}
