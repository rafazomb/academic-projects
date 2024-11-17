/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aula10do09;
import static com.mycompany.aula10do09.ex06.mes;
import javax.swing.JOptionPane;
/**
 *7ª) Criar um programa que retorne o fatorial de um número, usando um método que receba 
um valor e retorne o fatorial desse valor.
Fatorial de 5 = 5 x 4 x 3 x 2 x 1 = 120
 * @author João Silva, Nathan e Rafael
 */
public class ex07 {
    public static int fator(int inicio){
        int resp = 1;
        for (int p=1;p<=inicio;p++){
            resp = resp * p;
        }
        return resp;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String val = JOptionPane.showInputDialog(null,"Digite um número:","EX07",1);
        int num = Integer.parseInt(val);
        JOptionPane.showMessageDialog(null,"O valor fatorial desse número é: "+fator(num),"EX07",1);
    }
    
}
