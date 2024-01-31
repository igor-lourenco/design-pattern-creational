package factory.method.simple;

import factory.method.simple.factory.IPhoneSimpleFactory;
import factory.method.simple.model.IPhoneAbstract;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("### Ordering an iPhone X ###");
		IPhoneAbstract iphone = IPhoneSimpleFactory.orderIPhone("X", "standard");
		System.out.println("Classe: " + iphone);
		
		System.out.println("-----------------------------------------------------");
		System.out.println("\n### Ordering an iPhone 11 HighEnd ###");
		IPhoneAbstract iphone2 = IPhoneSimpleFactory.orderIPhone("11", "highEnd");
		System.out.println(iphone2);
		System.out.println("Classe2: " + iphone2);
	}
}

