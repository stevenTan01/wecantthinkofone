/**
 * Test the MazeSolver class
 *
 * Contains an instance of a maze called test0
 *
 * test0 is used to instantiate mazeSolver tester0
 *
 * the solve method is called by tester0
 */

public class UserOfMazeSolver {

    public static void main(String[]  commandLine)
    throws java.io.FileNotFoundException {
        
      //create a new object of type Maze called mazeToSolve
      Maze mazeToSolve = new Maze( commandLine[0]
                          , Integer.parseInt( commandLine[1])
                          , Integer.parseInt( commandLine[2])
                          );
        
      System.out.println(mazeToSolve); //print the original maze
        
      //create a new object of type MazeSolver that will be used to solve mazeToSolve
      MazeSolver solveThisMaze = new MazeSolver(mazeToSolve);
      
      //show results in the process of solving mazeToSolve
      System.out.println(solveThisMaze.solve());


    }





}
