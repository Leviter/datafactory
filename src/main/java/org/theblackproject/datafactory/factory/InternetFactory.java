package org.theblackproject.datafactory.factory;

import lombok.Getter;
import org.theblackproject.datafactory.data.Internet;
import org.theblackproject.datafactory.data.impl.InternetImpl;

public class InternetFactory {

	@Getter
	private Internet internet = new InternetImpl();

}
