
package Atividades_Sala.Matriz;

import pj_mãe.Recursos.Scan_Texto;
import java.util.Arrays;
import java.util.Random;

public class Exemplo_Matriz 
{    
    int matA[][] = new int [10][10];
    int matB[][] = new int [10][10]; 
    int matC[][] = new int [10][10];
    int valor_Preenchimento = 0;
   
    public void Inserir_matrizAeB()
    {
      Scan_Texto scan  = new Scan_Texto();
        System.out.print("Insira a quantidade que irá preencher a matriz(1 ~ 10): ");
        valor_Preenchimento = scan.Entrada_int();
        
        if (valor_Preenchimento != 0 && valor_Preenchimento < 10){
        
            for (int i = 0; i < valor_Preenchimento ; i++)
            for (int j= 0; j< valor_Preenchimento ; j++)
            {
                matA[i][j]= j+3;
                matB[i][j]= j+i+3 ;
            }
            
        }else{            
                System.out.print("Valor inserido nao pode ser menor que 0 ou maior que 10.");
                return;
             }
        
        for (int i = 0 ,j= valor_Preenchimento- 1 ; i < valor_Preenchimento ; i++, j--  )
            System.out.printf("MAT A: "+matA[i][j]+" \t MAT B: "+matB[i][j]);
     
       
    }
     public void Inserir_MatrizAeB_Aleatorio()
    {
               
        Scan_Texto scan  = new Scan_Texto();
        System.out.print("Insira a quantidade que irá preencher a matriz(1 ~ 10): ");
        valor_Preenchimento = scan.Entrada_int();
        
        if (valor_Preenchimento != 0 && valor_Preenchimento < 10){
            Random rand = new Random();
        
            for (int i = 0 ; i < valor_Preenchimento ; i++)
            {
                for (int j = 0; j > valor_Preenchimento ; j++)
                 {
                     matA[i][j] = rand.nextInt(10);
                     matB[i][j] = rand.nextInt(10);
                 }
            }
        }else
                
        {       
         System.out.print("Valor inserido nao pode ser menor que 0 ou maior que 10.");    
         return;
        }
        System.out.println("MAT A:  \tMAT B: ");
       for (int i = 0 ,j= 10 - 1 ; i < valor_Preenchimento ; i++, j--  )
       {
            
            System.out.printf(" "+matA[i][j]+"   \t  1"+matB[i][j]);
            System.out.println(); 
       }
     
             
    }
    public void Multiplica_Matriz()
    {
        
       for (int i = 0; i < valor_Preenchimento ; i++)
            for (int j= 0; j< valor_Preenchimento ; j++)
        {
           matC[i][j] =matA[i][j] * matB[i][j];
          
        }
    }
     public void Soma_Matriz()
    {
    
      for (int i = 0; i < valor_Preenchimento ; i++)
            for (int j= 0; j< valor_Preenchimento ; j++)
        {
             matC[i][j] =matA[i][j] + matB[i][j];
          
        }
    }
      public void Subtrair_Matriz()
    {
    
      for (int i = 0; i < valor_Preenchimento ; i++)
            for (int j= 0; j< valor_Preenchimento ; j++)
        {
            matC[i][j] =matA[i][j] - matB[i][j];
          
        }
    }
      public void Exibe_Matriz_Calculada()
    {
         
            
      for (int i = 0; i < valor_Preenchimento ; i++)
      {
         System.out.println(); 
      
        for (int j= 0; j< valor_Preenchimento ; j++)
        {
            System.out.print(matC[i][j]+" ");
            System.out.println(); 
        }
       System.out.println(); 
      }
    }
    public void Matriz_Professor()
    {
      int mat[][];
      mat = new int [10][];
     
      for (int i = 0; i < 10 ; i++)
          mat[i]= new int[i+1];
      
        for (int i = 0; i < mat.length ; i++)
              for (int j = 0; j < mat[i].length ; j++)
              mat[i][j] = i;
        
        for (int[] mat2 : mat) 
        {
            System.out.println();
            for (int[] mat1 : mat) 
                System.out.print(Arrays.toString(mat1) + " ");
           
        }
    }
    
   
}
