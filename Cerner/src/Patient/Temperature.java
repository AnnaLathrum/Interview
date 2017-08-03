package Patient;

import java.text.SimpleDateFormat;
import java.util.Date;

import utilities.Location;

public class Temperature{
	public double temp;
	public Location location;
	Date dateTime;
	
	public Temperature(double temp, Location location) {
		this.temp = temp;
		this.location = location;
		dateTime = new Date();
	}
	
	public Temperature(double temp, Location location, Date date) {
		this.temp = temp;
		this.location = location;
		dateTime = date;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public String toString() {
		SimpleDateFormat x = new SimpleDateFormat("H:mm MM/dd");
		return String.format("%5.2f F  -- %15s  --  %s", temp, location, x.format(dateTime));
	}
}


