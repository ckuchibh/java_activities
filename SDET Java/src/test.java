
public class test {

	public static void main(String[] args) {
		Boy boy = new Boy(); 		// instantiate object
		Girl girl = new Girl();		// instantiate object
		human susie = new Girl();	// instantiate object
		Robo alexa = new Robo();	// instantiate object
		
		boy.speaks();
		girl.speaks();
		girl.shout();
		susie.speaks();
		alexa.speaks();
		
		System.out.println(human.population);	//static variable, no need to instantiate
		

	}

}
