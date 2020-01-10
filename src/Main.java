import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void fixed() throws Exception {
        int size = 4;
        ExecutorService executorService = Executors.newFixedThreadPool(size);

        for (int i = 0; i < 8; i++) {
            Future<?> submit = executorService.submit(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("demo");
            });
            submit.get();
        }
    }

    public static void main(String[] args) throws Exception {
        fixed();

        System.in.read();
    }

    private static String getBinaryString(int n) {
        String s = "";
        for (int x = n; x > 0; x = x/2) {
            System.out.println("============"+x+"----------------"+(x%2));
            s = (x % 2) + s;
        }
        return s;
    }
}

