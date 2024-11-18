public class rotationofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int a[]= {5,4,7,8,9};
		int temp=a[0];
		for(i=0; i<a.length-1;i++) {
			a[i]=a[i+1];
			
		}

		a[i]=temp;
		System.out.println(" left rotation of array");
		for(int j=0;j<=a.length;j++) {
			System.out.println(a[j]);
		}

		
	}