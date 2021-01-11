import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
import java.io.*;
import java.io.IOException;
/**
 * Write a description of class Congratulations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Congratulations extends World
{
    public static int points;
    /**
     * Constructor for objects of class Congratulations.
     * 
     */
    public Congratulations()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        setBackground​("images/space.jpg");

        CongratulationsText congratulations = new CongratulationsText();      
        addObject(congratulations,480,300);
        BackButton backButton = new BackButton();
        addObject(backButton,91,92);
        backButton.setLocation(900,580);
        creaArchivo();

    }

    public void creaArchivo()
    {
        File file = new File("records.txt");
        FileWriter escribir;
        FileReader leer;
        PrintWriter linea;

        points = Player.points;

        if(!file.exists()) {
            try{
                file.createNewFile();
            }catch (IOException ex){ex.printStackTrace();}
        }

        try {
            escribir = new FileWriter(file,true);
            linea = new PrintWriter(escribir);
            linea.println(Player.name+","+ Player.points);
            escribir.close();
            linea.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
