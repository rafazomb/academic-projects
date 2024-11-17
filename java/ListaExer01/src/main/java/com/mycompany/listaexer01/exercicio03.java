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
public class exercicio03 {
//lista de exercicios 1 - Nathan e Rafael
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float valor1, valor2, media;
    System.out.println("Digite o primeiro valor: ");
    valor1 = input.nextFloat();
    System.out.println("Digite o segundo valor: ");
    valor2 = input.nextFloat();
    media = (valor1 + valor2)/2;
    System.out.printf("A média dos valores é %f",media);
            
    }
}
