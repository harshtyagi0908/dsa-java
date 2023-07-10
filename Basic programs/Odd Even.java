Scanner scn =  new Scanner(System.in);
		
		int num=scn.nextInt();
		int rem=num%2;
		if(rem==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
