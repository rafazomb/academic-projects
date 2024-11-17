/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aula10do09;
/**
 *1ª) Criar um programa que permita a entrada de um número inteiro e retorne o seu dobro, 
através de um método.
 * @author João Silva, Nathan e Rafael
 */
import javax.swing.JOptionPane; 

public class ex01 {

    public static int dobro(int num){
            num = num*2; 
            return num; 
    }
    
    public static void main(String[] args) {
        
        String numero= JOptionPane.showInputDialog(null, "digite um número: ", "Ex1", 1); 
        
        int numero1=Integer.parseInt(numero); 
        
        JOptionPane.showMessageDialog(null, "O dobro deste valor é: "+dobro(numero1), "Dobro", 1);
        
    }
    
}
