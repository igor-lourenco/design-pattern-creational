package factory.method.after.factory;

import factory.method.after.model.IPhone11Pro;
import factory.method.after.model.IPhoneAbstract;

public class IPhone11ProFactory extends IPhoneFactory {
	public IPhoneAbstract createIPhone() {
		return new IPhone11Pro();
	}
}
