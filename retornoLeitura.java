/**
 * Retorna a caracteristica da carta especificada (pelo id) 
 * Retorna a caracpteristica da carta
 * 
 **/
public class retornoLeitura{

  
  //Retorna o valor correspondete da caracteristica com base no id da carta e do id da linha
  public static String retornaValorCaracteristica(int caractaristicaInt, int cartaId){
    
    Leitura.setCartas();
    
    return Leitura.cartasDeRetorno[cartaId][caractaristicaInt];
    
  }

}