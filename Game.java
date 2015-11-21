/**
 * Classe Game
 *
 * Classe de controle do game ela chama e controla as classes que executam o game.
 * Esta classe controla as demais.
 *
 **/
import java.util.Arrays;

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
    
    int rodadas = 1;
 
    
    while(rodadas != 0){
      
      int quantidadeJogador = (Game.numeroValoresMatriz(Game.idsCartasJogador));
      int quantidadeComputador = (Game.numeroValoresMatriz(Game.idsCartasComputador));
    
      int valorCartaJogador = 0;
      int valorCartaComputador = 0;
      
      
      if(quantidadeJogador > 0){
        valorCartaJogador = Game.getCartaEscolhida();
      }else{
        rodadas = 0;
      }
     
      if(quantidadeComputador > 0){
        valorCartaComputador = Game.getCartaEscolhidaComputador();
      }else{
        rodadas = 0;
      }
      
      //retorno os valores
      System.out.println("JOGADOR => "+quantidadeJogador+" || PC => "+quantidadeComputador);
      System.out.println("JOGADOR => "+valorCartaJogador+" || PC => "+valorCartaComputador);
      
      if(valorCartaJogador >  valorCartaComputador){
         Game.modelarVetor(Game.idsCartasJogador,Game.idsCartasComputador, quantidadeJogador);
      }else{
         Game.modelarVetor(Game.idsCartasComputador,Game.idsCartasJogador, quantidadeComputador);
      }
     
    }
    
  }
  
  public static void modelarVetor(int[] idsCartasGanhador,int[] idsCartasPerdedor, int posicao){
    
    idsCartasGanhador[posicao - 1] = idsCartasPerdedor[0];
    idsCartasPerdedor[posicao] = idsCartasGanhador[0];
    
    idsCartasPerdedor[0] = 0;
    /*
    for(int i = 1; i < idsCartasPerdedor.length; i++){
      idsCartasPerdedor[i - 1] = idsCartasPerdedor[i];
    }
    
    for(int i = 1; i < idsCartasGanhador.length; i++){
      idsCartasGanhador[i - 1] = idsCartasGanhador[i];
    }
    */
    
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
   
    int valor = Integer.parseInt(Game.retornaCaracteristicaSelecionada(caractaristicaInt,idsCartasJogador[0]));
    
    return valor ;
    
  }
  
  public static int getCartaEscolhidaComputador(){
    System.out.println("Esta é sua carta \n");
    System.out.println(Leitura.getCartaByString(idsCartasComputador[0]));
    
    //Zera a variavel de caracteristicas
    int caractaristicaInt = 0;
    
    //Recebe o id da caracteristica a ser comparada
    do{
      Mensagem.printaSelecionaCaracteristica();
      caractaristicaInt = (int)(Math.random() * 5)+1;
    }while(caractaristicaInt <= 0 && caractaristicaInt > 4);
    
    Game.selecionaCaracteristica(caractaristicaInt,0);
   
    int valor = Integer.parseInt(Game.retornaCaracteristicaSelecionada(caractaristicaInt,idsCartasJogador[0]));
    
    return valor ;
  
  
  }
  
  //Função retorna quantidade de "casas" da matriz com valor
  
  public static int numeroValoresMatriz(int[] numeroValoresMatriz){
    
    int cont = 0;
    
    for(int i = 0; i < numeroValoresMatriz.length; i++){
      if(numeroValoresMatriz[i] >= 1){
        cont++;
      }
    }
  
    return cont;
  }
  
  //Função que trabalha com a caracteristica que o usuário selecionou
  public static void selecionaCaracteristica(int caractaristicaInt,int cartaId){
    
    System.out.println("\n\n Você escolheu comparar a caracteristica "+Game.retornaCaracteristicaSelecionada(caractaristicaInt));
    
  }
  
  //Compara a caracteristica que o usuário selecionou
  public static void comparaCaracteristica(int caractaristicaInt, int cartaId){
    int valorCaracteristicaUsuario = Integer.parseInt(retornoLeitura.retornaValorCaracteristica(caractaristicaInt,cartaId));
  }
  
  public static String retornaCaracteristicaSelecionada(int caractaristicaInt, int cartaId){
    return retornoLeitura.retornaValorCaracteristica(caractaristicaInt,cartaId);
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