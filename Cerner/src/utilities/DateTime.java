package utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	public Date date;
	
	
	public DateTime(String month, String day, String year) throws ParseException {
		date = new SimpleDateFormat("yyyyMMdd").parse(year + month + day);
	}
	
	public DateTime(){
		date = new Date();
	}
	
	public Date getDate() {
		return date;
	}
	
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyy");
		return String.format(dateFormat.format(date));
	}
	
}
