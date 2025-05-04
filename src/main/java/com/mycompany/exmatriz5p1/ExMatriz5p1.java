

package com.mycompany.exmatriz5p1;

import javax.swing.JOptionPane;

public class ExMatriz5p1 {

    public static void main(String[] args) {
        int atleta[][] = new int [3][2];
        for(int i = 0; i<3; i++){
            atleta[i][0] = Integer.parseInt(JOptionPane.showInputDialog("informe o numero do atleta: "));
            atleta[i][1] = Integer.parseInt(JOptionPane.showInputDialog("informe a altura do atleta: "));
        }
        int numero = atleta[0][0];
        int altura = atleta[0][1];
        for (int i = 1; i < 3; i++) {
            if (altura <= atleta[i][1]) {
                numero = atleta[i][0];
                altura = atleta[i][1];
            }
        }
        JOptionPane.showMessageDialog(null, "o atleta mais alto é " + numero + " e sua altura é " + altura);
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += atleta[i][1];
        }
        double media = soma / 3d;
        JOptionPane.showMessageDialog(null, "A media das alturas é " + media);
        int menor = 0;
        for (int i = 0; i < 3; i++) {
            if (atleta[i][1] < 178) {
                menor++;
            }
        }
        JOptionPane.showMessageDialog(null, "O número de Atletas com altura menor de 178 é " + menor);
    }
}
