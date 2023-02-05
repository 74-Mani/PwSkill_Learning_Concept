package Learning;

public class Manish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		for(int i=0; i<n ; i++) {
			for(int j=0; j<n; j++) {
				if(j==0 || i==j) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.print("");
			for(int k=0; k<n; k++) {
				if(k==n-1 || i+k == n-1) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int l=0; l<n; l++) {
				if(l+i == n-1 || i ==(n-1)/2 && l>=(n-1)/2) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.print("");
			for(int m=0; m<n; m++) {
				if(i==m || i ==(n-1)/2 && m<=(n-1)/2) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int o=0; o<n; o++) {
				if(i==o || o ==0 || o==n-1) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int p=0; p<n; p++) {
				if(i==0 || i ==n-1 || p==(n-1)/2) {
					System.out.print("*");
				}else
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
			for(int q=0; q<n; q++) {
				if(q==0 || q ==n-1 || i==(n-1)/2) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
