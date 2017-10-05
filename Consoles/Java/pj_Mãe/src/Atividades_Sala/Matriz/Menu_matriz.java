
package Atividades_Sala.Matriz;
import pj_mãe.Recursos.Scan_Texto;

public class Menu_matriz {
    
       public void Cons_MenuMatriz()
    {
        boolean finaly_MenuMatriz;
        
        do{
           int item = Menu_itens_Matriz(); 
           finaly_MenuMatriz = Selecao_iten_Matriz(item); 
          }while(finaly_MenuMatriz != false);
        
    }
    
    private int Menu_itens_Matriz()
    {
        System.out.println("<------------------------[MENU MATRIZ]-------------------------------->");
        System.out.println("<- Digite o valor correspondente:                                    ->");
        System.out.println("<-                                                                   ->");
        System.out.println("<-                       1-INSERIR                                   ->");
        System.out.println("<-                       2-INSERIR ALEATÓRIO                         ->");  
        System.out.println("<-                       3-SOMA                                      ->");
        System.out.println("<-                       4-SUBTRAÇÃO                                 ->");
        System.out.println("<-                       5-DIVISÃO                                   ->");
        System.out.println("<-                       6-MULTIPLICAÇÃO                             ->");
        System.out.println("<-                       7-PROFESSOR                                 ->");
        System.out.println("<-                                                      0-Sair       ->");
        System.out.println("<--------------------------------------------------------------------->");
        System.out.print("<-{");
        Scan_Texto scan = new Scan_Texto();
        return scan.Entrada_int();
    }
    
    private boolean Selecao_iten_Matriz(int item)
    {  Exemplo_Matriz exMat = new Exemplo_Matriz();
        switch (item) {
            case 0 :
                Scan_Texto.clearConsole();
                System.out.println("Fim. ");
                return false;
            case 1 :
                // EXEMPLO INSERIR
                Scan_Texto.clearConsole();
                 
                 exMat.Inserir_matrizAeB();
                return true;
            case 2 :
                // EXEMPLO INSERIR ALEATORIO
                Scan_Texto.clearConsole();
                 
                 exMat.Inserir_MatrizAeB_Aleatorio();
                return true;
            case 3 :
                // EXEMPLO SOMA
                Scan_Texto.clearConsole();
                
                exMat.Soma_Matriz();
                return true;
            case 4 :
                // EXEMPLO SUBTRAÇÃO
                Scan_Texto.clearConsole();
                
                 exMat.Subtrair_Matriz();
                return true;
            case 5 :
                // EXEMPLO DIVISÃO
                Scan_Texto.clearConsole();
                System.out.println("AINDA NÃO IMPLEMENTADO! ");
                 
                return true;
            case 6 :
                // EXEMPLO MULTIPLICAÇÃO
                Scan_Texto.clearConsole();
                
                 exMat.Multiplica_Matriz();
                return true;
            case 7 : 
                Scan_Texto.clearConsole();
                exMat.Matriz_Professor();
                return true;
            default:
                Scan_Texto.clearConsole();
                System.out.println("valor inválido!");
                return true;
        }
          
    }
}
