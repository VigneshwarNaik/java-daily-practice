package Multi;

class Warrior extends Thread {

    String res1 = "Brahmastra";
    String res2 = "Sarpastra";

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        if (name.equalsIgnoreCase("Arjun")) {
            arjun();
        } else {
            karna();
        }
    }

    void arjun() {
        synchronized (res1) {
            System.out.println("Arjun acquired Brahmastra");
            try { Thread.sleep(3000); } catch (Exception e) {}

            synchronized (res2) {
                System.out.println("Arjun acquired Sarpastra");
            }
        }
    }

    void karna() {
        synchronized (res2) {
            System.out.println("Karna acquired Sarpastra");
            try { Thread.sleep(3000); } catch (Exception e) {}

            synchronized (res1) {
                System.out.println("Karna acquired Brahmastra");
            }
        }
    }
}

public class DeadlockDemo {

    public static void main(String[] args) {

        Warrior w1 = new Warrior();
        Warrior w2 = new Warrior();

        w1.setName("Arjun");
        w2.setName("Karna");

        w1.start();
        w2.start();
    }
}

