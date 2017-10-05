using System;
using System.IO;
namespace ExplorerPendrive
{
    class CRegistryLog
    {

       

        public void Log( String _valorTexto)
        {
            DateTime dt = DateTime.Now; // Or whatever
            string  = dt.ToString("yyyy/MM/ddHHmmss");
            string nomeArquivo = @"c:\Key\log" + s + ".txt";

            // Cria um novo arquivo e devolve um StreamWriter para ele

            StreamWriter writer = new StreamWriter(nomeArquivo);                            

            // Agora é só sair escrevendo

            writer.WriteLine(_valorTexto);

            // Não esqueça de fechar o arquivo ao terminar

            writer.Close();

        }

    }
}

