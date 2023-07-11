  public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println(a + " : " + b);
		swap(a, b);
		
	}

	public static void swap(int a, int b) {
	
		int c = a;
		a = b;
		b = c;
		System.out.println(a + " : " + b);
	}


