package com.mycompany.aula03do09;

import javax.swing.JOptionPane;

/**5) Criar um programa que leia um número que será o limite superior de um intervalo e 
o incremento. Exibir todos os números naturais no intervalo de 0 até esse número. 
Suponha que os dois números lidos são maiores que zero. Exemplo:
Limite superior: 20
Incremento: 5
Saída: 0 5 10 15 20
 * @author João Silva, Nathan e Rafael H.
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int limiteSuperior = 0;
        int incremento = 0;
        int n = 0;
        String resul = "";

        try {
            // Solicita o limite superior
            String limiteSuperiorStr = JOptionPane.showInputDialog(null, "Digite o limite superior:", "Limite Superior", JOptionPane.QUESTION_MESSAGE);
            limiteSuperior = Integer.parseInt(limiteSuperiorStr);
            if (limiteSuperior <= 0) {
                throw new Exception("O limite superior deve ser maior que zero.");
            }

            // Solicita o valor do incremento
            String incrementoStr = JOptionPane.showInputDialog(null, "Digite o valor do incremento:", "Incremento", JOptionPane.QUESTION_MESSAGE);
            incremento = Integer.parseInt(incrementoStr);
            if (incremento <= 0 || incremento >= limiteSuperior) {
                throw new Exception("O incremento deve ser maior que zero e menor que o limite superior.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato do número digitado está incorreto!", "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        // Exibe os intervalos com incremento
        do {
            resul = resul + ", " + n;
            n += incremento;
        } while (n <= limiteSuperior);

        JOptionPane.showMessageDialog(null, "Intervalos do Incremento:\n" + resul, "Intervalo", JOptionPane.INFORMATION_MESSAGE);
    }
}
