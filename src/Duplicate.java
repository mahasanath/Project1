
public class Duplicate {

	public static int[] findDup(int[]a)
	{
		int i = 0;
		int j = i +1;
		int count = 1;
		int len = a.length;
		//System.out.println(len);
		//int [] b = new int[a.length];
		while(i< len && j < len)
		{
			if(a[i] == a[j])
			{
				//System.out.println(a[i]);
				//System.out.println(a[j]);
				j++;
				count++;
			 if(a[j]!=a[j-1] && j<len)
				{
				 //System.out.println(a[j]);
				 //for(int m =0;m<count;m++)
				  //{
				 	 //System.out.println(i);
				  //}
					for(int k = i+1;k < (len-count + 1);k++)
					{
						a[k]=a[k+ count - 1];
						//System.out.println(a[k]);
					}
					len = len - count + 1;
					
					//System.out.println(a[i]);
					//System.out.println(a[j]);
					i = 0;
					j = i +1;
					count =1;
					//System.out.println("\n");
				}
			}
			else
			{
				//for(int k = 0;k<len-2;k++)
				//{
				//	a[k]=a[k+2];
				//}
				//len = len -2;
				i++;
				j=i+1;
				
			}
		}
		//System.out.println(len);
		for (int i1 =0;i1 < len;i1++)
			System.out.println(a[i1]);
		return a;
	
	}

public static void main(String[] args)
{
	int [] a = {1,1,1,2,3,3,4,5};
	//int [] c = {1,2,3,4,5,6};
	//int [] b = {1,1,1,1,1,1,1};
	int [] re1 = findDup(a);
	//int [] re2 = findDup(b);
	//int [] re3 = findDup(c);
	//for(int i : re1)
	//System.out.println(i);
	//System.out.println(re2);
	//System.out.println(re3);
}
}
