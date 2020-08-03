public void tri(int rows) {

		int spaces = 0;

		for (int row = 0; row <= rows; row++) {

			spaces = rows - row;
			for (int x = 0; x <= spaces; x++) {

				System.out.print(" ");

			}

			for (int column = 0; column <= row; column++) {

				System.out.print(FindNumber(row, column));

				System.out.print(" ");

			}

			System.out.println();

		}

	}

	private static int FindNumber(int row, int column) {
		int x = 1;

		if (column > row - column) {

			column = row - column;

		}

		for (int i = 0; i < column; i++) {

			x *= (row - i);
			x /= (i + 1);

		}

		return x;

	}
