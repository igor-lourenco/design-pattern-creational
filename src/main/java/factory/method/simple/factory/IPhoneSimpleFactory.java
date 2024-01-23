package factory.method.simple.factory;

import factory.method.simple.model.IPhone11;
import factory.method.simple.model.IPhone11Pro;
import factory.method.simple.model.IPhoneAbstract;
import factory.method.simple.model.IPhoneX;
import factory.method.simple.model.IPhoneXSMax;

public class IPhoneSimpleFactory {

	public static IPhoneAbstract orderIPhone(String generation, String level) {
		IPhoneAbstract device = null;

		if (generation.equals("X")) {
			if (level.equals("standard")) {
				device = new IPhoneX();
			} else if (level.equals("highEnd")) {
				device = new IPhoneXSMax();
			}
		} else if (generation.equals("11")) {
			if (level.equals("standard")) {
				device = new IPhone11();
			} else if (level.equals("highEnd")) {
				device = new IPhone11Pro();
			}
		}

		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}
}
