package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Using {
    public static void main(String []agrs){
        LocalDateTime anydata = LocalDateTime.now();

        System.out.println(anydata);
        System.out.println(anydata.minus(10, ChronoUnit.CENTURIES.HOURS));
    }
}
