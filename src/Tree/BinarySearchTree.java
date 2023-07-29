package Tree;

public class BinarySearchTree {

    Node root;
    public static class Node{
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

    //recursive call for contains method.
    private boolean rContains(Node currentNode, int value){
        if(currentNode == null) return false;
        if(currentNode.value == value) return true;
        else if(currentNode.value > value) return rContains(currentNode.left, value);
        else return rContains(currentNode.right, value);
    }

    public boolean rContains(int value){
        return rContains(root, value);
    }

    //recursive call for insert method.
    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null) return new Node(value);

        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert(int value){
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }
}
