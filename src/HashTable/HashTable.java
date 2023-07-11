package HashTable;

import java.util.ArrayList;
import java.util.Objects;

public class HashTable {

    private int size = 7;
    private Node[] dataMap;

    public HashTable(){
        dataMap = new Node[size];
    }

    public class Node{
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value){
            this.key = key;
            this.value = value;

        }
    }

    private int hash(String key){
        int hash = 0;
        char[] charArray = key.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            int asciiValue = charArray[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public void printValue(){
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];

            while(temp != null) {
                System.out.println("    {" + temp.key + " = " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        if(dataMap[index] == null){
            dataMap[index] = newNode;
        }else{
            Node temp = dataMap[index];
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    public int get(String key){
        int index = hash(key);
        int value = 0;
        Node temp = dataMap[index];
        while (temp != null){
            if (Objects.equals(temp.key, key))
                value = temp.value;
            temp = temp.next;
        }
        return value;
    }

    public ArrayList<String> keys(){
        ArrayList<String> allKeys = new ArrayList<>();

        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null){
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }
}
