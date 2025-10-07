/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaexercicios;

import java.util.Scanner;


/**
 *
 * @author Tofano
 */
public class Exercicio5 {
    public static void calcularPrestacao(){
        Scanner scanner = new Scanner(System.in);
        
        double valor = 0d;
        double taxa = 0d;
        int tempo = 0;
        double prestacao = 0d;
        
        System.out.println("Digite o valor da prestação: R$ ");
        valor = scanner.nextDouble();
        
        System.out.println("Digite a porcentagem da taxa: ");
        taxa = scanner.nextDouble();
        
        System.out.println("Digite o tempo em atraso (meses): ");
        tempo = scanner.nextInt();
        
        prestacao = valor + (valor * (taxa/100) * tempo);
        
        System.out.printf("\n O valor da prestacao em atraso é: R$%.2f\n", prestacao);
        
    }   
}
