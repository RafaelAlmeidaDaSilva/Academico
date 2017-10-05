using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Microsoft.Win32;


namespace IniciarJuntoComWindows
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            WriteRegistry(Registry.CurrentUser, "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run", textBox1.Text, @"c:\Caminho\seu_soft.exe");
        }

        static void WriteRegistry(RegistryKey parentKey, String DirRegistro, String valueName, Object value)
        {
            RegistryKey key;
            try
            {
                key = parentKey.OpenSubKey(DirRegistro, true);
                if (key == null)
                    key = parentKey.CreateSubKey(DirRegistro);

                //Set the value.
                key.SetValue(valueName, value);
                

            }
            catch (Exception e)
            {
                //Erro...
                MessageBox.Show("Erro");
                
            }
            MessageBox.Show("Registrado");
        }
        static void deleteRegistro(RegistryKey parentKey, String DirRegistro, String valueName) 
        {
            RegistryKey key;
            key = parentKey.OpenSubKey(DirRegistro, true);
            key.DeleteValue(valueName, false);
            MessageBox.Show("Deletado");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            deleteRegistro(Registry.CurrentUser, "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run", textBox1.Text);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            OpenFileDialog openFileDialog1 = new OpenFileDialog();
            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                textBox1.Text = openFileDialog1.FileName ;
                
            
            }
        }

    }
}
