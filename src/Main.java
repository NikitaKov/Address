import java.util.Scanner;

/**
 * Created by student on 08.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        AddressBook b1=new AddressBook();
//        b1.add(new Address("Иван", "12345","почта"));
//        b1.print();
        Scanner sc=new Scanner (System.in);
        while (true){
            System.out.println("1. Добавление записи");
            System.out.println("2. Поиск записи");
            System.out.println("3. Вывод всех записей");
            System.out.println("4. Удаление записи");
            System.out.println("5. Изменение записи");
            System.out.println("6. Выход из программы");
            int command=sc.nextInt();
            switch (command){
                case 1:
                    System.out.println("Введите имя");
                    String name=sc.next();
                    System.out.println("Введите телефон");
                    String phone=sc.next();
                    System.out.println("Введите e-mail");
                    String email=sc.next();
                    b1.add(new Address(name,phone,email));
                    break;
                case 2:

                case 3:
                    b1.print();
                    break;
                case 4:
                case 5:
                case 6:

            }
        }
    }
}
