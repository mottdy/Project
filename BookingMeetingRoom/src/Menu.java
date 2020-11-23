
import java.util.Scanner;

public class Menu {


    Function access = new Function();
    Booking[] arrays = new Booking[100];

    private String name;
    private char size;
    private double hour;
    private double price;
    private int head;

    private int stay;

    public int getStay() {
        return stay;
    }

    public int getLength() {
        return arrays.length;
    }

    public void showCurrentRoom() {

        access.showRoomCurrent();
        this.stay = 1;
    }

    public void bookingRoom() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Name : ");
        name = sc.nextLine();

        System.out.print("Hour : ");
        hour = sc.nextDouble();

        while (true) {
            System.out.print("size( only s,m,l) : ");
            size = sc.next().charAt(0);
            if (size == 's' || size == 'm' || size == 'l') {
                break;
            }
        }

        switch (size) {
            case 's':
                price = hour * 100;
                break;
            case 'm':
                price = hour * 200;
                break;
            case 'l':
                price = hour * 300;
                break;
            default:
                break;
        }
        System.out.println(name + "'s room : size " + size + "" + hour + "" + " hour");
        System.out.println("Price : " + price);
        arrays[head++] = new Booking(name, hour, size); //arrays[head++]

        access.book(size);
        System.out.println("Booking Successful");
        this.stay = 1;
    }

    public void cancelRoom() {
        Scanner sc = new Scanner(System.in);
        int select;
        String checkName;
        char checkSize;

        System.out.print("Name : ");
        checkName = sc.nextLine();

        while (true) {
            System.out.print("size( only s,m,l) : ");
            checkSize = sc.next().charAt(0);
            if (checkSize == 's' || checkSize == 'm' || checkSize == 'l') {
                break;
            }
        }


        for (int i = 0; i < head; i++) {
            if (checkName.equals(arrays[i].getName()) && checkSize == arrays[i].getSize()) {

                System.out.println(arrays[i]);
                System.out.println(" 1 . cancel");
                System.out.println(" 2 . exit");
                while (true) {
                    System.out.println("Select : ");
                    select = sc.nextInt();
                    if (select == 1) {
                        switch (arrays[i].getSize()) {
                            case 's':
                                access.cancel('s');
                                break;
                            case 'm':
                                access.cancel('m');
                                break;
                            case 'l':
                                access.cancel('l');
                                break;
                            default:
                                break;
                        }
                        arrays[i] = new Booking(null, 0, '\u0000');
                        System.out.println("Cancel Successful");
                    } else {
                        System.out.println("Menu");
                    }
                    if (select == 1 || select == 2) {
                        break;
                    }
                }
            } else {
                System.out.println("Not found");
            }
        }

        this.stay = 1;
    }

    public void returnRoom() {
        Scanner sc = new Scanner(System.in);
        int select;
        String checkName;
        char checkSize;

        System.out.print("Name :");
        checkName = sc.nextLine();


        while (true) {
            System.out.print("size( only s,m,l) : ");
            checkSize = sc.next().charAt(0);
            if (checkSize == 's' || checkSize == 'm' || checkSize == 'l') {
                break;
            }
        }

        for (int i = 0; i < head; i++) {
            if (checkName.equals(arrays[i].getName()) && checkSize == arrays[i].getSize()) {

                System.out.println(arrays[i]);
                System.out.println(" 1 . return");
                System.out.println(" 2 . exit");
                while (true) {
                    System.out.println("Select : ");
                    select = sc.nextInt();
                    if (select == 1) {
                        switch (arrays[i].getSize()) {
                            case 's':
                                access.returnRoom('s');
                                break;
                            case 'm':
                                access.returnRoom('m');
                                break;
                            case 'l':
                                access.returnRoom('l');
                                break;
                            default:
                                break;
                        }
                        arrays[i] = new Booking(null, 0, '\u0000');

                        System.out.println("Return Successful");
                    } else {
                        System.out.println("Menu");
                    }
                    if (select == 1 || select == 2) {
                        break;
                    }
                }
            } else {
                System.out.println("Not found");
            }
        }
        this.stay = 1;
    }

    public void exit() {
        this.stay = 0;
    }

}
