/**
 * Classe Game
 *
 * Classe de controle do game ela chama e controla as classes que executam o game.
 * Esta classe controla as demais.
 *
 **/
public class Game{
  
  //Variáveis da classe
  static int[] qntdCartasJogador;
  static int[] qntdCartasComputador;
  
  //Vetores cartas
  static String[] cartasJogador;
  static String[] cartasComputador;
  
  
  //Inicia o jogo setando as cartas para os jogadores.
  //As cartas são referenciadas pelo id cadastrado no arquivo.
  public static void iniciar(int qntdCartas){
    
    //Seta com quantas cartas o jogador escolheu jogar
    Carta.setQuantidadeDeCartas(qntdCartas);
    
    //Pegas as cartas (ids) do jogador e do computador
    Game.qntdCartasJogador    = Carta.getCartas();
    Game.qntdCartasComputador = Carta.getCartas();
    
      //Vetores com as cartas dos jogadores
      Game.cartasJogador    = new String[qntdCartas/2];
      Game.cartasComputador = new String[qntdCartas/2];
    
      
    //Preenchendo os vetores cartas com as cartas selecionadas do random
      //Após preencher zera a variável 
    for (int i = 0; i < Game.qntdCartasJogador.length; i++) {
      
      //Vetor com as cartas do Jogador
      cartasJogador[i]     = retornoLeitura.retornaCarta(qntdCartasJogador[i]);
      retornoLeitura.carta = "";
      
      //Vetor com as cartas do Computador
      cartasComputador[i]  = retornoLeitura.retornaCarta(qntdCartasComputador[i]);
      retornoLeitura.carta = "";
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
    int valorCaracteristicaUsuario = retornoLeitura.retornaValorCaracteristica(caractaristicaInt,cartaId);
  
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