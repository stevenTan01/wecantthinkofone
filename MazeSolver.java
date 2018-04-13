/**
 * MazeSolver Class
 * contains fields inProgress; type Maze
 * contains constructor; MazeSolver(Maze maze); inProgress assigned a reference to new object of Maze
 * contains methods solve(); 
 * @param none
 * @return boolean value; true means maze has been solved explorer has landed on treasure; false means maze is unsolved, possibly unsolvable

 */

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
