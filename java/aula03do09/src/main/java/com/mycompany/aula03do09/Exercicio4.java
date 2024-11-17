/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aula03do09;
import javax.swing.*;

/**
 *4) Um programa que calcule a média de uma aluno nos moldes da Fatec Zona SUL
 * @author João Silva, Nathan e Rafael H.
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nota, notaTotal = 0; 
        int total = 2; 
        String resp = "s";
        
        try {
            String A = JOptionPane.showInputDialog(null, "Digite a nota 1 do aluno:","Exercicio 4",1);
            nota = Double.parseDouble(A);
            notaTotal = notaTotal + nota;
            if (nota > 10 | nota < 0){
                throw new Exception("Execeção");
            }
            A = JOptionPane.showInputDialog(null, "Digite a nota 2 do aluno:","Exercicio 4",1);
            nota = Double.parseDouble(A);
            notaTotal = notaTotal + nota;
            if (nota > 10 | nota < 0){
                throw new Exception("Execeção");
            }
            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Formato do número digitado errado!", "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        catch(Exception Execeção){
            JOptionPane.showMessageDialog(null, "Nota maior que 10 ou menor que 0!", "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        finally{
            notaTotal = notaTotal / total;
            JOptionPane.showMessageDialog(null, "Média Final:"+notaTotal,"Média",1);
        }
    }
}
