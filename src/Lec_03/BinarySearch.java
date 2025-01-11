package Lec_03;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		int t=50;
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==t) {
				System.out.println(mid);
				return;
			}
			else if(arr[mid]<t) {
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		System.out.println("-1");
//		int a=Integer.MAX_VALUE
	}

}
