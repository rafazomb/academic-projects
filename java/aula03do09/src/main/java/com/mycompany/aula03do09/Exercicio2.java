/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aula03do09;
import javax.swing.JOptionPane;

/**
 *2) Um programa que imprima até o “n” termo a seqüência de Fibonacci. Série: 
1,1,2,3,5,8,13,21.......
Por exemplo, imprimir até o 6º termo: 1, 1, 2, 3, 5, 8
 * @author João Silva, Nathan e Rafael H.
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num2 = 0, num3 = 1, var1 = 0, aux;
        String resul = "";
        try{
            String numero = JOptionPane.showInputDialog(null,"Digite o numero");
            var1 = Integer.parseInt(numero);
            if (var1 <= 0) {
                throw new Exception ("Valor menor que zero");
            }
            if (var1 == 1){
                resul = ""+num2;
            }
            else {
                resul = num2 + ", "+ num3; 
            }
            for (int n = 2; n < var1; n++){
                aux = num2;
                num2 =  num3 ;
                num3 = aux + num2;
                resul = resul + ", " + num3;
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Numero invalido");
            System.exit(0);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            System.exit(0);
        }
        finally{
            JOptionPane.showMessageDialog(null, "A sequencia de fibonacci ate o " + var1 +"º valor é: \n"+resul,"Fibonacci",1);
        }
    }
    
}
