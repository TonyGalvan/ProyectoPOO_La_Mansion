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

    public GreenfootImage image = new GreenfootImage ("images/personaje_right.png");

    private int lifes;
    private int points;

    private int movementInX;
    private int movementInY;

    public Player()
    {
        setImage(image);

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
        Actor wallCollision = getOneIntersectingObject(Wall.class);

        switch(keyPressed)
        {
            case "up":

            movementInY = -1;
            direction = CharacterDirection.UP;
            image = new GreenfootImage("images/personaje_up.png");
            setImage(image);

            break;
            case "down":

            movementInY = 1;
            direction = CharacterDirection.DOWN;
            image = new GreenfootImage("images/personaje_down.png");
            setImage(image);

            break;
            case "left":

            direction = CharacterDirection.LEFT;
            movementInX = -1;
            image = new GreenfootImage("images/personaje_left.png");
            setImage(image);

            break;
            case "right":
            direction = CharacterDirection.RIGHT;
            movementInX = 1;
            image = new GreenfootImage("images/personaje_right.png");
            setImage(image);

            break;
        }
    }

    void checkCollisions()
    {

        Wall wall = null;
        switch(direction)
        {
            case UP:
            wall = (Wall)getOneObjectAtOffset(0, -40, Wall.class);
            break;
            case DOWN:
            wall = (Wall)getOneObjectAtOffset(0, 50, Wall.class);
            break;
            case RIGHT:
            wall = (Wall)getOneObjectAtOffset(30, 20, Wall.class);
            break;
            case LEFT:
            wall = (Wall)getOneObjectAtOffset(-25, 20, Wall.class);
            break;
        }

        if(wall != null)
        {
            movementInY = 0;
            movementInX = 0;
        }

    }
}