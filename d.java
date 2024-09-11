import java.util.*;
class d {
    public static void main(String args[]){
   
    int arr[]={2,2,5,5,5,6,5};
    int cand =0;
     int  count =0;
     
       for(int i=0; i< 7; i++){
         if(count == 0){
         cand=arr[i];
       }
       if(cand==arr[i]){
       count++;
       }else{
       count--;
       }
       }
       System.out.println(cand);
       }   
   }
   
