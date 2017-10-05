using System;
using System.IO;
namespace CRegistryLog
{
    public class Class1
    {
        String _valorTexto = "";

        public Class1(String Texto)
        {
            _valorTexto = Texto;
         
        }

        void Log()
        {
            string nomeArquivo = @"c:\log" + DateTime.Now.ToString("yyyyMMddHHmmss") + ".txt";

            // Cria um novo arquivo e devolve um StreamWriter para ele

            StreamWriter writer = new StreamWriter(nomeArquivo);

            // Agora é só sair escrevendo

            writer.WriteLine(_valorTexto);

            // Não esqueça de fechar o arquivo ao terminar

            writer.Close();

        }

    }
}
