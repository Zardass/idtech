package lesson35;

public class WaitNotifyExample
{
    static class MessageBox{
        private String message;
        private boolean hasMessage = false;

        public synchronized void produce(String msg) throws InterruptedException {
            while (hasMessage){//ne qeder ki mesaj var gonderme
                wait();// object claassin methodudur
            }
            message = msg;
            hasMessage = true;

            System.out.println("Produced: " + msg);

            notify();//her hansisa threadi oyat
        }

        public synchronized void consume() throws InterruptedException {
            while (!hasMessage){
                wait();
            }

            hasMessage = false;
            System.out.println("consumed: " + message);

            notify();
        }

    }

    public static void main(String[] args) {
        MessageBox box = new MessageBox();

        Thread producer = new Thread(() -> {
            try {
                box.produce("Hello");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        Thread consumer = new Thread(()->{
            try {
                box.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        consumer.start();
        producer.start();
    }

}
