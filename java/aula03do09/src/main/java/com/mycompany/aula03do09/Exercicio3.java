/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aula03do09;
import javax.swing.JOptionPane;

/**
 *3) Um programa capaz de imprimir todos os números primos em um intervalo de 
números informado pelo usuário;
 * @author João Silva, Nathan e Rafael H.
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String resul = "";
        int min = 0, max = 0, aux = 1;
        try{
            String resp = JOptionPane.showInputDialog(null,"Digite o valor minimo: ", "Exercicio 3", 1);
            min = Integer.parseInt(resp);
            resp = JOptionPane.showInputDialog(null,"Digite o valor maximo: ", "Exercicio 3", 1);
            max = Integer.parseInt(resp);
            if (min > max){
                throw new Exception("MinMaior");
            }      
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Valor digitado em formato errado","Error",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        catch(Exception MinMaior){
            JOptionPane.showMessageDialog(null,"Valor Minimo é maior que o Maximo","Error",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        finally{
            for(int n = min; n <= max; n++){  
                if (n == 2){
                    aux = 0;
                }
                if (n > 2){
                    aux = 0;
                    for(int t = 2; t < n; t++){
                        if(n%t == 0){
                            t = n+1;
                            aux = 1;
                        }                    
                    }
                }
                if(aux == 0){
                    resul = resul + ", " + n;
                }
            }
            JOptionPane.showMessageDialog(null,"Números primos entre "+ min +" e "+ max +":\n"+ resul,"Exercicio 3",1);
        }
    }
    
}
