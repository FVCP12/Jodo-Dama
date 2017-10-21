
package jogo_de_dama;

public class Tabuleiro {
    
    private Pecas[][] tabuleiroMontado = new Pecas[8][8];//ira armazenar todas as posicoes das pecas
    
   
    public Tabuleiro(){//construtor tabuleiro ja cria o tabueliro com as pecas ja em cada lugar correto

     for(int i =0;i<8;i++){
      for(int k=0;k<8;k++){
        if(i == 3||i==4 ){
           if(i==4){
            if(k%2==0){
                tabuleiroMontado[i][k] = new AreaVazia();
            }
            else{
                tabuleiroMontado[i][k] = new AreaNula();
            }
           }else{
            if(k%2==0){
                tabuleiroMontado[i][k]= new AreaNula(); 
            }
            else{
                tabuleiroMontado[i][k] = new AreaVazia();
            }               
           }
        }  
        else if(i % 2 == 0){
            if(k%2==0){
                tabuleiroMontado[i][k]=i>=0&&i<=2? new PecasNormais("1"):new PecasNormais("2"); 
            }
            else{
                tabuleiroMontado[i][k] = new AreaNula();
            }
        }
        else{
            if(k%2==0){                
                tabuleiroMontado[i][k] = new AreaNula();
            }
            else{
               tabuleiroMontado[i][k]=i>=0&&i<=2?new PecasNormais("1"):new PecasNormais("2"); 
            }  
          }
          
        }
      }
    }


    public Pecas[][] getTabuleiroMontado() {
        return tabuleiroMontado;
    }


    public void setTabuleiroMontado(Pecas[][] tabuleiroMontado) {
        this.tabuleiroMontado = tabuleiroMontado;
    }
    
 
}
