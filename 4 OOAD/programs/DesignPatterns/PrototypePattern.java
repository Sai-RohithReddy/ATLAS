package DesignPatterns;

//prototype pattern
interface Prototype {
    Prototype clone();
}

class ConcretePrototype implements Prototype {
    private int value;

    ConcretePrototype(int value) {
        this.value = value;
    }

    // define setter and getter methods as needed
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Prototype clone() {
        return new ConcretePrototype(this.value);
    }
}

// client
public class PrototypePattern {
    public static void main(String args[]) {
        ConcretePrototype concreteProtoype = new ConcretePrototype(10);
        System.out.println(concreteProtoype.getValue());
        ConcretePrototype clonedPrototype1 = (ConcretePrototype) concreteProtoype.clone();

        clonedPrototype1.setValue(100);
        System.out.println(clonedPrototype1.getValue());
        System.out.println(concreteProtoype.getValue());
    }
}