package Learning;

public class PwSkill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		
		for(int i=0; i<n; i++) {
			for(int j =0; j<n ; j++) {
				if(j==0 || i==0 && j<n-1 || j==n-1 && i>0 && i<(n-1)/2 || i == (n-1)/2 && j < n-1){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int k =0; k<n ; k++) {
				if(i-k >= 0){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			for(int l =0; l<n ; l++) {
				if(i+l>= n-1){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print("");
			for(int m =0; m<n ;m++) {
				if(i-m >= 0){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			for(int o =0; o<n ; o++) {
				if(i+o>= n-1){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print("         ");
			for(int s =0; s<n ; s++) {
				if(i==0 || s==0 && i<=(n-1)/2 || i ==(n-1)/2 || s ==n-1 && i>(n-1)/2 || i == n-1){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			for(int r =0; r<n ; r++) {
				if(r==0 || i+r ==(n-1)/2 || i-r ==(n-1)/2){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int t =0; t<n ; t++) {
				if(t == 0){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int u =0; u<n ; u++) {
				if(u == 0 || i ==n-1){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for(int v =0; v<n ; v++) {
				if(v == 0 || i ==n-1){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("GitCommit");
		System.out.println("GitCommit");
	}

}
