package lesson34;

public class VolatileExample {

    private volatile static boolean running = true;
    /*
    hemin owrker cpu nin cache in de saxlanilir ve worker oz kopyasini istiafde ede biler
    Main deyisende yani running false olanda worker in xeberi olmur 1 saniye loop da qalan moment
     */
    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            while(running) {
                //isleyir
            }
            System.out.println("worker dayandir");
        });

        worker.start();
        Thread.sleep(1000);
        running =  false;
        /**
         * buna shared resources deyirler bu her hansisa deyisenin muxtelif threadler arasinda paylanmasidir
         * mesleen bu numunede main thread running -i false edib amma bizim oz worker threadimizin
         * bundan xeberi yoxdur cunki o cacheden oxuyur bu problemi
         * volatile hell edir o hemise deyisenin deyerni gedir main memory-den oxuyur cache-den yox
         */

    }
}
