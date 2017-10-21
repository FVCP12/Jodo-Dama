
package jogo_de_dama;
import javax.swing.ImageIcon;

public class PecasDama extends Pecas{
       //simbolo jogador 1 = 11 / simbolo jogador 2 = 22
       ImageIcon aux1 = new ImageIcon(getClass().getResource("/jogo_de_dama/Dama_branca.png"));
       ImageIcon aux1_1 = new ImageIcon(getClass().getResource("/jogo_de_dama/selecao_Dama_branca.png"));
       
       ImageIcon aux2 = new ImageIcon(getClass().getResource("/jogo_de_dama/Dama_preta.png"));
       ImageIcon aux2_2 = new ImageIcon(getClass().getResource("/jogo_de_dama/selecao_Dama_preta.png"));
       
        public PecasDama(String tipoPeca){//cosntrutor da classe recebendo parametros
          setTipoPeca(tipoPeca);//colocado na hora da transformação
          
          if(getTipoPeca().equals("11")){///verifica qual jogador a peça representa
            setIcone(aux1);
              setSelecIcone(aux1_1);
          }else{
            setIcone(aux2);
              setSelecIcone(aux2_2);
          }
          
        }
}
