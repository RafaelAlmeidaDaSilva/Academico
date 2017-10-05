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
using Dolinay;

namespace DetectarPendrive
{
    public partial class Form1 : Form
    { private DriveDetector driveDetector = null;

        public Form1()
        {
            InitializeComponent();
            driveDetector = new DriveDetector();
            driveDetector.DeviceArrived += new DriveDetectorEventHandler(OnDriveArrived);
            driveDetector.DeviceRemoved += new DriveDetectorEventHandler(OnDriveRemoved);
            driveDetector.QueryRemove += new DriveDetectorEventHandler(OnQueryRemove);
        }

        // Called by DriveDetector when removable device in inserted 
        private void OnDriveArrived(object sender, DriveDetectorEventArgs e)
        {
            // Report the event in the listbox.
            // e.Drive is the drive letter for the device which just arrived, e.g. "E:\\"
            string s = "PenDrive Conectado" + e.Drive;
            MessageBox.Show(s);

            // If you want to be notified when drive is being removed (and be able to cancel it), 
            // set HookQueryRemove to true 
            if ( checkBox1.Checked )   
                e.HookQueryRemove = true;                 
        }

        // Called by DriveDetector after removable device has been unpluged 
        private void OnDriveRemoved(object sender, DriveDetectorEventArgs e)
        {
            // TODO: do clean up here, etc. Letter of the removed drive is in e.Drive;
            
            // Just add report to the listbox
            string s = "Pendrive Removido" + e.Drive;
            MessageBox.Show(s);
        }

        // Called by DriveDetector when removable drive is about to be removed
        // chamado pelo DriveDetector quando removido pendrive é sobre ser Removido
        private void OnQueryRemove(object sender, DriveDetectorEventArgs e)
        {
            // Should we allow the drive to be unplugged?
            if (checkBox1.Checked)
            {
                if (MessageBox.Show("Allow remove?", "Query remove",
                    MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
                    e.Cancel = false;       // Allow removal
                else
                    e.Cancel = true;        // Cancel the removal of the device  
            }
        }
        

        private void button1_Click(object sender, EventArgs e)
        {
          
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
