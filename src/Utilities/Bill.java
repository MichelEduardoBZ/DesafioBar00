package Utilities;

public class Bill {

	private String gender;
	private int beer;
	private int barbecue;
	private int softDrink;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getBeer() {
		return beer;
	}

	public void setBeer(int beer) {
		this.beer = beer;
	}

	public int getBarbecue() {
		return barbecue;
	}

	public void setBarbecue(int barbecue) {
		this.barbecue = barbecue;
	}

	public int getSoftDrink() {
		return softDrink;
	}

	public void setSoftDrink(int softDrink) {
		this.softDrink = softDrink;
	}

	public double feeding() {
		double sum = 0;

		sum += this.getBeer() * 5;

		sum += this.getSoftDrink() * 3;

		sum += this.getBarbecue() * 7;

		return sum;
	}

	public double cover() {
		if (feeding() > 30) {
			return 0;
		}
		
		return 4;
	}

	public double ticket() {
		if (this.getGender().equalsIgnoreCase("M")) {
			return 10;
		}
		return 8;
	}

	public double total() {
		return ticket() + feeding() + cover();
	}
}
