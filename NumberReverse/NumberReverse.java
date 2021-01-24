import java.util.Scanner;

public class NumberReverse {

    public static void main(String[] args) {

        int userInput,reverse=0;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        userInput=scanner.nextInt();

        while(userInput!=0){

            //gets the last digit of userInput and
            //adds as current reverse numbers last digit
            reverse=reverse*10 + userInput%10;

            //omits the last digit
            userInput=userInput/10;
        }

        System.out.println("Reverse of number provided: "+reverse);

    }
}
