import java.util.Scanner;

/*
 *@Author Emircan Aktaş - 26.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, total = 0;

        do {
            System.out.print("Enter a number :");
            number = inp.nextInt();
            if(number % 2 == 1){
                break;
            }else if (number % 4 == 0){
                total += number;
            }

        }while(number > 0);
        System.out.println("Total :"+total);

    }
}