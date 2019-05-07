package es.EstechDam;

public class Main {

    public static void main(String[] args) {
        long initialTime = System.currentTimeMillis();
        final int LENGTH = 6;

        HelloWorld threads[] = new HelloWorld[LENGTH];

        for(int i = 0; i < threads.length; i++){
            int seconds = i + 1;
            threads[i] = new HelloWorld(initialTime, seconds);
            threads[i].start();
        }
    }
}
