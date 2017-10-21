
package jogo_de_dama;
import javax.swing.ImageIcon;

public class AreaVazia extends Pecas{
   
        ImageIcon aux = new ImageIcon(getClass().getResource("/jogo_de_dama/area_branca.png"));
    
        public AreaVazia(){//construtor da classe com um tipo de peça ja determinado
         setTipoPeca("??");//simbolo da area vazia = ??
         setIcone(aux);

        }
}
