import java.util.*;
public class count1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int evencount=0;
		int oddcount=0;
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.println("enter number"+i+":");
			int num=sc.nextInt();
			if(num%2==0) {
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
