/**
 * Classe Cartas
 *
 * Classe de controle das cartas do game
 *
 **/
public class Carta{
  
<<<<<<< HEAD
  //variÃ¡veis da classe
=======
  //variáveis da classe
>>>>>>> e8671a74c32abdd53198f5075bb90f8391927f0d
  static int qntdCartas = 0;
  static int[] cartasComputador;
  static int[] cartasJogador;
  
  //Seta para a propriedade a quantidade de cartas que o jogador escolheu
  public static void setQuantidadeDeCartas(int qntdCartas){
    Carta.qntdCartas = qntdCartas;
    
    //Seta o tamanho dos vetores (inicializa os vetores)
<<<<<<< HEAD
    Carta.cartasComputador = new int[ qntdCartas / 2];
    Carta.cartasJogador    = new int[ qntdCartas / 2];
    
    //ApÃ³s chamar este metodo jÃ¡ chama este outro que seta as cartas
=======
    Carta.cartasComputador = new int[ qntdCartas ];
    Carta.cartasJogador    = new int[ qntdCartas ];
    
    //Após chamar este metodo já chama este outro que seta as cartas
>>>>>>> e8671a74c32abdd53198f5075bb90f8391927f0d
    Carta.setCartas();
  }
  
  //Seta as cartas dos jogadores (computador e jogador)
  public static void setCartas(){
    
<<<<<<< HEAD
    //Inicializa a variÃ¡vel
=======
    //Inicializa a variável
>>>>>>> e8671a74c32abdd53198f5075bb90f8391927f0d
    int cartaSorteada = 0;
    
    //Preenche o vetor com as cartas do computador
    for (int i = 0; i < Carta.qntdCartas / 2; i++) {
          //Enquanto a carta sorteada existe no vetor sorteie uma nova carta
          do {
            cartaSorteada = Carta.sorteiaCarta();
          }while(Carta.existeCartaNoVetor(cartaSorteada,Carta.cartasComputador));
      
          Carta.cartasComputador[i] = cartaSorteada;
    }
     
<<<<<<< HEAD
    //Zerando a variÃ¡vel
=======
    //Zerando a variável
>>>>>>> e8671a74c32abdd53198f5075bb90f8391927f0d
    cartaSorteada = 0;
    
    //Preenche o vetor com as cartas do Jogador
    for (int i = 0; i < Carta.qntdCartas / 2; i++) {
      //Enquanto a carta existe em alguns dos vetores sorteie uma nova carta
      do {
        cartaSorteada = Carta.sorteiaCarta();
<<<<<<< HEAD
      }while(Carta.existeCartaNoVetor(cartaSorteada,Carta.cartasComputador) && Carta.existeCartaNoVetor(cartaSorteada,Carta.cartasJogador));
=======
      }while(Carta.existeCartaNoVetor(cartaSorteada,Carta.cartasComputador) || Carta.existeCartaNoVetor(cartaSorteada,Carta.cartasJogador));
>>>>>>> e8671a74c32abdd53198f5075bb90f8391927f0d
      
      Carta.cartasJogador[i] = cartaSorteada;
      
    }
  }
  
  //Testa se a carta exise no vetor
  // int carta   -> Id da carta sorteada
  // int[] vetor -> Vetor a ser analisado
<<<<<<< HEAD
  //Retorna true se a carta existe no vetor e false caso nÃ£o exista
=======
  //Retorna true se a carta existe no vetor e false caso não exista
>>>>>>> e8671a74c32abdd53198f5075bb90f8391927f0d
  public static boolean existeCartaNoVetor(int carta, int[] vetor){
    //Variavel de controle de teste
    boolean existe = false;
    
    if (vetor != null && vetor.length != 0) {
      //Valida se a carta existe no vetor
      for (int i = 0; i < vetor.length; i++) {
        if (carta == vetor[i]) {
          existe = true;
        }
      }
    }
    
    return existe;
  }
  
  //Retorna as cartas do Computador
  public static int[] getCartasComputador(){
    return Carta.cartasComputador;
  }
  
  
  //Retorna as cartas do Jogador
  public static int[] getCartasJogador(){
    return Carta.cartasJogador;
  }

<<<<<<< HEAD
  //Sorteia a carta pela qual os jogador irÃ£o jogar
=======
  //Sorteia a carta pela qual os jogador irão jogar
>>>>>>> e8671a74c32abdd53198f5075bb90f8391927f0d
  public static int sorteiaCarta(){
    return (int) ((Math.random() * 32) + 1) ;
  }
  
}