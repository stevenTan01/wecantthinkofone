/**
 o MazeSolver Class
 o contains fields inProgress; type Maze
                   directions; integer array
                   drops; integer array
 o contains constructor; MazeSolver(Maze maze); inProgress assigned a reference to new object of Maze
 o contains methods solve();
 o @param none
 o @return boolean value; true means maze has been solved explorer has landed on treasure; false means maze is unsolved, possibly unsolvable
 */
public class MazeSolver {

  Maze inProgress;
  int[] directions;

  public MazeSolver(Maze maze){

    inProgress = new Maze(maze);  // instantiates a Maze as a copy of another

    directions = new int[] { Maze.NORTH, Maze.EAST, Maze.SOUTH, Maze.WEST};
  }// An array for directions in order to shorten
   // the code for the solver with a for each loop.


  public boolean solve(){

	// base cases

  // if explorer is on a wall
	if(inProgress.explorerIsOnA() == Maze.WALL) return false;

  // if explorer is on the treasure
	else if(inProgress.explorerIsOnA() == Maze.TREASURE) return true;

  // entry into recursion
	else {

      // retain a copy of the current state of the maze
      Maze snapshot = new Maze(inProgress);

      // do the following for each of the directions
      for(int dir: directions){

        // drop a wall on current spot to prevent going backwards
        inProgress.dropA(Maze.WALL);

        // go to next stepping-stone
        inProgress.go(dir);

        // show what happened -- for debugging
	      System.out.println(inProgress);

        // recursive abstraction -- return true if this state of the maze
        // has a solution
        if (this.solve() == true) return true;

        // recursive back-tracking -- go to the previous state of the maze if
        // current direction has no solution
        inProgress = new Maze(snapshot);
                }
         }
    // If none of the directions have a solution, the maze cannot be solved
    return false;
  }
}
