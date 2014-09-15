import domein.DomeinController;
import gui.Console;

public class StartUp {
    public static void main(String args[]){
        DomeinController domCntrl = new DomeinController();
        if(args.length == 0){
            Console con = new Console(domCntrl);
            con.start();
        }else{
            
        }
    }
}
