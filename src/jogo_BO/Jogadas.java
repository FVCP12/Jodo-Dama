
package jogo_BO;

import javax.swing.ImageIcon;
import jogo_de_dama.Jogador;
import jogo_de_dama.Tabuleiro;
import jogo_de_dama.Pecas;
import jogo_de_dama.PecasDama;
import java.util.*;


public class Jogadas {
    
    private  int numeroTotalPecas1 = 12;//armazena o numero total de peças do jogador 1 no tabulerio
    private  int numeroTotalPecas2 = 12;//armazena o numero total de peças do jogador 2 no tabulerio
    private  int numeroJogadasSemCaptura = 0;//armazena o nuemro de jogadas sem captura de peca (limite de 25)
    Tabuleiro tabuleiro = new Tabuleiro();
    public Jogador jogador1,jogador2;
    
    public Jogadas(String nomeJogador1,String nomeJogador2){
       jogador1 = new Jogador(nomeJogador1,"1");
       jogador2 = new Jogador(nomeJogador2,"2"); 
    }

    //de acordo com instruções do professor, as funções seram implementadas futuramente. 
    
    
    /**
     * @return the numeroTotalPecas1
     */
    public int getNumeroTotalPecas1() {
        return numeroTotalPecas1;
    }

    /**
     * @param numeroTotalPecas1 the numeroTotalPecas1 to set
     */
    public void setNumeroTotalPecas1(int numeroTotalPecas1) {
        this.numeroTotalPecas1 = numeroTotalPecas1;
    }

    /**
     * @return the numeroTotalPecas2
     */
    public int getNumeroTotalPecas2() {
        return numeroTotalPecas2;
    }

    /**
     * @param numeroTotalPecas2 the numeroTotalPecas2 to set
     */
    public void setNumeroTotalPecas2(int numeroTotalPecas2) {
        this.numeroTotalPecas2 = numeroTotalPecas2;
    }

    /**
     * @return the numeroJogadasSemCaptura
     */
    public int getNumeroJogadasSemCaptura() {
        return numeroJogadasSemCaptura;
    }

    /**
     * @param numeroJogadasSemCaptura the numeroJogadasSemCaptura to set
     */
    public void setNumeroJogadasSemCaptura(int numeroJogadasSemCaptura) {
        this.numeroJogadasSemCaptura = numeroJogadasSemCaptura;
    }
    
    public ImageIcon imagemPeca(int linha,int coluna ){//retorna a imagem da posição
        Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro
        return pecas[linha][coluna].getIcone();
    }
   
    public ImageIcon selectPeca(int linha,int coluna ){//retorna a imagem da posição
        Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro
        return pecas[linha][coluna].getSelecIcone();
    }    
    
    /////////////////implementações
    public String jogValidaAreaVazia(int linha,int coluna){//retorna se existe peca na posição
        Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro
            if(pecas[linha][coluna].getTipoPeca().equals("??") ){
              return "Ops!!!!\nNão tem peça nenhuma ai.\nTente novamente";//não valido
            }
            else{
              return "OK";//valido
            }
           
    }
    
    public String jogValidaPecaCerta(int linha,int coluna,String simboloJogador){//retorna se a peça correspode ao jogador certo
        Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro
      
        if(pecas[linha][coluna].getTipoPeca().equals(simboloJogador) || pecas[linha][coluna].getTipoPeca().equals(simboloJogador+simboloJogador)){
              return "OK";
        }
        else{
            return "Esta peça não è sua!\nVamos tentar denovo.\nSem trapaça hein!!!";
        }
           
    }
    
    public String jogValidaPodeMover(int linha,int coluna,String simboloJogador){//retorna se nao esta cercada
        Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro
        
        if(simboloJogador.equals("1")){
            if(pecas[linha][coluna].getTipoPeca().equals(simboloJogador)){//para peça normal
               return auxUm(linha, coluna,simboloJogador);
                
            }else{//para peca dama
                if(linha+1 >7){
                   return auxDois(linha, coluna,simboloJogador);
                }
                else if(linha-1<0){
                    return auxUm(linha, coluna,simboloJogador);
                }
                else{
                    String retorno1 = auxDois(linha, coluna,simboloJogador);
                    String retorno2 = auxUm(linha, coluna,simboloJogador);
                    if(retorno1.equals(retorno2)){
                        return retorno1;
                    }else{
                        return "OK";
                    }
                }
            }
        }else{//peça jogador 2
            if(pecas[linha][coluna].getTipoPeca().equals(simboloJogador)){//para peça normal
               return auxDois(linha, coluna,simboloJogador);
                
            }else{//para peca dama
                if(linha+1 >7){
                   return auxDois(linha, coluna,simboloJogador);
                }
                else if(linha-1<0){
                    return auxUm(linha, coluna,simboloJogador);
                }
                else{
                    String retorno1 = auxDois(linha, coluna,simboloJogador);
                    String retorno2 = auxUm(linha, coluna,simboloJogador);
                    if(retorno1.equals(retorno2)){
                        return retorno1;
                    }else{
                        return "OK";
                    }
                }
            }
        }
    }
////////codigos para aproveitar na funcao acima, so existe no contexto dela
    private String auxUm(int linha,int coluna,String simboloJogador){
            Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro
       
                if(coluna-1<0){
                    if(pecas[linha+1][coluna+1].getTipoPeca().equals(simboloJogador) ||pecas[linha+1][coluna+1].getTipoPeca().equals(simboloJogador+simboloJogador)){
                        return "Desculpe!\nMas esta peça não pode ser movida agora";
                    }else{
                        return "OK";
                    }
                }
                else if(coluna+1>=8){
                    if(pecas[linha+1][coluna-1].getTipoPeca().equals(simboloJogador) ||pecas[linha+1][coluna-1].getTipoPeca().equals(simboloJogador+simboloJogador)){
                        return "Desculpe!\nMas esta peça não pode ser movida agora";
                    }else{
                        return "OK";
                    }                   
                }
                else{
                    if((pecas[linha+1][coluna+1].getTipoPeca().equals(simboloJogador) ||pecas[linha+1][coluna+1].getTipoPeca().equals(simboloJogador+simboloJogador))&&(pecas[linha+1][coluna-1].getTipoPeca().equals(simboloJogador) ||pecas[linha+1][coluna-1].getTipoPeca().equals(simboloJogador+simboloJogador))){
                        return "Desculpe!\nMas esta peça não pode ser movida agora";
                    }
                    else{
                        return "OK";
                    }
                }           
              
    }
    private String auxDois(int linha,int coluna,String simboloJogador){
            Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro
       
                if(coluna-1<0){
                    if(pecas[linha-1][coluna+1].getTipoPeca().equals(simboloJogador) ||pecas[linha-1][coluna+1].getTipoPeca().equals(simboloJogador+simboloJogador)){
                        return "Desculpe!\nMas esta peça não pode ser movida agora";
                    }else{
                        return "OK";
                    }
                }
                else if(coluna+1>=8){
                    if(pecas[linha-1][coluna-1].getTipoPeca().equals(simboloJogador+simboloJogador) ||pecas[linha-1][coluna-1].getTipoPeca().equals(simboloJogador+simboloJogador)){
                        return "Desculpe!\nMas esta peça não pode ser movida agora";
                    }else{
                        return "OK";
                    }                   
                }
                else{
                    if((pecas[linha-1][coluna+1].getTipoPeca().equals(simboloJogador) ||pecas[linha-1][coluna+1].getTipoPeca().equals(simboloJogador+simboloJogador))&&(pecas[linha-1][coluna-1].getTipoPeca().equals(simboloJogador) ||pecas[linha-1][coluna-1].getTipoPeca().equals(simboloJogador+simboloJogador))){
                        return "Desculpe!\nMas esta peça não pode ser movida agora";
                    }
                    else{
                        return "OK";
                    }
                }           
              
    }
//////////////////////////////fim das funções aux
    
    public List<String> JogadaObrig(String SimboloJogador){
        Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro
        List<String> jog_Obr = new ArrayList<String>();//lista as jogadas
        
        for(int i=0;i<8;i++){
          for(int k=0;k<8;k++){
              if(pecas[i][k].getTipoPeca().equals(SimboloJogador)){
                  jog_Obr.addAll(auxPecaNor(i, k, SimboloJogador));
              }
              else if (pecas[i][k].getTipoPeca().equals(SimboloJogador+SimboloJogador))
              {
                  jog_Obr.addAll(auxPecaDam(i, k, SimboloJogador));
              }
          }
        }
        return jog_Obr;
    }
    
 ////////codigos para aproveitar na funcao acima, so existe no contexto dela
    private List<String> auxPecaNor(int i,int k,String SimboloJogador){//i para linha ; k para coluna
        Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro
        List<String> jog_Obr = new ArrayList<String>();//lista as jogadas
        int linha,coluna;
        
        if(SimboloJogador.equals("1")){
        ///    
    	if(i+1 < 8){
    	    if(k+1 < 8){
    		if(pecas[i+1][k+1].getTipoPeca().equals("2") || pecas[i+1][k+1].getTipoPeca().equals("22")){
    		    if(i+2 <8){
    			if(k+2 < 8){
    			    if(pecas[i+2][k+2].getTipoPeca().equals("??")){
    				linha = i+2;
    				coluna = k+2;
    				jog_Obr.add(String.valueOf(i)+String.valueOf(k)+"||"+String.valueOf(linha)+String.valueOf(coluna));

    			    }
    			}
   		    }
    		}
    					
            }
    	    if(k-1 >=0){
    		if(pecas[i+1][k-1].getTipoPeca().equals("2") || pecas[i+1][k-1].getTipoPeca().equals("22")){
    		    if(i+2 <8){
    			if(k-2 >= 0){
    			    if(pecas[i+2][k-2].getTipoPeca().equals("??")){
    				linha = i+2;
    				coluna = k-2;
    				jog_Obr.add(String.valueOf(i)+String.valueOf(k)+"||"+String.valueOf(linha)+String.valueOf(coluna));

    			    }
    			}
    		    }
    		}
    	    }
    	}
    				
    	}
        ////////////para jogador 2 abaixo
        else{
            if(i-1 >=0){
    	    if(k+1 < 8){
    		if(pecas[i-1][k+1].getTipoPeca().equals("1") || pecas[i-1][k+1].getTipoPeca().equals("11")){
    		    if(i-2 >=0){
    			if(k+2 < 8){
    			    if(pecas[i-2][k+2].getTipoPeca().equals("??")){
    				linha = i-2;
    				coluna = k+2;
    				jog_Obr.add(String.valueOf(i)+String.valueOf(k)+"||"+String.valueOf(linha)+String.valueOf(coluna));

    			    }
    			}
   		    }
    		}
    					
            }
    	    if(k-1 >=0){
    		if(pecas[i-1][k-1].getTipoPeca().equals("1") || pecas[i-1][k-1].getTipoPeca().equals("11")){
    		    if(i-2 >=0){
    			if(k-2 >= 0){
    			    if(pecas[i-2][k-2].getTipoPeca().equals("??")){
    				linha = i-2;
    				coluna = k-2;
    				jog_Obr.add(String.valueOf(i)+String.valueOf(k)+"||"+String.valueOf(linha)+String.valueOf(coluna));

    			    }
    			}
    		    }
    		}
    	    }
    	}
            
        }
        return jog_Obr;
    }
    
    private List<String> auxPecaDam(int i,int k,String SimboloJogador){
        Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro
        List<String> jog_Obr = new ArrayList<String>();//lista as jogadas
        int linha,coluna;
        String prin,sec;
        if(SimboloJogador.equals("1")){
           prin = "1";
           sec = "2";
        }else{
           prin = "2";
           sec = "1";        
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////
        linha = i;
    	coluna = k;
    	while(linha<8 && coluna <8 && linha >= 0 && coluna >= 0){
            linha++;
            coluna++;
            if(linha<8 && coluna <8 && linha >= 0 && coluna >= 0){
            
                if(pecas[linha][coluna].getTipoPeca().equals(prin+prin) || pecas[linha][coluna].getTipoPeca().equals(prin)){
                         linha=10;
                         coluna=10;//encerra nao encontrado
                }
                else if(pecas[linha][coluna].getTipoPeca().equals(sec) || pecas[linha][coluna].getTipoPeca().equals(sec+sec)){
                    if(linha+1 < 8 && coluna+1 < 8){
                      
                        if(pecas[linha+1][coluna+1].getTipoPeca().equals("??")){
                            jog_Obr.add(String.valueOf(i)+String.valueOf(k)+"||"+String.valueOf(linha+1)+String.valueOf(coluna+1));
			    linha = 10;
			    coluna=10; 
                        }
                        else{
                            linha=10;
                            coluna=10;//encerra nao encontrado 
                        }
                      		 
                    }else{
                        linha=10;
                        coluna=10;//encerra nao encontrado
                    }
                        	 
                }
              }			
    	    }
///////////////////////////////////////////////////////////
    linha = i;
    coluna = k;
    while(linha<8 && coluna <8 && linha >= 0 && coluna >= 0){
        linha++;
        coluna--;
        if(linha<8 && coluna <8 && linha >= 0 && coluna >= 0){
            if(pecas[linha][coluna].getTipoPeca().equals(prin+prin) || pecas[linha][coluna].getTipoPeca().equals(prin)){
                linha=10;
                coluna=10;//encerra nao encontrado   
            }
            else if(pecas[linha][coluna].getTipoPeca().equals(sec) || pecas[linha][coluna].getTipoPeca().equals(sec+sec)){
                if(linha+1 < 8 && coluna-1 >=0 ){
                    
                    if(pecas[linha+1][coluna-1].getTipoPeca().equals("??")){
                        jog_Obr.add(String.valueOf(i)+String.valueOf(k)+"||"+String.valueOf(linha+1)+String.valueOf(coluna-1));
			linha = 10;
                        coluna=10; 
                    }
                    else{
                        linha=10;
                        coluna=10;//encerra nao encontrado 
                    }
                        		 
                }else{
                     linha=10;
                     coluna=10;//encerra nao encontrado
                }
                        	 
            }
        }				
    }
  /////////////////////////////////////////////////////////////////////
    linha = i;
    coluna = k;
    while(linha<8 && coluna <8 && linha >= 0 && coluna >= 0){
        linha--;
        coluna--;
        if(linha<8 && coluna <8 && linha >= 0 && coluna >= 0){
        if(pecas[linha][coluna].getTipoPeca().equals(prin+prin) || pecas[linha][coluna].getTipoPeca().equals(prin)){
            linha=10;
            coluna=10;//encerra nao encontrado
        }
        else if(pecas[linha][coluna].getTipoPeca().equals(sec) || pecas[linha][coluna].getTipoPeca().equals(sec+sec) ){
            if(linha-1 >= 0 && coluna-1 >= 0){
                if(pecas[linha-1][coluna-1].getTipoPeca().equals("??") ){
                    jog_Obr.add(String.valueOf(i)+String.valueOf(k)+"||"+String.valueOf(linha-1)+String.valueOf(coluna-1));
	            linha = 10;
		    coluna=10; 
                }
                else{
                    linha=10;
                    coluna=10;//encerra nao encontrado 
                }
                    		 
            }else{
                linha=10;
                coluna=10;//encerra nao encontrado
            }
                    	 
        }
        }				
    }
///////////////////////////////////////////////////////////////////////////  
    linha = i;
    coluna = k;
    while(linha<8 && coluna <8 && linha >= 0 && coluna >= 0){
        linha--;
        coluna++;
        if(linha<8 && coluna <8 && linha >= 0 && coluna >= 0){
        if(pecas[linha][coluna].getTipoPeca().equals(prin+prin) || pecas[linha][coluna].getTipoPeca().equals(prin) ){
            linha=10;
            coluna=10;//encerra nao encontrado
        }
        else if(pecas[linha][coluna].getTipoPeca().equals(sec) || pecas[linha][coluna].getTipoPeca().equals(sec+sec) ){
            if(linha-1 >= 0 && coluna+1 < 8){
                if(pecas[linha-1][coluna+1].getTipoPeca().equals("??")){
                    jog_Obr.add(String.valueOf(i)+String.valueOf(k)+"||"+String.valueOf(linha-1)+String.valueOf(coluna+1));
		    linha = 10;
		    coluna=10; 
                }
                else{
                    linha=10;
                    coluna=10;//encerra nao encontrado 
                }
                    		 
            }else{
                linha=10;
                coluna=10;//encerra nao encontrado
            }
                    	 
         }
        }				
    }
    			
       return jog_Obr;
    }
  
 //////////////////////////////fim das funções aux
           
    public void contarPecas(){//usado para verificar se comeu alguma peca
    Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro
    int pecasJ1=0;
    int pecasJ2=0;
    
    
    for(int i=0;i<8;i++){
        for(int k=0;k<8;k++){
            if(pecas[i][k].getTipoPeca().equals("1") || pecas[i][k].getTipoPeca().equals("11")){
                pecasJ1++;
            }
            else if(pecas[i][k].getTipoPeca().equals("2") || pecas[i][k].getTipoPeca().equals("22")){
                pecasJ2++;
            }
        }
    }
    
    if(this.numeroTotalPecas1 != pecasJ1 || this.numeroTotalPecas2 != pecasJ2){
         this.numeroTotalPecas1 = pecasJ1;
         this.numeroTotalPecas2 = pecasJ2;
         this.numeroJogadasSemCaptura = 0;
    }
    else{
       this.numeroJogadasSemCaptura++;
    }
      
  }
   
 
    
    public String VerificarJogObrig(int linha,int coluna,List<String> jog_Obr,boolean primeiraPeca){//verifica se a peca escolhida faz parte das jogadas obrigatorias
       
        if(jog_Obr.size() == 0){
               return "OK";
        }
        else if (primeiraPeca){
           for(String jog: jog_Obr){
              if(Integer.parseInt(jog.charAt(0)+"") == linha && Integer.parseInt(jog.charAt(1)+"") == coluna){
                 return "OK";
              }
           }
           
           return "Voce não pode escolher esta peça, voce tem jogadas obrigatorias!!";
        }else{
        for(String jog: jog_Obr){
              if(Integer.parseInt(jog.charAt(4)+"") == linha && Integer.parseInt(jog.charAt(5)+"") == coluna){
                 return "OK";
              }
           }
           
           return "Voce não pode escolher esta peça, voce tem jogadas obrigatorias!!";
        }
         
    } 
    
   
    public String ExibirJogObrig(List<String> jog_Obr){//exibir para o usuario as jogadas que sao obrigatorias
       
        String frase = "As jogadas obrigatorias são: "+"\n";//retorna as jogadas obrigatorias
        
        if(jog_Obr.size() == 0){
               return "Você não tem jogadas obrigatorias!";
        }
        else{
           for(String jog: jog_Obr){
              frase = frase + "Linha:"+jog.charAt(0)+" Coluna"+jog.charAt(1)+"\n";
           }
           frase = frase+"Escolha uma delas!!";
           return frase;

        }
         
      
    }
    
   
    public String ExibirDesObrig(List<String> jog_Obr,int linha,int coluna){//exibir destino obrigatorio
       
        String frase = "O/Os destinos obrigatorias são: "+"\n";//retorna as jogadas obrigatorias
        
        if(jog_Obr.size() == 0){
               return "Você não tem destinos obrigatorias!";
        }
        else{
           for(String jog: jog_Obr){
              if(Integer.parseInt(jog.charAt(0)+"")==linha && Integer.parseInt(jog.charAt(1)+"")==coluna){ 
              frase = frase + "Linha:"+jog.charAt(4)+" Coluna"+jog.charAt(5)+"\n";
              }
           }
           frase = frase+"Escolha uma delas!!";
           return frase;

        }
         
      
    }   
    
    //ok corrigido, continuar verificando
    public boolean DestinoObrigatorioValido(List<String> jog_Obr,int linhaVelho,int colunaVelho,int linhaNovo,int colunaNovo){//verifica se o destino escolhido esta nos obrigatorios
         Pecas[][] pecas = tabuleiro.getTabuleiroMontado();
         boolean resposta=false;//variavel a retorno 
         
         
         for(String jog:jog_Obr){
            if(Integer.parseInt(jog.charAt(0)+"")==linhaVelho && Integer.parseInt(jog.charAt(1)+"")==colunaVelho && resposta==false){ 
               if(pecas[Integer.parseInt(jog.charAt(0)+"")][Integer.parseInt(jog.charAt(1)+"")].getTipoPeca() == "1" || pecas[Integer.parseInt(jog.charAt(0)+"")][Integer.parseInt(jog.charAt(1)+"")].getTipoPeca() == "2"){//para peça normal
                if(Integer.parseInt(jog.charAt(4)+"")==linhaNovo && Integer.parseInt(jog.charAt(5)+"")==colunaNovo){
                    resposta= true;
                 }
               }else{//para peça dama
                  if(Integer.parseInt(jog.charAt(4)+"")==linhaNovo && Integer.parseInt(jog.charAt(5)+"")==colunaNovo){
                      resposta = true;
                  }else{

                      
                      if(linhaNovo>linhaVelho){//descendo
                          if(colunaNovo>colunaVelho){//direita
                             linhaVelho = Integer.parseInt(jog.charAt(4)+"");
                             colunaVelho = Integer.parseInt(jog.charAt(5)+"");
                              
                              while(linhaVelho<8 && linhaVelho>=0 && colunaVelho<8 && colunaVelho>=0){
                                  linhaVelho++;
                                  colunaVelho++;
                                  if(pecas[linhaVelho][colunaVelho].getTipoPeca().equals("??")){
                                      if(linhaVelho==linhaNovo && colunaVelho==colunaNovo){
                                          resposta = true;
                                          linhaVelho = 10;
                                      }
                                  }
                                  else{
                                      resposta = false;
                                      linhaVelho=10;//para parar
                                  }
                              }
                          }else{//esquerda
                             linhaVelho = Integer.parseInt(jog.charAt(4)+"");
                             colunaVelho = Integer.parseInt(jog.charAt(5)+"");
                              while(linhaVelho<8 && linhaVelho>=0 && colunaVelho<8 && colunaVelho>=0){
                                  linhaVelho++;
                                  colunaVelho--;
                                  if(pecas[linhaVelho][colunaVelho].getTipoPeca().equals("??")){
                                      if(linhaVelho==linhaNovo && colunaVelho==colunaNovo){
                                          resposta = true;
                                          linhaVelho = 10;
                                      }
                                  }
                                  else{
                                      resposta = false;
                                      linhaVelho=10;//para parar
                                  }                              
                              }
                          }    
                      }else{//subindo
                          if(colunaNovo>colunaVelho){//direita
                             linhaVelho = Integer.parseInt(jog.charAt(4)+"");
                             colunaVelho = Integer.parseInt(jog.charAt(5)+"");
                              while(linhaVelho<8 && linhaVelho>=0 && colunaVelho<8 && colunaVelho>=0){
                                  linhaVelho--;
                                  colunaVelho++;
                                  if(pecas[linhaVelho][colunaVelho].getTipoPeca().equals("??")){
                                      if(linhaVelho==linhaNovo && colunaVelho==colunaNovo){
                                          resposta = true;
                                          linhaVelho = 10;
                                      }
                                  }
                                  else{
                                      resposta = false;
                                      linhaVelho=10;//para parar
                                  }
                              }
                          }else{//esquerda
                             linhaVelho = Integer.parseInt(jog.charAt(4)+"");
                             colunaVelho = Integer.parseInt(jog.charAt(5)+"");
                             
                              while(linhaVelho<8 && linhaVelho>=0 && colunaVelho<8 && colunaVelho>=0){
                                  linhaVelho--;
                                  colunaVelho--;
                                  if(pecas[linhaVelho][colunaVelho].getTipoPeca().equals("??")){
                                      if(linhaVelho==linhaNovo && colunaVelho==colunaNovo){
                                          resposta = true;
                                          linhaVelho = 10;
                                      }
                                  }
                                  else{
                                      resposta = false;
                                      linhaVelho=10;//para parar
                                  }                              
                              }
                          }                          
                      }
                  } 
               }
            }
         }
         return resposta;
    }
     
    // ok corrigido, continuar testando
     public boolean DestinoValido(String turnoJogador,int linhaJoAnterior,int colunaJoAnterior,int linha,int coluna){//verifico jogadas validas(sem obrigatorias)
         Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro
        // boolean resultado=false;
         
         if(turnoJogador == "1"){//comparação para jogador 1
            if(pecas[linhaJoAnterior][colunaJoAnterior].getTipoPeca() == "1"){//comparaçao para peça normal
              if(linha==linhaJoAnterior){
                  return false;
              }
              else if(linha<linhaJoAnterior){
                  return false;
              }
              else{
                  if(coluna>colunaJoAnterior){
                    if(coluna==colunaJoAnterior+1 && linha==linhaJoAnterior+1){
                       return true;
                    }
                    else{
                      return false;
                    }
                  }
                  else{
                    if(coluna==colunaJoAnterior-1 && linha==linhaJoAnterior+1){
                       return true;
                    }
                    else{
                      return false;
                    }                      
                      
                  }
              }
            }else{//para peça dama
             if(linha==linhaJoAnterior){
                  return false;
              }
              else if(linha<linhaJoAnterior){//subindo
                  if(coluna==colunaJoAnterior){
                      return false;
                  }
                  else if(coluna>colunaJoAnterior){//direita
                      while(colunaJoAnterior < 8 && linhaJoAnterior>=0){
                          colunaJoAnterior++;
                          linhaJoAnterior--;
                          
                          if(colunaJoAnterior >=8 || linhaJoAnterior<0){
                              return false;//encontrou algum erro na comparação  de cima
                          }
                          else if (!pecas[linhaJoAnterior][colunaJoAnterior].getTipoPeca().equals("??")){
                              return false;
                          }
                          else if(colunaJoAnterior==coluna && linhaJoAnterior==linha){
                             return true;
                          }
                      }
                      
                  }
                  else{//esquerda
                      while(colunaJoAnterior >=0 && linhaJoAnterior>=0){
                          colunaJoAnterior--;
                          linhaJoAnterior--;
                          
                          if(colunaJoAnterior <0 || linhaJoAnterior<0){
                              return false;//encontrou algum erro na comparação  de cima
                          }
                          else if (!pecas[linhaJoAnterior][colunaJoAnterior].getTipoPeca().equals("??")){
                              return false;
                          }
                          else if(colunaJoAnterior==coluna && linhaJoAnterior==linha){
                              return true;
                          }
                      }                      
                  }
              }
              else{//descendo
                  if(coluna==colunaJoAnterior){
                      return false;
                  }
                  else if(coluna>colunaJoAnterior){//direita
                      while(colunaJoAnterior <8 && linhaJoAnterior<8){
                          colunaJoAnterior++;
                          linhaJoAnterior++;
                          
                          if(colunaJoAnterior >=8 || linhaJoAnterior>=8){
                              return false;//encontrou algum erro na comparação  de cima
                          }
                          else if (!pecas[linhaJoAnterior][colunaJoAnterior].getTipoPeca().equals("??")){
                              return false;
                          }
                          else if(colunaJoAnterior==coluna && linhaJoAnterior==linha){
                             return true;
                          }
                      }
                      
                  }
                  else{//esquerda
                      while(colunaJoAnterior >=0 && linhaJoAnterior<8){
                          colunaJoAnterior--;
                          linhaJoAnterior++;
                          
                          if(colunaJoAnterior <0 || linhaJoAnterior>=8){
                             return false;//encontrou algum erro na comparação  de cima
                          }
                          else if (!pecas[linhaJoAnterior][colunaJoAnterior].getTipoPeca().equals("??")){
                              return false;
                          }
                          else if(colunaJoAnterior==coluna && linhaJoAnterior==linha){
                              return true;
                          }
                      }                      
                  }                  
                  
               
              }
                
            }
             return false;//evitar erro
         }else{//para jogador 2
            if(pecas[linhaJoAnterior][colunaJoAnterior].getTipoPeca() == "2"){//comparaçao para peça normal
              if(linha==linhaJoAnterior){
                  return false;
              }
              else if(linha>linhaJoAnterior){
                 return false;
              }
              else{
                  if(coluna>colunaJoAnterior){
                    if(coluna==colunaJoAnterior+1 && linha==linhaJoAnterior-1){
                       return true;
                    }
                    else{
                      return false;
                    }
                  }
                  else{
                    if(coluna==colunaJoAnterior-1 && linha==linhaJoAnterior-1){
                       return true;
                    }
                    else{
                      return false;
                    }                      
                      
                  }
              }
            }else{//para peça dama
             if(linha==linhaJoAnterior){
                  return false;
              }
              else if(linha<linhaJoAnterior){//subindo
                  if(coluna==colunaJoAnterior){
                     return false;
                  }
                  else if(coluna>colunaJoAnterior){//direita
                      while(colunaJoAnterior < 8 && linhaJoAnterior>=0){
                          colunaJoAnterior++;
                          linhaJoAnterior--;
                          
                          if(colunaJoAnterior >=8 || linhaJoAnterior<0){
                              return false;//encontrou algum erro na comparação  de cima
                          }
                          else if (!pecas[linhaJoAnterior][colunaJoAnterior].getTipoPeca().equals("??")){
                              return false;
                          }
                          else if(colunaJoAnterior==coluna && linhaJoAnterior==linha){
                             return true;
                          }
                      }
                      
                  }
                  else{//esquerda
                      while(colunaJoAnterior >=0 && linhaJoAnterior>=0){
                          colunaJoAnterior--;
                          linhaJoAnterior--;
                          
                          if(colunaJoAnterior <0 || linhaJoAnterior<0){
                              return false;//encontrou algum erro na comparação  de cima
                          }
                          else if (!pecas[linhaJoAnterior][colunaJoAnterior].getTipoPeca().equals("??")){
                              return false;
                          }
                          else if(colunaJoAnterior==coluna && linhaJoAnterior==linha){
                              return true;
                          }
                      }                      
                  }
              }
              else{//descendo
                  if(coluna==colunaJoAnterior){
                      return false;
                  }
                  else if(coluna>colunaJoAnterior){//direita
                      while(colunaJoAnterior <8 && linhaJoAnterior<8){
                          colunaJoAnterior++;
                          linhaJoAnterior++;
                          
                          if(colunaJoAnterior >=8 || linhaJoAnterior>=8){
                              return false;//encontrou algum erro na comparação  de cima
                          }
                          else if (!pecas[linhaJoAnterior][colunaJoAnterior].getTipoPeca().equals("??")){
                              return false;
                          }
                          else if(colunaJoAnterior==coluna && linhaJoAnterior==linha){
                             return true;
                          }
                      }
                      
                  }
                  else{//esquerda
                      while(colunaJoAnterior >=0 && linhaJoAnterior<8){
                          colunaJoAnterior--;
                          linhaJoAnterior++;
                          
                          if(colunaJoAnterior <0 || linhaJoAnterior>=8){
                              return false;//encontrou algum erro na comparação  de cima
                          }
                          else if (!pecas[linhaJoAnterior][colunaJoAnterior].getTipoPeca().equals("??")){
                              return false;
                          }
                          else if(colunaJoAnterior==coluna && linhaJoAnterior==linha){
                              return true;
                          }
                      }                      
                  }                  
                  
               
              }   
            } 
            return false;//evitar erro
         }
     }
     
     
     public void EfetuarMovSemComer(int linhaJoAnterior,int colunaJoAnterior,int linhaNova,int colunaNova){//efetuar o mevomento sem captura
          Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro
          
          Pecas novo = pecas[linhaJoAnterior][colunaJoAnterior];//armazena a peca que sera movida
          Pecas antigo = pecas[linhaNova][colunaNova];//armazena a peca que ficara no local movido
                  
          pecas[linhaJoAnterior][colunaJoAnterior] = antigo;
          pecas[linhaNova][colunaNova] = novo;
          
          tabuleiro.setTabuleiroMontado(pecas);
          
     }
     
     
     public void TranformeDama(){//efetuar o mevomento sem captura
          Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro
          
           for(int i=0;i<8;i++){
             if(pecas[0][i].getTipoPeca().equals("2")){
                pecas[0][i] = new PecasDama("22");
             }
             else if(pecas[7][i].getTipoPeca().equals("1")){
               pecas[7][i] = new PecasDama("11");
             }
           }
          
          tabuleiro.setTabuleiroMontado(pecas);
          
     }    
     
     
     
     public void EfetuarJogadaObrig(int linhaJoAnterior,int colunaJoAnterior,int linhaNova,int colunaNova){
          Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro
          int linhaAux,colunaAux;
          
          
          Pecas novo = pecas[linhaJoAnterior][colunaJoAnterior];//armazena a peca que sera movida
          Pecas antigo = pecas[linhaNova][colunaNova];//armazena a peca que ficara no local movido(peça branco)
          
          pecas[linhaJoAnterior][colunaJoAnterior] = antigo;
          pecas[linhaNova][colunaNova] = novo;
          
          
          if(linhaJoAnterior<linhaNova){//descendo
              if(colunaJoAnterior<colunaNova){//direita
                  linhaAux = linhaJoAnterior+1;
                  colunaAux = colunaJoAnterior+1;
                  while(linhaAux!=linhaNova && colunaAux!=colunaNova){
                      pecas[linhaAux][colunaAux] = antigo;
                      linhaAux++;
                      colunaAux++;
                  }
              }
              else{//esquerda
                  linhaAux = linhaJoAnterior+1;
                  colunaAux = colunaJoAnterior-1;
                  while(linhaAux!=linhaNova && colunaAux!=colunaNova){
                      pecas[linhaAux][colunaAux] = antigo;
                      linhaAux++;
                      colunaAux--;
                  }
              }
          }
          else{//subindo
              if(colunaJoAnterior<colunaNova){//direita
                  linhaAux = linhaJoAnterior-1;
                  colunaAux = colunaJoAnterior+1;
                  while(linhaAux!=linhaNova && colunaAux!=colunaNova){
                      pecas[linhaAux][colunaAux] = antigo;
                      linhaAux--;
                      colunaAux++;
                  }
              }
              else{//esquerda
                  linhaAux = linhaJoAnterior-1;
                  colunaAux = colunaJoAnterior-1;
                  while(linhaAux!=linhaNova && colunaAux!=colunaNova){
                      pecas[linhaAux][colunaAux] = antigo;
                      linhaAux--;
                      colunaAux--;
                  }
              }
          }
          
          tabuleiro.setTabuleiroMontado(pecas);
     }
     
     
    public List<String> ComerMais(String SimboloJogador,int i,int k){//verifica se tem a peçã pode comer mais(i para linha;k para coluna)
        Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro
        List<String> jog_Obr = new ArrayList<String>();//lista as jogadas
        
       
              if(pecas[i][k].getTipoPeca().equals(SimboloJogador)){
                  jog_Obr.addAll(auxPecaNor(i, k, SimboloJogador));
              }
              else if (pecas[i][k].getTipoPeca().equals(SimboloJogador+SimboloJogador))
              {
                  jog_Obr.addAll(auxPecaDam(i, k, SimboloJogador));
              }
     
        return jog_Obr;
    }
     
    public boolean verificaNaoJogadaTravada(String SimboloJogador){
     Pecas[][] pecas = tabuleiro.getTabuleiroMontado();//busca as pecas do tabuleiro   
   
      for(int i=0;i<8;i++){
          for(int k=0;k<8;k++){
            if(pecas[i][k].getTipoPeca().equals(SimboloJogador)){
               if(SimboloJogador == "1"){
                   if(i+1<8){
                     if(k+1<8){
                         if(pecas[i+1][k+1].getTipoPeca().equals("??")){
                             return true;
                         }
                     }
                     if(k-1>=0){
                         if(pecas[i+1][k-1].getTipoPeca().equals("??")){
                             return true;
                         }
                     }
                   }
               }
               else{
                   if(i-1>=0){
                     if(k+1<8){
                         if(pecas[i-1][k+1].getTipoPeca().equals("??")){
                             return true;
                         }
                     }
                    if(k-1>=0){
                         if(pecas[i-1][k-1].getTipoPeca().equals("??")){
                             return true;
                         }
                     }
                   }                   
               }             
            }else if(pecas[i][k].getTipoPeca().equals(SimboloJogador+SimboloJogador)){
                   if(i+1<8){
                     if(k+1<8){
                         if(pecas[i+1][k+1].getTipoPeca().equals("??")){
                             return true;
                         }
                     }
                     if(k-1>=0){
                         if(pecas[i+1][k-1].getTipoPeca().equals("??")){
                             return true;
                         }
                     }
                   }
                  if(i-1>=0){
                     if(k+1<8){
                         if(pecas[i-1][k+1].getTipoPeca().equals("??")){
                             return true;
                         }
                     }
                    if(k-1>=0){
                         if(pecas[i-1][k-1].getTipoPeca().equals("??")){
                             return true;
                         }
                     }
                   }                     
            }            
          }
      }
     return false;
   }
 


    
}
