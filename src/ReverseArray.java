
public class ReverseArray {

	public static int[] reverse(int [] a)
	
	{
		int index = 0;
		int index2 = a.length - 1;
		for(int i = 0;i < a.length;i++)
			
		{
			int temp = 0;
			if (i == a.length - i - 1)
				break;
			else
				
				temp = a[index];
				a[index]= a[index2];
				a[index2] = temp;
				index2--;
		}
		return a;
	}
	
	public static void main (String args[])
	{
		int [] a = {1,3,2,4,5}; 
		int [] b =reverse(a);
		for(int c : b)
		{
			System.out.println(c);
			System.out.println("hello " +  c);
			System.out.println(c);
			System.out.println("hello " +  c);
			System.out.println(c);
			System.out.println("hello " +  c);
		}
	}
}
