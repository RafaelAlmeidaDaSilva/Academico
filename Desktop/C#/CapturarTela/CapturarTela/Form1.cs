using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CapturarTela
{
    public partial class Form1 : Form
    {
        int TelaLargura =Convert.ToInt32( System.Windows.Forms.Screen.PrimaryScreen.Bounds.Width);
        int TelaAltura =Convert.ToInt32( System.Windows.Forms.Screen.PrimaryScreen.Bounds.Height);
        public Form1()
        {
            InitializeComponent();
        }

        private void btnCapturarTela_Click(object sender, EventArgs e)
        {
            //oculta o formulário e inicia a captura
            this.Hide();
            tmTela.Start();

        }

        private void tmTela_Tick(object sender, EventArgs e)
        { 
            //armazena a imagem no bitmap
            Bitmap b = new Bitmap(TelaLargura,TelaAltura);
            //copia  a tela no bitmap
           Graphics g = Graphics.FromImage(b);
            g.CopyFromScreen(Point.Empty, Point.Empty, Screen.PrimaryScreen.Bounds.Size);
            //atribui a imagem ao picturebox exibindo-a
            picTela.Image = b;
            this.Show();
            //habilita o botão para salvar a tela
            btnSalvarTela.Enabled = true;
            //encerra o timer
            tmTela.Stop();
        }

        private void btnSalvarTela_Click(object sender, EventArgs e)
        {
            //abre a janela de dialogo SaveDialog para salvar o arquivo gerado na captura
            DialogResult res = svdTela.ShowDialog();
            if (res == DialogResult.OK)
            {
                //obtem a extensão do arquivo salvo
                string ext = System.IO.Path.GetExtension(svdTela.FileName);
                if (ext == ".jpg")
                    picTela.Image.Save(svdTela.FileName, System.Drawing.Imaging.ImageFormat.Jpeg);
                else if (ext == ".gif")
                    picTela.Image.Save(svdTela.FileName, System.Drawing.Imaging.ImageFormat.Gif);
                else if (ext == ".png")
                    picTela.Image.Save(svdTela.FileName, System.Drawing.Imaging.ImageFormat.Png);

                MessageBox.Show("Salvo Com Sucesso!!");
            }
           
        }

        private void btnLimparTela_Click(object sender, EventArgs e)
        {
            this.picTela.Image = null;
        }
    }
}
