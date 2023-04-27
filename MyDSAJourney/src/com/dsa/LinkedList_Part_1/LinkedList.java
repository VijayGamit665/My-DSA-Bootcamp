package com.dsa.LinkedList_Part_1;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;

    public static int size;

    // Add First in LL
    public void addFirts(int data) {

        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 = newNode next = head
        newNode.next = head; // link

        // step3 = head = newNode
        head = newNode;
    }

    // // Add Last in LL
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print a LL

    public void print() {

        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // Add in the Middle of LL

    public void add(int idx, int data) {

        if (idx == 0) {
            addFirts(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {

        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {

        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size-2

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int itrSearch(int Key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == Key) {
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int helper(Node head, int Key) {

        if (head == null) {
            return -1;
        }
        if (head.data == Key) {
            return 0;
        }
        int idx = helper(head.next, Key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;

    }

    public int recSearch(int Key) {

        return helper(head, Key);

    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n) {
        // Calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next; // removeFirst
            return;
        }
        // Size-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while ((fast != null && fast.next != null)) {
            slow = slow.next;  // +1
            fast = fast.next.next;  // +2
        }

        return slow; // slow is my midNode
    }

    public boolean checkPelindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step1 - find mind
        Node midNode = findMid(head);

        // step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;    // right half head
        Node left = head;
        // step3 - check left half and right half

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next.next;
        }

        return true;
    }


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirts(1);
        ll.print();
        ll.addFirts(2);
        ll.print();
        ll.addLast(1);
        ll.print();
        ll.addLast(2);
//        ll.add(2, 3);
//        ll.print();
//        System.out.println("LL Size is = " + ll.size);

//        ll.removeFirst();
//        ll.print();
//
//        System.out.println("LL Size is = " + ll.size);
//
//        ll.removeLast();
//        ll.print();
//        System.out.println("LL Size is = " + ll.size);
//
//        System.out.println("itrSearch ="+ ll.itrSearch(3));
//        System.out.println("itrSearch ="+ ll.itrSearch(10));
//
//        System.out.println( "recSearch = "+ ll.recSearch(3));
//        System.out.println( "recSearch = "+ ll.recSearch(10));
//
//        ll.reverse();
//        ll.print();
//
//        ll.deleteNthfromEnd(2);
//        ll.print();

        ll.print();
        System.out.println(ll.checkPelindrome());
    }

}
