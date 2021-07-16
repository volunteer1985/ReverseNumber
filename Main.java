public class Main {
    public static long reverseNum(long num){
        if (num < -2_147_483_648 || num > 2_147_483_647 || num == 0){
            return 0;
        } else {
           long initNum = num;
           long revNum = 0;
           long reversator = 0;
           while (initNum != 0){
               reversator = initNum % 10;
               revNum = revNum * 10 + reversator;
               initNum /= 10;
           }


            return revNum;
        }

    }

    public static void main(String[] args) {
        System.out.println(reverseNum(123456789000L));
    }
}
