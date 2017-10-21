/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import jogo_BO.Jogadas;
import javax.swing.*;

/**
 *
 * @author Felipe
 */
public class Final extends javax.swing.JFrame {

    ImageIcon imagemVitoria = new ImageIcon(getClass().getResource("/Interface/FinalVitoria.png"));
    ImageIcon imagemEmpate = new ImageIcon(getClass().getResource("/Interface/Imagem fundo empate.png"));
    
    /**
     * Creates new form Final
     */
    public Final() {
        initComponents();
    }
  
    public Final(String simboloJogador,Jogadas finalizado){
        initComponents();
        this.setSize(960, 540);//tamanho
        this.setResizable(false);//tamanho fixo
        exibir(simboloJogador, finalizado);
    }
    
    String nomeJogadorVitoria;
    String empate = "Jogo empatado!!!!";
    
    private void exibir(String simboloJogador,Jogadas finalizado){
        switch (simboloJogador) {
            case "1":
                labImagemFundo.setIcon(imagemVitoria);
                nomeJogadorVitoria = finalizado.jogador1.getNome();
                nomeJogador.setText(nomeJogadorVitoria);
                break;
            case "2":
                labImagemFundo.setIcon(imagemVitoria);
                nomeJogadorVitoria = finalizado.jogador2.getNome();
                nomeJogador.setText(nomeJogadorVitoria);
                break;
            case "3":
                labImagemFundo.setIcon(imagemEmpate);
                parabens.setText(empate);
                jogador.setText("");
                voce.setText("");
                break;
            default:
                labImagemFundo.setIcon(imagemVitoria);
                if(simboloJogador.charAt(0)=='1'){
                    nomeJogadorVitoria = finalizado.jogador2.getNome();
                    nomeJogador.setText(nomeJogadorVitoria);
                }
                else{
                    nomeJogadorVitoria = finalizado.jogador1.getNome();
                    nomeJogador.setText(nomeJogadorVitoria);
                }   break;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        voce = new javax.swing.JLabel();
        parabens = new javax.swing.JLabel();
        nomeJogador = new javax.swing.JLabel();
        jogador = new javax.swing.JLabel();
        labImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        voce.setFont(new java.awt.Font("Ravie", 3, 36)); // NOI18N
        voce.setForeground(new java.awt.Color(255, 255, 255));
        voce.setText("Voce é o vencedor!!");
        jPanel1.add(voce);
        voce.setBounds(240, 270, 530, 80);

        parabens.setFont(new java.awt.Font("Ravie", 3, 36)); // NOI18N
        parabens.setForeground(new java.awt.Color(255, 255, 255));
        parabens.setText("Parabens!!!!");
        jPanel1.add(parabens);
        parabens.setBounds(320, 110, 610, 80);

        nomeJogador.setFont(new java.awt.Font("Ravie", 3, 36)); // NOI18N
        nomeJogador.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(nomeJogador);
        nomeJogador.setBounds(370, 190, 580, 80);

        jogador.setFont(new java.awt.Font("Ravie", 3, 36)); // NOI18N
        jogador.setForeground(new java.awt.Color(255, 255, 255));
        jogador.setText("Jogador: ");
        jPanel1.add(jogador);
        jogador.setBounds(120, 190, 240, 80);

        getContentPane().add(jPanel1);
        getContentPane().add(labImagemFundo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Final().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jogador;
    private javax.swing.JLabel labImagemFundo;
    private javax.swing.JLabel nomeJogador;
    private javax.swing.JLabel parabens;
    private javax.swing.JLabel voce;
    // End of variables declaration//GEN-END:variables
}
