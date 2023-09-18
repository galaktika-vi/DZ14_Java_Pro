import java.util.Scanner;
import java.util.TreeMap;

public class DoctorAppointment {
    public static void main(String[] args) {
        TreeMap<Integer, String> appointments = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие: 1 - Записаться на прием, 2 - Показать следующего пациента, 3 - Завершить работу");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    System.out.println("Введите номер временного слота (например, 1 для 9:00):");
                    int timeSlot = scanner.nextInt();
                    scanner.nextLine(); // Очистка буфера

                    System.out.println("Введите ваше имя:");
                    String name = scanner.nextLine();

                    appointments.put(timeSlot, name);
                    System.out.println("Вы успешно записаны на прием.");
                    break;

                case 2:
                    if (appointments.isEmpty()) {
                        System.out.println("Нет записей на прием.");
                    } else {
                        int nextTimeSlot = appointments.firstKey();
                        String nextPatient = appointments.get(nextTimeSlot);

                        System.out.println("Следующий пациент: " + nextPatient + " (временной слот: " + nextTimeSlot + ")");
                        appointments.remove(nextTimeSlot);
                    }
                    break;

                case 3:
                    System.out.println("Работа программы завершена.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
    }
}
