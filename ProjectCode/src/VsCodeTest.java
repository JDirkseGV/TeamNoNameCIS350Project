

public class VsCodeTest {
    public static void main(String[] args){
        int a = 3;
        int b = 5;

        for (int i = 0; i < 5; i++){
            a += 5;
        }

        System.out.println(a);
        System.out.println(b + " hello world!");

        Person human = new Person(20, "John");

        System.out.println(human.toString());
        System.out.println(human.getName() + " is ");
        System.out.println(human.getAge() + " years old");

    }
}
