package singloton.eager;

public class EagerInitialization {

    private EagerInitialization(){

    }

    private  static final EagerInitialization instance ;

    static{
        instance = new EagerInitialization();
        }

    public static EagerInitialization getInstance(){
        return instance;
    }


}
