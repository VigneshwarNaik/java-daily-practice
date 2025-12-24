class AutoSave extends Thread {

    public void run() {
        System.out.println("Auto-save daemon started");

        while (true) {
            System.out.println("Auto-saving file...");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {}
        }
    }
}

public class Daemon {

    public static void main(String[] args) {

        System.out.println("User opened the editor (Main thread starts)");

        AutoSave auto = new AutoSave();
        auto.setDaemon(true);   // background service
        auto.start();           // daemon starts

        try {
            Thread.sleep(2000); // user working
        } catch (InterruptedException e) {}

        System.out.println("User closed the editor (Main thread ends)");
    }
}
