import java.util.HashSet;
import java.util.Set;



public class WordBreak {
	    public static boolean wordBreak(String s, Set<String> dict) {
	             return wordBreakHelper(s, dict, 0);
	    }
	 
	    public static boolean wordBreakHelper(String s, Set<String> dict, int start){
	        if(start == s.length()) 
	            return true;
	 
	        for(String a: dict){
	            int len = a.length();
	            int end = start+len;
	 
	            //end index should be <= string length
	            if(end > s.length()) 
	                continue;
	 
	            if(s.substring(start, start+len).equals(a))
	                if(wordBreakHelper(s, dict, start+len))
	                    return true;
	        }
	 
	        return false;
	    }
	    
	    
	    public static void main(String[] args) {
	    Set s = new HashSet();
	    s.add("ashwath");
	    s.add("am");
	    s.add("srir");
	    //s.add("");
	    s.add("one");
	    System.out.print(wordBreak("ashwathsriram",s));
	    }
	}

