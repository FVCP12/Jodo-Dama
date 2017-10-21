
package Interface;
import java.util.ArrayList;
import java.util.List;
import jogo_BO.Jogadas;

public class Jogo extends javax.swing.JFrame {
    
    Jogadas jogadas;
    //inicio da declaração das variaveis que seram usadas
    private int linha,coluna;//representa a linha e a coluna de cada botao
    private int[] posLinhaColuna = new int[4];//armazena os numeros das linhas e colunas das peças da jogada 
    private boolean primeiraPeca = true;//verifica se o jogador ja escolheu alguma peça(true para primeira peça, 
                                        // a origem, e false para segunda peça, o destino)  
    private String turnoJogador = "1"; //"1" ->para turno do jagodor 1 || "2" -> para turno do jogador 2
    private String aux ="";//armazena temporariamente a mensagem que sera exibida no painel de informação
    private List<String> jog_Obr = new ArrayList<String>();
   

    //fim da declaração
    
    public Jogo(){
    }
    
    public Jogo(Jogadas jogadas) {
        initComponents();
        this.setSize(1000, 650);//tamanho
        this.setResizable(false);//tamanho fixo
        this.jogadas=jogadas;
        this.atualizarImagens();//atualiza as imagens no tabuleiro
        this.informacao.setEditable(false);//nao deixa o usuario digitar nada na area de infomação
        this.informacao.setText("Começou o jogo! \nBoa sorte aos jogadores!!!!!!");//menssagem inicial nas informaçoes
        this.nomeJogador1.setText(jogadas.jogador1.getNome());//nomes dos jogadores
        this.nomeJogador2.setText(jogadas.jogador2.getNome());
        this.numeroPecasJ1.setText(""+jogadas.getNumeroTotalPecas1());//numero de peças dos jogadores('""+' para virar texto)
        this.numeroPecasJ2.setText(""+jogadas.getNumeroTotalPecas2());
        this.jogadasSemCapt.setText(jogadas.getNumeroJogadasSemCaptura()+"/25");//jogadas sem captura
        this.mostraNomeJogador.setText(jogadas.jogador1.getNome());//mostra nome do jogador que começa
        this.posLinhaColuna[0] = -1;//evitar que começe com zero
        this.posLinhaColuna[1] = -1;
        this.posLinhaColuna[2] = -1;
        this.posLinhaColuna[3] = -1;
                
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        l0c0 = new javax.swing.JButton();
        l0c1 = new javax.swing.JButton();
        l0c2 = new javax.swing.JButton();
        l0c3 = new javax.swing.JButton();
        l0c4 = new javax.swing.JButton();
        l0c5 = new javax.swing.JButton();
        l0c6 = new javax.swing.JButton();
        l0c7 = new javax.swing.JButton();
        l1c0 = new javax.swing.JButton();
        l1c1 = new javax.swing.JButton();
        l1c2 = new javax.swing.JButton();
        l1c3 = new javax.swing.JButton();
        l1c4 = new javax.swing.JButton();
        l1c5 = new javax.swing.JButton();
        l1c6 = new javax.swing.JButton();
        l1c7 = new javax.swing.JButton();
        l2c0 = new javax.swing.JButton();
        l2c1 = new javax.swing.JButton();
        l2c2 = new javax.swing.JButton();
        l2c3 = new javax.swing.JButton();
        l2c4 = new javax.swing.JButton();
        l2c5 = new javax.swing.JButton();
        l2c6 = new javax.swing.JButton();
        l2c7 = new javax.swing.JButton();
        l3c0 = new javax.swing.JButton();
        l3c1 = new javax.swing.JButton();
        l3c2 = new javax.swing.JButton();
        l3c3 = new javax.swing.JButton();
        l3c4 = new javax.swing.JButton();
        l3c5 = new javax.swing.JButton();
        l3c6 = new javax.swing.JButton();
        l3c7 = new javax.swing.JButton();
        l4c0 = new javax.swing.JButton();
        l4c1 = new javax.swing.JButton();
        l4c2 = new javax.swing.JButton();
        l4c3 = new javax.swing.JButton();
        l4c4 = new javax.swing.JButton();
        l4c5 = new javax.swing.JButton();
        l4c6 = new javax.swing.JButton();
        l4c7 = new javax.swing.JButton();
        l5c0 = new javax.swing.JButton();
        l5c1 = new javax.swing.JButton();
        l5c2 = new javax.swing.JButton();
        l5c3 = new javax.swing.JButton();
        l5c4 = new javax.swing.JButton();
        l5c5 = new javax.swing.JButton();
        l5c6 = new javax.swing.JButton();
        l5c7 = new javax.swing.JButton();
        l6c0 = new javax.swing.JButton();
        l6c1 = new javax.swing.JButton();
        l6c2 = new javax.swing.JButton();
        l6c3 = new javax.swing.JButton();
        l6c4 = new javax.swing.JButton();
        l6c5 = new javax.swing.JButton();
        l6c6 = new javax.swing.JButton();
        l6c7 = new javax.swing.JButton();
        l7c0 = new javax.swing.JButton();
        l7c1 = new javax.swing.JButton();
        l7c2 = new javax.swing.JButton();
        l7c3 = new javax.swing.JButton();
        l7c4 = new javax.swing.JButton();
        l7c5 = new javax.swing.JButton();
        l7c6 = new javax.swing.JButton();
        l7c7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        mostraNomeJogador = new javax.swing.JLabel();
        numeroPecasJ1 = new javax.swing.JLabel();
        nomeJogador1 = new javax.swing.JLabel();
        corpeca1 = new javax.swing.JLabel();
        informacaofixa1 = new javax.swing.JLabel();
        informacaofixa2 = new javax.swing.JLabel();
        numeroPecasJ2 = new javax.swing.JLabel();
        corpeca2 = new javax.swing.JLabel();
        nomeJogador2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jogadasSemCapt = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        informacao = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(8, 8));

        l0c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l0c0ActionPerformed(evt);
            }
        });
        jPanel2.add(l0c0);

        l0c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l0c1ActionPerformed(evt);
            }
        });
        jPanel2.add(l0c1);

        l0c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l0c2ActionPerformed(evt);
            }
        });
        jPanel2.add(l0c2);

        l0c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l0c3ActionPerformed(evt);
            }
        });
        jPanel2.add(l0c3);

        l0c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l0c4ActionPerformed(evt);
            }
        });
        jPanel2.add(l0c4);

        l0c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l0c5ActionPerformed(evt);
            }
        });
        jPanel2.add(l0c5);

        l0c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l0c6ActionPerformed(evt);
            }
        });
        jPanel2.add(l0c6);

        l0c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l0c7ActionPerformed(evt);
            }
        });
        jPanel2.add(l0c7);

        l1c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1c0ActionPerformed(evt);
            }
        });
        jPanel2.add(l1c0);

        l1c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1c1ActionPerformed(evt);
            }
        });
        jPanel2.add(l1c1);

        l1c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1c2ActionPerformed(evt);
            }
        });
        jPanel2.add(l1c2);

        l1c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1c3ActionPerformed(evt);
            }
        });
        jPanel2.add(l1c3);

        l1c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1c4ActionPerformed(evt);
            }
        });
        jPanel2.add(l1c4);

        l1c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1c5ActionPerformed(evt);
            }
        });
        jPanel2.add(l1c5);

        l1c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1c6ActionPerformed(evt);
            }
        });
        jPanel2.add(l1c6);

        l1c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1c7ActionPerformed(evt);
            }
        });
        jPanel2.add(l1c7);

        l2c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2c0ActionPerformed(evt);
            }
        });
        jPanel2.add(l2c0);

        l2c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2c1ActionPerformed(evt);
            }
        });
        jPanel2.add(l2c1);

        l2c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2c2ActionPerformed(evt);
            }
        });
        jPanel2.add(l2c2);

        l2c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2c3ActionPerformed(evt);
            }
        });
        jPanel2.add(l2c3);

        l2c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2c4ActionPerformed(evt);
            }
        });
        jPanel2.add(l2c4);

        l2c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2c5ActionPerformed(evt);
            }
        });
        jPanel2.add(l2c5);

        l2c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2c6ActionPerformed(evt);
            }
        });
        jPanel2.add(l2c6);

        l2c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2c7ActionPerformed(evt);
            }
        });
        jPanel2.add(l2c7);

        l3c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3c0ActionPerformed(evt);
            }
        });
        jPanel2.add(l3c0);

        l3c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3c1ActionPerformed(evt);
            }
        });
        jPanel2.add(l3c1);

        l3c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3c2ActionPerformed(evt);
            }
        });
        jPanel2.add(l3c2);

        l3c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3c3ActionPerformed(evt);
            }
        });
        jPanel2.add(l3c3);

        l3c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3c4ActionPerformed(evt);
            }
        });
        jPanel2.add(l3c4);

        l3c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3c5ActionPerformed(evt);
            }
        });
        jPanel2.add(l3c5);

        l3c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3c6ActionPerformed(evt);
            }
        });
        jPanel2.add(l3c6);

        l3c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3c7ActionPerformed(evt);
            }
        });
        jPanel2.add(l3c7);

        l4c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l4c0ActionPerformed(evt);
            }
        });
        jPanel2.add(l4c0);

        l4c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l4c1ActionPerformed(evt);
            }
        });
        jPanel2.add(l4c1);

        l4c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l4c2ActionPerformed(evt);
            }
        });
        jPanel2.add(l4c2);

        l4c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l4c3ActionPerformed(evt);
            }
        });
        jPanel2.add(l4c3);

        l4c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l4c4ActionPerformed(evt);
            }
        });
        jPanel2.add(l4c4);

        l4c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l4c5ActionPerformed(evt);
            }
        });
        jPanel2.add(l4c5);

        l4c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l4c6ActionPerformed(evt);
            }
        });
        jPanel2.add(l4c6);

        l4c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l4c7ActionPerformed(evt);
            }
        });
        jPanel2.add(l4c7);

        l5c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l5c0ActionPerformed(evt);
            }
        });
        jPanel2.add(l5c0);

        l5c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l5c1ActionPerformed(evt);
            }
        });
        jPanel2.add(l5c1);

        l5c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l5c2ActionPerformed(evt);
            }
        });
        jPanel2.add(l5c2);

        l5c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l5c3ActionPerformed(evt);
            }
        });
        jPanel2.add(l5c3);

        l5c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l5c4ActionPerformed(evt);
            }
        });
        jPanel2.add(l5c4);

        l5c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l5c5ActionPerformed(evt);
            }
        });
        jPanel2.add(l5c5);

        l5c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l5c6ActionPerformed(evt);
            }
        });
        jPanel2.add(l5c6);

        l5c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l5c7ActionPerformed(evt);
            }
        });
        jPanel2.add(l5c7);

        l6c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l6c0ActionPerformed(evt);
            }
        });
        jPanel2.add(l6c0);

        l6c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l6c1ActionPerformed(evt);
            }
        });
        jPanel2.add(l6c1);

        l6c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l6c2ActionPerformed(evt);
            }
        });
        jPanel2.add(l6c2);

        l6c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l6c3ActionPerformed(evt);
            }
        });
        jPanel2.add(l6c3);

        l6c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l6c4ActionPerformed(evt);
            }
        });
        jPanel2.add(l6c4);

        l6c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l6c5ActionPerformed(evt);
            }
        });
        jPanel2.add(l6c5);

        l6c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l6c6ActionPerformed(evt);
            }
        });
        jPanel2.add(l6c6);

        l6c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l6c7ActionPerformed(evt);
            }
        });
        jPanel2.add(l6c7);

        l7c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l7c0ActionPerformed(evt);
            }
        });
        jPanel2.add(l7c0);

        l7c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l7c1ActionPerformed(evt);
            }
        });
        jPanel2.add(l7c1);

        l7c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l7c2ActionPerformed(evt);
            }
        });
        jPanel2.add(l7c2);

        l7c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l7c3ActionPerformed(evt);
            }
        });
        jPanel2.add(l7c3);

        l7c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l7c4ActionPerformed(evt);
            }
        });
        jPanel2.add(l7c4);

        l7c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l7c5ActionPerformed(evt);
            }
        });
        jPanel2.add(l7c5);

        l7c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l7c6ActionPerformed(evt);
            }
        });
        jPanel2.add(l7c6);

        l7c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l7c7ActionPerformed(evt);
            }
        });
        jPanel2.add(l7c7);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(520, 150, 470, 440);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("7");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(490, 550, 20, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("0");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(540, 120, 20, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("1");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(600, 120, 20, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("2");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(660, 120, 20, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("3");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(720, 120, 20, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("4");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(780, 120, 20, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("5");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(830, 120, 20, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("6");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(890, 120, 20, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("7");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(950, 120, 20, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("0");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(490, 170, 20, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("1");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(490, 220, 20, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("2");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(490, 280, 20, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("3");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(490, 330, 20, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("4");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(490, 390, 20, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("5");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(490, 440, 20, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("6");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(490, 490, 20, 20);

        jLabel18.setFont(new java.awt.Font("Ravie", 3, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Turno do jogador:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(600, 20, 310, 30);

        mostraNomeJogador.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        mostraNomeJogador.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(mostraNomeJogador);
        mostraNomeJogador.setBounds(620, 70, 360, 30);

        numeroPecasJ1.setFont(new java.awt.Font("Ravie", 2, 14)); // NOI18N
        numeroPecasJ1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(numeroPecasJ1);
        numeroPecasJ1.setBounds(230, 80, 40, 20);

        nomeJogador1.setFont(new java.awt.Font("Ravie", 2, 14)); // NOI18N
        nomeJogador1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(nomeJogador1);
        nomeJogador1.setBounds(20, 20, 430, 20);

        corpeca1.setFont(new java.awt.Font("Ravie", 2, 14)); // NOI18N
        corpeca1.setForeground(new java.awt.Color(255, 255, 255));
        corpeca1.setText("Cor da peça: Branca");
        jPanel1.add(corpeca1);
        corpeca1.setBounds(60, 50, 210, 20);

        informacaofixa1.setFont(new java.awt.Font("Ravie", 2, 14)); // NOI18N
        informacaofixa1.setForeground(new java.awt.Color(255, 255, 255));
        informacaofixa1.setText("Numero de peças:");
        jPanel1.add(informacaofixa1);
        informacaofixa1.setBounds(60, 80, 170, 20);

        informacaofixa2.setFont(new java.awt.Font("Ravie", 2, 14)); // NOI18N
        informacaofixa2.setForeground(new java.awt.Color(255, 255, 255));
        informacaofixa2.setText("Numero de peças:");
        jPanel1.add(informacaofixa2);
        informacaofixa2.setBounds(60, 180, 170, 20);

        numeroPecasJ2.setFont(new java.awt.Font("Ravie", 2, 14)); // NOI18N
        numeroPecasJ2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(numeroPecasJ2);
        numeroPecasJ2.setBounds(230, 180, 40, 20);

        corpeca2.setFont(new java.awt.Font("Ravie", 2, 14)); // NOI18N
        corpeca2.setForeground(new java.awt.Color(255, 255, 255));
        corpeca2.setText("Cor da peça: Preta");
        jPanel1.add(corpeca2);
        corpeca2.setBounds(60, 150, 210, 20);

        nomeJogador2.setFont(new java.awt.Font("Ravie", 2, 14)); // NOI18N
        nomeJogador2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(nomeJogador2);
        nomeJogador2.setBounds(20, 120, 430, 20);

        jLabel19.setFont(new java.awt.Font("Ravie", 2, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Jogadas sem captura de peças:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(10, 230, 390, 25);

        jogadasSemCapt.setFont(new java.awt.Font("Ravie", 2, 18)); // NOI18N
        jogadasSemCapt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jogadasSemCapt);
        jogadasSemCapt.setBounds(390, 230, 80, 20);

        jLabel20.setFont(new java.awt.Font("Ravie", 3, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Painel de informações:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(30, 300, 410, 30);

        informacao.setColumns(20);
        informacao.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        informacao.setRows(5);
        jScrollPane2.setViewportView(informacao);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 330, 440, 250);

        getContentPane().add(jPanel1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/ImagemFundofinalJogo.png"))); // NOI18N
        getContentPane().add(jLabel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void l0c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l0c0ActionPerformed
        // TODO add your handling code here:
        linha = 0;
        coluna = 0;
        
        jogada(linha,coluna);

    }//GEN-LAST:event_l0c0ActionPerformed

    private void l0c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l0c1ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l0c1ActionPerformed

    private void l0c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l0c2ActionPerformed
        // TODO add your handling code here:
        linha = 0;
        coluna = 2;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l0c2ActionPerformed

    private void l0c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l0c3ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l0c3ActionPerformed

    private void l0c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l0c4ActionPerformed
        // TODO add your handling code here:
        linha = 0;
        coluna = 4;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l0c4ActionPerformed

    private void l0c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l0c5ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l0c5ActionPerformed

    private void l0c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l0c6ActionPerformed
        // TODO add your handling code here:
        linha = 0;
        coluna = 6;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l0c6ActionPerformed

    private void l0c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l0c7ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l0c7ActionPerformed

    private void l1c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1c0ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l1c0ActionPerformed

    private void l1c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1c1ActionPerformed
        // TODO add your handling code here:
        linha = 1;
        coluna = 1;    
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l1c1ActionPerformed

    private void l1c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1c2ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l1c2ActionPerformed

    private void l1c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1c3ActionPerformed
        // TODO add your handling code here:
        linha = 1;
        coluna = 3;  
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l1c3ActionPerformed

    private void l1c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1c4ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l1c4ActionPerformed

    private void l1c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1c5ActionPerformed
        // TODO add your handling code here:
        linha = 1;
        coluna = 5;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l1c5ActionPerformed

    private void l1c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1c6ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l1c6ActionPerformed

    private void l1c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1c7ActionPerformed
        // TODO add your handling code here:
        linha = 1;
        coluna = 7;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l1c7ActionPerformed

    private void l2c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2c0ActionPerformed
        // TODO add your handling code here:
        linha = 2;
        coluna = 0;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l2c0ActionPerformed

    private void l2c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2c1ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l2c1ActionPerformed

    private void l2c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2c2ActionPerformed
        // TODO add your handling code here:
        linha = 2;
        coluna = 2;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l2c2ActionPerformed

    private void l2c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2c3ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l2c3ActionPerformed

    private void l2c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2c4ActionPerformed
        // TODO add your handling code here:
        linha = 2;
        coluna = 4;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l2c4ActionPerformed

    private void l2c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2c5ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l2c5ActionPerformed

    private void l2c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2c6ActionPerformed
        // TODO add your handling code here:
        linha = 2;
        coluna = 6;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l2c6ActionPerformed

    private void l2c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2c7ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l2c7ActionPerformed

    private void l3c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3c0ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l3c0ActionPerformed

    private void l3c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3c1ActionPerformed
        // TODO add your handling code here:
        linha = 3;
        coluna = 1;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l3c1ActionPerformed

    private void l3c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3c2ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l3c2ActionPerformed

    private void l3c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3c3ActionPerformed
        // TODO add your handling code here:
        linha = 3;
        coluna = 3;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l3c3ActionPerformed

    private void l3c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3c4ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l3c4ActionPerformed

    private void l3c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3c5ActionPerformed
        // TODO add your handling code here:
        linha = 3;
        coluna = 5;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l3c5ActionPerformed

    private void l3c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3c6ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l3c6ActionPerformed

    private void l3c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3c7ActionPerformed
        // TODO add your handling code here:
        linha = 3;
        coluna = 7;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l3c7ActionPerformed

    private void l4c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l4c0ActionPerformed
        // TODO add your handling code here:
        linha = 4;
        coluna = 0;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l4c0ActionPerformed

    private void l4c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l4c1ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l4c1ActionPerformed

    private void l4c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l4c2ActionPerformed
        // TODO add your handling code here:
        linha = 4;
        coluna = 2;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l4c2ActionPerformed

    private void l4c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l4c3ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l4c3ActionPerformed

    private void l4c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l4c4ActionPerformed
        // TODO add your handling code here:
        linha = 4;
        coluna = 4;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l4c4ActionPerformed

    private void l4c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l4c5ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l4c5ActionPerformed

    private void l4c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l4c6ActionPerformed
        // TODO add your handling code here:
        linha = 4;
        coluna = 6;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l4c6ActionPerformed

    private void l4c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l4c7ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l4c7ActionPerformed

    private void l5c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l5c0ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l5c0ActionPerformed

    private void l5c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l5c1ActionPerformed
        // TODO add your handling code here:
        linha = 5;
        coluna = 1;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l5c1ActionPerformed

    private void l5c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l5c2ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l5c2ActionPerformed

    private void l5c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l5c3ActionPerformed
        // TODO add your handling code here:
        linha = 5;
        coluna = 3;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l5c3ActionPerformed

    private void l5c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l5c4ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l5c4ActionPerformed

    private void l5c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l5c5ActionPerformed
        // TODO add your handling code here:
        linha = 5;
        coluna = 5;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l5c5ActionPerformed

    private void l5c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l5c6ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l5c6ActionPerformed

    private void l5c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l5c7ActionPerformed
        // TODO add your handling code here:
        linha = 5;
        coluna = 7;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l5c7ActionPerformed

    private void l6c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l6c0ActionPerformed
        // TODO add your handling code here:
        linha = 6;
        coluna = 0;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l6c0ActionPerformed

    private void l6c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l6c1ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l6c1ActionPerformed

    private void l6c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l6c2ActionPerformed
        // TODO add your handling code here:
        linha = 6;
        coluna = 2;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l6c2ActionPerformed

    private void l6c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l6c3ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l6c3ActionPerformed

    private void l6c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l6c4ActionPerformed
        // TODO add your handling code here:
        linha = 6;
        coluna = 4;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l6c4ActionPerformed

    private void l6c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l6c5ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l6c5ActionPerformed

    private void l6c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l6c6ActionPerformed
        // TODO add your handling code here:
        linha = 6;
        coluna = 6;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l6c6ActionPerformed

    private void l6c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l6c7ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l6c7ActionPerformed

    private void l7c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l7c0ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l7c0ActionPerformed

    private void l7c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l7c1ActionPerformed
        // TODO add your handling code here:
        linha = 7;
        coluna = 1;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l7c1ActionPerformed

    private void l7c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l7c2ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l7c2ActionPerformed

    private void l7c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l7c3ActionPerformed
        // TODO add your handling code here:
        linha = 7;
        coluna = 3;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l7c3ActionPerformed

    private void l7c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l7c4ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l7c4ActionPerformed

    private void l7c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l7c5ActionPerformed
        // TODO add your handling code here:
        linha = 7;
        coluna = 5;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l7c5ActionPerformed

    private void l7c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l7c6ActionPerformed
        // TODO add your handling code here:
        pecaNulaExibir();
    }//GEN-LAST:event_l7c6ActionPerformed

    private void l7c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l7c7ActionPerformed
        // TODO add your handling code here:
        linha = 7;
        coluna = 7;
        
        jogada(linha,coluna);
    }//GEN-LAST:event_l7c7ActionPerformed

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    
///////////abaixo as funcao das peças
    ///função que atualiza as imagens das peças no tabuleiro
    
    private void atualizarImagens(){//atualiza a imagem de cada botão
       l0c0.setIcon(jogadas.imagemPeca(0,0));
       l0c1.setIcon(jogadas.imagemPeca(0,1));
       l0c2.setIcon(jogadas.imagemPeca(0,2));
       l0c3.setIcon(jogadas.imagemPeca(0,3));
       l0c4.setIcon(jogadas.imagemPeca(0,4));
       l0c5.setIcon(jogadas.imagemPeca(0,5));
       l0c6.setIcon(jogadas.imagemPeca(0,6));
       l0c7.setIcon(jogadas.imagemPeca(0,7));
       l1c0.setIcon(jogadas.imagemPeca(1,0));
       l1c1.setIcon(jogadas.imagemPeca(1,1));
       l1c2.setIcon(jogadas.imagemPeca(1,2));
       l1c3.setIcon(jogadas.imagemPeca(1,3));
       l1c4.setIcon(jogadas.imagemPeca(1,4));
       l1c5.setIcon(jogadas.imagemPeca(1,5));
       l1c6.setIcon(jogadas.imagemPeca(1,6));
       l1c7.setIcon(jogadas.imagemPeca(1,7));
       l2c0.setIcon(jogadas.imagemPeca(2,0));
       l2c1.setIcon(jogadas.imagemPeca(2,1));
       l2c2.setIcon(jogadas.imagemPeca(2,2));
       l2c3.setIcon(jogadas.imagemPeca(2,3));
       l2c4.setIcon(jogadas.imagemPeca(2,4));
       l2c5.setIcon(jogadas.imagemPeca(2,5));
       l2c6.setIcon(jogadas.imagemPeca(2,6));
       l2c7.setIcon(jogadas.imagemPeca(2,7));
       l3c0.setIcon(jogadas.imagemPeca(3,0));
       l3c1.setIcon(jogadas.imagemPeca(3,1));
       l3c2.setIcon(jogadas.imagemPeca(3,2));
       l3c3.setIcon(jogadas.imagemPeca(3,3));
       l3c4.setIcon(jogadas.imagemPeca(3,4));
       l3c5.setIcon(jogadas.imagemPeca(3,5));
       l3c6.setIcon(jogadas.imagemPeca(3,6));
       l3c7.setIcon(jogadas.imagemPeca(3,7));
       l4c0.setIcon(jogadas.imagemPeca(4,0));
       l4c1.setIcon(jogadas.imagemPeca(4,1));
       l4c2.setIcon(jogadas.imagemPeca(4,2));
       l4c3.setIcon(jogadas.imagemPeca(4,3));
       l4c4.setIcon(jogadas.imagemPeca(4,4));
       l4c5.setIcon(jogadas.imagemPeca(4,5));
       l4c6.setIcon(jogadas.imagemPeca(4,6));
       l4c7.setIcon(jogadas.imagemPeca(4,7));
       l5c0.setIcon(jogadas.imagemPeca(5,0));
       l5c1.setIcon(jogadas.imagemPeca(5,1));
       l5c2.setIcon(jogadas.imagemPeca(5,2));
       l5c3.setIcon(jogadas.imagemPeca(5,3));
       l5c4.setIcon(jogadas.imagemPeca(5,4));
       l5c5.setIcon(jogadas.imagemPeca(5,5));
       l5c6.setIcon(jogadas.imagemPeca(5,6));
       l5c7.setIcon(jogadas.imagemPeca(5,7));
       l6c0.setIcon(jogadas.imagemPeca(6,0));
       l6c1.setIcon(jogadas.imagemPeca(6,1));
       l6c2.setIcon(jogadas.imagemPeca(6,2));
       l6c3.setIcon(jogadas.imagemPeca(6,3));
       l6c4.setIcon(jogadas.imagemPeca(6,4));
       l6c5.setIcon(jogadas.imagemPeca(6,5));
       l6c6.setIcon(jogadas.imagemPeca(6,6));
       l6c7.setIcon(jogadas.imagemPeca(6,7));
       l7c0.setIcon(jogadas.imagemPeca(7,0));
       l7c1.setIcon(jogadas.imagemPeca(7,1));
       l7c2.setIcon(jogadas.imagemPeca(7,2));
       l7c3.setIcon(jogadas.imagemPeca(7,3));
       l7c4.setIcon(jogadas.imagemPeca(7,4));
       l7c5.setIcon(jogadas.imagemPeca(7,5));
       l7c6.setIcon(jogadas.imagemPeca(7,6));
       l7c7.setIcon(jogadas.imagemPeca(7,7));
          
    }
    
    
    private void cancela_Select_peca(int linha,int coluna){//atualiza a imagem de cada botão
      if(linha == 0){
       if(coluna == 0)   
        l0c0.setIcon(jogadas.imagemPeca(0,0));
       else if(coluna == 2)
        l0c2.setIcon(jogadas.imagemPeca(0,2));
       else if(coluna == 4)
        l0c4.setIcon(jogadas.imagemPeca(0,4));
       else
        l0c6.setIcon(jogadas.imagemPeca(0,6));
       }
      else if(linha == 1){
       if(coluna == 1)   
        l1c1.setIcon(jogadas.imagemPeca(1,1));
       else if(coluna == 3)
        l1c3.setIcon(jogadas.imagemPeca(1,3));
       else if(coluna == 5)
        l1c5.setIcon(jogadas.imagemPeca(1,5));
      else
        l1c7.setIcon(jogadas.imagemPeca(1,7));
      }
      else if(linha == 2){
       if(coluna == 0)   
        l2c0.setIcon(jogadas.imagemPeca(2,0));
       else if(coluna == 2)
        l2c2.setIcon(jogadas.imagemPeca(2,2));
       else if(coluna == 4)
        l2c4.setIcon(jogadas.imagemPeca(2,4));
      else
        l2c6.setIcon(jogadas.imagemPeca(2,6));
      }
      else if(linha == 3){
       if(coluna == 1)   
        l3c1.setIcon(jogadas.imagemPeca(3,1));
       else if(coluna == 3)
        l3c3.setIcon(jogadas.imagemPeca(3,3));
       else if(coluna == 5)
        l3c5.setIcon(jogadas.imagemPeca(3,5));
       else 
        l3c7.setIcon(jogadas.imagemPeca(3,7));
      }
      else if(linha == 4){
       if(coluna == 0)         
        l4c0.setIcon(jogadas.imagemPeca(4,0));
       else if(coluna == 2)
        l4c2.setIcon(jogadas.imagemPeca(4,2));
       else if(coluna == 4)
        l4c4.setIcon(jogadas.imagemPeca(4,4));
       else 
        l4c6.setIcon(jogadas.imagemPeca(4,6));
      }
      else if(linha == 5){
       if(coluna == 1)   
        l5c1.setIcon(jogadas.imagemPeca(5,1));
       else if(coluna == 3)
        l5c3.setIcon(jogadas.imagemPeca(5,3));
       else if(coluna == 5)
        l5c5.setIcon(jogadas.imagemPeca(5,5));
       else
        l5c7.setIcon(jogadas.imagemPeca(5,7));
      }
      else if(linha == 6){
       if(coluna == 0)   
        l6c0.setIcon(jogadas.imagemPeca(6,0));
       else if(coluna == 2)
        l6c2.setIcon(jogadas.imagemPeca(6,2));
       else if(coluna == 4)
        l6c4.setIcon(jogadas.imagemPeca(6,4));
       else
        l6c6.setIcon(jogadas.imagemPeca(6,6));
      }
      else {
       if(coluna == 1)   
        l7c1.setIcon(jogadas.imagemPeca(7,1));
       else if(coluna == 3)
        l7c3.setIcon(jogadas.imagemPeca(7,3));
       else if(coluna == 5)
        l7c5.setIcon(jogadas.imagemPeca(7,5));
      else
        l7c7.setIcon(jogadas.imagemPeca(7,7));
      }   
    }
    
    private void Select_peca(int linha,int coluna){//atualiza a imagem de cada botão
      if(linha == 0){
       if(coluna == 0)   
        l0c0.setIcon(jogadas.selectPeca(0,0));
       else if(coluna == 2)
        l0c2.setIcon(jogadas.selectPeca(0,2));
       else if(coluna == 4)
        l0c4.setIcon(jogadas.selectPeca(0,4));
       else
        l0c6.setIcon(jogadas.selectPeca(0,6));
       }
      else if(linha == 1){
       if(coluna == 1)   
        l1c1.setIcon(jogadas.selectPeca(1,1));
       else if(coluna == 3)
        l1c3.setIcon(jogadas.selectPeca(1,3));
       else if(coluna == 5)
        l1c5.setIcon(jogadas.selectPeca(1,5));
      else
        l1c7.setIcon(jogadas.selectPeca(1,7));
      }
      else if(linha == 2){
       if(coluna == 0)   
        l2c0.setIcon(jogadas.selectPeca(2,0));
       else if(coluna == 2)
        l2c2.setIcon(jogadas.selectPeca(2,2));
       else if(coluna == 4)
        l2c4.setIcon(jogadas.selectPeca(2,4));
      else
        l2c6.setIcon(jogadas.selectPeca(2,6));
      }
      else if(linha == 3){
       if(coluna == 1)   
        l3c1.setIcon(jogadas.selectPeca(3,1));
       else if(coluna == 3)
        l3c3.setIcon(jogadas.selectPeca(3,3));
       else if(coluna == 5)
        l3c5.setIcon(jogadas.selectPeca(3,5));
       else 
        l3c7.setIcon(jogadas.selectPeca(3,7));
      }
      else if(linha == 4){
       if(coluna == 0)         
        l4c0.setIcon(jogadas.selectPeca(4,0));
       else if(coluna == 2)
        l4c2.setIcon(jogadas.selectPeca(4,2));
       else if(coluna == 4)
        l4c4.setIcon(jogadas.selectPeca(4,4));
       else 
        l4c6.setIcon(jogadas.selectPeca(4,6));
      }
      else if(linha == 5){
       if(coluna == 1)   
        l5c1.setIcon(jogadas.selectPeca(5,1));
       else if(coluna == 3)
        l5c3.setIcon(jogadas.selectPeca(5,3));
       else if(coluna == 5)
        l5c5.setIcon(jogadas.selectPeca(5,5));
       else
        l5c7.setIcon(jogadas.selectPeca(5,7));
      }
      else if(linha == 6){
       if(coluna == 0)   
        l6c0.setIcon(jogadas.selectPeca(6,0));
       else if(coluna == 2)
        l6c2.setIcon(jogadas.selectPeca(6,2));
       else if(coluna == 4)
        l6c4.setIcon(jogadas.selectPeca(6,4));
       else
        l6c6.setIcon(jogadas.selectPeca(6,6));
      }
      else {
       if(coluna == 1)   
        l7c1.setIcon(jogadas.selectPeca(7,1));
       else if(coluna == 3)
        l7c3.setIcon(jogadas.selectPeca(7,3));
       else if(coluna == 5)
        l7c5.setIcon(jogadas.selectPeca(7,5));
      else
        l7c7.setIcon(jogadas.selectPeca(7,7));
      }   
    }
    
    private void pecaNulaExibir(){//exibi a mensagem ao clicar na area nula do tabuleiro
          this.informacao.setText(aux+"\n"+"Posição nula do tabuleiro.\nNão há nada ai, e nunca haverá!!!!\nEscolha outra posição.");     
    }
    
    private boolean verifJaClicou(int linha,int coluna){//verifica se ja clicou na peca (usado na escolha da segunda peça)
        if(linha == posLinhaColuna[0] && coluna == posLinhaColuna[1]){
            return true;//peça igual 
        }else{
            return false;//nao e igual a primeira peça
        }
    }
    
   private void jogada(int linha,int coluna){//executa a jogada
       
       String ver;///usada para verificação
       
       if(primeiraPeca){//verifica se e a primeira peça
          // aux = jogadas.ExibirJogObrig(jog_Obr);
           //informacao.setText(aux);//verificar
           
        if(!verifJaClicou(linha, coluna)){   
           ver = jogadas.jogValidaAreaVazia(linha, coluna);
           if(ver.equals("OK")){
               ver = jogadas.jogValidaPecaCerta(linha,coluna,turnoJogador);
               if(ver.equals("OK")){
                   ver = jogadas.jogValidaPodeMover(linha, coluna, turnoJogador);
                   if(ver.equals("OK")){
                       ver = jogadas.VerificarJogObrig(linha, coluna, jog_Obr,primeiraPeca);
                       if(ver.equals("OK")){
                          posLinhaColuna[0] = linha;
                          posLinhaColuna[1] = coluna;
                          aux =aux+"\n"+ "Ótimo, agora temos um ponto de partida!!"+"\n"+"A peça que voce selecionou: "+
                         "Linha:"+linha+" | Coluna:"+coluna+"\n"+"Agora escolha sua próxima peça!";
                          informacao.setText(aux);
                           Select_peca(linha, coluna);
                          
                          primeiraPeca = false;
                       }
                       else{
                           informacao.setText(aux+"\n"+ver);
                       }
                   }
                   else{
                      informacao.setText(aux+"\n"+ver);
                   }
               }
               else{
                   informacao.setText(aux+"\n"+ver);
               }
           }
           else{
              informacao.setText(aux+"\n"+ver);
           }
        }
        else{
          aux = "Jogada cancelada,escolha novamente sua peça!!";
          posLinhaColuna[0] = -1;
          posLinhaColuna[1] = -1;
          informacao.setText(aux);
          cancela_Select_peca(linha, coluna);
        }
       }
       else{//se for a segunda peça   
           
        if(!verifJaClicou(linha, coluna)){ //verificar se a segunda escolha cancela a primeira

           
          if(jog_Obr.size() != 0){
              aux = aux+"\n"+jogadas.ExibirDesObrig(jog_Obr, posLinhaColuna[0], posLinhaColuna[1]);
              informacao.setText(aux);
                 if(jogadas.DestinoObrigatorioValido(jog_Obr, posLinhaColuna[0], posLinhaColuna[1],linha,coluna)){
                     //efetuar jogada                    
                     jogadas.EfetuarJogadaObrig(posLinhaColuna[0], posLinhaColuna[1], linha, coluna);
                        jog_Obr = new ArrayList<String>(); 
                        jog_Obr = jogadas.ComerMais(turnoJogador, linha, coluna);
                        
                           if(jog_Obr.size() != 0){
                               atualizarImagens();
                               posLinhaColuna[0] = linha;
                               posLinhaColuna[1] = coluna;
                               aux = "Voce pode comer mais!!"+"\n"+"Continue comendo"+"\n"+jogadas.ExibirDesObrig(jog_Obr, posLinhaColuna[0], posLinhaColuna[1]);
                               informacao.setText(aux);
                               Select_peca(linha, coluna);
                               
                           }else{
                              proximaJogada();
                           }
                 }
                 else{
                   aux = aux+"\n"+"Escolha um dos destinos obrigatorios!!";
                   informacao.setText(aux);                   
                 }
               
          }else{
              if(jogadas.jogValidaAreaVazia(linha, coluna) != "OK"){
                   if(jogadas.DestinoValido(turnoJogador,posLinhaColuna[0] ,posLinhaColuna[1] , linha, coluna)){
                       jogadas.EfetuarMovSemComer(posLinhaColuna[0] ,posLinhaColuna[1] , linha, coluna);
                       //aux = aux +"\n"+"Otimo, sua jogada foi realizada"+"\n"+"Agora é a vez do oponente";
                       //informacao.setText(aux);                
                       proximaJogada();
                   }else{
                     aux = aux +"\n"+"Desculpe, mais você não pode realizar este movimento!"+"\n"+"Por favor, escolha outro destino";
                     informacao.setText(aux);  
                   } 
              }else{
                 aux = aux +"\n"+"Desculpe, mais você não pode realizar este movimento!"+"\n"+"Por favor, escolha outro destino";
                 informacao.setText(aux);
              }
            
          }  
            

            
        }else{
             primeiraPeca = true;    
             aux = aux+"\n"+"Jogada cancelada,escolha novamente sua peça!!";
             posLinhaColuna[0] = -1;
             posLinhaColuna[1] = -1;
             informacao.setText(aux);
             cancela_Select_peca(linha, coluna);
        }

       }
       
   
   } 
    
   
   
   void proximaJogada(){
       primeiraPeca = true;
       jogadas.contarPecas();
       this.numeroPecasJ1.setText(""+jogadas.getNumeroTotalPecas1());//numero de peças dos jogadores('""+' para virar texto)
       this.numeroPecasJ2.setText(""+jogadas.getNumeroTotalPecas2());
       this.jogadasSemCapt.setText(jogadas.getNumeroJogadasSemCaptura()+"/25");//jogadas sem captura

       if(jogadas.getNumeroTotalPecas1() == 0){//verifica se o jogador 2 ganhou
           Final telaFinal = new Final("2",jogadas);
           telaFinal.setVisible(true);
           this.dispose();
       }
       else if(jogadas.getNumeroTotalPecas2() == 0){//verifica se o jogador 1 ganhou
           Final telaFinal = new Final("1",jogadas);
           telaFinal.setVisible(true);
           this.dispose();
       }
       else if(jogadas.getNumeroJogadasSemCaptura() == 25){//verifica se o empatou
           Final telaFinal = new Final("3",jogadas);
           telaFinal.setVisible(true);
           this.dispose();
       }
       else{//segue o jogo
          jogadas.TranformeDama();
          
          atualizarImagens();
          
          if(turnoJogador == "1"){
             turnoJogador = "2";
              this.mostraNomeJogador.setText(jogadas.jogador2.getNome());//mostra nome do jogador que começa
          }else{
            turnoJogador = "1";
             this.mostraNomeJogador.setText(jogadas.jogador1.getNome());//mostra nome do jogador
          }
          
          //colocar para o proximo jogador
          jog_Obr = new ArrayList<String>();
          jog_Obr.addAll(jogadas.JogadaObrig(turnoJogador));//lista as jogadas obrigatorias
          //
          //verificar
           aux = jogadas.ExibirJogObrig(jog_Obr);
           informacao.setText(aux);//verificar
           if(jog_Obr.size() == 0 && !jogadas.verificaNaoJogadaTravada(turnoJogador)){//verifica se o proximo jogador pode jogar
              Final telaFinal = new Final(turnoJogador+"3",jogadas);//numero do jogador que perdeu com o 3 no final
              telaFinal.setVisible(true);
              this.dispose();
           }
       }       
   
   }
   
   
   
   
   
/////////fim da funções    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel corpeca1;
    private javax.swing.JLabel corpeca2;
    private javax.swing.JTextArea informacao;
    private javax.swing.JLabel informacaofixa1;
    private javax.swing.JLabel informacaofixa2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jogadasSemCapt;
    private javax.swing.JButton l0c0;
    private javax.swing.JButton l0c1;
    private javax.swing.JButton l0c2;
    private javax.swing.JButton l0c3;
    private javax.swing.JButton l0c4;
    private javax.swing.JButton l0c5;
    private javax.swing.JButton l0c6;
    private javax.swing.JButton l0c7;
    private javax.swing.JButton l1c0;
    private javax.swing.JButton l1c1;
    private javax.swing.JButton l1c2;
    private javax.swing.JButton l1c3;
    private javax.swing.JButton l1c4;
    private javax.swing.JButton l1c5;
    private javax.swing.JButton l1c6;
    private javax.swing.JButton l1c7;
    private javax.swing.JButton l2c0;
    private javax.swing.JButton l2c1;
    private javax.swing.JButton l2c2;
    private javax.swing.JButton l2c3;
    private javax.swing.JButton l2c4;
    private javax.swing.JButton l2c5;
    private javax.swing.JButton l2c6;
    private javax.swing.JButton l2c7;
    private javax.swing.JButton l3c0;
    private javax.swing.JButton l3c1;
    private javax.swing.JButton l3c2;
    private javax.swing.JButton l3c3;
    private javax.swing.JButton l3c4;
    private javax.swing.JButton l3c5;
    private javax.swing.JButton l3c6;
    private javax.swing.JButton l3c7;
    private javax.swing.JButton l4c0;
    private javax.swing.JButton l4c1;
    private javax.swing.JButton l4c2;
    private javax.swing.JButton l4c3;
    private javax.swing.JButton l4c4;
    private javax.swing.JButton l4c5;
    private javax.swing.JButton l4c6;
    private javax.swing.JButton l4c7;
    private javax.swing.JButton l5c0;
    private javax.swing.JButton l5c1;
    private javax.swing.JButton l5c2;
    private javax.swing.JButton l5c3;
    private javax.swing.JButton l5c4;
    private javax.swing.JButton l5c5;
    private javax.swing.JButton l5c6;
    private javax.swing.JButton l5c7;
    private javax.swing.JButton l6c0;
    private javax.swing.JButton l6c1;
    private javax.swing.JButton l6c2;
    private javax.swing.JButton l6c3;
    private javax.swing.JButton l6c4;
    private javax.swing.JButton l6c5;
    private javax.swing.JButton l6c6;
    private javax.swing.JButton l6c7;
    private javax.swing.JButton l7c0;
    private javax.swing.JButton l7c1;
    private javax.swing.JButton l7c2;
    private javax.swing.JButton l7c3;
    private javax.swing.JButton l7c4;
    private javax.swing.JButton l7c5;
    private javax.swing.JButton l7c6;
    private javax.swing.JButton l7c7;
    private javax.swing.JLabel mostraNomeJogador;
    private javax.swing.JLabel nomeJogador1;
    private javax.swing.JLabel nomeJogador2;
    private javax.swing.JLabel numeroPecasJ1;
    private javax.swing.JLabel numeroPecasJ2;
    // End of variables declaration//GEN-END:variables
}
