package gui;

import domein.DomeinController;
import gui.utility.ImageResizer;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class StartPanel extends CustomPanel{
    private DomeinController domCntrl;
    private BufferedImage backgroundImage;
    
    public StartPanel(DomeinController domCntrl){
        this.domCntrl = domCntrl;
        //loadBackground image
        try{
            backgroundImage = ImageIO.read(StartPanel.class.getResourceAsStream("/assets/images/backgrounds/bg.jpg"));
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    
    //paint methode
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(ImageResizer.getInstance().resizeImage(backgroundImage, GuiController.getInstance().getWidth(), GuiController.getInstance().getHeight()), 0, 0, null);
    }
}
