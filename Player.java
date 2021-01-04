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

    public static int lifes;
    public static int points;
    public static boolean key = false;

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
        getWorld().showText("Points = " + points, 100, 15);
        getWorld().showText("Lifes = " + lifes, 220, 15);
        getWorld().showText("Time ", 420, 15);

        if(key == false){
            getWorld().showText("Key = No ", 335, 15);
        }

        String lastKeyPressed = Greenfoot.getKey();
        if(lastKeyPressed != null)
        {
            movePlayer(lastKeyPressed);
        }

        checkCollisions();
        eatPoints();
        checkRoomExit();
        if(lifes == 0){
            Greenfoot.delay(20);
            Greenfoot.setWorld(new GameOver());
        }
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

    void eatPoints(){
        if(isTouching(Key.class)){
            Greenfoot.playSound("key.wav");
            removeTouching(Key.class);
            key = true;
            getWorld().showText("Key = Yes ", 335, 15);
        }
        if(isTouching(Coin.class)){
            Greenfoot.playSound("coin.wav");
            removeTouching(Coin.class);
            points += 5;
            getWorld().showText("Points = " + points, 100, 15);

        }
        if(isTouching(Diamond.class)){
            Greenfoot.playSound("coin.wav");
            removeTouching(Diamond.class);
            points += 10;
            getWorld().showText("Points = " + points, 100, 15);

        }
    }

    void checkRoomExit(){
        if(isTouching(RoomExit.class) && key == true){
            Greenfoot.delay(20);
            Greenfoot.setWorld(new Congratulations());
        }

    }
}