import java.util.ArrayList;
import java.util.HashMap;


public class StringRep {

	
	public static String replace(String str)
	{
		int start = 0; int end = str.length()-1;
		HashMap m = new HashMap();
		ArrayList l = new ArrayList();
	StringBuilder r = new StringBuilder(str);
	StringBuilder u = new StringBuilder();
	
		for(start = 0; start <end; start++, end--)
		{
			char temp = r.charAt(start);
			r.setCharAt(start, r.charAt(end));
			r.setCharAt(end, temp);
		}
		for(int i = 0;i <r.length();i++)
		{
			if(m.containsKey(r.charAt(i)))
			{
				l.add(r.charAt(i));
			}
			else
				m.put(r.charAt(i), 1);
		}
			for(int j = 0; j < r.length();j++)
			{
				if(!l.contains(r.charAt(j)) || l.isEmpty())
				{
					u.append(r.charAt(j));
				}
				else if(!l.isEmpty()&& l.contains(r.charAt(j)))
				{
					l.remove(l.indexOf((r.charAt(j))));
			}
			
		}
			String k = u.toString();
			System.out.println(k);
			return k;
		
	}
	public static void main(String []args)
	{
		replace("arpittpit");
	}
	
}
