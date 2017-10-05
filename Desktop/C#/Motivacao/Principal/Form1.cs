using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Principal
{    
    public partial class Form1 : Form
    {
        int minutos = 0; // contador de minutos 
        public Form1()
        {
            InitializeComponent();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            // MessageBox.Show("Se passo 1 minutos");
            minutos++;

            switch (minutos)
            {
                case 30:
                    MessageBox.Show("Muito bem, de 30 em 30 minutos você vai se tornando cada vez mais FODA em programação; e terá um futuro promissor.");
                    break;
                case 60:
                    MessageBox.Show("Parabens, acaba de ficar 1 HORA direto programando, o seu caminho vai ficando cada vez mais curto, rumo ao seu destino magnifico. CONTINUE ASSIM!!");
                    break;
                case 90:
                    MessageBox.Show("Vamos nos divertir, Programação e um jogo, onde o unica que ganha as partidas e sua logica, Você está avançando rápidamente. Logo logo seus projetos complexidades infinitas... fique mais 30 minutos e poderá fazer uma pausa para um cafe matinal.");
                    break;
                case 120:
                    MessageBox.Show("Explendido, Se continuar assim todos os dias seu futuro como hacker, programador ou ate mesmo futuro visionário do ano estará garantido!");
                    MessageBox.Show("Uma pausa para distrair a mente e bom para seu progresso, mas e claro se nao for interroper suas ideias. CONVERSE, DISCUTA, COMPARE, RELEIE, REFLITA, SEUS AVANÇOS, SEUS DEFEITOS, CRIE , SOLUÇOES, PERMITA-SE ser que você quer ser. Assim como todo musculo precisa de descanso para aprender o cerebro também precisa.s");
                    break;
                case 150:
                    MessageBox.Show("Seu tempo do Cafe Ja se foi, MEDITE um Pouco e volte a programar seu corpo e suas ideias!!");
                    break;
                default:
                    break;
            }

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            
        }
    }
}
