import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {

            String name = "";
            while (name.trim().isEmpty()) {
                System.out.println("Введите название машины №" + i + ":");
                name = scanner.nextLine();
                if (name.trim().isEmpty()) {
                    System.out.println("Название не может быть пустым!");
                }
            }

            int speed = 0;
            boolean valid = false;

            while (!valid) {
                System.out.println("Введите скорость машины №" + i + ":");

                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    scanner.nextLine();

                    if (speed > 0 && speed <= 250) {
                        valid = true;
                    } else {
                        System.out.println("Неправильная скорость! Должна быть от 1 до 250.");
                    }
                } else {
                    System.out.println("Ошибка: введите целое число!");
                    scanner.nextLine();                }
            }

            Car car = new Car(name.trim(), speed);
            race.checkLeader(car);
        }

        System.out.println("Самая быстрая машина: " + race.getWinner());
        scanner.close();
    }
}