public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Class1 class1 = new Class1("Class1");
        Class1_1 class1_1 = new Class1_1("Class1_1");
        Class1_1 class1_1Copy = new Class1_1("Class1_1");

        Base<Integer,Class1> base1 = new Base<>(123, class1);
        Base<String,Class1_1> base2 = new Base<>("123", class1_1);
        Base<String,Class1_1> base2Copy = new Base<>("123", class1_1Copy);
        Base baseClone = base1.clone();

        System.out.println(class1.getObject());
        System.out.println(base1.hashCode());
        System.out.println(base2.hashCode());
        System.out.println(base1);
        System.out.println(base2);
        System.out.println(base1.equals(base2));
        System.out.println(base2.equals(base2Copy));
        System.out.println(base1);
        System.out.println(baseClone);
    }
}
