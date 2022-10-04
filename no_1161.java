import java.util.*;
public class no_1161 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        switch(num1%2){
            case 0 :
                System.out.printf("짝수+");
                break;
            case 1 :
                System.out.printf("홀수+");
                break;
        }
        switch(num2%2){
            case 0 :
                System.out.printf("짝수=");
                break;
            case 1 :
                System.out.printf("홀수=");
                break;
        }
        switch((num1+num2)%2){
            case 0 :
                System.out.printf("짝수");
                break;
            case 1 :
                System.out.printf("홀수");
                break;
        }
    }
}

