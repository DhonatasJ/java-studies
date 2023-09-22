package time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Calendear {
    public static void main(String []args){

        Date dt1 = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println(sdf.format(dt1));

        Calendar cal = Calendar.getInstance();
        cal.setTime(dt1);
        cal.add(Calendar.HOUR_OF_DAY, 3);

        System.out.println(sdf.format(cal.getTime()));
    }



}
