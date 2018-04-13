public class MazeSolver {

  Maze inProgress;
  int[] directions;
  int[] drops;

  public MazeSolver(Maze maze){
    inProgress = new Maze(maze);
    directions = new int[] { Maze.NORTH, Maze.EAST, Maze.SOUTH, Maze.WEST};
    drops = new int[] {Maze.TREASURE, Maze.WALL, Maze.STEPPING_STONE};
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
        System.out.println("in");
        inProgress.dropA(drops[1]);
        inProgress.go(dir);
        if (this.solve() == true) return true;
        inProgress = new Maze(snapshot);
            }
                              }
         }
    return false;
  	}
}
