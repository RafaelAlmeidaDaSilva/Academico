package Atividades_Casa.Caelum;

import pj_mãe.Recursos.Scan_Texto;

public class Menu_VetorDeAluno 
{
    Scan_Texto scan = new Scan_Texto();

    public void Cons_Menu_VetorAluno() {
        boolean finaly_MenuProgram;
       
        do {
             int item = Menu_itens_VetorAluno();
            finaly_MenuProgram = Selecao_iten_VetorAluno(item);
        } while (finaly_MenuProgram != false);

    }

    private int Menu_itens_VetorAluno() {
        System.out.println("<------------------------[MENU_VETOR_ALUNO]--------------------------->");
        System.out.println("<- Digite o valor correspondente:                                    ->");
        System.out.println("<-                                                                   ->");
        System.out.println("<-                       1- Cadastrar Aluno                          ->");
        System.out.println("<-                       2- Cadastrar Aluno(Posição)                 ->");
        System.out.println("<-                       3- Pesquisar Aluno                          ->");
        System.out.println("<-                       4- Listar Alunos                            ->");
        System.out.println("<-                                                                   ->");
        System.out.println("<-                                                      0-Sair       ->");
        System.out.println("<--------------------------------------------------------------------->");
        System.out.print("<-{");

        return scan.Entrada_int();
    }

    private boolean Selecao_iten_VetorAluno(int item) {
        Vetor Lista = new Vetor();
        Aluno aluno = new Aluno();
        
        switch (item) {
            case 0:
                Scan_Texto.clearConsole();
                System.out.println("Fim[RAIZ Vetor_Aluno]. ");
                return false;
            case 1:
                Scan_Texto.clearConsole();
                 //CADASTRAR ALUNO
                
                System.out.print("Digite o nome do Aluno: ");
                aluno.setNome(scan.Entrada_str());
                Lista.adiciona(aluno);
                return true;
                
            case 2:
                Scan_Texto.clearConsole();
                //CADASTRAR ALUNO PELA POSICAO
               
                System.out.print("Digite o nome do Aluno: ");
                aluno.setNome(scan.Entrada_str());
                int posicao;
                System.out.print("Digite a posição entre [0 ~ 100]: ");
                posicao = scan.Entrada_int();
                Lista.adiciona(posicao, aluno);
                return true;
                
            case 3:
                Scan_Texto.clearConsole();
                //PESQUISAR ALUNO
                 
                System.out.print("Digite o nome do Aluno que deseja Pesquisar: ");
                aluno.setNome(scan.Entrada_str());
                
                if (!Lista.contem(aluno))
                    System.out.print("Aluno nao cadastrado ainda!");
                else
                    System.out.print("Contem Aluno informado!");
                return true;
                
            case 4:
                Scan_Texto.clearConsole();
                //LISTAR ALUNOS
                Lista.Listar();
                return true;
            
            default:
                Scan_Texto.clearConsole();
                System.out.println("valor inválido!");
                return true;
        }

    }

}
