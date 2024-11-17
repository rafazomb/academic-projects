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
public class exercicio05 {
//lista de exercicios 1 - Nathan e Rafael
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raio, altura, volume;
        System.out.println("Digite o valor do raio: ");
        raio = input.nextDouble();
        System.out.println("Digite o valor da altura: ");
        altura = input.nextDouble();
        volume = 3.14159*2*raio*altura;
        System.out.printf("O volume desse cilindro é %2f",volume);
    
    }
}
