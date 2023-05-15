import java.util.Scanner;

public class View {

    public static int ShowMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "\n1- Добавить игрушку\n" +
                            "2- Добавить игрушку с заданием вручную  шанса игрушки попасть в розыгрыш\n" +
                            "3- Показать массив игрушек\n4- Провести розыгрыш игрушки\n" +
                            "5- Показать массив призовых игрушек\n6- Сохранить в файл\n" +
                            "7 -Выход из программы\n");

            System.out.print("Выберите пункт меню: ");
            String userInput = sc.nextLine();
            int userInt;
            try {
                userInt = Integer.parseInt(userInput);
                if (userInt < 1 || userInt > 7 || userInt != (int) userInt)
                    throw new Exception();
                switch (userInt) {
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                    case 4:
                        return 4;
                    case 5:
                        return 5;
                    case 6:
                        return 6;
                    case 7:
                        return 7;
                }
            } catch (Exception e) {
                System.out.println(
                        "\nВводить можно только цифры из диапазона меню! от  1 7 \nПовторите ввод!\n");
            }

        }
    }

    public static String SelectedRobot() {
        Scanner sc = new Scanner(System.in);
        String userInput;
        System.out.println("\n1- Robot\n" +
                "2- Constructor\n" +
                "3- Boadr Game\n ");
        System.out.print("Выберите пункт меню: ");
        userInput = sc.nextLine();
        return userInput;
    }

}