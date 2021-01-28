package kmitl.singleton;

public class CompanyManager {

    public static final CompanyManager INSTANCE = new CompanyManager();

    protected CompanyManager() {
        //...
    }

    public void doSthInstance() {
        System.out.println("Sth with the instance");
    }

    public static String doSth() {
        System.out.println("Sth");
        return "Sth";
    }

}
