package singleton;

public class DbSingletonDemo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);

        //DbSingleton testConst = new DbSingleton();

        DbSingleton anotherInstance = DbSingleton.getInstance();
        // anotherInstance and instance is same object
        System.out.println(anotherInstance);
    }
}
