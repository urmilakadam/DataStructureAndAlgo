package HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        hashTable.set("urmila", 1);
        hashTable.set("rohit", 2);
        hashTable.set("summit", 3);
        hashTable.set("neils", 6);
        hashTable.set("micheal", 8);

       hashTable.printValue();

        System.out.println("Value:" + hashTable.get("urmila"));
        System.out.println("Value:" + hashTable.get("tiles"));
        System.out.println("Keys:" + hashTable.keys());

        hashTable.keys().stream().forEach(System.out::println);
    }
}
