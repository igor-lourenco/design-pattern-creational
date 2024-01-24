package factory.method.after.factory;

import factory.method.after.model.IPhoneAbstract;
import factory.method.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory{
	public IPhoneAbstract createIPhone() {
		return new IPhoneX();
	}
}
