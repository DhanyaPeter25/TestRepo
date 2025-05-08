package excelread1;

import java.io.IOException;

public class SecondClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String var =FirstClass.getStringData(1, 0);
System.out.println(var);
System.out.println(FirstClass.getInteger(1, 1));
System.out.println(FirstClass.getFloat(2, 1));
	}

}
