
package jogo_de_dama;


public class Jogador {
   private String nome;
   private String tipoPeca;//recebe 1 para o jogador1 e 2 para o jogador2(numero a ser inserido pelo sistema na 
                           // hora de criar o jogador)

   
   public Jogador(String nome,String tipoPeca){
       this.nome = nome;
       this.tipoPeca = tipoPeca;  
   }
   
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

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
   
   
   
   
   
}
