package com.example.adsassignment2;

public class Demo {
    public static void main(String[] args) {
        MyList<Integer> al = new MyArrayList<>();
        al.add(10); al.add(20); al.add(30);
        for (int x : al) System.out.print(x + " ");
        System.out.println("\n" + al.remove(1) + " removed");

        MyList<String> ll = new MyLinkedList<>();
        ll.add("A"); ll.add("B"); ll.add("C");
        for (String s : ll) System.out.print(s + " ");
        System.out.println("\n" + ll.remove(0) + " removed");

        MyStack<Integer> st = new MyStack<>();
        st.push(1); st.push(2); System.out.println("\npop: " + st.pop());

        MyQueue<String> q = new MyQueue<>();
        q.enqueue("X"); q.enqueue("Y"); System.out.println("dequeue: " + q.dequeue());

        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.add(5); heap.add(2); heap.add(8);
        System.out.println("min: " + heap.peek());
    }
}
