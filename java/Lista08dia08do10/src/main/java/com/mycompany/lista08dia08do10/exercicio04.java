/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista08dia08do10;
import javax.swing.JOptionPane;
/**
 *4) Crie uma classe em Java chamada Data que inclui três informações como 
variáveis de instância:
• mês (int),
• dia (int)
• e ano (int).
A classe deve ter métodos get e set para cada variável e um construtor que 
inicializa as variáveis e assume que os valores fornecidos são corretos. Forneça 
um método displayData que exibe o dia, o mês e o ano separados por barras 
normais ( / ).
Escreva um aplicativo de teste chamado DataTeste que demonstra as 
capacidades da classe Data.
 * @author João Silva, Nathan e Rafael
 */
public class exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia,mes,ano;
        String entrada = JOptionPane.showInputDialog(null,"Digite o numero do dia","EX04",1);
        dia = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog(null,"Digite o numero do mês","EX04",1);
        mes = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog(null,"Digite o numero do ano","EX04",1);
        ano = Integer.parseInt(entrada);
        Data hoje = new Data(dia,mes,ano);
        hoje.displayData();
        entrada = JOptionPane.showInputDialog(null,"Altere o numero do ano","EX04",1);
        ano = Integer.parseInt(entrada);
        hoje.setAno(ano);
        hoje.setDia(hoje.getMes());
        hoje.displayData();
    }
    
}
