package abstracts.factory.halfSimple;

import abstracts.method.halfSimple.factory.IPhone11Factory;
import abstracts.method.halfSimple.factory.IPhoneFactory;
import abstracts.method.halfSimple.factory.IPhoneXFactory;
import abstracts.method.halfSimple.model.IPhoneAbstract;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();
		
		System.out.println("### Ordering an iPhone X");
		IPhoneAbstract iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("-----------------------------------------------------");
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhoneAbstract iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
