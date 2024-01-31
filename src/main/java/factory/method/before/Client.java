package factory.method.before;

import factory.method.before.model.IPhone11;
import factory.method.before.model.IPhone11Pro;
import factory.method.before.model.IPhoneAbstract;
import factory.method.before.model.IPhoneX;
import factory.method.before.model.IPhoneXSMax;

public class Client {
	
	public IPhoneAbstract orderIPhone(String generation, String level) {
		IPhoneAbstract device = null;
		
		if(generation.equals("X")) {
			if(level.equals("standard")) {
				device = new IPhoneX();
			} else if(level.equals("highEnd")) {
				device = new IPhoneXSMax();
			}
		} else if(generation.equals("11")) {
			if(level.equals("standard")) {
				device = new IPhone11();
			} else if(level.equals("highEnd")) {
				device = new IPhone11Pro();
			}
		}
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}

	public static void main(String[] args) {
		Client client = new Client();
		
		System.out.println("### Ordering an iPhone X");
		IPhoneAbstract iphone = client.orderIPhone("X", "standard");
		System.out.println(iphone);
		
		System.out.println("-----------------------------------------------------");
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhoneAbstract iphone2 = client.orderIPhone("11", "highEnd");
		System.out.println(iphone2);
	}
}
