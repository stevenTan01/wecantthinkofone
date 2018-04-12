public class MazeSolver {

	Maze inProgress;

	public MazeSolver(Maze maze){
	      inProgress = new Maze( maze);
	      
	}

	public boolean solve(){
		//base cases
		if(inProgress.explorerIsOnA() == Maze.WALL) return false;
		else if(inProgress.explorerIsOnA() == Maze.TREASURE) return true;
		else return false;
	}
}
