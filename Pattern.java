class Pattern5{

	public static void main(String arr[]){
		
		int n=5;                             // no of rows ,n can be used for taking rows from user as well
		for(int i=1; i<=n; i++){             // Outer Loop
		     
		    for(int j=n-i; j>=1; j--)              //space loop
			System.out.print(" ");
			
		    

		    for(int k=1; k<=i; k++){         //printing loop
		        System.out.print("* ");  
		    }

		    System.out.print("\n");       
		}
}
}
