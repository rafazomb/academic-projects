/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista08dia08do10;
import javax.swing.JOptionPane;
/**
 *1) Crie uma classe chamada Faturar que possa ser utilizado por uma loja de
 suprimentos de informática para representar uma fatura de um item vendido na
 loja. Uma fatura deve incluir as seguintes informações como atributos: • o número
 do item faturado,
• a descrição do item, 
• a quantidade comprada do item e 
• o preço unitário do item. 
Sua classe deve ter um construtor que inicialize os quatro atributos. 
Forneça um método set e um método get para cada variável de instância. Além
 disso, forneça um método chamado getFaturarTotal que calcula o valor da fatura
 (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como 
um double. 
Escreva um aplicativo de teste que demonstra as capacidades da classe Faturar.
 * @author João Silva, Nathan e Rafael
 */
public class exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double preco;
        int qnt;
        String entrada = JOptionPane.showInputDialog(null,"Digite o preço unitario ","EX01",1);
        preco = Double.parseDouble(entrada);
        Faturar fatura = new Faturar(4, "teclado", 0, preco);
        entrada = JOptionPane.showInputDialog(null,"Digite a quantidade comprada ","EX01",1);
        qnt = Integer.parseInt(entrada);
        fatura.setQuantidadeComprada(qnt);
        JOptionPane.showMessageDialog(null,fatura.getPrecoUnitario(),"Preco unitario",1);
        JOptionPane.showMessageDialog(null,"O total dessa fatura será "+fatura.getFaturaTotal(),"EX01",1);
        
    }
    
}
