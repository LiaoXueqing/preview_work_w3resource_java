package DateTime;

import java.util.Calendar;

public class DateTime_6 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("current time : " + cal.get(Calendar.YEAR)+"/"+(cal.get(Calendar.MONTH)+1)+"/"+
                cal.get(Calendar.DATE)+" "+cal.get(Calendar.HOUR_OF_DAY) + ":" +
                cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
    }
}
