using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Runtime.InteropServices;
using System.Diagnostics;

namespace VerificarConexaoWeb
{
    public partial class Form1 : Form
    {

        [DllImport("wininet.dll")]

        private extern static Boolean InternetGetConnectedState(out int Description, int ReservedValue);
        public Form1()
        {
            InitializeComponent();
        }

        public static Boolean IsConnected()
        {

            bool result;

            try
            {

                int Description;

                result = InternetGetConnectedState(out Description, 0);

            }

            catch
            {

                result = false;

            }

            return result;

        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show(Convert.ToString(IsConnected()));
        }
    }
}
