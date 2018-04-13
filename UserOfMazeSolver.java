/**
 * Contains an instance of a maze called test0
 *
 * test0 is used to instantiate mazeSolver tester0
 *
 * the solve method is called by tester0
 */

public class UserOfMazeSolver {

    public static void main(String[]  commandLine)
    throws java.io.FileNotFoundException {
      Maze test0 = new Maze( commandLine[0]
                          , Integer.parseInt( commandLine[1])
                          , Integer.parseInt( commandLine[2])
                          );
      MazeSolver tester0 = new MazeSolver(test0);
      System.out.println(tester0.solve());


    }





}
