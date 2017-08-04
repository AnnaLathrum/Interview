package Patient;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.swing.text.DateFormatter;

public class Birth {
	public Date birth;
	public String continent;
	public String city;
	
	public Birth(Date birth, String continent, String city) {
		this.birth = birth;
		this.continent = continent;
		this.city = city;
	}
	
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public void setCountry(String continent) {
		this.continent = continent;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getBirth() {
		return getBirthInOtherTimeZone(this.continent, this.city);
	}
	
	public String getCountry() {
		return continent;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getBirthInOtherTimeZone(String continent, String city) {
		return convertToTimezone(continent, city);
	}
	
	public String convertToTimezone(String continent, String city) {
		Calendar calendar = new GregorianCalendar();
		
		calendar.setTime(this.birth);
		//System.out.println(calendar.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy MM dd HH:mm:ss z");
		
		df.setCalendar(calendar);
		df.setTimeZone(TimeZone.getTimeZone(continent + "/" + city));
		
		return df.format(calendar.getTime());
	}
}
