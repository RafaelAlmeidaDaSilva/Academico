using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Diagnostics;


namespace ListandoProcessos
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            Process[] processos = Process.GetProcesses();
            foreach (Process processo in processos)
            {
                listBox1.Items.Add(processo.ProcessName);
            }
            // Loop de armazenar processos
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Process[] processos = Process.GetProcessesByName(listBox1.SelectedItem.ToString());
           // MessageBox.Show(listBox1.SelectedItem.ToString());
            foreach (Process processo in processos)
            {
                processo.Kill();
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            listBox1.Items.Clear();
            Process[] processos = Process.GetProcesses();
            foreach (Process processo in processos)
            {
                listBox1.Items.Add(processo.ProcessName);
            }
        }


    }
}
