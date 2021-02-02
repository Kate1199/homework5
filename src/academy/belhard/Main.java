package academy.belhard;

import academy.belhard.entity.Person;
import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {

        User u1 = new User("Том", "Hurdy", "tom.hurdy@mail.ru", "7788");
        System.out.println(u1.getFullInfo());
        System.out.println();
        System.out.println(u1.isPasswordCorrect("7788"));
    }
}
