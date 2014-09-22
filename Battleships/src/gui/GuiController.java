package gui;

import domein.DomeinController;
import java.awt.Dimension;
import java.util.HashMap;
import javax.swing.JFrame;

public class GuiController {
    private JFrame mainFrame;
    private final Dimension STANDARD = new Dimension(800,600);
    private static GuiController instance;
    private HashMap<String, CustomPanel> views;
    private CustomPanel visiblePanel;
    private DomeinController domCntrl;
    
    private GuiController(){
        views = new HashMap<String, CustomPanel>();
    }
    
    public void setFrame(JFrame frame, DomeinController domCntrl){
        this.mainFrame = frame;
        this.domCntrl = domCntrl;
        initFrame();
    }
    
    private void initFrame(){
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(STANDARD);
        mainFrame.setLocationRelativeTo(null);
        initPanels();
        mainFrame.setVisible(true);
    }
    
    private void initPanels(){
        views.put("start", new StartPanel(domCntrl));
    }
    
    private void clearFrame(){
        if(visiblePanel != null){
            mainFrame.remove(visiblePanel);
            //System.out.println("removing: " + visiblePanel.toString());
        }
        mainFrame.repaint();
    }
    
    public void toStartPanel(){
       clearFrame();
        visiblePanel = views.get("start");
        mainFrame.add(visiblePanel);
        //mainFrame.pack(); 
    }
    
    public int getWidth(){
        return mainFrame.getWidth();
    }
    
    public int getHeight(){
        return mainFrame.getHeight();
    }
    
    public static GuiController getInstance(){
        if(instance == null)
            instance = new GuiController();
        
        return instance;
    }
}
