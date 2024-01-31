package factory.method.after.factory;

import factory.method.after.model.IPhoneAbstract;
import factory.method.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {
	public IPhoneAbstract createIPhone() {
		return new IPhoneXSMax();
	}
}
