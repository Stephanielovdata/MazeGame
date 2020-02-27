/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author liguo
 */
public class Maze {
    //the Maze class define three attributes
    public static int max_Maze_Row = 20;
    public static int max_Maze_Column = 50;
    public int row;
    public int column;
    public static String maze[][] = new String[max_Maze_Row][max_Maze_Column];

    
    public Maze () {

    
    }
    

    //the Maze class has these methods:
    public static void create(String filename) throws FileNotFoundException {
        //This method reads the file passed to the method 
        //(e.g. Maze.txt) and initializes the 2-dimentional array 
        //with the maze content provided in the file.
        //input file

        // read the input file "Maze.txt"
        try(Scanner scan = new Scanner(new File(filename)))
        {

            for (int i = 0; i < max_Maze_Row; i++)
            {
                String temp = scan.nextLine();
                String[] arrayPasser = temp.split("");
                for (int j = 0; j < arrayPasser.length; j++)
                {
                    maze[i][j]=arrayPasser[j];
                }
            }
        }catch (FileNotFoundException e) 
        {
            System.out.println("Unable to open file.");
        }
    }
    
    public static void display () throws IOException{

        for (int i = 0; i < max_Maze_Row; i++){
            for (int j = 0; j < max_Maze_Column; j++){
                System.out.print(maze[i][j]);
                System.out.print(" ");
        }
            System.out.print("\n");
      }
    }
    
    public static boolean available (int row, int col) {
        //This method takes a row and a column and determines
        //if the location is a blank space. If it is, it 
        // returns true; otherwise, it returns false.
        return (maze[row][col].equals("*")== false);
    }
    
}
    
    
  
