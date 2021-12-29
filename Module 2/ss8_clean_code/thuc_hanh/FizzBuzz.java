package ss8_clean_code.thuc_hanh;

public class FizzBuzz implements StringFizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if(isFizz && isBuzz)
            return FIZZ_BUZZ;

        if(isFizz)
            return FIZZ;

        if(isBuzz)
            return BUZZ;

        return number + "";
    }
}
