package InterviewProg;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9 };
		int target = 8;
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (right + left) / 2;
			if (arr[mid] == target) {
				System.out.println("Position: " + mid);
				return;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		System.out.println("Insert Position: " + left);
	}

}
