public class armstrongum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=56;
    int temp=n;
    double sum=0;
    while(temp!=0) {
    	int d=temp%10;
    	sum=sum+Math.pow(d,5 );
    	temp=temp/10;
    	
    }
    System.out.println(sum);
    if(temp==n) {System.out.println("armstrong");
    		
	}
    else {
    	System.out.println("Not armstrong");
    }

}
}
