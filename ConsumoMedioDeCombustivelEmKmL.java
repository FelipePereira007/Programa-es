/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consumomediodecombustivelemkml;

import java.util.Scanner;

/**
 *
 * @author FelipePereira007
 */
public class ConsumoMedioDeCombustivelEmKmL {

   public static void main(String[] args) { {
    
        Scanner sc = new Scanner(System.in);
                
        int distancia, combustivelGasto, consumoMedio;
        
        
        
        
        System.out.print("Digite a Distancia Percorrida em Km: ");
        distancia=sc.nextInt();
        
        System.out.print("Digite a Quantia de Combustivel Gasto em L: ");
        combustivelGasto=sc.nextInt();
     
      
        
        consumoMedio=distancia/combustivelGasto;
        System.out.println("Consumo Medio em Km por L: " + consumoMedio);

    }    }
}
