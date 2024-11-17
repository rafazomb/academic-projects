/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aula10do09;
/**
 *2ª) Criar um programa que receba 4 notas e calcule a média aritmética, através de um 
método
 * @author João Silva, Nathan e Rafael
 */
import javax.swing.JOptionPane; 

public class ex02 {

    public static float media(float nota1, float nota2, float nota3, float nota4){
            float med = ((nota1+nota2+nota3+nota4)/4); 
            return med; 
    }
    
    public static void main(String[] args) {
        
        String num1= JOptionPane.showInputDialog(null, "digite a nota 1: ", "Ex2", 1); 
        
        int numero1=Integer.parseInt(num1); 
        
        String num2= JOptionPane.showInputDialog(null, "digite a nota 2: ", "Ex2", 1); 
        
        int numero2=Integer.parseInt(num2); 
        
        String num3= JOptionPane.showInputDialog(null, "digite a nota 3: ", "Ex2", 1); 
        
        int numero3=Integer.parseInt(num3); 
        
        String num4= JOptionPane.showInputDialog(null, "digite a nota 4: ", "Ex2", 1); 
        
        int numero4=Integer.parseInt(num4); 
        
        JOptionPane.showMessageDialog(null, "A média dos valores é igual à: "+media(numero1, numero2, numero3, numero4), "Media", 1);
        
    }
    
}