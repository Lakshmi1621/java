public class numbers {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5};
		int num=0;
		int rev=0;
		
		for(int i=0;i<=a.length-1;i++) {
			if(num<rev) {
				int temp=num;
				num=rev;
				rev=temp;
				num++;
				rev--
			;
				
						
			}
			
		}
		System.out.println("reverse of a array :");
		for (int i=0;i<a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
