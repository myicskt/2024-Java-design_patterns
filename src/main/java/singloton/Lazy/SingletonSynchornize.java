package singloton.Lazy;

public class SingletonSynchornize {

    public static SingletonSynchornize instance;

    private SingletonSynchornize(){

    }

public static  synchronized SingletonSynchornize getInstance(){
    System.out.println("current thread " +Thread.currentThread().getName());

        if(instance==null){
            instance=new SingletonSynchornize();
        }
        return instance;

}
public synchronized void  Loop(){
    for (int i = 0; i <100 ; i++) {
        System.out.println(i+" : cureent thread is : "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}




}
