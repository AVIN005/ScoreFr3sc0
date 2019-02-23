
import handles.Travel;
import entities.Driver;
import java.util.ArrayList;


public class OlaAppStart {
	public static void main(String args[] ) 
	{
		Driver d1 = new Driver("car", 01, 3, "BASHA",24000 );
		Driver d2 = new Driver("auto", 02,  5,"BALASA", 20000);
		Driver d3 = new Driver("car", 03, 4, "CHIRU", 16000);

		ArrayList<Driver> list = new ArrayList<Driver>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		Travel t = new Travel();
		boolean d = t.isCarDriver(d3);
		System.out.println(d);
		
		String find = t.retrivebyDriverId(list, 01);
		System.out.println(find);
		
		int countofcar= t.retriveCountOfDriver(list, "car");
		System.out.println(countofcar);
		
		ArrayList<Driver> lod= t.retriveDriver(list, "car");
		//Iterator<Driver> itr = lod.iterator(); while(itr.hasNext()){ System.out.println(itr.next()); 
		for(Driver item: lod){
			System.out.println("Driver of car is " + item.getDriverName()+ " --");
			}		
		
		
		Driver bolt = t.retriveMaximumDistanceTravelledDriver(list);
		System.out.println("Our bolt driver is "+ bolt.getDriverName());
		System.out.println("Our star performer is "+ t.highestRatedDriver(list).getDriverName());
		}

}

