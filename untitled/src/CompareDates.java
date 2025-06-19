import java.util.Calendar;
import java.util.Date;

public class CompareDates {

    public static  void main(String[] args){

        Date date1 = Calendar.getInstance().getTime();

        Calendar date = Calendar.getInstance();
    date.add(Calendar.DATE,-1);

        Date date2 = date.getTime();
        System.out.println("date is "+date1.getTime());
        System.out.println("date is "+date2.getTime());

        System.out.println("comparing dates "+date2.after(date1));
    }
}
