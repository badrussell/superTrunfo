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
  
  
  //Inicia o jogo setando as cartas para os jogadores.
  //As cartas são referenciadas pelo id cadastrado no arquivo.
  public static void iniciar(int qntdCartas){
    
    //Seta com quantas cartas o jogador escolheu jogar
    Carta.setQuantidadeDeCartas(qntdCartas);
    
    //Pegas as cartas (ids) do jogador e do computador
    Game.qntdCartasJogador    = Carta.getCartas();
    Game.qntdCartasComputador = Carta.getCartas();
    
      //Vetores com as cartas dos jogadores
      String[] cartasJogador = new String[qntdCartas/2];
      String[] cartasComputador = new String[qntdCartas/2];
    
      
    //Preenchendo os vetores cartas com as cartas selecionadas do random
      //Após preencher zera a variável 
    for (int i = 0; i < Game.qntdCartasJogador.length; i++) {
      cartasJogador[i]     = retornoLeitura.retornaCarta(qntdCartasJogador[i]);
      retornoLeitura.carta = "";
      
      cartasComputador[i]  = retornoLeitura.retornaCarta(qntdCartasComputador[i]);
      retornoLeitura.carta = "";
    }
    
    
  }
  
}