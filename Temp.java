import org.apache.commons.collections.list.TreeList;

import java.util.*;

/**
 * @author chopra
 * 09/03/18
 */

public class Temp {

    class A implements Comparable{
        /*
            1. Using implement comparable
            2. creating a comparator

            class Checker implements Comparator<Temp.A>
            {
                @Override
                public int compare(Temp.A o1, Temp.A o2) {
                    if (o1.getI() < o2.getI()){
                        return 1;
                    }
                    else return 0;
                }
            }

         */

        public A() {
        }

        public A(Integer i, Character ch) {
            this.i = i;
            this.ch = ch;
        }

        private Integer i;
        private Character ch;

        public Integer getI() {
            return i;
        }

        public void setI(Integer i) {
            this.i = i;
        }

        public Character getCh() {
            return ch;
        }

        public void setCh(Character ch) {
            this.ch = ch;
        }

        @Override
        public String toString() {
            return "A{" +
                    "i=" + i +
                    ", ch=" + ch +
                    '}';
        }

        @Override
        public int compareTo(Object o) {
            if (o == null)
                return 0;
            A a = (A)o;
            if (this.i<a.i)
                return -1;
            else if (this.i > a.i)
                return 1;
            else return 0;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            A a = (A) o;

            if (i != null ? !i.equals(a.i) : a.i != null) return false;
            return ch != null ? ch.equals(a.ch) : a.ch == null;
        }

        @Override
        public int hashCode() {
            int result = i != null ? i.hashCode() : 0;
            result = 31 * result + (ch != null ? ch.hashCode() : 0);
            return result;
        }
    }

    void arrayListTemp(){

        List<String> list = new ArrayList<>();
        list.add("amit");
        list.add("chopra");
        list.add("amit");

        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.lastIndexOf("amit"));

        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println((String) it.next());
        }
    }

    void immutableTemp(){
        // Primitive Wrappers are immutable such as Integer, Douuble, Boolean

        List<String> lst = new ArrayList<String>();
        lst.add("alpha");
        lst.add("beta");
        lst.add("charlie");


        System.out.println(lst);   // [alpha, beta, charlie]

        for (String str : lst) {
            str += "1!";   // cannot modify "immutable" objects
        }
        System.out.println(lst);   // [alpha, beta, charlie]

    }


    void listTemp(){

        // 1. array list

        List<Integer> listArrayList = new ArrayList<>();
        listArrayList.add(1);
        listArrayList.add(2);
        listArrayList.add(3);
        listArrayList.add(3);

        System.out.println(listArrayList);

        // 2. linked list

        List<Integer> listLinkedList = new LinkedList<>();
        listLinkedList.add(1);
        listLinkedList.add(3);
        listLinkedList.add(5);
        listLinkedList.add(1);
        listLinkedList.add(3);
        listLinkedList.add(5);

        System.out.println(listLinkedList);

        // 3. Vector Sync Legacy

        List<Integer> listVector = new Vector<>();
        listVector.add(1);
        listVector.add(2);
        listVector.add(3);

        System.out.println(listVector);


        // 4. Stack

        List<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(4);

        System.out.println(stack);

    }

    void stackTemp(){

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(4);

        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push(6);
        System.out.println(stack.peek());

    }

    void dequeueTemp(){
        Deque<Integer> deque  = new ArrayDeque<>();
        deque.addLast(1);
        deque.addFirst(0);
        deque.addLast(2);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }

    void queueTemp() {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue);


        // Min Heap
        // PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(12);
        pq.add(15);
        pq.add(2);

        System.out.println(pq);

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        // Max Heap

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        pq1.add(10);
        pq1.add(5);
        pq1.add(12);
        pq1.add(15);
        pq1.add(2);

        System.out.println(pq1);

        while (!pq.isEmpty()){
            System.out.println(pq1.poll());
        }


        // max heap
        PriorityQueue<A> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        A a = new A();
        a.setI(10);
        a.setCh('B');

        A a1 = new A();
        a1.setI(12);
        a1.setCh('D');

        A a2 = new A();
        a2.setI(1);
        a2.setCh('E');

        A a3 = new A();
        a3.setI(15);
        a3.setCh('A');

        priorityQueue.add(a);
        priorityQueue.add(a1);
        priorityQueue.add(a2);
        priorityQueue.add(a3);

        System.out.println(priorityQueue);

        while (!priorityQueue.isEmpty()){
            A a5 = priorityQueue.peek();
            System.out.println(a5.getI() +" - "+ a5.getCh());
            priorityQueue.poll();
        }
    }

    void setTemp(){

        // using hash Set

        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(2);

        System.out.println(s1);
        for (Integer i:s1){
            System.out.println(i);
        }

        // using Linked hash Set maintaining insertion order

        Set<Integer> s2 = new LinkedHashSet<>();
        s2.add(10);
        s2.add(2);
        s2.add(9);
        s2.add(3);
        s2.add(3);

        System.out.println(s2);
        for (Integer i:s2){
            System.out.println(i);
        }

        // using Tree Set maintaing order sorting in reverse order

        Set<Integer> s3 = new TreeSet<>(Collections.reverseOrder());
        s3.add(10);
        s3.add(2);
        s3.add(9);
        s3.add(3);
        s3.add(3);

        System.out.println(s3);
        for (Integer i:s3){
            System.out.println(i);
        }

        Set<A> s4 = new TreeSet<>();
        s4.add(new A(10,'A'));
        s4.add(new A(10,'A'));
        s4.add(new A(12,'B'));
        s4.add(new A(12,'C'));
        s4.add(new A(9,'A'));
        s4.add(new A(8,'A'));

        for (A a: s4){
            System.out.println(a.getI() + " - "+ a.getCh());
        }
    }

    void mapTemp(){

    }



    public static void main(String[] args) {
        Temp t = new Temp();
//        t.arrayListTemp();
//        t.immutableTemp();
//        t.listTemp();
//        t.stackTemp();
//        t.dequeueTemp();
//        t.queueTemp();
        t.setTemp();
    }
}

