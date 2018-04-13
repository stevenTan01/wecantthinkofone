/**
 * MazeSolver Class
 * contains fields inProgress; type Maze
 *                 directions; integer array
 *                 drops; integer array
 * contains constructor; MazeSolver(Maze maze); inProgress assigned a reference to new object of Maze
 * contains methods solve(); 
 * @param none
 * @return boolean value; true means maze has been solved explorer has landed on treasure; false means maze is unsolved, possibly unsolvable
 */
public class MazeSolver {

  Maze inProgress;
  int[] directions;
  //int[] drops;

  public MazeSolver(Maze maze){
    inProgress = new Maze(maze);
    directions = new int[] { Maze.NORTH, Maze.EAST, Maze.SOUTH, Maze.WEST};
    //drops = new int[] {Maze.TREASURE, Maze.WALL, Maze.STEPPING_STONE};
  }


  public boolean solve(){

		//base cases

		if(inProgress.explorerIsOnA() == Maze.WALL) return false;

		else if(inProgress.explorerIsOnA() == Maze.TREASURE) return true;

		else {
      Maze snapshot = new Maze(inProgress);
      for(int dir: directions){
        if (inProgress.checkMaybeGo(dir) == false) continue;
        else{
        inProgress.dropA(Maze.WALL);
        inProgress.go(dir);
	System.out.println(inProgress); //show what happened
        if (this.solve() == true) return true;
        inProgress = new Maze(snapshot);
            }
                              }
         }
    return false;
  	}
}
