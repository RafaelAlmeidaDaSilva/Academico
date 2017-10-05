namespace CapturarTela
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.picTela = new System.Windows.Forms.PictureBox();
            this.btnSalvarTela = new System.Windows.Forms.Button();
            this.btnLimparTela = new System.Windows.Forms.Button();
            this.btnCapturarTela = new System.Windows.Forms.Button();
            this.tmTela = new System.Windows.Forms.Timer(this.components);
            this.svdTela = new System.Windows.Forms.SaveFileDialog();
            ((System.ComponentModel.ISupportInitialize)(this.picTela)).BeginInit();
            this.SuspendLayout();
            // 
            // picTela
            // 
            this.picTela.Location = new System.Drawing.Point(12, 76);
            this.picTela.Name = "picTela";
            this.picTela.Size = new System.Drawing.Size(567, 360);
            this.picTela.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.picTela.TabIndex = 0;
            this.picTela.TabStop = false;
            // 
            // btnSalvarTela
            // 
            this.btnSalvarTela.Location = new System.Drawing.Point(93, 12);
            this.btnSalvarTela.Name = "btnSalvarTela";
            this.btnSalvarTela.Size = new System.Drawing.Size(75, 23);
            this.btnSalvarTela.TabIndex = 1;
            this.btnSalvarTela.Text = "Salvar";
            this.btnSalvarTela.UseVisualStyleBackColor = true;
            this.btnSalvarTela.Click += new System.EventHandler(this.btnSalvarTela_Click);
            // 
            // btnLimparTela
            // 
            this.btnLimparTela.Location = new System.Drawing.Point(174, 12);
            this.btnLimparTela.Name = "btnLimparTela";
            this.btnLimparTela.Size = new System.Drawing.Size(75, 23);
            this.btnLimparTela.TabIndex = 2;
            this.btnLimparTela.Text = "Limpar";
            this.btnLimparTela.UseVisualStyleBackColor = true;
            this.btnLimparTela.Click += new System.EventHandler(this.btnLimparTela_Click);
            // 
            // btnCapturarTela
            // 
            this.btnCapturarTela.Location = new System.Drawing.Point(12, 12);
            this.btnCapturarTela.Name = "btnCapturarTela";
            this.btnCapturarTela.RightToLeft = System.Windows.Forms.RightToLeft.Yes;
            this.btnCapturarTela.Size = new System.Drawing.Size(75, 23);
            this.btnCapturarTela.TabIndex = 3;
            this.btnCapturarTela.Text = "Capturar";
            this.btnCapturarTela.UseVisualStyleBackColor = true;
            this.btnCapturarTela.Click += new System.EventHandler(this.btnCapturarTela_Click);
            // 
            // tmTela
            // 
            this.tmTela.Tick += new System.EventHandler(this.tmTela_Tick);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(591, 448);
            this.Controls.Add(this.btnCapturarTela);
            this.Controls.Add(this.btnLimparTela);
            this.Controls.Add(this.btnSalvarTela);
            this.Controls.Add(this.picTela);
            this.Name = "Form1";
            this.Text = "Form1";
            ((System.ComponentModel.ISupportInitialize)(this.picTela)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.PictureBox picTela;
        private System.Windows.Forms.Button btnSalvarTela;
        private System.Windows.Forms.Button btnLimparTela;
        private System.Windows.Forms.Button btnCapturarTela;
        private System.Windows.Forms.Timer tmTela;
        private System.Windows.Forms.SaveFileDialog svdTela;
    }
}

