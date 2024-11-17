/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista08dia08do10;
import javax.swing.JOptionPane;
/**
 *3) Escreva uma classe em Java que simule uma calculadora bem simples. Essa 
classe deve ter como atributos duas variáveis double e um char. Deve possuir um 
construtor que recebe como parâmetro dois números e um caracter,correspondente 
a uma das operações básicas (+, -, *, /). Deve ter um método para
calcular a operação desejada e um para imprimir o resultado. O programa deve 
considerar divisões por zero como sendo erros, e imprimir uma mensagem 
adequada
 * @author João Silva, Nathan e Rafael
 */
public class exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1,num2;
        char oper;
        String entrada = JOptionPane.showInputDialog(null,"Digite o primeiro número ","EX03",1);
        num1 = Double.parseDouble(entrada);
        entrada = JOptionPane.showInputDialog(null,"Digite o segundo número ","EX03",1);
        num2 = Double.parseDouble(entrada);
        entrada = JOptionPane.showInputDialog(null,"Digite a operação desejada(+,-,*,/) ","EX03",1);
        oper = entrada.charAt(0);
        Calculadora calcu = new Calculadora(num1,num2,oper);
        calcu.calcular();
        JOptionPane.showMessageDialog(null,"O resultado dessa operação é "+calcu.Resultado(),"EX03",1);
    }
   
}
