package in.kgcoding.challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadService {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            PrintNums task = new PrintNums();
            service.submit(task);
        }
    }
}
