/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) 
    {
        if (node==null)
        {
            return null;
        }
        HashMap<Node,Node> visited=new HashMap<>();
        return clonehelper(node,visited);
    }
    public Node clonehelper(Node node, HashMap<Node, Node> visited)
    {
        Node clone=new Node(node.val);
        visited.put(node,clone);
        for(Node n:node.neighbors)
        {
            if(visited.containsKey(n))
            {
                clone.neighbors.add(visited.get(n));
            }
            else
            {
                Node neighborclone =clonehelper(n,visited);
                clone.neighbors.add(neighborclone);
            }
        }
        return clone;
    }
}