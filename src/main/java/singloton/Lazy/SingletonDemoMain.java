package singloton.Lazy;

public class SingletonDemoMain {

    public static void main(String[] args) {
        SingletonDemo s1 = SingletonDemo.getInstance();

        SingletonDemo s2 = SingletonDemo.getInstance();


        if(s1 == s2){
            System.out.println("singleton ");
        }

    }
}
