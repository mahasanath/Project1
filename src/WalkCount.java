
public class WalkCount {

	public static int countwalks(int graph[][], int u, int v, int k)
	{
	   // Base cases
	   if (k == 0 && u == v)      return 1;
	   if (k == 1 && graph[u][v]==1) return 1;
	   if (k <= 0)                return 0;
	 
	   // Initialize result
	   int count = 0;
	 
	   // Go to all adjacents of u and recur
	   for (int i = 0; i < 4; i++)
	       if (graph[u][i]==1)  // Check if is adjacent of u
	           count += countwalks(graph, i, v, k-1);
	 
	   return count;
	}
	
public static void main (String args[])
	{
	
	 int graph[][] = { {0, 1, 0, 1},
             		   {1, 1, 0, 1},
                       {1, 0, 0, 1},
                       {0, 1, 0, 1}
                     };
	 int u = 0;
	 int v = 3; 
	 int k = 2;
	 System.out.println(countwalks(graph, u, v, k));
	}
}