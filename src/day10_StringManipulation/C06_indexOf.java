package day10_StringManipulation;

public class C06_indexOf {

    public static void main(String[] args) {


        String str="Hava bugun cok guzel";
            if(str.contains(" ")){
        int i=str.indexOf(" ");
        System.out.println(i);
            String str1=str.substring(0,i);
           // String str2=
                System.out.println(str1);}
            else System.out.println("yok");
       // System.out.println(str.indexOf(" "));
        //System.out.println(str.indexOf('u'));
       // System.out.println(str.indexOf('t'));// bize -1 dondurur,aranan degerin
                                            // str de olmadıgını gosterir


       /* String str5="djdjgoglşmsdişeoınmv.çcöböşsl";
        if(str5.indexOf("ş")==-1){
            System.out.println("istenen deger yok");
        }
        else{
            System.out.println("istenen deger var");
        }
        System.out.println(str5.lastIndexOf("ö"));
        System.out.println(str5.charAt(str5.length()-1));*/
         }
}
