import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PacMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Person
{
    private static final int INITIAL_LIFES = 6;
    private static final int INITIAL_POINTS = 0;
    private static final int ITERATIONS_TO_CHANGE_SPRITE = 15;

    private int lifes;
    private int points;

    private int movementInX;
    private int movementInY;

    public Player()
    {
        sprites = new GreenfootImage[1];
        sprites[0] = new GreenfootImage("images/personaje_right.png");

        lifes = INITIAL_LIFES;
        points = INITIAL_POINTS;
        direction = CharacterDirection.RIGHT;
    }

    /**
     * Act - do whatever the PacMan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(delaySprite >= ITERATIONS_TO_CHANGE_SPRITE)
        {
            currentSprite = (++currentSprite) % sprites.length;
            setImage(sprites[currentSprite]);

            delaySprite = 0;
        }

        delaySprite++;

        setLocation(getX() + movementInX, getY() + movementInY);

        String lastKeyPressed = Greenfoot.getKey();
        if(lastKeyPressed != null)
        {
            movePlayer(lastKeyPressed);
        }

        checkCollisions();

    }    

    void movePlayer(String keyPressed)
    {
        movementInY = 0;
        movementInX = 0;
        switch(keyPressed)
        {
            case "up":
            movementInY = -1;
            direction = CharacterDirection.UP;
            sprites[0]= new GreenfootImage("images/personaje_up.png");
            break;
            case "down":
            movementInY = 1;
            direction = CharacterDirection.DOWN;
            sprites[0] = new GreenfootImage("images/personaje_down.png");
            break;
            case "left":
            direction = CharacterDirection.LEFT;
            movementInX = -1;
            sprites[0] = new GreenfootImage("images/personaje_left.png");
            break;
            case "right":
            direction = CharacterDirection.RIGHT;
            movementInX = 1;
            sprites[0] = new GreenfootImage("images/personaje_right.png");
            break;
        }
    }

    void checkCollisions()
    {
        Wall wall = null; 
        switch(direction)
        {
            case UP:
            wall = (Wall)getOneObjectAtOffset(0, -20, Wall.class);
            break;
            case DOWN:
            wall = (Wall)getOneObjectAtOffset(0, 20, Wall.class);
            break;
            case RIGHT:
            wall = (Wall)getOneObjectAtOffset(20, 0, Wall.class);
            break;
            case LEFT:
            wall = (Wall)getOneObjectAtOffset(-20, 0, Wall.class);
            break;
        }

        if(wall != null)
        {
            movementInY = 0;
            movementInX = 0;
        }

    }


}