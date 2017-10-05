using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace ExplorerPendrive
{
    public partial class Form1 : Form
    {  int ContArquivos = 0; 
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            Listar(@"G:\");
        }
        private void Listar(String Caminho)
        {
            DirectoryInfo Dir = new DirectoryInfo(Caminho);
            // Busca automaticamente todos os arquivos em todos os subdiretórios
            try
            {

         
            FileInfo[] Files = Dir.GetFiles("*.*", SearchOption.AllDirectories);
            foreach (FileInfo File in Files)
            {
                listBox1.Items.Add(File.FullName);
                ContArquivos++;
            }
            String str = "";
            foreach (var  List in listBox1.Items )
             {
                str += List;
            }
            CRegistryLog regLog = new CRegistryLog();
            regLog.Log(str);
            }
            catch (UnauthorizedAccessException e)
            {

                MessageBox.Show("Pendrive Restrito");
               
            }
           
            lbNumerosArquivos.Text = Convert.ToString(ContArquivos);
        }
    }
}
