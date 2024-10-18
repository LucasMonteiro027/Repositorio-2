/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject5;

import java.util.Scanner;

/**
 *
 * @author LUCAS MONTEIRO
 */
public class Mavenproject5 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        
        //Solicitar o valor do produto no exterior.
        System.out.print("Digite o valor do produto no exterior: ");
        double valorProduto = entrada.nextDouble();

        if (valorProduto <= 0) {
            System.out.println("Valor inválido, tente novamente mais tarde.");
        } else {
            
            //Escolher o tipo de frete.
            System.out.println("Escolha o tipo de frete desejado:");
            System.out.println("1 - Frete demorado (10% do valor do produto)");
            System.out.println("2 - Frete médio (15% do valor do produto)");
            System.out.println("3 - Frete rápido (20% do valor do produto)");
            int frete = entrada.nextInt();

            if (frete < 1 || frete > 3) {
                System.out.println("Opção de frete inválida, tente novamente mais tarde.");
            } else {
                
                //Calcular a taxa de importação e o frete.
                double taxaImportacao = valorProduto * 0.60;
                double taxaFrete = 0;

                switch (frete) {
                    case 1: 
                        taxaFrete = valorProduto * 0.10;
                        System.out.println("Frete demorado escolhido!");
                        break;
                    case 2: 
                        taxaFrete = valorProduto * 0.15;
                        System.out.println("Frete médio escolhido!");
                        break;
                    case 3:
                        taxaFrete = valorProduto * 0.20;
                        System.out.println("Frete rápido escolhido!");
                        break;
                }

                //Calcular o valor do produto final.
                double valorFinal = valorProduto + taxaImportacao + taxaFrete;

                //Imprimir os valores calculados.
                System.out.println("Valor da taxa de importação: R$ " + taxaImportacao);
                System.out.println("Valor do frete: R$ " + taxaFrete);
                System.out.println("Valor do produto final: R$ " + valorFinal);
            }
        }
    }
}
    
