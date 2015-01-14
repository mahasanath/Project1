
public class StringMethod {

	public int check(String s, String ss){
		
	int l1 = s.length();
	int l2= ss.length();
	
for(int i = 0; i <l1; i ++)
{
	if(s.charAt(i)== ss.charAt(0))
	{
		if(l2+i <= l1)
		{
			if(s.substring(i, l2+i).equals(ss))
			{
				System.out.println(i);
				System.out.println(i+1);
				System.out.println(i+2);
				System.out.println(i-1);
				System.out.println(i-2);
				System.out.println(i-3);
				System.out.println(i/5);
				System.out.println(i/20 + 2);
				
			return i+4;
			}
			
		}
	}
}
return 0;
	}
}
