public class bank_step2 {
    public static void main(String[] args){

        int refund = 25000;
        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;

        System.out.printf("50000원:%d, 나머지:%d\n",refund / curr50000, refund % curr50000);
        refund = refund % 50000; // modulo 나머지 mod %
        System.out.printf("10000원:%d, 나머지:%d\n",refund / curr10000, refund % curr10000);
        refund = refund % 10000;
        System.out.printf("5000원:%d, 나머지:%d\n",refund / curr5000, refund % curr5000);
        refund = refund % 5000;
        System.out.printf("1000원:%d, 나머지:%d\n",refund / curr1000, refund % curr1000);
        refund = refund % 1000;
        System.out.printf("500원:%d, 나머지:%d\n",refund / curr500, refund % curr500);
        refund = refund % 500;
        System.out.printf("100원:%d, 나머지:%d\n",refund / curr100, refund % curr100);
        refund = refund % 100;
        System.out.printf("50원:%d, 나머지:%d\n",refund / curr50, refund % curr50);
        refund = refund % 50;


    }
}
