public class rotationofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int a[]= {5,4,7,8,9};
         System.out.println("Right rotation of array");
	int temp1=a[a.length-1];
	for(i=a.length-1;i>0;i--) {
           a[i]=a[i-1];
	}
	a[i]=temp1;
	for(int j=0;j<a.length;j++) {
		System.out.println(a[j]);
	}

}
}
