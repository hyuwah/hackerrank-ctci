/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {

    /** Mulai coding disini */

    // bikin variable hasil, set ke false dulu
    boolean result = false;
  
    if(head == null) result = false; // kalo list empty / head==null, return false
    else {
        // kalo list ga empty
        // bikin object node yang merupakan bagian selanjutnya dari head
        Node current = head.next;
        // Bikin daftar node
        List<Node> nodeList = new ArrayList<Node>();
        // tambah si head ke daftar
        nodeList.add(head);
        
        // loop untuk telusur sampe ke node terakhir
        while(current != null){
            //System.out.println(current);
            
            // kalo node yang sekarang udah ada di daftar node -> cycle detected -> keluar
            if(nodeList.contains(current)){
                // kalo cycle detected return true
                result = true;
                break;                    
            }
            // kalo pengkondisian diatas ga kena berarti ga ada cycle di linkedlistnya, means return false
            
            // kalo belum ada tambahin ke daftar
            nodeList.add(current);
            // telusur lagi ke node selanjutnya
            current = current.next;   
        }
    }
    return result;

    /** Akhir coding disini */
    
}
