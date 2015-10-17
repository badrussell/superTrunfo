/**
 * Classe Game
 *
 * Classe de controle do game ela chama e controla as classes que executam o game.
 * Esta classe controla as demais.
 *
 **/
public class Game{
  
  public static void iniciar(int qntdCartas){
    
    Carta.setQuantidadeDeCartas(qntdCartas);
    
    int cartas[] = Carta.getCartasJogador();
    
    for (int i = 0; i < cartas.length; i++) {
      System.out.println(cartas[i]);
    }
    
  }
  
}