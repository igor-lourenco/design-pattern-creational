package factory.method.after.factory;

import factory.method.after.model.IPhoneAbstract;

public abstract class IPhoneFactory {

	public IPhoneAbstract orderIPhone() {
		IPhoneAbstract device = null;
		
		device = createIPhone();
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhoneAbstract createIPhone();
}
