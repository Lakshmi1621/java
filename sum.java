import java.util.*;
public class sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int evencount=0;
		int oddcount=0;
		int sum=0;
		int n=sc.nextInt();
		for(int i=0;i<100;i++) {
			if(i%2==0) {
			 evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println("even number:"+evencount);
		System.out.println("odd number:"+oddcount);
		
	}

}
