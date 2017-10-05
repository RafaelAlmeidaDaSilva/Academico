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
using System.Net;
using System.Net.Mail;
using System.Diagnostics;

namespace Email_V1
{
    public partial class Form1 : Form
    {

        private MailMessage Email;
        Stopwatch Stop = new Stopwatch();
        public Form1()
        {
            InitializeComponent();
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            Email = new MailMessage();
            Email.To.Add(new MailAddress(txtEmailDestinado.Text));
            Email.From = (new MailAddress(txtEmailUser.Text));
            Email.Subject = txtAssunto.Text;
            Email.IsBodyHtml = true;
            Email.Body = txtTexto.Text;
            SmtpClient cliente = new SmtpClient("smtp.live.com",587);
            using(cliente)
            {
                cliente.Credentials = new System.Net.NetworkCredential(txtEmailUser.Text,txtSenha.Text);
                cliente.EnableSsl = true;
                cliente.Send(Email);
            }
            MessageBox.Show("Email enviado com sucesso!!","Email - Enviado!" );
        }
    }
}
