/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeGame;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author liguo
 */


public class Squirrel extends Entity implements Movable {
    public int pointsCollected =0;
    public int totalNutsEaten =0; 
    //the Squirrel class has one constructor
    public Squirrel (){
    this.symbol = "@";
    this.row = 0;
    this.column = 0;
  
    }
    
    //the Squirrel class defines the following methods:
    // create() method get user's command which creates the squirrel and puts the squirrel in the maze
   //input from users command
    @Override
    public void create() {
        
        System.out.print ("Enter the Squirrel position (row, column): ");
        try {
    
            Scanner keyboard = new Scanner (System.in);
            String input = keyboard.nextLine();

            String[] tokens =input.split(",");
            if (tokens.length !=2)
            {
                System.out.println("Invalid format. try again");
                create();
            }else{
          
            this.row = Integer.parseInt(tokens[0].trim());
            this.column = Integer.parseInt(tokens[1].trim());}
            
            if(this.row > 20 ||this.row<0 || this.column > 50 || this.column <0){
                System.out.println ("Reach the boundaries, try again: 0< Row < 20, 0< Column <50");
                create();
            } 

            if ("*".equals(Maze.maze[this.row][this.column]))
            {
                System.out.println ("Position not available. Try again");
                create();
            } else{
            put(this.row, this.column);
            }
            
        } catch (InputMismatchException e) {
        throw e;
        } 

    }
    // This move(String direction) method moves the squirrel one position to the direction specified.
    // Also, it shows a warning if there is a wall ; it add points when the squirrel ate nuts
    public void move(String direction) throws IOException {

        if ("l".equals(direction)) {
            if (("*").equals(Maze.maze[this.row][this.column-1]) || this.column<1)
            {System.out.println("Position not available. Try something else."); 

            } else {
                if (("A").equals(Maze.maze[this.row][this.column-1])){
                pointsCollected += 5;
                totalNutsEaten++;
                System.out.println ("!!! Squirrel ate Almond and gained 5 points (Total " + pointsCollected + " points) !!!");
                } 
                if (("P").equals(Maze.maze[this.row][this.column-1])){
                pointsCollected += 10;
                totalNutsEaten++;
                System.out.println ("!!! Squirrel ate Peanut and gained 10 points (Total " + pointsCollected + " points) !!!");
                } 
                if (("C").equals(Maze.maze[this.row][this.column-1])){
               
                System.out.println ("!!! Squirrel ate PoisonousCashew and the game is over !!!");
                System.exit(0);
                } 
                Maze.maze[this.row][this.column-1] = "@";
                Maze.maze[this.row][this.column] = " ";
                this.column = this.column -1;
            }
                
        } else if ("r".equals(direction)) {
            if (("*").equals(Maze.maze[this.row][this.column+1]) || this.column>50)
            {System.out.println("Position not available. Try something else."); 

            } else {

                if (("A").equals(Maze.maze[this.row][this.column+1])){
                pointsCollected += 5;
                totalNutsEaten++;
                System.out.println ("!!! Squirrel ate Almond and gained 5 points (Total " + pointsCollected + " points) !!!");
                } 
                if (("P").equals(Maze.maze[this.row][this.column+1])){
                pointsCollected += 10;
                totalNutsEaten++;
                System.out.println ("!!! Squirrel ate Peanut and gained 10 points (Total " + pointsCollected + " points) !!!");
                } 
                if (("C").equals(Maze.maze[this.row][this.column+1])){
               
                System.out.println ("!!! Squirrel ate PoisonousCashew and the game is over !!!");
                System.exit(0);
                } 
                Maze.maze[this.row][this.column+1] = "@";
                Maze.maze[this.row][this.column] = " ";
                this.column = this.column +1;
            }
                
        } else if ("u".equals(direction)) {
            if (("*").equals(Maze.maze[this.row-1][this.column]) || this.row<1)
            {System.out.println("Position not available. Try something else."); 

            } else {

                if (("A").equals(Maze.maze[this.row-1][this.column])){
                pointsCollected += 5;
                totalNutsEaten++;
                System.out.println ("!!! Squirrel ate Almond and gained 5 points (Total " + pointsCollected + " points) !!!");
                } 
                
                if (("P").equals(Maze.maze[this.row-1][this.column])){
                pointsCollected += 10;
                totalNutsEaten++;
                System.out.println ("!!! Squirrel ate Peanut and gained 10 points (Total " + pointsCollected + " points) !!!");
                } 
                if (("C").equals(Maze.maze[this.row-1][this.column])){
               
                System.out.println ("!!! Squirrel ate PoisonousCashew and the game is over !!!");
                System.exit(0);
                } 
                Maze.maze[this.row-1][this.column] = "@";
                Maze.maze[this.row][this.column] = " ";
                this.row=this.row-1;
            }
                
        } else if("d".equals(direction)) {
            if (("*").equals(Maze.maze[this.row+1][this.column]) || this.row>20)
            {System.out.println("Position not available. Try something else."); 

            } else {
                if (("A").equals(Maze.maze[this.row+1][this.column])){
                pointsCollected += 5;
                totalNutsEaten++;
                System.out.println ("!!! Squirrel ate Almond and gained 5 points (Total " + pointsCollected + " points) !!!");
                } 
                if (("P").equals(Maze.maze[this.row+1][this.column])){
                pointsCollected += 10;
                totalNutsEaten++;
                System.out.println ("!!! Squirrel ate Peanut and gained 10 points (Total " + pointsCollected + " points) !!!");
                } 
                if (("C").equals(Maze.maze[this.row+1][this.column])){
               
                System.out.println ("!!! Squirrel ate PoisonousCashew and the game is over !!!");
                System.exit(0);
                } 
                Maze.maze[this.row+1][this.column] = "@";
                Maze.maze[this.row][this.column] = " ";
                this.row=this.row+1;
            }
                
        } else {
                System.out.println ("Incorrect direction command. please try again (r,l,u,d)");
                }
        if (totalNutsEaten == 5){
        Maze.display();

        System.out.println ("Squirrel sucessfully collected all the nuts. Total points " + pointsCollected);
        System.out.println ("Thank you for playing this game.");
        System.exit(0);}

    }
            
}
            

