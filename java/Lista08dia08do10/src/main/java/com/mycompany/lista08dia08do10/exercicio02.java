/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista08dia08do10;
import javax.swing.JOptionPane;
/**
 *2) A fim de representar empregados em uma firma, crie uma classe chamada 
Empregado que inclui as três informações a seguir como atributos: 
• um primeiro nome, 
• um sobrenome, e
• um salário mensal.
Sua classe deve ter um construtor que inicializa os três atributos. Forneça um
 método set e get para cada atributo. 
Escreva um aplicativo de teste que demonstra as capacidades da classe. Crie 
duas instâncias da classe e exiba o salário anual de cada instância. 
Então dê a cada empregado um aumento de 10% e exiba novamente o salário
 anual de cada empregado.
 * @author João Silva, Nathan e Rafael
 */
public class exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salario;
        String nome = JOptionPane.showInputDialog(null,"Digite o nome do empregado:","EX02",1);
        String sobrenome = JOptionPane.showInputDialog(null,"Digite o sobrenome do empregado:","EX02",1);
        String entrada = JOptionPane.showInputDialog(null,"Digite o salario do empregado:","EX02",1);
        salario = Double.parseDouble(entrada);
        Empregado num1 = new Empregado(nome,sobrenome,salario);
         nome = JOptionPane.showInputDialog(null,"Digite o nome do empregado:","EX02",1);
         sobrenome = JOptionPane.showInputDialog(null,"Digite o sobrenome do empregado:","EX02",1);
         entrada = JOptionPane.showInputDialog(null,"Digite o salario do empregado:","EX02",1);
        salario = Double.parseDouble(entrada);
        Empregado num2 = new Empregado(nome,sobrenome,salario);
        JOptionPane.showMessageDialog(null,"O "+ num1.getNome() + num1.getSobrenome() + " tem o salario de "+ num1.getSalario(),"EX02",1);
        JOptionPane.showMessageDialog(null,"O "+ num2.getNome() + num2.getSobrenome() + " tem o salario de "+ num2.getSalario(),"EX02",1);
        salario = num1.getSalario()* 1.1;
        num1.setSalario(salario);
        salario = num2.getSalario()* 1.1;
        num2.setSalario(salario);
        JOptionPane.showMessageDialog(null,"O "+ num1.getNome() + num1.getSobrenome() + " tem o salario de "+ num1.getSalario() + " com aumento de 10%","EX02",1);
        JOptionPane.showMessageDialog(null,"O "+ num2.getNome() + num2.getSobrenome() + " tem o salario de "+ num2.getSalario() + " com aumento de 10%","EX02",1);
        
    }
    
}
