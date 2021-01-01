import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map extends World
{
    GreenfootSound backMusic = new GreenfootSound("castillo.mp3");
    /**
     * Constructor for objects of class Map.
     * 
     */
    public Map()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        Play_Music();
    }
    public void Play_Music(){
        backMusic.setVolume(50);
        backMusic.playLoop();
    }
    
}
