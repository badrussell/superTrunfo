import java.util.*; 
import javax.swing.*;
import java.io.*;
import java.util.regex.*;

public class FileManenger{
  
  // nome do arquivo txt das cartas
  static String fileName = "cartas.txt";
  
  // funcao principal da class aqui vou fazer todas as chamadas
  public static void main(String SuperTrunfo[]){
    
    readFile();
    lookingCode();
  }
  
  public static void readFile(){
    
    try {
      
      FileReader arq = new FileReader(FileManenger.fileName);
      BufferedReader lerArq = new BufferedReader(arq);
      String linha = lerArq.readLine(); // lê a primeira linha a variável "linha" recebe o valor "null" quando o processo  de repetição atingir o final do arquivo texto 
      while (linha != null) { 
        System.out.println(linha);
        linha = lerArq.readLine(); // lê da segunda até a última linha
      }      
      arq.close(); 
      
    } catch (IOException e) {
      System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage()); 
    }
    
  }
  
  public static void lookingCode(){
    
    int procura = 0;
    boolean entrou = false;
    
    do{
      procura = Entrada.leiaInt("Digite o código da carta: ");
    }while(procura < 0 || procura > 32);
    
    try {
      FileReader arq = new FileReader(FileManenger.fileName);
      BufferedReader lerArq = new BufferedReader(arq);
      String linha = lerArq.readLine(); 
      
      while (linha != null) { 
        
        // procura na string '.'
        if(linha.toLowerCase().contains(".".toLowerCase())){
          
          // separ em um array a linha que tem o nome do personagem ex: 1.CARLOS
          String columnArray[] = linha.split(Pattern.quote("."));
          
          // testa se o codigo é o que ele procura
          if(procura == Integer.parseInt(columnArray[0])){
            
            // achou o codigo que ele procura
            entrou = true;
          }
        }
        
        
        // testa se a linha é igual a * se for ele já não é mais o personagem que procuramos
        if(linha.equals("*")){
          entrou = false;
        }
        
        
        // mostra as inforamações do personagem
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