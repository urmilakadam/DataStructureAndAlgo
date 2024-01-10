package Heap;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(99);
        heap.insert(72);
        heap.insert(61);
        heap.insert(58);
        System.out.println(heap.getHeap()); //[99, 72, 61, 58]

        heap.insert(100);
        System.out.println(heap.getHeap()); //[100, 99, 61, 58, 72]

        heap.remove();
        System.out.println(heap.getHeap()); //[99, 72, 61, 58]

        heap.remove();
        System.out.println(heap.getHeap()); //[72, 58, 61]
    }
}
