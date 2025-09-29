package simpledateformat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class sdf {

	public static void main(String[] args) {
	
Date dt =new Date();
SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
System.out.println(sdf.format(dt));
	}

}
