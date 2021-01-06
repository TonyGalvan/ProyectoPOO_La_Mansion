import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Menu()
    {    
        super(1000, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setBackground​("images/fondo.png");
        PlayButton playButton = new PlayButton();
        addObject(playButton,91,92);
        playButton.setLocation(500,300);

        HelpButton helpButton = new HelpButton();
        addObject(helpButton,81,82);
        helpButton.setLocation(150,500);

        RecordsButton records = new RecordsButton();
        addObject(records,900,100);
        records.setLocation(500,500);

        ExitButton exit = new ExitButton();
        addObject(exit,900,500);
        exit.setLocation(850,500);        

    }
}