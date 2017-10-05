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

namespace BuscarArquivosDoDiretorio
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            folderBrowserDialog1.Description = "Selecione O diretorio para Listar os Arquivos";
            folderBrowserDialog1.ShowNewFolderButton = false;
            DialogResult result = folderBrowserDialog1.ShowDialog();

            if (result == DialogResult.OK)
            {
                textBox1.Text = folderBrowserDialog1.SelectedPath; 
            
            }
           if (textBox1.Text != ""){

               Listar(textBox1.Text);
           }
        }
        private void Listar(String Caminho)
        {
            DirectoryInfo Dir = new DirectoryInfo(Caminho);
            // Busca automaticamente todos os arquivos em todos os subdiretórios
            FileInfo[] Files = Dir.GetFiles("*", SearchOption.AllDirectories);
            foreach (FileInfo File in Files)
            {
                listBox1.Items.Add(File.FullName);
            }
        }
    }
}
