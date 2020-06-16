import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {

	public static int value = 10;

	public static void main(String[] args) throws Exception {

		Thread thread1 = getThread(13);
		Thread thread2 = getThread(16);
		Thread thread3 = getThread(17);

		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		executor.submit(thread1);
		executor.submit(thread2);
		executor.submit(thread3);

		executor.shutdown();

	}

	private static Thread getThread(int i) {

		Share cal = new Share();
		
		return new Thread(() -> {
			cal.setMemory(i);
		});
	}
}
class Share {

	int resource;

	public synchronized void setMemory(int resource) {
		this.resource = resource;
		System.out.println(this.resource);
	}
}
