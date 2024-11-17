/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexer01;

import java.util.Scanner;
/**
 *
 * @author Lab04Aluno
 */
public class exercicio04 {
//lista de exercicios 1 - Nathan e Rafael
    public static void main(String[] args) {
        
        float tempc, tempf;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em celsius.");
        tempc = input.nextFloat();
        
        tempf = (9 * tempc + 160) / 5;
      
        System.out.printf("A temperatura em Fahrenheit é %f", tempf);
        
    }
}
