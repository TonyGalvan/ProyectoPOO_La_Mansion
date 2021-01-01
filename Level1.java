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
        addKey(map);
        addDiamond(map);
        addRoomExit(map);
        map.addObject(new Player(), 73, 515);
        map.addObject(new Monster(), 70, 70);
        map.addObject(new Monster(), 400, 300);
        map.addObject(new Monster(), 900, 400);
        map.addObject(new Monster(), 900, 100);

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

        for(int y = 150; y <300; y+=60) {
            map.addObject(new Wall(), 500, y);
        }

        for(int x = 280; x <500; x+=60) {
            map.addObject(new Wall(), x, 150);
        }

        for(int x = 500; x <650; x+=60) {
            map.addObject(new Wall(), x, 330);
        }

        for(int x = 820; x <1000; x+=60) {
            map.addObject(new Wall(), x, 450);
        }

        for(int x = 880; x <1000; x+=60) {
            map.addObject(new Wall(), x, 300);
        }

        map.addObject(new Wall(), 150, 350);
        map.addObject(new Wall(), 210, 350);
        map.addObject(new Wall(), 730, 200);

    }

    void addCoin(Map map)
    {       
        for(int y = 180; y <=420; y+=40) {
            map.addObject(new Coin(), 70, y);
        }

        for(int x = 260; x <=800; x+=40) {
            map.addObject(new Coin(), x, 550);
        }
        for(int x = 800; x <970; x+=40) {
            map.addObject(new Coin(), x, 400);
        }

        for(int x = 870; x <990; x+=40) {
            map.addObject(new Coin(), x, 250);
        }

        for(int x = 300; x <780; x+=40) {
            map.addObject(new Coin(), x, 490);
        }

    }

    void addKey(Map map)
    { 
        map.addObject(new Key(), 440, 225);       

    }

    void addRoomExit(Map map)
    {
        map.addObject(new RoomExit(), 925, 525);
    }

    void addDiamond(Map map)
    { 
        for(int x = 280; x <590; x+=45) {
            map.addObject(new Diamond(), x, 100);
        }

        for(int y = 145; y <325; y+=45) {
            map.addObject(new Diamond(), 550, y);
        }

        map.addObject(new Diamond(), 200, 225);
        map.addObject(new Diamond(), 140, 225);
        map.addObject(new Diamond(), 200, 275);
        map.addObject(new Diamond(), 140, 275);
        map.addObject(new Diamond(), 595, 280);
        map.addObject(new Diamond(), 640, 280);
        map.addObject(new Diamond(), 700, 150);
        map.addObject(new Diamond(), 745, 150);
        map.addObject(new Diamond(), 855, 150);
        map.addObject(new Diamond(), 900, 150);
        map.addObject(new Diamond(), 945, 150);
        map.addObject(new Diamond(), 855, 150);
        map.addObject(new Diamond(), 900, 200);
        map.addObject(new Diamond(), 945, 200);
        map.addObject(new Diamond(), 855, 200);

    }

}
