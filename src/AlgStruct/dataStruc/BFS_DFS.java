package AlgStruct.dataStruc;

import java.util.*;

public class BFS_DFS {
    List<Integer> res = new ArrayList<>();
    enum DFS{
        postOrder,
        inOrder,
        preOrder
    }

    public List<List<Integer>> BFS(Node root) {

        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean order = true;
        int size = 1;
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i<size;i++){
                Node n = q.poll();
                if(order){
                    temp.add(n.value);
                } else {
                    temp.add(0,n.value);
                }
                if (n.left!=null){
                    q.add(n.left);
                }
                if (n.right!=null){
                    q.add(n.right);
                }
            }
            res.add(temp);
            size = q.size();
            order = !order;
        }
        return res;
    }

    public List<Integer> DFS(Node root,DFS dfsType) {
        switch (dfsType){
            case preOrder:
                if(root==null) return null;
                res.add(root.value);
                DFS(root.left,DFS.preOrder);
                DFS(root.right,DFS.preOrder);
                break;
            case inOrder:
                if(root==null) return null;
                DFS(root.left,DFS.inOrder);
                res.add(root.value);
                DFS(root.right,DFS.inOrder);
                break;
            case postOrder:
                if(root==null) return null;
                DFS(root.left,DFS.postOrder);
                DFS(root.right,DFS.postOrder);
                res.add(root.value);
                break;
        }
        return res;
    }

    public List<Integer> DFS(Node root) {   //iterative
        List<Integer> list = new ArrayList<Integer>();

        Stack<Node> stack = new Stack<>();
        Node cur = root;

        while(cur!=null || !stack.empty()){
            while(cur!=null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.value);
            cur = cur.right;
        }

        return list;
    }




    public static void printTree(){
        System.out.println("    3    ");
        System.out.print("   / ");
        System.out.println("\\  ");
        System.out.println("  9   20");
        System.out.print("     /  ");
        System.out.println("\\");
        System.out.println("    15   7");
    }


    public static void main(String[] args) {
        printTree();
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        BFS_DFS bd = new BFS_DFS();
        for(List<Integer>i:bd.BFS(root)){
            System.out.println(i);
        }


        System.out.println(bd.DFS(root,DFS.preOrder));


    }
}
