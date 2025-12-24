package thread;

class Queue {
    private int data;
    private boolean isDataPresent = false;

    // Producer sets data
    synchronized void setData(int data) {
        while (isDataPresent) { // If data is already present, wait
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.data = data;
        System.out.println(Thread.currentThread().getName() + " produced: " + data);
        isDataPresent = true;
        notify(); // Notify the consumer
    }

    // Consumer gets data
    synchronized void getData() {
        while (!isDataPresent) { // If no data present, wait
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " consumed: " + data);
        isDataPresent = false;
        notify(); // Notify the producer
    }
}

class ProducerThread extends Thread {
    Queue q;

    public ProducerThread(Queue q) {
        this.q = q;
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            q.setData(i++);
            try {
                Thread.sleep(500); // slow down for demo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ConsumerThread extends Thread {
    Queue q;

    public ConsumerThread(Queue q) {
        this.q = q;
    }

    @Override
    public void run() {
        while (true) {
            q.getData();
            try {
                Thread.sleep(500); // slow down for demo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Queue q = new Queue();

        ProducerThread producer = new ProducerThread(q);
        ConsumerThread consumer = new ConsumerThread(q);

        producer.setName("Producer");
        consumer.setName("Consumer");

        producer.start();
        consumer.start();
    }
}
