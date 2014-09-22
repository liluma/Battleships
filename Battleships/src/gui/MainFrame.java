package gui;

import domein.DomeinController;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
    
    public MainFrame(DomeinController domCntrl){
        GuiController.getInstance().setFrame(this, domCntrl);
        GuiController.getInstance().toStartPanel();
    }
}
