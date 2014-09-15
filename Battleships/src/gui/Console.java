package gui;

import domein.DomeinController;

public class Console {
    private DomeinController domCntrl;
    
    public Console(DomeinController domCntrl){
        this.domCntrl = domCntrl;
    }
    
    public void start(){
        System.out.println("starting a game of battleships");
        do{
            System.out.println("running game");
            System.out.println(domCntrl.getOverview());
        }while(domCntrl.gameRunning());
    }
}
