import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(true){
            System.out.println("Введите год в формате уууу");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней");
            int inerDays = scanner.nextInt();
            int calcDay = dayInYear.calc(year);
            if (inerDays == calcDay) {
                i++;
            } else if (calcDay == 365 ){
                System.out.println("Не правильно! В этом году 365 дней");
                break;
            } else {
                System.out.println("Не правильно! В этом году 366 дней");
                break;
            }
        }
        System.out.println("Набрано очков: " + i);

    }
}
