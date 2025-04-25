package thomus_travels;

public class Driver {
	private String getcategory;
	private String drivername;
	private int driverid;
	private double totaldistance;

	public Driver() {
		// TODO Auto-generated constructor stub
	}


	public Driver(String getcategory, String drivername, int driverid, double totaldistance) {
		super();
		this.getcategory = getcategory;
		this.drivername = drivername;
		this.driverid = driverid;
		this.totaldistance = totaldistance;
	}


	public String getGetcategory() {
		return getcategory;
	}

	public void setGetcategory(String getcategory) {
		this.getcategory = getcategory;
	}

	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}

	public int getDriverid() {
		return driverid;
	}

	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}

	public double getTotaldistance() {
		return totaldistance;
	}

	public void setTotaldistance(double totaldistance) {
		this.totaldistance = totaldistance;
	}
	
	@Override
	public String toString() {
	    return "Driver [Category=" + getcategory +
	           ", Name=" + drivername +
	           ", ID=" + driverid +
	           ", TotalDistance=" + totaldistance + "]";
	}


}
