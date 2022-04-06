import java.util.Objects;

public class Base <I, T extends Class1 & Printable> implements Cloneable{
    I id;
    T objClass;

    public Base(I id, T objClass) {
        this.id = id;
        this.objClass = objClass;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id='" + id + '\'' +
                ", objClass=" + objClass +
                '}';
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(id) * 13 * 17;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Base class1 = (Base) obj;
        return this.objClass.name.equals(class1.objClass.name);
    }

    @Override
    public Base clone() throws CloneNotSupportedException {
        Base base = (Base) super.clone();
        base.objClass = base.objClass.clone();
        return base;
    }
}
