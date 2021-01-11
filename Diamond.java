import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamond extends Item
{
    /**
     * Act - do whatever the Diamond wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final GreenfootImage image = new GreenfootImage("images/diamond.png");

    public Diamond(){
        setImage(image);

        points = 10;

    }
}
