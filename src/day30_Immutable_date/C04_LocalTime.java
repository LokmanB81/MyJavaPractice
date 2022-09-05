package day30_Immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException{

        LocalTime time1=LocalTime.now();
        System.out.println(time1);
/*
bizim olusturugumuz date ve time canli tarih ve saat degildir.
LocalTime.now(); kullandigimiz satirda o anki tarih veya saati alip
bizim variable imiza store eder...
time variable in degeri SABİTTİR...

 */
        Thread.sleep(3000);

        time1=LocalTime.now();
        System.out.println(time1);

        System.out.println(time1.getSecond());

        System.out.println(time1.plusSeconds(10000));

        System.out.println(time1.minusMinutes(350));
        System.out.println(time1.withHour(3));

    }
}
