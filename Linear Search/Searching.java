import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the searched value: ");
        int j = input.nextInt();
        int[] arr = {1,22,51521,5411,888};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == j){
                System.out.println(i);
            }
            else{
                System.out.println("No index found");
            }
        }
    }
}
