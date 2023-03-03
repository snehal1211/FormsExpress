package Runner;

import BDDframework.utils.TestInit;

import cucumber.runtime.java.picocontainer.PicoFactory;

public class CustomPicoFactory extends PicoFactory {
	
	public CustomPicoFactory() {
		addClass(TestInit.class);
		
	
	}
	

}
