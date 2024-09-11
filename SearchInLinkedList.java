import java .util.*;

import javax.print.DocFlavor.INPUT_STREAM;

public class SearchInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();

        //add elements to the linked list

        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(2);   
        linkedList.add(4);

        //display the linkedlist
        System.out.println("Linke list "+linkedList);

        //Search for the number and display its index;
        int searchElement =9;
        int index= searchInLinkedList(linkedList,searchElement);

        if(index !=-1){
           System.out.println(searchElement+ "found at index "+index);

        }else{
            System.out.println(searchElement+"not found");
        }
        
    }
    public static int searchInLinkedList(LinkedList<Integer> linkedList,int target){
        for(int i=0;i < linkedList.size();i++){
            if(linkedList.get(i)==target){
                return i;//return the index if the element is founrd
            }
        }
        return -1;
    }
}