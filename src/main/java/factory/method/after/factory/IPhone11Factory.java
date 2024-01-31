package factory.method.after.factory;

import factory.method.after.model.IPhone11;
import factory.method.after.model.IPhoneAbstract;

public class IPhone11Factory extends IPhoneFactory{
	public IPhoneAbstract createIPhone() {
		return new IPhone11();
	}
}
