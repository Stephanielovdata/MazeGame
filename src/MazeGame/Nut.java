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
public abstract class Nut extends Entity {
    public final int TOTAL_NUTS = 5;
    public int NUTRITION_POINTS;
    public String name;
    public boolean isAlmond = true;//true
    //public int row =0;
    //public int column = 0;
    //Maze maze = new Maze();
    
    //constructor
    public Nut (){
        this.row = 0;
        this.column = 0;
        this.name = "";    
    }
    
    /**
     *
     */
    //int i = 0;
    @Override
    public void create (){

        do {
        this.row = (int)(Math.random()*20);
        this.column = (int) (Math.random()*50);
        } while (!Maze.available(this.row,this.column));
        Maze.maze[this.row][this.column] = this.symbol;
        
    }
}
