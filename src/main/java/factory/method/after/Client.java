package factory.method.after;

import factory.method.after.factory.IPhone11ProFactory;
import factory.method.after.factory.IPhoneFactory;
import factory.method.after.factory.IPhoneXFactory;
import factory.method.after.model.IPhoneAbstract;

public class Client {

	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhoneAbstract iphone = iphoneXFactory.orderIPhone();
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhoneAbstract iphone2 = iphone11ProFactory.orderIPhone();
		System.out.println(iphone2);
	}
}
