package xlreader;

import java.io.IOException;

public class Excelcodemain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String var=Excelcode.getStringData(1, 0);
		System.out.println(var);
		String z=Excelcode.getTntegerData(1, 1);
		System.out.println(z);
		
		
	}

}
