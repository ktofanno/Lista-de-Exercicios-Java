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
public class Exercicio2 {
    
    public static void calcularCubo(){
        
        Scanner scanner = new Scanner(System.in);
        
        int n1;
        double cuboN;
        
        System.out.println("Digite o número: ");
        n1 = scanner.nextInt();
        
        cuboN = Math.pow(n1, 3);
        
        System.out.printf("O cubo de " + n1 + "é: " + cuboN);
       
       
        
        
        
        
    }
    
}
