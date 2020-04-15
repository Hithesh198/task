package task;
import java.io.*;
public class PrintWriter {

	
	public static void main(String[] args)throws Exception {
		
		
		File f = new File("ABCXYZ.csv");
		BufferedWriter  rd = new BufferedWriter(new FileWriter(f));
		rd.write(Integer.toString(12));
		rd.write("Welcome");
		rd.newLine();
		rd.write("IT");
		rd.write("Software");
		rd.flush();
		rd.close();
		System.out.println(f.getAbsolutePath());
	}


}
