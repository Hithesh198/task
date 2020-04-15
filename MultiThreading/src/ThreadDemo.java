/*class Hi implements Runnable
 {
 public void run() {
 for (int i = 0; i < 5; i++) {
 System.out.println("Hi");
 try {
 Thread.sleep(1000);
 } catch (Exception e) {

 }
 }
 }
 }
 */
/*class Hello extends Thread {
 public void run() {
 for (int i = 0; i < 5; i++) {
 System.out.println("Hello");
 try {
 Thread.sleep(1000);
 } catch (Exception e) {

 }
 }
 }
 }
 */
public class ThreadDemo {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Runnable obj1 = new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					System.out.println("Hi ");
					try{
					Thread.sleep(1000);} catch(Exception e){}	
				}
			}
		};

		Runnable obj2 = new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					System.out.println("Hithesh");
					try{Thread.sleep(1000);} catch(Exception e){}}
			}
		};
		Thread t = new Thread(obj1);
		Thread t1 = new Thread(obj2);

		t.start();

		try {Thread.sleep(10);}catch (Exception e) {}
		t1.start();
		
		t.join();
		t1.join();
		System.out.println("Bye");}
	}

