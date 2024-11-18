import java.util.*;
public class fact {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		int fact=1;
		int num=sc.nextInt();
		for(int i=5;i>0;i--) {
			fact=fact*n;
		}
		System.out.println("factortial number:"+fact);
	}
	

}
