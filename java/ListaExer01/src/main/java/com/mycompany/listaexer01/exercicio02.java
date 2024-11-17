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
public class exercicio02 {
//lista de exercicios 1 - Nathan e Rafael
    public static void main(String[] args) {
       
        float salmin, sal, salmins;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o salário mínimo.");
        salmin = input.nextFloat();
        
        System.out.println("Digite seu salário.");
        sal = input.nextFloat();
        
        salmins = sal/salmin ;
        
        System.out.printf("O numero de salarios minimos são %f",salmins);
    }
}
