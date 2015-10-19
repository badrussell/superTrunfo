import java.util.*; 
import javax.swing.*;
import java.io.*;
import java.util.regex.*;

public class RetornoLeitura{
  public static void main(String SuperTrunfo[]){
    
    int procura = 0;
    boolean entrou = false;
    
    do{
      procura = Entrada.leiaInt("Digite o código da carta: ");
    }while(procura < 0 || procura > 32);
    
    try {
      FileReader arq = new FileReader("cartas.txt");
      BufferedReader lerArq = new BufferedReader(arq);
      String linha = lerArq.readLine(); // lê a primeira linha
    
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
          System.out.println(linha);
        }
        
        linha = lerArq.readLine(); 
      }
      
      arq.close(); 
    } catch (IOException e) {
      System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage()); 
    } 
  }
}