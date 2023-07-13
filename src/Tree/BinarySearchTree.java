package Tree;

public class BinarySearchTree {

    Node root;
    public class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    public boolean insert(int value){
        Node newNode = new Node(value);
        if(root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;

        while(true){
            if(temp.value == newNode.value) return false;
            if(temp.value < newNode.value){
                if(temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }else{
                if(temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
        }
    }

    public boolean contains(int value){
        if(root == null) return false;
        Node temp = root;

        while (temp != null){

            if(temp.value == value) return true;
            else if(temp.value > value)
                temp = temp.left;
            else
                temp = temp.right;
        }
        return false;
    }
}
