package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class testes {
    public static void main(String[] args) throws ParseException {

        Date now1 = new Date();
        SimpleDateFormat sfd1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sfd2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sfd1.parse("04/06/2023");
        Date y2 = sfd1.parse("04/06/2023 20:45:03");

        System.out.println(sfd2.format(now1));
        System.out.println(sfd1.format(y1));
        System.out.println(sfd2.format(y2));

    }
}
