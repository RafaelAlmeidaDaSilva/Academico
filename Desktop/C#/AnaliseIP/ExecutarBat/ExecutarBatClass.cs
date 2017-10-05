using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Diagnostics;
using Email;

namespace ExecutarBat
{
    public class ExecutarBatClass
    {
        public static void ExecutarArquivoBat()
        {
            try
            {
                Process process = new Process();
                process.StartInfo.FileName = "cmd.bat";
                process.Start();
                process.WaitForExit();

                EnviarEmail.enviarEmailIp();
            }
            catch(Exception ex)
            {
                Console.Write(ex.Message);
            }

        }
    }
}
