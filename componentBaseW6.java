/**
 * componentBaseW6
 */
import java.util.Scanner;
public class componentBaseW6 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String score = "";
        BoundProperty mySource = new BoundProperty();
        Person listener1 = new Person();
        Person listener2 = new Person();
        mySource.addPropertyChangeListener(listener1);
        mySource.addPropertyChangeListener(listener2);
        
        while(true){
            System.out.println("Please Enter Score.");
            score = sc.nextLine();
            mySource.setValue(score);
            if(score.equals("")){
                break;
            }
        }

       
     
       
    }
}