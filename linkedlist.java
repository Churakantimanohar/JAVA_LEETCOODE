
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class linkedlist {

    // Method to rearrange the linked list nodes in odd-even manner
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode p = head;
        ListNode temp = p.next;
        ListNode head2 = p.next;
        ListNode c = head;
        int count = 1;

        // Count the total number of nodes in the linked list
        while (c.next != null) {
            count++;
            c = c.next;
        }

        ListNode prev = null;
        // Rearranging nodes
        while (p.next != null) {
            p.next = temp.next;
            prev = p;
            p = temp;
            temp = temp.next;
        }

        // Connect the last node of odd-indexed list to the head of even-indexed list
        if (count % 2 == 0) {
            prev.next = head2;
        } else {
            p.next = head2;
        }

        return head;
    }

    // Function to print the linked list
    public void pvsm(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main function to test the solution
    public static void main(String[] args) {
        linkedlist solution = new linkedlist();

        // Example linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        solution.pvsm(head);

        ListNode result = solution.oddEvenList(head);

        System.out.println("Odd-Even List:");
        solution.pvsm(result);
    }
}
