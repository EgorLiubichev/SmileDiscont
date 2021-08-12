import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CommonData {
    public static void main(String[] args) throws FileNotFoundException {
        int dataFile = 0;

        System.out.print("Введите сумму оплаты: ");
        Scanner scanner = new Scanner(System.in);     //вводить копейки через запятую
        double paymentAmount = scanner.nextDouble();
        System.out.println("Сумма к оплате: " + paymentAmount);

        System.out.print("Введите № карты: ");
        Scanner scannerCard = new Scanner(System.in);
        int numberOfCard = scannerCard.nextInt();

        File file = new File ("Data.txt");
        Scanner scanner1 = new Scanner(file);
        while (scanner1.hasNextLine()){
                String line = scanner1.nextLine();
                dataFile = Integer.valueOf(line);
        }
        scanner1.close();
            double a = paymentAmount * 0.97;
            double b = paymentAmount * 0.94;
            double c = paymentAmount * 0.91;

                    if(dataFile == 9901 && numberOfCard == 1001){
                System.out.println("Ваша скидка составила 3%.\nСумма к оплате "+ a +" руб.");
            } else if (dataFile == 9902 && numberOfCard == 1001){
                System.out.println("Ваша скидка составила 6%.\nСумма к оплате "+ b +" руб.");
            } else if (dataFile == 9903 && numberOfCard == 1001) {
                System.out.println("Ваша скидка составила 9%.\nСумма к оплате " + c + " руб.");
            } else if (dataFile == 9901 && (numberOfCard == 1002 || numberOfCard == 1003)){
                System.out.println("Ваша скидка составила 3%.\nСумма к оплате "+ a +" руб.");
                        File file1 = new File("Data.txt");
                        PrintWriter pw = new PrintWriter(file1);
                        pw.println("9902");
                        pw.close();
            } else if (dataFile == 9902 && (numberOfCard == 1002)) {
                        System.out.println("Ваша скидка составила 3%.\nСумма к оплате " + a + " руб.");
            } else if (dataFile == 9903 && numberOfCard == 1002) {
                        System.out.println("Ваша скидка составила 6%.\nСумма к оплате " + b + " руб.");
            } else if (dataFile == 9902 && numberOfCard == 1003){
                            System.out.println("Ваша скидка составила 3%.\nСумма к оплате "+ a +" руб.");
                            File file1 = new File("Data.txt");
                            PrintWriter pw = new PrintWriter(file1);
                            pw.println("9903");
                            pw.close();
            } else {
                    System.out.println("Карта скидки отсутствует, к оплате: " + paymentAmount + " руб.");
            }
    }
}