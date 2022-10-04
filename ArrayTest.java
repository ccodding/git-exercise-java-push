public class ArrayTest {
    public static void main(String[] args){

        System.out.println("hello");// alt + shift + f10 == Run - run...
        //10칸의 int array를 만들고
        //1부터 10까지 채우기
        //그리고 console에 출력

        int[] ArrayTest = new int[10];
        for(int i = 0; i < 10; i++ ){
            ArrayTest[i] = i+1;
            System.out.printf("%d ", ArrayTest[i]);

        }
    }
}
