/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programadovendedor;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ProgramaDoVendedor {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String nome;
        double salarioFixo, vendas, comissao, total;
        
        salarioFixo = 2500;
        
        
        
        System.out.print("Digite o nome do funcionario: ");
        nome = sc.nextLine();
        System.out.println(nome + salarioFixo);
        
        System.out.print("Digite a quantia de vendas efetuadas: ");
        vendas= sc.nextDouble();
        comissao = vendas*0.15;
        System.out.println("Total de Comissao Recebida pelo funcionario: " + comissao);
        
        total = comissao+salarioFixo;
        System.out.print("Total de Salario Mensal em Reais: " + total);
        
    }
}
