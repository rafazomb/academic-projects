/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aula10do09;

import javax.swing.JOptionPane; 
/**
 *3ª) Criar um programa que receba 2 valores e calcule o produto através de um método que 
retorna valores
 * @author João Silva, Nathan e Rafael
 */
public class ex03 {

    public static float produto(float num1, float num2){
            float prod = num1*num2; 
            return prod; 
    }
    
    public static void main(String[] args) {
        
        String num1= JOptionPane.showInputDialog(null, "digite o valor 1: ", "Ex3", 1); 
        
        int numero1=Integer.parseInt(num1); 
        
        String num2= JOptionPane.showInputDialog(null, "digite o valor 2: ", "Ex3", 1); 
        
        int numero2=Integer.parseInt(num2);
        
        JOptionPane.showMessageDialog(null, "O produto dos valores é igual à: "+produto(numero1, numero2), "Produto", 1);
        
    }
    
}