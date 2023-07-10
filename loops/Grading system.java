Scanner scn = new Scanner(System.in) ;
			int marks = scn.nextInt();
			if(50<=marks && marks>60) {
				System.out.println("grade E");
			}
			else if (60<=marks && marks>70) {
				System.out.println("grade D");
			}
			else if (70<=marks && marks>80) {
				System.out.println("grade c");
			}
			else if(80<=marks && marks>90) {
				System.out.println("grade b");
			}
			else if(marks>=90) {
				System.out.println("grade a");
			}
			else {
				System.out.println("fail");
			}
		}
