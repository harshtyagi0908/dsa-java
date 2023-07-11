 public static void main(String[] args) {
     int [] arr ={23,45,83,94,02};
     
     System.out.println(Max(arr));
    }
     public static int Max(int[] arr) {

		int pocket = arr[0];
		for (int apple : arr) {
			if (apple > pocket) {
				pocket = apple;
			}
		}
		return pocket;
    }
