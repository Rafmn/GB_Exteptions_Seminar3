import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Считывание данных
        System.out.println("Введите в произвольном порядке через пробел следующие данные: фамилия, имя, отчество, дата рождения в формате дд.мм.гггг, номер телефона (целове беззнаковое число, без форматирования), пол (f или m): ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();
        String[] data = str.split(" ");

        // Проверка введенных данных на количество
        if (Check.lengthStrings(data) == false) {
            System.exit(0);
        };

        // Проверка корректности введенных данных
        if (Check.correctData(data) == false) {
            System.exit(0);
        }
        
        // Преобразование данных в нужную строку
        String aline = "";
        for (String d: data) {
            d = "<" + d + ">";
            aline += d;
        }

        // Запись в файл
        File.writeFile(data[0], aline);
    }
}