/**
 * Classe Cartas
 *
 * Classe de controle das cartas do game
 *
 **/
public class Carta{
  
  //variaveis da classe
  static int qntdCartas = 0;
  static int[] cartasComputador;
  static int[] cartasJogador;
  
  //Seta para a propriedade a quantidade de cartas que o jogador escolheu
  public static void setQuantidadeDeCartas(int qntdCartas){
    Carta.qntdCartas = qntdCartas;
    
    //Seta o tamanho dos vetores (inicializa os vetores)
    Carta.cartasComputador = new int[ qntdCartas ];
    Carta.cartasJogador    = new int[ qntdCartas ];
    
    //Ap�s chamar este metodo j� chama este outro que seta as cartas
    Carta.setCartas();
  }
  
  //Seta as cartas dos jogadores (computador e jogador)
  public static void setCartas(){
    
    //Inicializa a vari�vel
    int cartaSorteada = 0;
    
    //Preenche o vetor com as cartas do computador
    for (int i = 0; i < Carta.qntdCartas / 2; i++) {
          //Enquanto a carta sorteada existe no vetor sorteie uma nova carta
          do {
            cartaSorteada = Carta.sorteiaCarta();
          }while(Carta.existeCartaNoVetor(cartaSorteada,Carta.cartasComputador));
      
          Carta.cartasComputador[i] = cartaSorteada;
    }
     
    //Zerando a vari�vel
    cartaSorteada = 0;
    
    //Preenche o vetor com as cartas do Jogador
    for (int i = 0; i < Carta.qntdCartas / 2; i++) {
      //Enquanto a carta existe em alguns dos vetores sorteie uma nova carta
      do {
        cartaSorteada = Carta.sorteiaCarta();
      }while(Carta.existeCartaNoVetor(cartaSorteada,Carta.cartasComputador) || Carta.existeCartaNoVetor(cartaSorteada,Carta.cartasJogador));
      
      Carta.cartasJogador[i] = cartaSorteada;
      
    }
  }
  
  //Testa se a carta exise no vetor
  // int carta   -> Id da carta sorteada
  // int[] vetor -> Vetor a ser analisado
  //Retorna true se a carta existe no vetor e false caso n�o exista
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

  //Sorteia a carta pela qual os jogador ir�o jogar
  public static int sorteiaCarta(){
    return (int) ((Math.random() * 32) + 1) ;
  }
  
}