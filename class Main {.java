class Main 
{
 public static void main(String.args[]){

 int arr[]={2,2,4,5,5,5,5,6,6,5};
   int  count =0;
   int cand =0;
    for(int i=0; i<= arr.length; i++){
      If(count == 0){
      cand=arr[i];
    }
    if(cand==arr[i]){
    count++;
    }else{
    count--;
    }
    }
    Return cand;
    }   
}
