package InterviewProg;

public class Assending_Order {

	public static void main(String[] args) {
		int arr[] = { 10, 30, 50, 70, 20, 40, 60, 80 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("assending order:");
		for (int num : arr) {
			System.out.println(num + "");
		}

	}

}
