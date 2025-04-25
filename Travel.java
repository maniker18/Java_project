package thomus_travels;

import java.util.ArrayList;

public class Travel {
	boolean isCarDriver(Driver driver) {
	return	driver.getGetcategory().equalsIgnoreCase("car");
			
		
		
	}
	
	String RetrivebyDriverId(ArrayList<Driver> driver1,int driverid) {
		for (Driver driver : driver1) {
			if (driver.getDriverid()==driverid) {
				
				return "Driver name is "+driver.getDrivername()+" Belonging to the category "
						+driver.getGetcategory()+" travelled "+driver.getTotaldistance()
						+" so far";
			}
		}
		return null;
	}
	
	int RetriveCountOfDriver(ArrayList<Driver> driver2,String category) {
		int count = 0;
    	for(Driver d: driver2) {
    		if (d.getGetcategory().equalsIgnoreCase(category)) {
    		count=	count+1;
				
			}
    		
    	}
    	return  count;
    	
	}
    ArrayList< Driver> retriveDriver(ArrayList<Driver> driver3,String category){
    	ArrayList< Driver> cArrayList= new ArrayList<Driver>();
    	for (Driver d3 : driver3) {
			if(category.equalsIgnoreCase(d3.getGetcategory())){
				 cArrayList.add(d3);
				
			}
		}
		return cArrayList;
    	
    }
    
    Driver RetriveMaximumDistanceTravelledDriver(ArrayList<Driver> driverList) {
        if (driverList == null || driverList.isEmpty()) {
            return null; // or throw exception, based on how you want to handle it
        }

        Driver maxDriver = driverList.get(0);

        for (Driver d : driverList) {
            if (d.getTotaldistance() > maxDriver.getTotaldistance()) {
                maxDriver = d;
            }
        }

        return maxDriver;
    }

}
