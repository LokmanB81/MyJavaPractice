package day30_Immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();

        System.out.println(tarihSaat);

        System.out.println(tarihSaat.toString());

        System.out.println(tarihSaat.plusDays(100).plusMinutes(500));
        System.out.println(tarihSaat.minusDays(50).minusHours(15));
        System.out.println(tarihSaat.toLocalDate());
    }
}
