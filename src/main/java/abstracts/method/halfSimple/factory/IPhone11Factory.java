package abstracts.method.halfSimple.factory;

import abstracts.method.halfSimple.model.IPhone11;
import abstracts.method.halfSimple.model.IPhone11Pro;
import abstracts.method.halfSimple.model.IPhoneAbstract;

public class IPhone11Factory  extends IPhoneFactory{

	@Override
	protected IPhoneAbstract createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11();
		} else if(level.equals("highEnd")) {
			return new IPhone11Pro();
		} else return null;
	}
}
