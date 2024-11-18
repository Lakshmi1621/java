import java.util.*;
public class frequceny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elemets i a array");
		int s=sc.nextInt();
		int []arr=new int[s];
		System.out.println("Enter"+s+"elements:");
		for(int i=0;i<s;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter first elements to find frequency:");
		int element1=sc.nextInt();
		System.out.println("Enter second  elements to find frequency:");
		int element2=sc.nextInt();
		int count1=0;
		int count2=0;
		for(int i=0;i<s;i++) {
			if(arr[i]==element1) {
				count1++;
				
			}
			if(arr[i]==element2) {
				count2++;
			}
			System.out.println("Frequency of " + element1 + ": " + count1);
	        System.out.println("Frequency of " + element2 + ": " + count2);
	        
		}

	}

}
