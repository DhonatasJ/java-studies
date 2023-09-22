package time;

import java.time.LocalDateTime;

public class allszone {
    public static void main(String []args){

          LocalDateTime anyt = LocalDateTime.now();

//        System.out.println("DIA MES " + anyt.getDayOfMonth());
//        System.out.println("DIA ANO " + anyt.getDayOfYear());
//        System.out.println("DIA SEMANA " + anyt.getDayOfWeek());
//
//        System.out.println("MES " + anyt.getMonthValue());
//        System.out.println("MES " + anyt.getMonth());
//
//        System.out.println("ANO " + anyt.getYear());

            LocalDateTime time = anyt.minusMinutes(7);
            LocalDateTime pastHourInstant = anyt.minusHours(12);
            System.out.println(anyt);
            System.out.println(time);
    }
}
