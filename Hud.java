import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hud extends Actor
{
    /**
     * Act - do whatever the Hud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int score=0;

    private static final GreenfootImage image = new GreenfootImage("images/score.png");
    public Hud(){
        setImage(image);
    }   
}