public class Frequency {
    public static void main(String[] args) {
        String c = "trreee11e";
        frequency(c);
            }
        
            private static void frequency(String c) {
                // TODO Auto-generated method stub
                //throw new UnsupportedOperationException("Unimplemented method 'frequency'");
                int arr[] = new int[125];
                for(char i: c.toCharArray()){
                    arr[i]++;
                }
                for(int i=0;i<arr.length;i++){
                    if(arr[i] == 1){
                       // System.out.print((char)i+" is "+ arr[i]+",");
                       System.out.print((char)i);
                        }else if(arr[i]>1){
                            for(int j=0;j<arr[i];j++){
                                System.out.print((char)i);
                        }
                        //System.out.println(" is "+arr[i]);
                    }
                }



            }
}
