
public class Problem15 {

	public static void main(String[] args) {
		int gridSize = 2;
		int[][] theGrid = new int[gridSize+1][gridSize+1];
		
		for(int i = 0; i < gridSize; i++){
			for(int j = 0; j < gridSize; j++){
				theGrid[i][j] = 0;
			}
		}
		
		for(int i = 0; i <= gridSize; i++){
			for(int j = 0; j <= gridSize; j++){
				if(i+1 <= gridSize && j+1 <= gridSize){
					theGrid[i][j] += 1;
					theGrid[i+1][j] += theGrid[i][j];
					theGrid[i][j+1] += theGrid[i][j];
				}
				else if(i+1 > gridSize && j+1 <= gridSize){
					theGrid[i][j+1] += theGrid[i][j];
				}
				else if(i+1 <= gridSize && j+1 > gridSize){
					theGrid[i+1][j] += theGrid[i][j];
				}
			}
		}
		
		System.out.println(theGrid[gridSize][gridSize]);
	}

}
