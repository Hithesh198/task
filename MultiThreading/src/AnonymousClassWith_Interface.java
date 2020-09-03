interface A{
	void show();
}
public class AnonymousClassWith_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 A obj = new A(){
	 public void show(){
		 System.out.println("Hello Hithesh, This is anonymous class with interface");
	 }
 };
 obj.show();
	}

}
