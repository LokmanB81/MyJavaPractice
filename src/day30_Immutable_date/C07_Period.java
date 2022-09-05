package day30_Immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        /*
        iki tarih arasindaki sureyi bulma
         */
        LocalDate tarih1=LocalDate.of(1980,9,1);
        LocalDate bugun=LocalDate.now();

        Period period=Period.between(tarih1,bugun);
        System.out.println(period);
        // period=Period.between(bugun,tarih1);
       // System.out.println(period);
        System.out.println(period.getYears()+" "+period.getMonths()+
                " "+period.getDays());

        System.out.println(period.toTotalMonths());


    }
}
