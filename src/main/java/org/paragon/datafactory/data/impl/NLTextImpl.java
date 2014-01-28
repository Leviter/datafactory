package org.paragon.datafactory.data.impl;

import org.apache.commons.lang3.StringUtils;
import org.paragon.datafactory.data.Text;
import org.paragon.datafactory.util.ItemSelector;

public class NLTextImpl extends ItemSelector implements Text {

	private static String[] articles = {
			"de", "het", "een"
	};

	private static String[] prepositions = {
			"van", "op", "tot", "over", "door", "achter", "voor", "naast", "in", "buiten", "tegen", "onder", "vanaf",
			"met", "bij"
	};

	private static String[] nouns = {
			"aambeeld", "aandeel", "aandeelhoudersvergadering", "auto",
			"bier", "boek", "broek", "brood",
			"caravan",
			"droom",
			"eenwieler",
			"fiets",
			"paard",
			"zus", "zwaard"
	};

	private static String[] verbs = {
			"kan", "is", "wordt", "verbindt", "liep", "benadert", "achterhaalde", "vervangt", "loopt"
	};

	@Override
	public String getSentence() {
		StringBuffer sentence = new StringBuffer();

		sentence.append(getItem(articles)).append(" ");
		sentence.append(getItem(nouns)).append(" ");
		sentence.append(getItem(verbs)).append(" ");
		sentence.append(getItem(prepositions)).append(" ");
		sentence.append(getItem(articles)).append(" ");
		sentence.append(getItem(nouns)).append(".");

		return StringUtils.capitalize(sentence.toString());
	}
}
