package Udemy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateformat {

	public static void main(String[] args) {
		
		
		Date d =new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(d));

	}

}
