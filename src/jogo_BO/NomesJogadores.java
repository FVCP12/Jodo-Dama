package jogo_BO;

/**
 *
 * @author Felipe
 */
public class NomesJogadores {
    
    private boolean invalido=true;//se for verdadeiro o nome e invalido
    
    
    public void validarNomes(String nomejogador1) throws Exception{
       
        if(nomejogador1.equals("")){
           throw new Exception();
        }
        else {
           for(int i=0;i<nomejogador1.length();i++){
               
                if(nomejogador1.charAt(i) != ' '){
                    invalido = false;
                    break;
                }
           } 
        }
        
        if(invalido == true){
          throw new Exception();
        }
        
        
   }
    
    
    
}
