package java.lambda;

public class WorkerImplementation {
    public static void main(String... args) {
        doingWork(a -> System.out.println(a));
    }

    public static void doingWork(Worker worker) {
        worker.doSomeWork(20);
    }

    public interface Worker {
        void doSomeWork(int a);
    }
}
