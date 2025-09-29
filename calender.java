package calender;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.util.Date;
public class calender {

	public static void main(String[] args) {
	Date dt =new Date();
	System.out.println(dt);
	
	DateFormat df;
	
	df=DateFormat.getDateInstance();
	System.out.println(df.format(dt));
	df=DateFormat.getDateTimeInstance();
	System.out.println(df.format(dt));
	df=DateFormat.getTimeInstance();
	System.out.println(df.format(dt));
	
	
	
	df=DateFormat.getDateInstance(DateFormat.LONG);
	System.out.println(df.format(dt));
	df=DateFormat.getDateInstance(DateFormat.MEDIUM);
	System.out.println(df.format(dt));
	df=DateFormat.getDateInstance(DateFormat.SHORT);
	System.out.println(df.format(dt));
	df=DateFormat.getDateInstance(DateFormat.FULL);
	System.out.println(df.format(dt));
	
	
	
	//like this for time and date&time instance
	}

}
