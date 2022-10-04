import java.util.*;
public class bank {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for(int i=0; i < arr.length; i++){
            if(i > 0){
                System.out.printf(arr[i] + "원: %d\n", (money%arr[i-1])/arr[i]);
            }
            else{
                System.out.printf(arr[i] + "원: %d\n", money/arr[i]);
            }
        }
        System.out.println();







    }
}
