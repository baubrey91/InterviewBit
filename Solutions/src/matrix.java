import java.util.ArrayList;

public class matrix {

	public static void main(String[] args) {
		
	}
	
	public static ArrayList<ArrayList<Integer>> prettyPrint(int A) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if (A <= 0) {
			return result;
		}
		// initialize matrix
		int matrixSize = 2 * A - 1;
		int[][] matrix = new int[matrixSize][matrixSize];

		// update matrix
		int x = 0;
		int y = 0;
		int SpiralDirection = 0;
		for (int num = A; num > 0; num--) {
			// watch the corner case when num = 1
			int size = num == 1 ? 1 : (2 * num - 1) * (2 * num - 1) - (2 * num - 3) * (2 * num - 3);
			int count = 0;
			while (count < size) {
				// print number in a circle
				count++;
				matrix[x][y] = num;
				if (SpiralDirection == 0) {
					y++; // move to right
					if (y == matrixSize || matrix[x][y] != 0) {
						SpiralDirection = 1;
						y--;
						x++;
					}
				} else if (SpiralDirection == 1) {
					x++; // move downwards
					if (x == matrixSize || matrix[x][y] != 0) {
						SpiralDirection = 2;
						x--;
						y--;
					}
				} else if (SpiralDirection == 2) {
					y--; // move to left
					if (y < 0 || matrix[x][y] != 0) {
						SpiralDirection = 3;
						y++;
						x--;
					}
				} else {
					x--; // move upwards
					if (x < 0 || matrix[x][y] != 0) {
						SpiralDirection = 0;
						x++;
						y++;
					}
				}
			}
		}

		for (int p = 0; p < matrixSize; p++) {
			ArrayList<Integer> list = new ArrayList<>();
			for (int q = 0; q < matrixSize; q++) {
				list.add(matrix[p][q]);
			}
			result.add(list);
		}

		return result;
	}
}
