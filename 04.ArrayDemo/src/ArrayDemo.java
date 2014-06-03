class ArrayDemo {
	public static void main(String[] args) {
		int a1[] = new int[5];
		int a2[] = new int[] { 1, 2, 3, 4, 5 };
		// int a2[] = new int {1,2,3,4,5,} ; //This is also allowed in JAVA

		int a3[][] = new int[5][];
		// a3[0] = new int[5]
		for (int index = 0; index < a3.length; index++) {
			a3[index] = new int[10];
		}

		int i = 11;

		for (int row = 0; row < a3.length; row++) {
			for (int col = 0; col < a3[row].length; col++) {
				a3[row][col] = i;
				i++;
			}
			i += 10;
		}

		for (int temp1[] : a3) {
			for (int temp2 : temp1) {
				System.out.print(" " + temp2 + " ");
			}
			System.out.println(" ");
		}

	}
}
