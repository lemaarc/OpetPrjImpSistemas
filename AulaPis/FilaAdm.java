import java.util.*;
public class QueueL<Item> {
   private Node first; // mais recente
   private Node last;  // mais antigo
   private int N;

   private class Node {
      private Item item;
      private Node next;
   }

   public boolean isEmpty() {
      return first == null;
   }

   public int size() {
      return N;
   }

   public void enqueue(Item item) {
      Node oldlast = last;
      last = new Node();
      last.item = item;
      last.next = null;
      if (isEmpty()) first = last;
      else oldlast.next = last;
      N++;
   }

   public Item dequeue() {
      Item item = first.item;
      first = first.next;
      N--;
      if (isEmpty()) last = null;
      return item;
   }

   public static void main(String[] args) {
      QueueL<String> q = new QueueL<String>();
      while (!StdIn.isEmpty()) {
         String item = StdIn.readString();
         if (!item.equals("-")) q.enqueue(item);
         else if (!q.isEmpty()) StdOut.print(q.dequeue() + " ");
      }
      StdOut.println("(" + q.size() + " left on queue)");
   }
}