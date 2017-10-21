package jogo_de_dama;
import javax.swing.ImageIcon;

public class AreaNula extends Pecas{
       
       private ImageIcon aux = new ImageIcon(getClass().getResource("/jogo_de_dama/area_preta.png"));
    
        public AreaNula(){//construtor da classe com um tipo de peça ja determinado
          setTipoPeca("XX");//simbolo da area nula
          setIcone(aux);
        }
}
