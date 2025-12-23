package Multi;

class Warrior extends Thread {

    String res1 = "Brahmastra";
    String res2 = "Sarpastra";
    String res3 = "Pashupatastra";


    @Override
    public void run() {
    String name=Thread.currentThread().getName();
        if (name.equalsIgnoreCase("Arjun")) {
            arjun();
        } else {
            karna();
        }
    }

    void arjun() {
        try {
            synchronized (res1) {
                System.out.println("Arjun acquired Brahmastra");
                Thread.sleep(3000);

                synchronized (res2) {
                    System.out.println("Arjun acquired Sarpastra");
                    Thread.sleep(3000);

                    synchronized (res3) {
                        System.out.println("Arjun acquired Pashupatastra");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void karna() {
        try {
            synchronized (res1) {
                System.out.println("Karna acquired Brahmastra");
                Thread.sleep(3000);

                synchronized (res2) {
                    System.out.println("Karna acquired Sarpastra");
                    Thread.sleep(3000);

                    synchronized (res3) {
                        System.out.println("Karna acquired Pashupatastra");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class LifeCycle {

    public static void main(String[] args) {

        Warrior w1 = new Warrior();
        Warrior w2 = new Warrior();
        
        w1.setName("Arjun");
        w2.setName("Karna");

        w1.start();
        w2.start();
    }
}
