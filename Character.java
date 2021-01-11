/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character implements Comparable<Character>  
{
    // instance variables - replace the example below with your own
    private String name;
    private int points;
    

    /**
     * Constructor for objects of class Character
     */
    public Character(String name, int points)
    {
        this.points = points;
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPoints(int points) {
        this.points = points;
    }
    public String getName() {
        return name;
    }
    public int getPoints() {
        return points;
    }
    @Override
    public int compareTo(Character player) {
        return player.points - points;
    }
}
