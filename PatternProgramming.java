package Learning;

public class PatternProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
	
		for(int i=0; i<n; i++) {
			for(int j =0; j<n ; j++) {
				if( i+j ==(n-1)/2 || j-i==(n)/2  || i == (n-1)/2 || i > (n-1)/2 && j==0 || j==n-1 && i> (n-1)/2) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int k =0; k<n ; k++) {
				if(k == 0 || i==0 && k<(n-1) || i==(n-1)/2 && k<(n-1) || k ==(n-1) && i>0 && i<(n-1)/2 || k==(n-1) && i>(n-1)/2 && i<n-1 || i == n-1 && k<(n-1) ){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int l =0; l<n ; l++) {
				if( i==0 || l == 0 || i == n-1 ){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int m=0; m<n ; m++) {
				if(  m == 0|| i==0 && m < n-2|| i == n-1 && m< n-2 || m == n-1 && i >0 && i< n-1){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int o =0; o<n; o++) {
				if(i==0 || i == n-1 || i == (n-1)/2 || o==0 ) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int p =0; p<n; p++) {
				if(i==0|| i == (n-1)/2 && p<n-1 || p==0 ) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int q =0; q<n; q++) {
				if(q==0 || i == 0 || i == n-1 || q == n-1 && i>=(n-1)/2 || i == (n-1)/2 && q>=(n-1)/2 ) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int s =0; s<n ; s++) {
				if(i==0 || s==0 && i<=(n-1)/2 || i ==(n-1)/2 || s ==n-1 && i>(n-1)/2 || i == n-1){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int t =0; t<n ; t++) {
				if(t==0 || t == n-1 || i== (n-1)/2 ){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0; i<n; i++) {
			for(int j =0; j<n ; j++) {
				if(i+j == n-1 || i == n-1){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print("");
			for(int k =0; k<n ; k++) {
				if(i==k || i == n-1){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println(" ");
			
		}		
		
	}
}
