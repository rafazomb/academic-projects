/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividade09aula12do11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
*1) No exemplo dado em sala de aula, acrescentar botões para subtrair, dividir e 
multiplicar os 2 valores, exibindo o resultado.
* @author João Silva, Nathan e Rafael 
*/
public class Ex01 {
    private JFrame janela;
    private JPanel painelPrincipal, painelDados, painelBotoes;
    private Label label1, lblr, lbl3, lbl1, lbl2;
    private TextField t1,t2;
 
    public static void main(String[] args) {
        new Ex01().montaTela();
    }
    private void montaTela(){
        preparaJanela();
        preparaPainelPrincipal();
        preparaLabel();
        preparaText();
        preparaBotaoCarregar();
        preparaBotaoSubtrai();
        preparaBotaoMultiplica();
        preparaBotaoDivide();
        preparaBotaoSair(); 
        mostraJanela();
    }
    private void preparaJanela() {
        janela = new JFrame("Exemplo");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    private void mostraJanela(){
        janela.pack();
        janela.setSize(600,300);
        janela.setVisible(true);
    }
    private void preparaPainelPrincipal(){
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal,BoxLayout.PAGE_AXIS));
        janela.add(painelPrincipal, BorderLayout.NORTH);
        painelDados = new JPanel();
        painelDados.setLayout(new GridLayout(3,2));
        janela.add(painelDados, BorderLayout.CENTER);
        painelBotoes = new JPanel(new FlowLayout());
        janela.add(painelBotoes, BorderLayout.SOUTH);

 
    }
    private void preparaLabel(){
    label1 = new Label("Calculando a Operação escolhida de 2 números",Label.CENTER);
    painelPrincipal.add(label1); 
    }
    private void preparaText(){
        lbl1 = new Label("Valor 1:");
        lbl2 = new Label("Valor 2:");
        t1 = new TextField("");
        t2= new TextField("");
        lblr = new Label("Resultado=");
        lbl3= new Label(" ");
        painelDados.add(lbl1);
        painelDados.add(t1);
        painelDados.add(lbl2);
        painelDados.add(t2);
        painelDados.add(lblr);
        painelDados.add(lbl3);
    }
    private void preparaBotaoCarregar() {
        JButton botaoCarregar = new JButton("SOMA");
        botaoCarregar.addActionListener(new ActionListener() {
        @Override
                public void actionPerformed(ActionEvent e) {
            int soma=Integer.parseInt(t1.getText())+ Integer.parseInt(t2.getText());
            String r = Integer.toString(soma);
            lbl3.setText(r);
            }
            });
        painelBotoes.add("South",botaoCarregar);
    }
    private void preparaBotaoSubtrai(){
        JButton botaoSubtrai = new JButton("SUBTRAI");
        botaoSubtrai.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) {
            int subtrai=Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText());
            String r = Integer.toString(subtrai);
            lbl3.setText(r);
        }
        });
        painelBotoes.add("South",botaoSubtrai);
    }
    private void preparaBotaoMultiplica(){
        JButton botaoMultiplica = new JButton("MULTIPLICA");
        botaoMultiplica.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int multiplica=Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText());
            String r = Integer.toString(multiplica);
            lbl3.setText(r);
        }
        });
        painelBotoes.add("South",botaoMultiplica);
    }
    private void preparaBotaoDivide(){
        JButton botaoDividir = new JButton("DIVIDE");
        botaoDividir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int divide=Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText());
            String r = Integer.toString(divide);
            lbl3.setText(r);
        }
        });
        painelBotoes.add("South",botaoDividir);
    }
    private void preparaBotaoSair() {
        JButton botaoSair = new JButton("SAIR");
        botaoSair.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
        });
        painelBotoes.add("South",botaoSair);
    }   
}