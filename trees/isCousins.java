//Given a function followed by parameters Head of the tree,Two nodes which are 'a' and 'b' ,we should determine wheather this two nodes are cousins are not

HashMap<Integer,Integer> depth // to store the depth of each node
HashMap<Integer,Node> parent // to store the parent of each node
public boolean isCousins(Node head,int a, int b)
{
depth = new HashMap<>();
parent = new HashMap<>();
dfs(head,null);
return (depth.get(a) == depth.get(b) && parent.get(a) != parent.get(b));
}
public void dfs(Node root,Node par)
{
if(node!=null)
{
depth.put(root.data, par!=null? 1+ depth.get(par) : 0);
parent.put(root.data,par);
dfs(root.left,root);
dfs(root.right,root);
}
}
