using System;
using System.IO;

namespace PesquisarArquivos
{
    class Program
    {

        static System.Collections.Specialized.StringCollection log = new System.Collections.Specialized.StringCollection();
        static void Main(string[] args)
        {
            DirectoryInfo diretorio = new DirectoryInfo(@"C:\");

            FileInfo[] arquivos = diretorio.GetFiles();

            Program p = new Program();
            p.PercorrerDiretorios(diretorio);

            Console.ReadKey();
        }



        void PercorrerDiretorios(System.IO.DirectoryInfo DiretorioInicial)
        {
            System.IO.FileInfo[] arquivos = null;
            System.IO.DirectoryInfo[] subDiretorio = null;

            // Processar todos os arquivos do diretório inicial
            try
            {
                arquivos = DiretorioInicial.GetFiles("*.*");
            }

            // A exceção que é gerada quando o sistema operacional nega acesso devido a um erro de 
            // E/S ou de um tipo específico de erro de segurança.
            catch (UnauthorizedAccessException e)
            {
                // Este código apenas escreve a mensagem e continua a recursividade.
                // Você pode decidir fazer algo diferente aqui. Por exemplo, você
                // Pode tentar elevar seus privilégios e acessar o arquivo novamente.
                log.Add(e.Message);
            }

            catch (System.IO.DirectoryNotFoundException e)
            {
                Console.WriteLine(e.Message);
            }


            if (arquivos != null)
            {
                foreach (System.IO.FileInfo fi in arquivos)
                {
                    Console.WriteLine(fi.FullName);
                }

                // pega todos os subdiretorios do direitorio inicial.
                subDiretorio = DiretorioInicial.GetDirectories();

                foreach (System.IO.DirectoryInfo dirInfo in subDiretorio)
                {
                    // Recursão de chamada para o proximo diretório 
                    PercorrerDiretorios(dirInfo);
                }
            }
        }
    }
}
