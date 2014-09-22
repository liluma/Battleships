import domein.DomeinController;
import gui.Console;
import gui.MainFrame;
import javax.swing.JOptionPane;

public class StartUp {
    public static void main(String args[]){
        DomeinController domCntrl = new DomeinController();
        if(args.length == 0){
            Console con = new Console(domCntrl);
            JOptionPane.showMessageDialog(null, "console starting");
            con.start();
        }else{
            MainFrame frame = new MainFrame(domCntrl);
        }
    }
}
