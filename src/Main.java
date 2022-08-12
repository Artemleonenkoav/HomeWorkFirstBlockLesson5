//    Пользователь должен ввести:
//    Имя, возраст и свой пол.  +
//    Если возраст человека не является пенсионным - мы пишем:
//    Вам еще рано на пенсию!
//    Во всех остальных случаях мы пишем что уже пора на пенсию.
//    Для мужчин 65, для женщин 60 - возрат выхода на пенсию.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String sex = "man";
        String sex2 = "woman";
        String name;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите своё имя ");
        name = in.nextLine();

        String usersex;
        System.out.println("Введите ваш пол ");
        Scanner sc = new Scanner(System.in);
        usersex = in.nextLine();

        int Age;
        System.out.println("Введите сколько вам лет");
        Scanner sc2 = new Scanner(System.in);
        Age = in.nextInt();
        if (usersex.equals(sex) && Age > 65) {
            System.out.printf("Пользователь %s,ваш пол %s,вам %s лет и вам пора на пенсию", name, usersex, Age);
        }
        if (usersex.equals(sex2) && Age > 60) {
            System.out.printf("Пользователь %s,ваш пол %s,вам %s лет и вам пора на пенсию", name, usersex, Age);
        } else if (usersex.equals(sex2) && Age < 60) {
            System.out.println("Вам еще рано на пенсию ");
        } else if (usersex.equals(sex) && Age < 65) {
            System.out.println("Вам еще рано на пенсию");
        } else
            System.out.println("Давай до свиданья");
    }

}