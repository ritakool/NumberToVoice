import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte number;
        System.out.println("Nhập số bạn muốn đọc: ");
        number = sc.nextByte();
        String say = "";

        if (number == 0){
            System.out.println("zero");
        }
        if (number >= 10 ){
            switch (number){
                case 19:
                    say = "nineteen";
                    break;
                case 18:
                    say = "eighteen";
                    break;
                case 17:
                    say = "seventeen";
                    break;
                case 16:
                    say = "sixteen";
                    break;
                case 15:
                    say = "fifteen";
                    break;
                case 14:
                    say = "fourteen";
                    break;
                case 13:
                    say = "thriteen";
                    break;
                case 12:
                    say = "twelve";
                    break;
                case 11:
                    say = "eleven";
                    break;
                case 10:
                    say = "ten";
                    break;
            }
        }
        if (number >= 100) {
            switch (number / 100) {
                case 1:
                    say = "one hundred ";
                    break;
                case 2:
                    say = "two hundred ";
                    break;
                case 3:
                    say = "three hundred ";
                    break;
                case 4:
                    say = "four hundred ";
                    break;
                case 5:
                    say = "five hundred ";
                    break;
                case 6:
                    say = "six hundred ";
                    break;
                case 7:
                    say = "seven hundred ";
                    break;
                case 8:
                    say = "eight hundred ";
                    break;
                case 9:
                    say = "nine hundred ";
            }
        }
        number %= 100;
        if (number >= 20) {
            switch (number / 10) {
                case 2:
                    say += "twenty ";
                    break;
                case 3:
                    say += "thirty ";
                    break;
                case 4:
                    say += "fourty ";
                    break;
                case 5:
                    say += "fifty ";
                    break;
                case 6:
                    say += "sixty ";
                    break;
                case 7:
                    say += "senventy ";
                    break;
                case 8:
                    say += "eighty ";
                    break;
                case 9:
                    say += "ninety ";
                    break;
            }
        }
        number %= 10;
        if (number > 0){
            switch (number){
                case 1:
                    say += "one";
                    break;
                case 2:
                    say += "two";
                    break;
                case 3:
                    say += "three";
                    break;
                case 4:
                    say += "four";
                    break;
                case 5:
                    say += "five";
                    break;
                case 6:
                    say += "six";
                    break;
                case 7:
                    say += "seven";
                    break;
                case 8:
                    say += "eight";
                    break;
                case 9:
                    say += "nine";
                    break;
            }
        }
        System.out.println(say);
    }
}
