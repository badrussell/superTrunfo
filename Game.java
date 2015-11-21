/**
 * Classe Game
 *
 * Classe de controle do game ela chama e controla as classes que executam o game.
 * Esta classe controla as demais.
 *
 **/
public class Game{
  
  //Variáveis da classe
  
  //Vetor com os ids das cartas
  static int[] idsCartasJogador;
  static int[] idsCartasComputador;
  
  //Vetores cartas
  static String[][] cartasJogador;
  static String[][] cartasComputador;
  
  
  //Inicia o jogo setando as cartas para os jogadores.
  //As cartas são referenciadas pelo id cadastrado no arquivo.
  public static void iniciar(int qntdCartas){
    
    //Seta com quantas cartas o jogador escolheu jogar
    Carta.setQuantidadeDeCartas(qntdCartas);
    
    //Pegas as cartas (ids) do jogador e do computador
    Game.idsCartasJogador    = Carta.getCartasJogador();
    Game.idsCartasComputador = Carta.getCartasComputador();
    
    // Inicializando vetores que irão conter as cartas dos jogadores
    Game.cartasJogador    = new String[qntdCartas/2][5];
    Game.cartasComputador = new String[qntdCartas/2][5];
    
      
    //Preenchendo os vetores cartas com do Jogador
    for (int i = 0; i < Game.idsCartasJogador.length; i++) {
      //Vetor com as cartas do Jogador
      Game.cartasJogador[i]     = Leitura.getCartaById(idsCartasJogador[i]);
    }
    
    //Preenchendo os vetores cartas do Computador
    for (int i = 0; i < Game.idsCartasComputador.length; i++) {
      //Vetor com as cartas do Computador
      Game.cartasComputador[i]  = Leitura.getCartaById(idsCartasComputador[i]);
    }
    
    
    for (int i = 0; i < cartasJogador.length; i++) {
      System.out.println("Esta é sua carta \n");
      System.out.println(cartasJogador[i]);
      
      int caractaristicaInt = 0;
      
      do{
        Mensagem.printaSelecionaCaracteristica();
        caractaristicaInt = Entrada.leiaInt();
      }while(caractaristicaInt <= 0 && caractaristicaInt > 4);
      
      Game.selecionaCaracteristica(caractaristicaInt,i);
      
    }
    
  }
  
  //Função que trabalha com a caracteristica que o usuário selecionou
  public static void selecionaCaracteristica(int caractaristicaInt,int cartaId){
    
    System.out.println("Você escolheu comparar a caracteristica "+retornaCaracteristicaSelecionada(caractaristicaInt));
    
    Game.comparaCaracteristica(caractaristicaInt,cartaId);
    
  }
  
  //Compara a caracteristica que o usuário selecionou
  public static void comparaCaracteristica(int caractaristicaInt, int cartaId){
    //int valorCaracteristicaUsuario = retornoLeitura.retornaValorCaracteristica(caractaristicaInt,cartaId);
  
  }
  
  //Retorna a caracteristica que o usuário escolheu comparar
  public static String retornaCaracteristicaSelecionada(int caractaristicaInt){
    if (caractaristicaInt == 1) {
      return "Soco";
    }else{
      if (caractaristicaInt == 2) {
        return "Chute";
      }else if(caractaristicaInt == 3){
        return "Poder";
      }else{
        return "Defesa";
      }
    }
  }
}