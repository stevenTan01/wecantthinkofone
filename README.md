### personnel
Jessie Cheng </br>
Jabir Chowdhury </br>
Steven Tan

### statement of problem

Return the Boolean value of the statement “it is possible to get from the current position to the treasure."

### recursive abstraction
When I am asked to  </br>
  to determine the boolean value of the statement "it is possible to get from the starting position to the treasure" </br>
the recursive abstraction can  </br>
  determine the boolean value of the statement "it is possible to get from the starting position to the treasure" after moving one stepping stone in a cardinal direction</br>

### base case
If you're on a treasure, return true  </br>
If you're on a wall, return false  </br>


### English or pseudocode description of algorithm
If the current position of the explorer does not contain the treasure, then record it as a checkpoint(snapshot) <br>
Traverse one step towards each of the four cardinal directions <br>
Invoke the recursive abstraction <br>

### class(es), with fields and methods
MazeSolver</br>
UserOfMazeSolver</br>
Maze</br>

### version *n* wishlist
what is the shortest way? </br>
what are all the ways?

### known bugs
1. Explorer will keep moving North when attempting to solve the maze, eventually reaching the outside and causing a NullPointerException


