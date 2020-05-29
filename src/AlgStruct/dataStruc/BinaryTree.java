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
                    focusNode = focusNode.leftNode;
                    if (focusNode==null){
                        parent.leftNode=newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightNode;
                    if (focusNode == null){
                        parent.rightNode = newNode;
                        return;
                    }
                }
            }

        }
    }

    private class Node {
        Node leftNode;
        Node rightNode;
        int value;

        Node(int value){
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node value is "+value;
        }
    }
}
