 int num=5;
	   int div=1;
	   int numfact=0;
	   while(div<=num) {
		   int rem=num%div;
		   if(rem ==0) {
			   numfact=numfact+1;
		   }
		   div++;
		   
	   }
	   if(numfact==2) {
		   System.out.println("prime number");
	   }
	   else {
		   System.out.println("not prime");
	   }
}


