package thread;

class WordPrinter implements Runnable {
    private static final Object lock = new Object();
    private static int currentIndex = 0;
    private final String[] words;
    private final int index;

    public WordPrinter(String[] words, int index) {
        this.words = words;
        this.index = index;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (currentIndex < words.length) {
                if (currentIndex == index) {
                    System.out.print(words[currentIndex] + " ");
                    currentIndex++;
                    lock.notifyAll();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Thread interrupted");
                    }
                }
            }
        }
    }
}

public class WordSync {
    public static void main(String[] args) {
        String[] words = {"Hello", "hi", "how", "do", "you", "do?"};
        Thread[] threads = new Thread[words.length];

        for (int i = 0; i < words.length; i++) {
            threads[i] = new Thread(new WordPrinter(words, i));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
