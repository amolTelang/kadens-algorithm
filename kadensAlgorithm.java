//implementation of Kadens Algorithm to find max sub array sum
public class Main
{
    static int kadensAlgorithm(int arr[])
    {
        int currentSum=0;
        int maxSum=0;
        for(int i=0;i<arr.length;i++)
        {   currentSum+=arr[i];
            if(currentSum<0)
            {
                currentSum=0;
            }
            if(currentSum>maxSum)
            {
                maxSum=currentSum;
            }
            
        }
        return maxSum;
    }
	public static void main(String[] args) {
		int[] array=new int[]{-2, -3, 3, -1, -2, 1, 5, -3,10};
		System.out.println(kadensAlgorithm(array));
	}
}
