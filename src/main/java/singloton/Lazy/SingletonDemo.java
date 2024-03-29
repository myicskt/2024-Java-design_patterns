package singloton.Lazy;

public class SingletonDemo {

    public static SingletonDemo instance;

    private SingletonDemo(){

    }

public static SingletonDemo getInstance(){

        if(instance==null){
            instance=new SingletonDemo();
        }

        return instance;

}



}
