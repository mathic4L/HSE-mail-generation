import java.util.Scanner;

public class MailGeneration {

    static public String emailGeneration(Student student) {
        return "" + student.getName().toLowerCase().charAt(0) + student.getPatronymic().toLowerCase().charAt(0) + "_" +
                student.getSurname().toUpperCase().charAt(0) +
                student.getSurname().toLowerCase().replaceAll(String.valueOf(student.getSurname().charAt(0)), "") +
                "_" + student.getGroup() + "@edu.hse.ru";
    }

    public static void main(String[] args) {

        Scanner scannerName = new Scanner(System.in);
        String name = scannerName.nextLine();

        Scanner scannerSurname = new Scanner(System.in);
        String surname = scannerName.nextLine();

        Scanner scannerPatronymic = new Scanner(System.in);
        String patronymic = scannerName.nextLine();

        Scanner scannerGroup = new Scanner(System.in);
        String group = scannerGroup.nextLine();

        Student student1 = new Student(name, surname, patronymic, Group.valueOf(group.toUpperCase()));

        emailGeneration(student1);
        System.out.println(emailGeneration(student1));

    }
}

