public class Circular {
    static class DoubleLinkedList {
        //kelas node untuk doublelinked list
        class Node{
            int item;
            Node previous;
            Node next;

            public Node(int item) {
                this.item = item;
            }
        }
        //awalnya head dan tail di set ke NULL
        Node head, tail = null;

        //menambahkan node ke list
        public void addNode(int item) {
            //membuat sebuahh node baru
            Node newNode = new Node(item);

            //jika list nya kosong,maka head dan tail nya akan menunjuk ke node terbaru
            if(head == null) {
                head = tail = newNode;
                //head sebelumnya akan menjadi NULL
                head.previous = null;
                //tail berikutnya akan menjadi NULL
                tail.next = null;
            }
            else {
                //menambahkan node baru ke akhir list dan tail di stel berikutnya ke node yang terbaru
                tail.next = newNode;
                //node baru mengulang ke set tail
                newNode.previous = tail;
                //dan node baru menjadi tail terbaru
                tail = newNode;
                //titik tail selanjutnya menjadi NULL terbaru
                tail.next = null;
            }
        }

        //memunculkan semua node dari daftar double linked list
        public void printNodes() {
            //node tersebut akan mengarah ke head
            Node current = head;
            if(head == null) {
                System.out.println("Doubly linked list is empty");
                return;
            }
            System.out.println("Nodes of doubly linked list: ");
            while(current != null) {
                //dan setiap node akan berlanjut seperti itu
                System.out.print(current.item + " ");
                current = current.next;
            }
        }
    }
    class Main{
        public static void main(String[] args) {
            //membuat sebuah objeck baru dari double linked list
            DoubleLinkedList dl_List = new DoubleLinkedList();
            //menambahkan node ke list
            dl_List.addNode(10);
            dl_List.addNode(20);
            dl_List.addNode(30);
            dl_List.addNode(40);
            dl_List.addNode(50);

            //mencetak node dari double linked list
            dl_List.printNodes();
        }
    }
}
