/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo_de_dama;
import javax.swing.*;
/**
 *
 * @author Felipe
 */
public abstract class Pecas {
    
    private String tipoPeca;//para cada tipo de peça ela tera um simbolo para futuras comparações e calculos
    private ImageIcon icone;
    private ImageIcon selecIcone;
    
    /**
     * @return the tipoPeca
     */
    public String getTipoPeca() {
        return tipoPeca;
    }

    /**
     * @param tipoPeca the tipoPeca to set
     */
    public void setTipoPeca(String tipoPeca) {
        this.tipoPeca = tipoPeca;
    }


    /**
     * @return the icone
     */
    public ImageIcon getIcone() {
        return icone;
    }

    /**
     * @param icone the icone to set
     */
    public void setIcone(ImageIcon icone) {
        this.icone = icone;
    }

    /**
     * @return the selecIcone
     */
    public ImageIcon getSelecIcone() {
        return selecIcone;
    }

    /**
     * @param selecIcone the selecIcone to set
     */
    public void setSelecIcone(ImageIcon selecIcone) {
        this.selecIcone = selecIcone;
    }
    
    
}
