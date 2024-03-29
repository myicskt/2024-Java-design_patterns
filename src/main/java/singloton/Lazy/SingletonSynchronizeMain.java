package singloton.Lazy;


import javax.sound.midi.Soundbank;

public class SingletonSynchronizeMain {





    public static void main(String[] args) throws InterruptedException {

        Runnable r1 = ()-> {
                    SingletonSynchornize s1 = SingletonSynchornize.getInstance();
                    s1.Loop();

        };

        Runnable r2 = ()-> {
            SingletonSynchornize s2 = SingletonSynchornize.getInstance();
            s2.Loop();

        };





        Thread t1 = new Thread(r1, "T1");
        t1.start();


        Thread t2 = new Thread(r2, "T2");
        t2.start();

    }
}
