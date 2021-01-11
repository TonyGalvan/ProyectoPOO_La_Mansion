import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.BufferedWriter;
import javax.swing.*;
import java.io.*;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;




/**
 * Write a description of class Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Records extends World
{
    private static final int NAME = 0;
    private static final int POINTS = 1;
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
        List<Character> players = new ArrayList<>();
        FileReader leer;
        String cadena = null;
        String names = null;
        String[] datos = null;
        int cont = 0;
        Character player = null;

        File file = new File("records.txt");
        try {
            leer = new FileReader(file);
            BufferedReader almacenar = new BufferedReader(leer);
            while((cadena = almacenar.readLine()) != null) {
                datos = cadena.split(",");
                player = new Character(datos[NAME], Integer.parseInt(datos[POINTS]));
                players.add(player);
                cont++;
            }
            Collections.sort(players);

            
        } catch (IOException e) {
            System.out.println(e);
        } 
        
        show(players,cont);
    }

    public void show(List<Character> players, int cont) {

        String points;
        for (int i = 0, j = 10; i < cont && i < 5; i++, j += 20) {
            showText(players.get(i).getName(), 450, 190 + j);
            points = Integer.toString(players.get(i).getPoints());
            showText(points, 550, 190 + j);

        }

    }
}