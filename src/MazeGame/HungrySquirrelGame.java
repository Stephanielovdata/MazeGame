/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeGame;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author liguo
 * 

 */
public class HungrySquirrelGame {
    
    public static void main (String[] args) throws FileNotFoundException, IOException{

        //1.Call the create method of the Maze class to create the maze. 
       
        Maze maze = new Maze();
        
        Maze.create("Maze.txt");

        //2.Create a Squirrel object. This creates the squirrel and puts the squirrel in the maze based on the user input.

        Squirrel squirrel = new Squirrel();
        squirrel.create();


        //3.Instantiate an array of Nut objects and determine and create the type of nut (almond or peanut).
        // add nuts 
        Almond almond = new Almond();
        Peanut peanut = new Peanut();
        PoisonousCashew poison = new PoisonousCashew();
        for (int i =0;i<3;i++){
            double n = Math.random();
            if (n<0.5) {
                almond.create();
                
            }else {
                peanut.create();
            }
            
        }
        for (int i =0;i<4;i++){
            poison.create();
            
        }
        
      
        //4.Display the maze with all the entities created.
        Maze.display();
        /*
        Step 5-8 details in the Squirrel class move() function
        5.Accept user input to move the squirrel.
        6.For every move the full maze with all the entities should be displayed.
        7.Every time the squirrel eats a nut, program prints the points collected for the new nut and total points collected thus far.
        !!! Squirrel ate Almond and gained 5 points (Total 15 points) !!! 

        8.Once the squirrel collects all the nuts, a message must be displayed and the game is over.
        “Squirrel successfully collected all the nuts. Total points 30.”
        “Thank you for playing this game”
        */
        // get user's direction command
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("Enter commands u,d,l,r to move Up, Down, Left, and Right:");        
        System.out.print ("Enter commands: ");
        
        while (keyboard.hasNext()){
            
        String direction = keyboard.next().trim();
            

        squirrel.move(direction);
        Maze.display();

        System.out.print ("Enter commands: ");

        }
        

    }
    
}
