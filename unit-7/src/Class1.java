public class Class1 implements Printable, Cloneable{
    String name;
    public Class1(String name) {
        this.name = name;
    }

    @Override
    public Class1 clone() throws CloneNotSupportedException {
        return (Class1) super.clone();
    }

    @Override
    public Object getObject() {
        return this;
    }
}

