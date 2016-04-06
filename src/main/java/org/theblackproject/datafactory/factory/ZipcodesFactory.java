package org.theblackproject.datafactory.factory;

import lombok.Getter;
import org.theblackproject.datafactory.data.Zipcodes;
import org.theblackproject.datafactory.data.impl.NLZipcodesImpl;

import java.util.Locale;

public class ZipcodesFactory {

	@Getter
	private Zipcodes zipcodes;

	public ZipcodesFactory(Locale locale) {
		if (locale != null) {
			// Use the country based on the ISO 3166-2 code
			switch (locale.getCountry()) {
				case "NL":
					zipcodes = new NLZipcodesImpl();
					break;
				default:
					zipcodes = new NLZipcodesImpl();
					break;
			}
		} else {
			zipcodes = new NLZipcodesImpl();
		}
	}
}
