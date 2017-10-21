
package jogo_de_dama;
import javax.swing.ImageIcon;

public class PecasNormais extends Pecas{
    //simbolo jogador 1 = 1 / simbolo jogador 2 = 2
    
    ImageIcon aux1 = new ImageIcon(getClass().getResource("/jogo_de_dama/peca_branca.png"));
    ImageIcon aux1_1 = new ImageIcon(getClass().getResource("/jogo_de_dama/selecao_peca_branca.png"));
    
    ImageIcon aux2 = new ImageIcon(getClass().getResource("/jogo_de_dama/peca_preta.png"));
    ImageIcon aux2_2 = new ImageIcon(getClass().getResource("/jogo_de_dama/selecao_peca_preta.png"));
    
    public PecasNormais(String tipoPeca){//cosntrutor da classe recebendo parametros
        setTipoPeca(tipoPeca);//colocado quando gerar o tabuleiro

        
        if(getTipoPeca().equals("1")){///verifica qual jogador a peça representa
            setIcone(aux1);
            setSelecIcone(aux1_1);
        }else{
            setIcone(aux2);
            setSelecIcone(aux2_2);
        }
    }
}
