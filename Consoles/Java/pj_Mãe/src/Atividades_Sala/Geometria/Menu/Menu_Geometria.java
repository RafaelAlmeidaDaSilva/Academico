package Atividades_Sala.Geometria.Menu;

import Atividades_Sala.Geometria.Quadrado;
import Atividades_Sala.Geometria.Triangulo;
import Atividades_Sala.Geometria.Circulo;
import pj_mãe.Recursos.Scan_Texto;


public class Menu_Geometria {
    
    Scan_Texto scan = new Scan_Texto();
    
     public void Cons_Menu_Geometria()
    {
        boolean finaly_MenuProgram;
        
        do{
           int item = Menu_itens_Geometria(); 
           finaly_MenuProgram = Selecao_iten_Geometria(item); 
          }while(finaly_MenuProgram);
        
    }
     
    private int Menu_itens_Geometria()
    {
        System.out.println("<------------------------[MENU_GEOMETRIA]----------------------------->");
        System.out.println("<- Digite o valor correspondente:                                    ->");
        System.out.println("<-                                                                   ->");
        System.out.println("<-                       1- Quadrado                                 ->");
        System.out.println("<-                       2- Triangulo(Equilatero)                    ->");
        System.out.println("<-                       3- Círculo                                  ->");
        System.out.println("<-                                                                   ->");     
        System.out.println("<-                                                      0-Sair       ->");
        System.out.println("<--------------------------------------------------------------------->");
        System.out.print("<-{");
       
        return scan.Entrada_int();
    }
    
    private boolean Selecao_iten_Geometria(int item)
    {  
        switch (item) {
            case 0 :
                Scan_Texto.clearConsole();
                System.out.println("Fim[RAIZ Geometria]. ");
                return false;
            case 1 :
                 Scan_Texto.clearConsole();
                 Quadrado quadrado = new  Quadrado();               
                 System.out.println("<---------------------[QUADRADO]----------------------->");
                 quadrado.Quadrado(); 
                 return true;
            case 2 :
                Scan_Texto.clearConsole();
                Triangulo triangulo = new Triangulo();
                System.out.println("<---------------------[TRIANGULO]----------------------->");
                triangulo.Triangulo();
                return true;
            case 3 :
                Scan_Texto.clearConsole();
                Circulo circulo = new Circulo();
                circulo.Circulo();
                return true;
            default:
                Scan_Texto.clearConsole();
                System.out.println("valor inválido!");
                return true;
        }
          
    }
}

