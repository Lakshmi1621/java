import java.util.*;
public class menudriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     char c='y';
     do {
    	 System.out.println("Enter name:");
    	 String name=sc.next();
    	 System.out.println("name");
    	 System.out.println("press y to contnue and n to dis");
    	 c=sc.next().charAt(0);
    	 if(c=='n') {
    		 break;
    	 }
     }while(c=='y');
     
	}
}
