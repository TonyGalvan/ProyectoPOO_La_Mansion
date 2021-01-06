import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
import java.io.*;
import java.io.IOException;

/**
 * Write a description of class Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Records extends World
{
    /**
     * Constructor for objects of class Records.
     * 
     */
    public Records()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        setBackground​("images/space.jpg");

        RecordsText records = new RecordsText();      
        addObject(records,480,150);
        BackButton backButton = new BackButton();
        addObject(backButton,91,92);
        backButton.setLocation(900,580);
        leerArchivos();
    }

    public void leerArchivos()
    {
        FileReader leer;
        String cadena = "";
        int y=50;

        File file = new File("records.txt");

        try {
            leer = new FileReader(file);
            BufferedReader almacenar = new BufferedReader(leer);
            while(cadena != null) {
                try {
                    cadena = almacenar.readLine();
                    if(cadena!=null) {
                        showText(" "+cadena, 470, y+150);
                    }
                }catch (IOException ex){ex.printStackTrace();}
            }
            try {
                almacenar.close();
                leer.close();
            }catch (IOException ex){ex.printStackTrace();};
        }catch(FileNotFoundException exception){};

    }

}
