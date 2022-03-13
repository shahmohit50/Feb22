package AssignTwo;

public class MaxMinRecur {

	static int arr [] = {1,-1,0,2,-2,3,-3,4,-4};
	static int max =0;
	static int min =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index =0;
		Recur(index);
		
	}
	
	public static void Recur(int index) {
		if(index >= arr.length) {
			System.out.println("Max :"+max+ "  Min :"+min);
			return;
		}

		if(arr[index] > max) {
			max = arr[index];
		}
		if(arr[index] < min) {
			min = arr[index];
		}
		Recur(index+1);
	}

}
