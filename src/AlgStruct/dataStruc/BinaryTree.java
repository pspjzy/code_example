package AlgStruct.dataStruc;

import java.util.LinkedList;

public class BinaryTree {
    Node root;

    public void addNode(int value){

        Node newNode = new Node(value);

        if (root==null){
            root=newNode;
        } else {
            Node focusNode = root;

            Node parent;

            while (true){
                parent = focusNode;

                if (value<focusNode.value){
                    focusNode = focusNode.left;
                    if (focusNode==null){
                        parent.left=newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.right;
                    if (focusNode == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }

        }
    }
}

 class Node {
    Node left;
    Node right;
    int value;

    Node(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node value is "+value;
    }
}
