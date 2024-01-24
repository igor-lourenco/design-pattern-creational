package factory.method.halfSimple.factory;

import factory.method.halfSimple.model.IPhoneAbstract;
import factory.method.halfSimple.model.IPhoneX;
import factory.method.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	@Override
	protected IPhoneAbstract createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX();
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax();
		} else return null;
	}

}
