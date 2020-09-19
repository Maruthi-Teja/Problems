class Solution 
{
    static Boolean isCycle(int ch, int parent, int visited[] , ArrayList<ArrayList<Integer> > graph)
    { 
        visited[ch] = 1; 
        Integer i; 
        Iterator<Integer> it = graph.get(ch).iterator(); 
        while (it.hasNext()) 
        { 
            i = it.next(); 
            if (visited[i]==0) 
            { 
                if (isCycle(i, ch, visited, graph)) 
                    return true; 
            } 
            else if (i != parent) 
                return true; 
        } 
        return false; 
    } 

    static Boolean isTree(int n, int m, int a[][])
    {
        ArrayList<ArrayList<Integer> > graph  = new ArrayList<ArrayList<Integer> >(n); 
          
        for (int i = 0; i < n; i++) 
            graph.add(new ArrayList<Integer>()); 

        for (int i=0; i<m ; i++ ) {
            int u = a[i][0]-1;
            int v = a[i][1]-1;
            graph.get(u).add(v); 
            graph.get(v).add(u);
        }

        int visited[] = new int[n];
        for(int i=0;i<n;i++)
            visited[i] = 0;

        if(isCycle(0, -1, visited, graph))
            return false;

        for(int i=0;i<n;i++)
            if(visited[i]==0)
                return false;

        return true;
    }
} 
