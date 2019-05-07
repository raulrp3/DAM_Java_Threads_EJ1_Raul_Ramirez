package es.EstechDam;

public class HelloWorld extends Thread {

    private final String MESSAGE = "¡Hello World!";
    private int seconds;
    private long initialTime;

    public HelloWorld(){

    }

    public HelloWorld(long initialTime, int seconds){
        this.initialTime = initialTime;
        this.seconds = seconds;
    }

    @Override
    public void run() {
        this.sleep(seconds);
        System.out.println("EL hilo " + Thread.currentThread().getName() + " ha dicho: " + MESSAGE + " en el tiempo " + (System.currentTimeMillis() - this.initialTime) / 1000);
    }

    private void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
