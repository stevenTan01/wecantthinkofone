public class UserOfMazeSolver {

	public static void main(String[] commandLine)
 	throws java.io.FileNotFoundException {
		Maze maze = new Maze( commandLine[0]
                            , Integer.parseInt( commandLine[1])
                            , Integer.parseInt( commandLine[2])
                            );

		MazeSolver solution = new MazeSolver(maze);
		solution.solve();
		
	}
}
