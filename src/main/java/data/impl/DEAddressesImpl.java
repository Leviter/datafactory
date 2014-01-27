package data.impl;

import data.Addresses;

public class DEAddressesImpl implements Addresses {

	private static String[] cities = {
			"Berlin", "Hamburg", "München", "Köln", "Frankfurt", "Essen", "Dortmund", "Stuttgart", "Düsseldorf",
			"Bremen", "Hannover", "Duisburg", "Nürnberg", "Leipzig", "Dresden", "Bochum", "Wuppertal", "Bielefeld",
			"Bonn", "Mannheim", "Karlsruhe", "Gelsenkirchen", "Wiesbaden", "Dorsten", "Worms", "Lüdenscheid",
			"Tübingen", "Neumünster", "Marburg", "Castrop-Rauxel", "Arnsberg", "Delmenhorst", "Konstanz", "Gladbeck",
			"Viersen", "Rheine", "Brandenburg", "Bayreuth", "Detmold", "Troisdorf", "Celle", "Frankfurt", "Bocholt",
			"Norderstedt", "Dinslaken", "Gießen", "Neubrandenburg", "Bamberg", "Unna", "Aschaffenburg", "Herten",
			"Neuwied", "Lüneburg", "Lippstadt", "Aalen", "Herford", "Grevenbroich", "Plauen", "Garbsen", "Dormagen",
			"Kerpen", "Schwäbisch Gmünd", "Fulda", "Bergheim", "Sindelfingen", "Wesel", "Weimar", "Kempten", "Görlitz",
			"Hameln", "Menden", "Rüsselsheim", "Langenfeld", "Stolberg", "Rosenheim", "Hattingen", "Offenburg",
			"Landshut", "Göppingen", "Stralsund", "Friedrichshafen", "Meerbusch", "Bergkamen", "Hilden", "Ahlen",
			"Sankt Augustin", "Eschweiler", "Schweinfurt", "Bad Salzuflen", "Wolfenbüttel", "Neustadt", "Hürth",
			"Cuxhaven", "Euskirchen", "Bad Homburg", "Gummersbach", "Pulheim", "Lingen", "Baden-Baden", "Nordhorn",
			"Emden", "Schwerte", "Waiblingen", "Heidenheim", "Greifswald", "Langenhagen", "Wetzlar", "Hoyerswerda",
			"Bad Oeynhausen", "Neunkirchen", "Hof", "Erftstadt", "Peine", "Passau", "Erkrath", "Speyer", "Ibbenbüren",
			"Frankenthal", "Willich", "Soest", "Kleve", "Neu-Ulm", "Wittenberg", "Ravensburg", "Elmshorn", "Albstadt",
			"Gotha", "Herzogenrath", "Kamen", "Dülmen", "Frechen", "Suhl", "Homburg", "Rastatt", "Pirmasens", "Lörrach",
			"Freiberg", "Melle", "Alsdorf", "Böblingen", "Nordhausen", "Stade", "Gronau", "Neustadt", "Wismar",
			"Goslar", "Straubing", "Bünde", "Gifhorn", "Singen", "Bad Kreuznach", "Leonberg", "Lehrte", "Bornheim",
			"Eberswalde", "Weiden", "Brühl", "Erkelenz", "Rodgau", "Kaarst", "Amberg", "Coburg", "Fellbach",
			"Rheda-Wiedenbrück", "Eisenach", "Lahr", "Völklingen", "Weinheim", "Oberursel", "Monheim", "Filderstadt",
			"Altenburg", "Lemgo", "Hennef", "Freising", "Aurich", "Eisenhüttenstadt", "Memmingen", "Wunstorf",
			"Bruchsal", "Löhne", "Halberstadt", "Heinsberg", "Rottenburg", "Nettetal", "Kaufbeuren", "Bautzen",
			"Landau", "Borken", "Seevetal", "Dreieich", "Schwedt", "Kamp-Lintfort", "Bietigheim-Bissingen",
			"Sankt Ingbert", "Ansbach", "Neumarkt", "Pinneberg", "Dachau", "Nürtingen", "Stendal", "Kirchheim",
			"Bensheim", "Schorndorf", "Voerde", "Schwabach", "Hückelhoven", "Warendorf", "Ahaus", "Laatzen",
			"Ettlingen", "Beckum", "Königswinter", "Mettmann", "Hemer", "Buxtehude", "Riesa", "Mühlhausen", "Pirna",
			"Saarlouis", "Hofheim", "Maintal", "Datteln", "Münster", "Mönchengladbach", "Chemnitz", "Augsburg",
			"Braunschweig", "Aachen", "Krefeld", "Halle", "Kiel", "Magdeburg", "Oberhausen", "Lübeck", "Freiburg",
			"Hagen", "Erfurt", "Kassel", "Rostock", "Mainz", "Hamm", "Saarbrücken", "Herne", "Mülheim", "Solingen",
			"Osnabrück", "Ludwigshafen", "Leverkusen", "Oldenburg", "Neuss", "Paderborn", "Heidelberg", "Darmstadt",
			"Potsdam", "Würzburg", "Göttingen", "Regensburg", "Recklinghausen", "Bottrop", "Wolfsburg", "Heilbronn",
			"Ingolstadt", "Ulm", "Remscheid", "Pforzheim", "Bremerhaven", "Offenbach", "Fürth", "Reutlingen",
			"Salzgitter", "Siegen", "Gera", "Koblenz", "Moers", "Bergisch Gladbach", "Cottbus", "Hildesheim", "Witten",
			"Zwickau", "Erlangen", "Iserlohn", "Trier", "Kaiserslautern", "Jena", "Schwerin", "Gütersloh", "Marl",
			"Lünen", "Esslingen", "Velbert", "Ratingen", "Düren", "Ludwigsburg", "Wilhelmshaven", "Hanau", "Minden",
			"Flensburg", "Dessau", "Villingen-Schwenningen"
	};

	@Override
	public String[] getCities() {
		return cities;
	}

	private static String[] states = {
			"Baden-Württemberg", "Bayern", "Berlin", "Brandenburg", "Bremen", "Hamburg", "Hessen",
			"Mecklenburg-Vorpommern", "Niedersachsen", "Nordrhein-Westfalen", "Rheinland-Pfalz", "Saarland", "Sachsen",
			"Sachsen-Anhalt", "Schleswig-Holstein", "Thüringen"
	};

	@Override
	public String[] getStates() {
		return states;
	}
}
