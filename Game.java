/**
 * Classe Game
 *
 * Classe de controle do game ela chama e controla as classes que executam o game.
 * Esta classe controla as demais.
 *
 **/
public class Game{
  
  //Variáveis da classe
  static int[] cartasJogador;
  static int[] cartasComputador;
  
  //Inicia o jogo setando as cartas para os jogadores.
  //As cartas são referenciadas pelo id cadastrado no arquivo.
  public static void iniciar(int qntdCartas){
    
    //Seta com quantas cartas o jogador escolheu jogar
    Carta.setQuantidadeDeCartas(qntdCartas);
    
    //Pegas as cartas do jogador e do computador
    Game.cartasJogador    = Carta.getCartas();
    Game.cartasComputador = Carta.getCartas();
    
    for (int i = 0; i < Game.cartasJogador.length; i++) {
      System.out.println(Game.cartasJogador[i]);
    }
    
    //System.out.println(retornoLeitura.retornaCarta(1));
    
    
  }
  
}