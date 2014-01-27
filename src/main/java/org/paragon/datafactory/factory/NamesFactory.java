package org.paragon.datafactory.factory;

import org.paragon.datafactory.data.Names;
import org.paragon.datafactory.data.impl.NLNamesImpl;
import lombok.Getter;

import java.util.Locale;

public class NamesFactory {

	@Getter
	private Names names;

	public NamesFactory(Locale locale) {
		if (locale != null) {
			// Use the country based on the ISO 3166-2 code
			switch (locale.getCountry()) {
				case "NL":
					names = new NLNamesImpl();
					break;
				default:
					names = new NLNamesImpl();
					break;
			}
		} else {
			names = new NLNamesImpl();
		}
	}
}
