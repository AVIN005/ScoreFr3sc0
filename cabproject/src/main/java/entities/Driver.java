package entities;

public class Driver {
	private String category;
	private int driverId;
	private int rating;
	private String driverName;
	private double totalDistance;


	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getDriverId() {
		return driverId;
	}
	public int getRating() {return rating;}
	public void setRating(int rating){this.rating=rating;}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public double getTotalDistance() {
		return totalDistance;
	}
	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}
	public Driver(String category, int driverId, int rating, String driverName,
				  double totalDistance) {
		super();
		this.category = category;
		this.driverId = driverId;
		this.rating = rating;
		this.driverName = driverName;
		this.totalDistance = totalDistance;
	}
	
	
}
