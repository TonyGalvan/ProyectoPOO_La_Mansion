import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Person
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected CharacterDirection direction;
    private int moveX;
    private int moveY;
    public GreenfootImage image = new GreenfootImage("images/monstruo_right.png");

    
   

    
    
    public Monster()
    {
        direction = CharacterDirection.getRandomDirection();
        setImage(image);
    }
    
    public void act() 
    {
        setLocation(getX() + moveX, getY() + moveY);

        if( checkCollisions()){
            direction = CharacterDirection.getRandomDirection();
        } 
        
        moveMonster();
    }
    

    
    void moveMonster()
    {
        moveX = 0;
        moveY = 0;
        
        switch(direction)
        {
            case UP:
            moveY = -1;
            image = new GreenfootImage("images/monstruo_up.png");
            setImage(image);
            break;
            
            case DOWN:
            moveY = 1;
            image = new GreenfootImage("images/monstruo_down.png");
            setImage(image);
            break;
            
            case LEFT:
            moveX = -1;
            image = new GreenfootImage("images/monstruo_left.png");
            setImage(image);
            break;
            
            case RIGHT:
            moveX = 1;
            image = new GreenfootImage("images/monstruo_right.png");
            setImage(image);
            break;
        }
    }
    
    boolean checkCollisions()
    {
        Wall walls = null;
        
        switch(direction)
        {
             case UP:
            walls = (Wall)getOneObjectAtOffset(0, -40, Wall.class);
            break;
            case DOWN:
            walls = (Wall)getOneObjectAtOffset(0, 40, Wall.class);
            break;
            case RIGHT:
            walls = (Wall)getOneObjectAtOffset(40, 0, Wall.class);
            break;
            case LEFT:
            walls = (Wall)getOneObjectAtOffset(-40, 0, Wall.class);
            break;
        }
        
        return walls != null;
    
    }
}