package handles;

import entities.Driver;

import java.util.ArrayList;

public class Travel {
	public boolean isCarDriver(Driver dx){
		boolean a ;
		String isItCar = dx.getCategory();
		if(isItCar.equalsIgnoreCase("car"))
			{ a= true;
				return a ;
			}	else 
		{a= false;
		return a;
		}
		
	}
	
	public String retrivebyDriverId(ArrayList<Driver> idarr,int i){
		int d1;String s;
		for(Driver d: idarr){
			d1=d.getDriverId();
			if(d1==i){
				 s= "Driver name is "+d.getDriverName()+" belonging to the categorty- "+d.getCategory()+" total distance travelled is "+d.getTotalDistance()+" so far";
				 return s;
			}
			}
		return null;}
	public int retriveCountOfDriver (ArrayList<Driver> idarr,String s){
		int i=0;
		for(Driver d: idarr)
		{
			if(d.getCategory()==s){
				i++;
				
			}
		}return i;
	}

	public ArrayList<Driver> retriveDriver(ArrayList<Driver> idarr,String s){
		ArrayList<Driver> idt= new ArrayList<Driver>();
		for(Driver d: idarr)
		{
			String s1= d.getCategory();
			if(s1.equals(s)){
				idt.add(d);
				
			}
		}return idt;
	}
	
	public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> idarr) {
		Driver obj = null;
		double dismax = 0;
		for (Driver d : idarr) {

			if (dismax < d.getTotalDistance()) {
				dismax = d.getTotalDistance();
				obj = d;

			}

		}
		return obj;
	}
	public Driver highestRatedDriver(ArrayList<Driver> star){
		Driver obj=null;
		int rate=0;
		for(Driver d:star){
			if(rate<d.getRating()){
				rate=d.getRating();
				obj=d;
			}
		}return obj;
	}
	}
	
	
	


