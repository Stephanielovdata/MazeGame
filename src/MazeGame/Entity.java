/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeGame;

/**
 *
 * @author liguo
 */
public abstract class Entity {
    public int row = 0;
    public int column =0;
    public String symbol;
    /*
    public Entity[][] entity = new Entity[20][50];

    Squirrel squirrel = new Squirrel();
    Wall wall = new Wall();
*/
    //constructor
    public Entity () {}
    
    public abstract void create();
    
    public void put(int newRow, int newCol) 
    //This method puts an entity at location (newRow, newCol) 
    //in the maze. This method returns an object that was replaced 
    //in the maze. (hint: This can be useful when moving the 
    //squirrel and determining if the squirrel found a nut).
    {

        
        Maze.maze[newRow][newCol] = "@";
        System.out.println ("User input accepted.");
                
    }    
 
}
    

