import java.util.*; 
import javax.swing.*;
import java.io.*;
import java.util.regex.*;

/**
 * Retorna a carta especificada (pelo id) 
 **/
public class retornoLeitura{
  
  static String carta = "";
  
  public static String retornaCarta(int codCarta){
    
    //Validação para que o codigo da carta esteja no intervalo válido
    if (codCarta < 0 || codCarta > 32) {
      return "false";
    }
    
    int procura = codCarta;
    boolean entrou = false;
    
    try {
      FileReader arq = new FileReader("cartas.txt");
      BufferedReader lerArq = new BufferedReader(arq);
      String linha = lerArq.readLine(); // le a primeira linha
    
      while (linha != null) { 
        
        if(linha.toLowerCase().contains(".".toLowerCase())){
          String columnArray[] = linha.split(Pattern.quote("."));
          if(procura == Integer.parseInt(columnArray[0])){
            entrou = true;
          }
        }
        
        if(linha.equals("*")){
          entrou = false;
        }
        
        if(entrou){
          //Guarda na variavel global a cartar encontrada
          retornoLeitura.carta += linha+"\n";
        }
        
        linha = lerArq.readLine();
        
      }
      
      arq.close(); 
      
    } catch (IOException e) {
      System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage()); 
    } 
    
    return retornoLeitura.carta;
  }
  
}