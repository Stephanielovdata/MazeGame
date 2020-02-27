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
public class Wall extends Entity{
    //You shall define the Wall Class. The Wall class is inherited
    //from Entity super class.  
    //Walls shall remain stationary and don’t move in the maze.

    public Wall () {
    this.symbol = "*";
    this.row = 0;
    this.column=0;
    }
    
    @Override
    public void create (){
    //
    }
    
}
