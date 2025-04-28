public class PersonDriver {

    public static void main(String[] args) {

        Person owen = new Person("Owen", 17);
        Person aji = new Person("Aji", 18);
        //Student owenS = new Student(12345, "OwenS", 17);

        owen.sayHi();
        aji.sayHi();

        owen.setName("Owen the third");

        //owenS.sayHi();

        System.out.println(owen.getName());
    }
}
