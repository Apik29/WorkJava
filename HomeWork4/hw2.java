package HomeWork4;

public class hw2 {
    public static void main(String[] args) {
    ListQueue queue = new ListQueue();
    for (int i = 0; i < 10; i++) {
        queue.enqueue(i);
    }    
    System.out.println(queue.toStr());
    System.out.println(queue.dequeue());
    System.out.println(queue.first()); 
    }
}
  