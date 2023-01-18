using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace ClientBase
{
    /// <summary>
    /// Logica di interazione per MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private const string serverName = "localhost";
        public ClientSocket clientsocket = new ClientSocket(8080);
        


        public MainWindow()
        {
            InitializeComponent();
        }

        private void Window_Loaded(object sender, RoutedEventArgs e)
        {
            
        }

        private void buttonAccedi_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                clientsocket.Run();
            }
            catch (Exception)
            {
                this.Close();
            }
        }

        private void buttonModificaDati_Click(object sender, RoutedEventArgs e)
        {
            txtDettaglioUsername.IsEnabled= true;
            txtNome.IsEnabled = true;
            txtCognome.IsEnabled = true;
            txtEta.IsEnabled = true;
        }

        private void buttonSalvaModificheDati_Click(object sender, RoutedEventArgs e)
        {

        }
    }
}
