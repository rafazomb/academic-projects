/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista08dia08do10;
import javax.swing.JOptionPane;

/**
 *
 * @author João Silva, Nathan e Rafael
 */
public class Calculadora {
    private double num1, num2, resul;
    private char oper;
    
    Calculadora(double nume1, double nume2, char opera){
        this.num1 = nume1;
        this.num2 = nume2;
        this.oper = opera;
    }
    public void calcular(){
        try{
            switch (oper){
            case '+':
                resul = num1 + num2;
                break;
            case '-':
                resul = num1 - num2;
                break;
            case '*':
                resul = num1 * num2;
                break;
            case '/':
                if(num2 == 0){
                    JOptionPane.showMessageDialog(null,"Divisão por 0","Error Div",1);
                }
                else{
                resul = num1 / num2;
                }
                break;
            default:
                throw new Exception("operador_errado");
            }
        }
        catch(Exception operador_errado){
                JOptionPane.showMessageDialog(null,"Character de operação invalido","Error char",1);
        }
    }
    public double Resultado() {
        return resul;
    }
}
