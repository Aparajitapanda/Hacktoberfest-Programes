import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			SquareRoot obj = new SquareRoot();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class SquareRoot
{
     long floorSqrt(long x)
	 {
		// Your code here
		double root =Math.sqrt(x);
		return (int)root;
	 }
}
