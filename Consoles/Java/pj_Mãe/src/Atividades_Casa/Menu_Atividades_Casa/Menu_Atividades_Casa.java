
package Atividades_Casa.Menu_Atividades_Casa;

import Atividades_Casa.Caelum.Menu_VetorDeAluno;
import pj_mãe.Recursos.Scan_Texto;

public class Menu_Atividades_Casa {
    Scan_Texto scan = new Scan_Texto();
    
     public void Cons_Menu_Atividades_Casa()
    {
        boolean finaly_MenuProgram;
        
        do{
           int item = Menu_itens_Casa(); 
           finaly_MenuProgram = Selecao_iten_Casa(item); 
          }while(finaly_MenuProgram);
        
    }
     
    private int Menu_itens_Casa()
    {
        System.out.println("<------------------------[MENU_ATIVIDADES_CASA]----------------------->");
        System.out.println("<- Digite o valor correspondente:                                    ->");
        System.out.println("<-                                                                   ->");
        System.out.println("<-                       1-Atividades CAELUM                         ->");
        System.out.println("<-                                                                   ->");
        System.out.println("<-                                                      0-Sair       ->");
        System.out.println("<--------------------------------------------------------------------->");
        System.out.print("<-{");
       
        return scan.Entrada_int();
    }
    
    private boolean Selecao_iten_Casa(int item)
    {  
        switch (item) {
            case 0 :
                Scan_Texto.clearConsole();
                System.out.println("Fim[RAIZ Atividades_Casa]. ");
                return false;
            case 1 :
                 Scan_Texto.clearConsole();
                 //CAELUM 
                 Menu_VetorDeAluno menu_vetor = new Menu_VetorDeAluno();
                 menu_vetor.Cons_Menu_VetorAluno();
                 
                return true;
            default:
                Scan_Texto.clearConsole();
                System.out.println("valor inválido!");
                return true;
        }
          
    }
}
