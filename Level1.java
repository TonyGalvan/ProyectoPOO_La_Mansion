/**
 * Write a description of class PacmanGoogleMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 implements StaticMapLoader
{
    public Map loadMap()
    {
        Map map = new Map();

        addWalls(map);
        addCoin(map);
        map.addObject(new Player(), 73, 515);
        map.addObject(new Monster(), map.getWidth()/2 - 50, map.getHeight()/2);


        return map;
    }

    void addWalls(Map map)
    {

        for(int x = 0; x <=1000; x+=65) {
            map.addObject(new Wall(), x, 0);
        }

        for(int x = 0; x <=1000; x+=65) {
            map.addObject(new Wall(), x, 600);
        }

        for(int y = 0; y <=600; y+=65) {
            map.addObject(new Wall(), 0, y);
        }

        for(int y = 0; y <=600; y+=65) {
            map.addObject(new Wall(), 1000, y);
        }
    }
    
    void addCoin(Map map)
    {           
            map.addObject(new Coin(), 100, 220);
            map.addObject(new Coin(), 100, 320);
            map.addObject(new Coin(), 100, 120);
            map.addObject(new Coin(), 200, 100);
            map.addObject(new Coin(), 300, 150);
            map.addObject(new Coin(), 150, 320);
            map.addObject(new Coin(), 600, 480);
            map.addObject(new Coin(), 250, 500);
            map.addObject(new Coin(), 800, 320);
            map.addObject(new Coin(), 750, 450);        
        
    }

 

}
