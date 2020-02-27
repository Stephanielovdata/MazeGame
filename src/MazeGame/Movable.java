import java.lang.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package MazeGame;

/**
 *
 * @author liguo
 */
public interface Movable {
    //The Movable interface declares a single method and is 
    //implemented by entities that can move in the maze 
    //(i.e. Squirrel)
    // reference: https://www.tutorialspoint.com/java/java_interfaces.htm
    public void move(char direction);
    
}


