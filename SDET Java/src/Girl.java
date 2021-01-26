
public class Girl extends human{
	
	public Girl() {
		updatePopulation();
	}

	
	public void eat() {
        System.out.println("Girl is eating");
    }
	
	public void speaks() {
        System.out.println("Girl is speaking");
    }
	
	public void shout() {
		super.speaks();
	}
	

}
