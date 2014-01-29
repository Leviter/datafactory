package org.theblackproject.datafactory.factory;

import org.theblackproject.datafactory.data.Addresses;
import org.theblackproject.datafactory.data.impl.DEAddressesImpl;
import org.theblackproject.datafactory.data.impl.NLAddressesImpl;
import lombok.Getter;

import java.util.Locale;

public class AddressesFactory {

	@Getter
	private Addresses addresses;

	public AddressesFactory(Locale locale) {
		if (locale != null) {
			// Use the country based on the ISO 3166-2 code
			switch (locale.getCountry()) {
				case "DE":
					addresses = new DEAddressesImpl();
					break;
				case "NL":
					addresses = new NLAddressesImpl();
					break;
				default:
					addresses = new NLAddressesImpl();
					break;
			}
		} else {
			addresses = new NLAddressesImpl();
		}
	}
}
