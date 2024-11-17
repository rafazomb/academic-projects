/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade10aula29do10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *1) Escreva um programa que peça como entrada o peso (em kilogramas) e a 
altura (em metros) da pessoa e calcule e exiba o seu IMC – Índice de Massa 
Corpórea. Adicionalmente, o programa deve emitir as mensagens 
correspondentes conforme a tabela a seguir:
 * @author Joao Silva, Nathan e Rafael
 */
public class Atividade10Aula29do10 {
private JFrame janela;
    private JPanel painelPrincipal, painelDados, painelBotoes;
    private Label label1, lblr, lbl3, lbl1, lbl2, lbl4, lbl5;
    private TextField t1,t2;
 
    public static void main(String[] args) {
        new Atividade10Aula29do10().montaTela();
    }
    private void montaTela(){
        preparaJanela();
        preparaPainelPrincipal();
        preparaLabel();
        preparaText();
        preparaBotaoCalculo();
        preparaBotaoSair(); 
        mostraJanela();
    }
    private void preparaJanela() {
        janela = new JFrame("Exemplo");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    private void mostraJanela(){
        janela.pack();
        janela.setSize(600,400);
        janela.setVisible(true);
    }
    private void preparaPainelPrincipal(){
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal,BoxLayout.PAGE_AXIS));
        janela.add(painelPrincipal, BorderLayout.NORTH);
        painelDados = new JPanel();
        painelDados.setLayout(new GridLayout(4,2));
        janela.add(painelDados, BorderLayout.CENTER);
        painelBotoes = new JPanel(new FlowLayout());
        janela.add(painelBotoes, BorderLayout.SOUTH);

 
    }
    private void preparaLabel(){
    label1 = new Label("Calculando IMC",Label.CENTER);
    painelPrincipal.add(label1); 
    }
    private void preparaText(){
        lbl1 = new Label("Altura:");
        lbl2 = new Label("Peso:");
        t1 = new TextField("");
        t2 = new TextField("");
        lblr = new Label("Valor IMC=");
        lbl3 = new Label(" ");
        lbl4 = new Label("Situação");
        lbl5 = new Label(" ");
        painelDados.add(lbl1);
        painelDados.add(t1);
        painelDados.add(lbl2);
        painelDados.add(t2);
        painelDados.add(lblr);
        painelDados.add(lbl3);
        painelDados.add(lbl4);
        painelDados.add(lbl5);
    }
    private void preparaBotaoCalculo(){
        JButton botaoMultiplica = new JButton("CALCULAR");
        botaoMultiplica.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            double peso = Double.parseDouble(t1.getText());
            double altura = Double.parseDouble(t2.getText());
            double imc= altura /(peso * peso);
            String r = Double.toString(imc);
            lbl3.setText(r);
            String S = "";
            if (imc < 18.5){
            S = "Abaixo do peso ideal";}
            else if (imc < 25){
            S = "Parabens, peso ideal";}
            else if (imc < 30){
            S = "acima do peso ideal";}
            else if (imc < 35){
            S = "Obesidade grau 1";}
            else if (imc < 40){
            S = "Obesidade grau 2";}
            else {
            S = "Obesidade grau 3";
            }
            lbl5.setText(S);
        }
        });
        painelBotoes.add("South",botaoMultiplica);
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
