package singloton.eager;

public class TestEagerInstances {

    public static void main(String[] args) {


        EagerInitialization e1 = EagerInitialization.getInstance();

        EagerInitialization e2 = EagerInitialization.getInstance();

        if(e1 == e2){
            System.out.println("we have singleton instance , botth referiring ");
        }
    }
}
