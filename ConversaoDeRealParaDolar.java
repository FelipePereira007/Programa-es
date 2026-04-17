/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversaoderealparadolar;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ConversaoDeRealParaDolar {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double real, dolar, dolar1, valor, restante;
            
    
    real = 5.22;
    
    System.out.print("Digite a Quantia de Dolares disponiveis: ");
    dolar1 = sc.nextDouble();
    
    System.out.print("Digite a Quantia de Dolares para converter: ");
    dolar = sc.nextDouble();
    
    valor = real*dolar;
    System.out.println("Valor de Conversao de Dolar em Real: " + valor);
    
    restante = dolar1-dolar;
    System.out.println("Quantia de Dolares restantes disponiveis: " + restante);
    
    }
}
