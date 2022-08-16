import java.util.Scanner;

public class chinesezodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz:");
        int year = input.nextInt();
        int new_year = year % 12;
        System.out.println(new_year);
        switch (new_year){
            case 0:
                System.out.println("Burcunuz maymun.");
                break;
            case 1:
                System.out.println("Burcunuz horoz.");
                break;
            case 2:
                System.out.println("Burcunuz köpek.");
                break;
            case 3:
                System.out.println("Burcunuz domuz.");
                break;
            case 4:
                System.out.println("Burcunuz fare.");
                break;
            case 5:
                System.out.println("Burcunuz öküz.");
                break;
            case 6:
                System.out.println("Burcunuz kaplan.");
                break;
            case 7:
                System.out.println("Burcunuz tavşan.");
                break;
            case 8:
                System.out.println("Burcunuz ejderha.");
                break;
            case 9:
                System.out.println("Burcunuz yılan.");
                break;
            case 10:
                System.out.println("Burcunuz at.");
                break;
            case 11:
                System.out.println("Burcunuz koyun.");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
