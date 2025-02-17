package xlreader;

import java.io.IOException;

public class xlcodemain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String var=xlcode.getStringData(1, 0);
		System.out.println(var);
		String z=xlcode.getTntegerData(1, 1);
		System.out.println(z);
		
		
	}

}
