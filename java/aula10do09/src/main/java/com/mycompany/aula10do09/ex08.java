/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aula10do09;
/**
 *8ª) Criar um programa que verifique se um número é primo ou não, através de um método. 
Número primo é divisível somente por 1 e por ele mesmo.
 * @author João Silva, Nathan e Rafael
 */
import javax.swing.JOptionPane; 

public class ex08 {
    public static boolean primo(int inicio){
        if (inicio>1){
            for (int p=2;p<inicio;p++){
                if (inicio%p == 0){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String val = JOptionPane.showInputDialog(null,"Digite um número:","EX08",1);
        int num = Integer.parseInt(val);
        if (primo(num)==true){
        JOptionPane.showMessageDialog(null,"Esse número é primo","EX08",1);    
        }
        if (primo(num)==false){
        JOptionPane.showMessageDialog(null,"Esse número não é primo","EX08",1);    
        }
    }
    
}
