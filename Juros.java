/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juros;

import java.util.Scanner;

/**
 *
 * @author FelipePereira007
 */
public class Juros {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double juros, valor, rendimento;
    
    juros=0.70;
    
    
    System.out.print("Digite o Valor Investido na Poupanca: ");
    valor=sc.nextDouble();
    
    rendimento=valor*(1+juros*1);
    System.out.println("Valor de Rendimento em 1 mes: " + rendimento);
    }
}
