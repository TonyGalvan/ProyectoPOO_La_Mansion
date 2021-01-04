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
    SimpleTimer time = new SimpleTimer();
    Counter counter = new Counter();
    /**
     * Constructor for objects of class Map.
     * 
     */
    public Map()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        addObject(counter,420,45);
        counter.setValue(300);

        Play_Music();
    }

    public void Play_Music(){
        backMusic.setVolume(50);
        backMusic.playLoop();
    }

    public void act()
    {
        if(time.millisElapsed()>1000)
        {
            counter.add(-1);
            time.mark();
        }

        if(counter.getValue() == 0){
            backMusic.stop();
            Greenfoot.delay(20);
            Greenfoot.setWorld(new GameOver());
        }
    }    
}
