import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {

        int month,day;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your Birthday :");
        day = input.nextInt();

        System.out.println("Please enter your Birthmonth ");
        month = input.nextInt();


        if( ((day>20)&&(month==3))||((day<21)&&(month == 4))) {
            System.out.println("Your horoscope is KOÇ ");
        }else if (((day>=20)&&(month==4))||((day<22)&&(month == 5))){
            System.out.println("Your horoscope is BOĞA ");
        }else if (((day>=21)&&(month==5))||((day<23)&&(month == 6))){
            System.out.println("Your horoscope is İKİZLER ");
        }else if (((day>=22)&&(month==6))||((day<23)&&(month == 7))){
            System.out.println("Your horoscope is YENGEÇ ");
        }else if (((day>=22)&&(month==7))||((day<23)&&(month == 8))){
            System.out.println("Your horoscope is ASLAN ");
        }else if (((day>=22)&&(month==8))||((day<23)&&(month == 9))){
            System.out.println("Your horoscope is BAŞAK ");
        }else if (((day>=22)&&(month==9))||((day<23)&&(month == 10))){
            System.out.println("Your horoscope is TERAZİ ");
        }else if (((day>=22)&&(month==10))||((day<22)&&(month ==11))){
            System.out.println("Your horoscope is AKREP ");
        }else if (((day>=21)&&(month==11))||((day<22)&&(month == 12))){
            System.out.println("Your horoscope is YAY ");
        }else if (((day>=21)&&(month==12))||((day<22)&&(month == 1))){
            System.out.println("Your horoscope is OĞLAK ");
        }else if (((day>=21)&&(month==1))||((day<20)&&(month == 2))) {
            System.out.println("Your horoscope is KOVA ");
        }else{
            System.out.println("Your horoscope is BALIK");
        }
    }
}
