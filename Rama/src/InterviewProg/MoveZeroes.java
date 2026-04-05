package InterviewProg;

import java.util.Arrays;

class MoveZeroes {
	public static void main(String[] args) {

		int arr[] = { 1, 0, 3, 0, 5, 0, 7, 0, 9 };
		int temp;
		int j = 0; 

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
