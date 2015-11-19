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
  
  //Inicia o jogo setando as cartas para os jogadores.
  //As cartas são referenciadas pelo id cadastrado no arquivo.
  public static void iniciar(int qntdCartas){
    
    //Seta com quantas cartas o jogador escolheu jogar
    Carta.setQuantidadeDeCartas(qntdCartas);
    
    //Pegas as cartas (ids) do jogador e do computador
    Game.idsCartasJogador    = Carta.getCartasJogador();
    Game.idsCartasComputador = Carta.getCartasComputador();
    
    int rodadas = 0;
    
    char vencedor = 'X';
    
    while(idsCartasJogador.length != 0 || idsCartasComputador.length != 0){
      
      Game.getCartaEscolhida();        
        
    }
    
    
  }
  
  public static int getCartaEscolhida(){
    
    System.out.println("Esta é sua carta \n");
    System.out.println(Leitura.getCartaByString(idsCartasJogador[0]));
    
    //Zera a variavel de caracteristicas
    int caractaristicaInt = 0;
    
    //Recebe o id da caracteristica a ser comparada
    do{
      Mensagem.printaSelecionaCaracteristica();
      caractaristicaInt = Entrada.leiaInt();
    }while(caractaristicaInt <= 0 && caractaristicaInt > 4);
    
    Game.selecionaCaracteristica(caractaristicaInt,0);
    
    System.out.println(Game.retornaCaracteristicaSelecionada(caractaristicaInt));
    return 1;
    
  }
  
  //Função que trabalha com a caracteristica que o usuário selecionou
  public static void selecionaCaracteristica(int caractaristicaInt,int cartaId){
    
    System.out.println("Você escolheu comparar a caracteristica "+Game.retornaCaracteristicaSelecionada(caractaristicaInt));
    
  }
  
  //Compara a caracteristica que o usuário selecionou
  public static void comparaCaracteristica(int caractaristicaInt, int cartaId){
    int valorCaracteristicaUsuario = Integer.parseInt(retornoLeitura.retornaValorCaracteristica(caractaristicaInt,cartaId));
    
    
    
  }
  
  
  public static int retornaCaracteristicaDoComputador(){
    return 2;
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