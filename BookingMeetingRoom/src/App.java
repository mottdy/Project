

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Menu run = new Menu();
        Scanner sc = new Scanner(System.in);

        do {
            Display.showMenu();
            while (true) {
                System.out.print("Enter the number : ");
                int select = sc.nextInt();
                switch (select) {
                    case 1:
                        run.showCurrentRoom();
                        break;
                    case 2:
                        run.bookingRoom();
                        break;
                    case 3:
                        run.cancelRoom();
                        break;
                    case 4:
                        run.returnRoom();
                        break;
                    case 5:
                        run.exit();
                        break;
                    default:
                        break;
                }
                if (select >= 1 && select <= 5) {
                    break;
                }
            }
        } while (run.getStay() != 0);
    }
}
