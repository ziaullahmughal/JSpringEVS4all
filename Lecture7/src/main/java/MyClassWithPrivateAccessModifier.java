
public class MyClassWithPrivateAccessModifier {

    private static MyClassWithPrivateAccessModifier inst = null;

    public static MyClassWithPrivateAccessModifier getinst() {
        if (inst == null) {
            inst = new MyClassWithPrivateAccessModifier();
        }
        return inst;
    }

    private MyClassWithPrivateAccessModifier() {
        System.out.println("My String = ");
    }
}
