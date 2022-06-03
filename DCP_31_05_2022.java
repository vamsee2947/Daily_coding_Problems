//Sudoku is a puzzle where you're given a partially-filled 9 by 9 grid with digits.
class Main
{
	public static boolean Ok_or_not(int[][] board,int row, int col,int num)
	{
		for (int d = 0; d < board.length; d++)
		{
			if (board[row][d] == num) {
				return false;
			}
    }
		for (int r = 0; r < board.length; r++)
		{
		    if (board[r][col] == num){
				return false;
			}
		}
		int sqr = (int)Math.sqrt(board.length);
		int boxRow = row - row % sqr;
		int boxCol = col - col % sqr;

		for (int r = boxRow;r < boxRow + sqr; r++)
		{
			for (int d = boxCol;d < boxCol + sqr; d++)
			{
				if (board[r][d] == num)
				{
					return false;
				}
			}
		}
		return true;
	}

	public static boolean solve(
		int[][] board, int n)
	{
		int row = -1;
		int col = -1;
		boolean empty = true;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (board[i][j] == 0)
				{
					row = i;
					col = j;

					empty = false;
					break;
				}
			}
			if (!empty) {
				break;
			}
		}

		if (empty)
		{
			return true;
		}

		for (int num = 1; num <= n; num++)
		{
			if (Ok_or_not(board, row, col, num))
			{
				board[row][col] = num;
				if (solve(board, n))
				{
					return true;
				}
				else
				{
					board[row][col] = 0;
				}
			}
		}
		return false;
	}

	public static void print(
		int[][] board, int N)
	{
		
		for (int r = 0; r < N; r++)
		{
			for (int d = 0; d < N; d++)
			{
				System.out.print(board[r][d]);
				System.out.print(" ");
			}
			System.out.println(" ");

			if ((r + 1) % (int)Math.sqrt(N) == 0)
			{
				System.out.print("");
			}
		}
	}

public static void main(String args[])
	{

		int[][] board = new int[][] {
			{ 0, 0, 0, 0, 4, 0, 0, 0, 0 },
			{ 1, 0, 0, 0, 0, 0, 0, 6, 0 },
			{ 0, 9, 0, 8, 0, 7, 3, 0, 0 },
			{ 0, 0, 6, 2, 0, 4, 0, 3, 0 },
			{ 0, 0, 0, 0, 9, 0, 4, 0, 0 },
			{ 0, 2, 0, 0, 5, 0, 0, 0, 0 },
			{ 0, 8, 0, 3, 0, 2, 7, 0, 0 },
			{ 0, 0, 0, 5, 0, 0, 0, 0, 0 },
			{ 0, 0, 9, 0, 0, 0, 0, 0, 8 }
		};
		int N = board.length;

		if (solve(board, N))
		{
			print(board, N);
		}
		else {
			System.out.println("No solution");
		}
	}
}
