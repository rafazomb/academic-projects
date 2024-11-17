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
public class exercicio01 {
//lista de exercicios 1 - Nathan e Rafael
    public static void main(String[] args) {
        String produto;
        float valor;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto: ");
        produto = input.next();
        System.out.println("Digite o valor unitario dele: ");
        valor = input.nextFloat();
        valor = (valor/100) * 91;
        System.out.printf("O %s com desconto de 9 porcento fica %f a unidade",produto, valor);
        
    }
}
