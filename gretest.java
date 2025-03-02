
import java.util.Scanner;



public class gretest {
  public static void main(String[] args) {
    


    Scanner obj = new Scanner(System.in);
    System.out.print("Enter number of inputs: ");
    int num_of_inputs = obj.nextInt();
    System.out.print("Enter 1st number  ");
    int first_number=obj.nextInt();
    int gretest_number= first_number;
    for(int i =2;i<=num_of_inputs;i++){
        System.out.print("Enter "+i+"number  ");
       int new_inputs = obj.nextInt();
       if(new_inputs > gretest_number){
        gretest_number = new_inputs;
       }

    }
    System.out.println("greatest number is " + gretest_number);

  }
}
