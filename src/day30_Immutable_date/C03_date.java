package day30_Immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_date {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();

        System.out.println("bugunun tarihi : "+tarih);
        System.out.println("Bugun yilin "+tarih.getDayOfYear()+". gunu");
        System.out.println("yil : "+tarih.getYear());
        System.out.println("haftanin "+tarih.getDayOfWeek()+" gunu");
        System.out.println("yilin "+tarih.getMonthValue()+". ayi");
        System.out.println("Bu yil artik yil mi ? "+tarih.isLeapYear()); // artik yil mi?

        LocalDate tarih2=LocalDate.of(1990,9,1);
        System.out.println(tarih2);

        LocalDate tarih3=LocalDate.of(1980, Month.SEPTEMBER,1);
        System.out.println(tarih3);

        System.out.println(tarih.plusDays(100));
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));

        System.out.println(tarih.minusWeeks(20));
        System.out.println(tarih.minusDays(100).minusMonths(5));

        System.out.println(tarih.isAfter(tarih2));

        /*
        iki farkli dogum gunu girildiginde hangisinde
        daha buyuk oldugunu bulunuz
        tarih2 ve tarih3 icin bunu yapalim
         */
        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3+" tarihinde dogan daha buyuktur");
        }
        else if(tarih2.isBefore(tarih3)){
            System.out.println(tarih2+" tarihinde dogan daha buyuktur");
        }
        else{
            System.out.println("ayni gun dogmuslar");
        }

    }
}
