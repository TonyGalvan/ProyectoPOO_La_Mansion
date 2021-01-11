import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends World
{

    /**
     * Constructor for objects of class Help.
     * 
     */
    public Help()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        Instructions instructions = new Instructions();      
        setBackground​("images/space.jpg");
        addObject(instructions,480,300);
        BackButton backButton = new BackButton();
        addObject(backButton,91,92);
        backButton.setLocation(900,580);
    }
}
