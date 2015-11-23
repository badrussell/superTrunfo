/**
 * Classe Game
 *
 * Classe de controle do game ela chama e controla as classes que executam o game.
 * Esta classe controla as demais.
 *
 **/
import java.util.Arrays;

public class Game{
  
  //Variaveis da classe
  
  //Vetor com os ids das cartas
  static int[] idsCartasJogador;
  static int[] idsCartasComputador;
  
  //Inicia o jogo setando as cartas para os jogadores.
  //As cartas sao referenciadas pelo id cadastrado no arquivo.
  public static void iniciar(int qntdCartas){
    
    //Seta com quantas cartas o jogador escolheu jogar
    Carta.setQuantidadeDeCartas(qntdCartas);
    
    //Pegas as cartas (ids) do jogador e do computador
    Game.idsCartasJogador    = Carta.getCartasJogador();
    Game.idsCartasComputador = Carta.getCartasComputador();
    
    int rodadas = 1;
 
    //Variavel com a informação de quem começa o game
    String comeca = sorteiaQuemComeca();
    
    while(continuaLaco(idsCartasJogador,idsCartasComputador)){
      
      //Variáveis utilizadas para controlar se o jogo continua
      int quantidadeJogador    = (Game.numeroValoresVetor(Game.idsCartasJogador));
      int quantidadeComputador = (Game.numeroValoresVetor(Game.idsCartasComputador));
    
      
      int valorCartaJogador = 0;
      int valorCartaComputador = 0;
      
      
      //Validacao de quem comeca a partida
      if (comeca == "c") {
        
        //Caso a quantidade de cartas do computador seja igual a zero então finaliza o jogo
        if(quantidadeComputador > 0){
          comeca = Game.getCartaEscolhidaComputador();
        }else{
          rodadas = 0;
        }
     
        
      }else{
        
        //Sorteia uma carta computador
        int cartaComputador = sorteiaCartaParaJogar(idsCartasComputador);
        
        //Sorteia uma caracteristica para o Computador
        int caracteristicaComputador = sorteiaCaracteristica();
        
        //Caso a quantidade de cartas do jogador seja igual a zero então finaliza o jogo
        if(quantidadeJogador > 0){
          comeca = Game.getCartaEscolhidaJogador(cartaComputador,caracteristicaComputador);
        }else{
          rodadas = 0;
        }
        
      }      
      
      //retorna os valores atualizados (placar)
      System.out.println("\n\n Placar \n");
      System.out.println("VOCÊ => "+numeroValoresVetor(idsCartasJogador)
                           +" || PC => "+numeroValoresVetor(idsCartasComputador));
     
    }
    
  }
  
  //Modela os vetores do vencedor e do perdedor da partida
  public static void modelarVetor(int[] idsCartasGanhador,int[] idsCartasPerdedor, int carta){
    
    boolean ocorrencia = true;
    //Coloca na primeira posição vazia do vetor a carta
    for (int j = 0; j < idsCartasGanhador.length; j++) {
      if (idsCartasGanhador[j] == 0) {
        if (ocorrencia) {
          idsCartasGanhador[j] = carta;
          ocorrencia = false;
        }
      }
    }
    
    //Retira a carta do vetor do perdedor
    for (int i = 0; i < idsCartasPerdedor.length; i++) {
      if (idsCartasPerdedor[i] == carta) {
        idsCartasPerdedor[i] = 0;
      }
    }
    
  }
  
  //Controla o fluxo, nesse ponto do programa é controlado a caracteristica que o usuário
  //deve comparar
  public static String getCartaEscolhidaJogador(int cartaComputador, int caracteristicaComputador){
    
    String ganhou = "";
    
    //Sorteia e mostra a carta do jogador
    System.out.println("Esta e sua carta \n");
    int cartaSorteadaJogador = sorteiaCartaParaJogar(idsCartasJogador);
    System.out.println(Leitura.getCartaByString(cartaSorteadaJogador));
    
    //Zera a variavel de caracteristicas
    int caractaristicaJogador = 0;
    
    //Recebe o id da caracteristica a ser comparada
    do{
      Mensagem.printaSelecionaCaracteristica();
      caractaristicaJogador = Entrada.leiaInt();
    }while(caractaristicaJogador <= 0 && caractaristicaJogador > 4);
    
    //Contém os valores das caracteristicas selecionadas
    String valorCaracteristicaJogador   = Game.retornaCaracteristicaSelecionada(caractaristicaJogador,cartaSorteadaJogador); 
    String valorCaracteristicaComputador = Game.retornaCaracteristicaSelecionada(caracteristicaComputador,cartaComputador); 
    
    System.out.println("\n\n Carta do Computador\n");
    System.out.println(Leitura.getCartaByString(cartaComputador));
    
    //Computador venceu
    if (Integer.parseInt(valorCaracteristicaJogador) < 
        Integer.parseInt(valorCaracteristicaComputador)) {
      modelarVetor(idsCartasComputador,idsCartasJogador,cartaSorteadaJogador);
      
      System.out.println("\n\nO Computador venceu essa rodada!\n\n");
      
      ganhou = "c";
      
    //Jogador venceu
    }else{
      modelarVetor(idsCartasJogador,idsCartasComputador,cartaComputador);
      
      System.out.println("\n\nVocê venceu essa rodada!\n\n");
      
      ganhou = "j";
    }
    
    return ganhou ;
  }
  
  public static String getCartaEscolhidaComputador(){
    
    String ganhou = "";
    
    //Sorteia uma carta computador
    int cartaComputador = sorteiaCartaParaJogar(idsCartasComputador);
        
    //Sorteia uma caracteristica para o Computador
    int caracteristicaComputador = sorteiaCaracteristica();
       
    //Sorteia um carta para o jogador
    int cartaJogador = sorteiaCartaParaJogar(idsCartasJogador);
        
    //Printa o id da caracteristica quem o computador optou por jogar
    System.out.println("O computador optou por jogar com a caracteristica " + caracteristicaComputador);
     
    System.out.println("\nEsta e sua carta \n");
    System.out.println(Leitura.getCartaByString(cartaJogador));
    
    System.out.println("\nEsta é a carta do computador\n");
    System.out.println(Leitura.getCartaByString(cartaComputador));
    
    int valorCaracteristicaComputador = Integer.parseInt(retornaCaracteristicaSelecionada(caracteristicaComputador, cartaComputador));
    int valorCaracteristicaJogador = Integer.parseInt(retornaCaracteristicaSelecionada(caracteristicaComputador, cartaJogador));
    
    //Jogador ganhou
    if (valorCaracteristicaComputador < valorCaracteristicaJogador) {
      System.out.println("\n Você ganhou esta rodada \n");
      modelarVetor(idsCartasJogador,idsCartasComputador, cartaComputador );
      
      ganhou = "j";
    //Computador ganhou
    }else{
      System.out.println("\n O computador ganhou esta rodada \n");
      modelarVetor(idsCartasComputador,idsCartasJogador,cartaJogador );
      ganhou = "c";
    }
    
    return ganhou ;
  }
  
  public static int sorteiaCaracteristica() {
    return (int) ((Math.random() * 4) + 1);
  }
  
  
  //Faz o sorteio da carta que vai ser jogada
  public static int sorteiaCartaParaJogar(int[] vetor){
  
    boolean existe = false;
    int cartaSorteada = 0;
    
    //Sorteia a carta enquanto ela não existir no vetor passado por parâmetro
    do {
       cartaSorteada = (int) ((Math.random() * 32) + 1);
       
       for (int i = 0; i < vetor.length; i++) {
         if (vetor[i] == cartaSorteada) {
           existe = true;
         }
       }
    }while(existe == false);
    
    return cartaSorteada;
  }
  
  //Metodo usado para sortear quem começa o jogo
  public static String sorteiaQuemComeca(){
    int comeca = (int) (Math.random() * 10) + 1;
    
    if (comeca % 2 == 0) {
      return "c";
    }else{
      return "j";
    }
    
  }
  
  //Funcao retorna quantidade de "casas" da matriz com valor
  //Conta a quantidade de valores dentro do vetor passado por parâmetro
  public static int numeroValoresVetor(int[] numeroValoresVetor){
    
    int cont = 0;
    
    for(int i = 0; i < numeroValoresVetor.length; i++){
      if(numeroValoresVetor[i] >= 1){
        cont++;
      }
    }
  
    return cont;
  }

  //Compara a caracteristica que o usu�rio selecionou
  public static void comparaCaracteristica(int caractaristicaInt, int cartaId){
    int valorCaracteristicaUsuario = Integer.parseInt(retornoLeitura.retornaValorCaracteristica(caractaristicaInt,cartaId));
  }
  
  public static String retornaCaracteristicaSelecionada(int caractaristicaInt, int cartaId){
    return retornoLeitura.retornaValorCaracteristica(caractaristicaInt,cartaId);
  }
  
  
  //Função que informa se o laço continua ou para
  public static boolean continuaLaco(int[] idsCartasJogador,int[] idsCartasComputador){
    
    int contJogador = 0;
    
    for (int i = 0; i < idsCartasJogador.length; i++) {
      if (idsCartasJogador[i] == 0) {
        contJogador++;
      }
    }
    
    int contComputador = 0;
    
    for (int i = 0; i < idsCartasComputador.length; i++) {
      if (idsCartasComputador[i] == 0) {
        contComputador++;
      }
    }
    
    
    if (contJogador == idsCartasJogador.length || contComputador == idsCartasComputador.length) {
      return false;
    }else{
      return true;
    }
    
  }
  
}