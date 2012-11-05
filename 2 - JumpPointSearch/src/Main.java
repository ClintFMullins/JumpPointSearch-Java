public class Main {
	public static void main(String[] args){
		
		int xMax = 1000;  //size of grid x direction
		int yMax = 1000;  //size of the grid y direction
		int xIsland = 1; //islands along the x direction
		int yIsland = 1; //islands along the y direction
		boolean uniform = true; //true for uniform land generation, false for random land generation
		boolean draw = true;
		Node[][] grid = null;
		
		JPS jpsg = new JPS(xMax,yMax,xIsland,yIsland,uniform,draw,grid);
	}
}
