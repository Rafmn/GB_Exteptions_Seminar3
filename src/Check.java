import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Check {
    public static boolean lengthStrings(String[] agrs) {
        if (agrs.length > 6) {
            System.out.println("Вы ввели больше данных");
            return false;
        }
        else if (agrs.length < 6) {
            System.out.println("Вы ввели не все данные");
            return false;
        }
        return true;
    }

    public static boolean correctData(String[] agrs) {
        if (!agrs[0].matches("^[a-zA-Zа-яА-Я]*$")) {
            System.out.println("Фамилия содержит недопустимые символы.");
            return false;
        }
        if (!agrs[1].matches("^[a-zA-Zа-яА-Я]*$")) {
            System.out.println("Имя содержит недопустимые символы.");
            return false;
        }
        if (!agrs[2].matches("^[a-zA-Zа-яА-Я]*$")) {
            System.out.println("Отчество содержит недопустимые символы.");
            return false;
        }
        if (!agrs[3].matches("^[0-9.]*$")) {
            System.out.println("Дата рождения содержит недопустимые символы.");
            return false;
        }
        else {
            String date = agrs[3];
            SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy");

            try {
                sdf.parse(date);
            } catch (ParseException e) {
                System.out.println("Неверный формат даты.");
                return false;
            }
        }
        if (!agrs[4].matches("^[0-9]*$")) {
            System.out.println("Номер телефона содержит недопустимые символы.");
            return false;
        }
        if (!agrs[5].equals("m") && !agrs[5].equals("f")) {
            System.out.println("Неверно указан пол.");
            return false;
        }
        return true;
    }
}
