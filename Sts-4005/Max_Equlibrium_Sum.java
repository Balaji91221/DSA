import java.util.Scanner;
public class Max_Equlibrium_Sum{
	static int Equilibrium(int[] arr){
		int left=0, right =0;
		for(int num:arr){
			right+=num;
		}
		int maxSum=0;
		for(int i=0;i<arr.length;i++){
			left+=arr[i];
			if(left==right){
				maxSum=Math.max(maxSum,left);
			}else{
				right-=arr[i];
			}
		}
		return maxSum;

	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int maxEquilibrium = Equilibrium(arr);
		if (maxEquilibrium != 0) {
			System.out.println("Maximum Equilibrium Sum: " + maxEquilibrium);
		} else {
			System.out.println("No equilibrium sum found.");
		}
		
	}
}