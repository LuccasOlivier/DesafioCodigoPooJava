package phoneDevice;
import Interfaces.InternetBrowser;
import Interfaces.MusicPlayer;
import Interfaces.Phone;

public class Iphone implements MusicPlayer, Phone, InternetBrowser{

       
        // Implementações dos métodos das interfaces
        public void play() {
            System.out.println("Playing music");
        }
    
        public void pause() {
            System.out.println("Pausing music");
        }
    
        public void selectMusic() {
            System.out.println("Selecting music");
        }
    
        public void toCall() {
            System.out.println("Making a call");
        }
    
        public void answer() {
            System.out.println("Answering a call");
        }
    
        public void startVoicemail() {
            System.out.println("Starting voicemail");
        }
    
        public void displayingPage() {
            System.out.println("Displaying web page");
        }
    
        public void newTab() {
            System.out.println("Adding a new tab");
        }
    
        public void refreshPage() {
            System.out.println("Refreshing web page");
        }

         public static void main(String[] args) {
            Iphone myIphone = new Iphone();

            //Exemplos de uso
            System.out.println("UTILIZANDO REPRODUTOR MUSICAL");
            myIphone.play();
            myIphone.selectMusic();
            myIphone.pause();

            System.out.println("- - - - - - - - - - - -");
            System.out.println("UTILIZANDO NAVEGADOR DE INTERNET");
            myIphone.displayingPage();
            myIphone.newTab();
            myIphone.refreshPage();
            System.out.println("- - - - - - - - - - - -");
            System.out.println("UTILIZANDO PHONE");
            myIphone.toCall();
            myIphone.answer();
            myIphone.startVoicemail();
        }
    }
    
    