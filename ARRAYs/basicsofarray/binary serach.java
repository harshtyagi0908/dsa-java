public static void main(String[] args) {
		int[] arr = { 5, 7, 12, 15, 20, 31, 35, 40, 45, 55, 58, 66, 71 };

	}

	public static int indexOf(int[] arr, int n) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (n == arr[mid]) {
				return mid;
			} else if (n < arr[mid]) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return -1;

	}
}
