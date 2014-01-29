package org.theblackproject.datafactory.data.impl;

import org.theblackproject.datafactory.data.Names;

public class DENamesImpl implements Names {

	private static String[] lastNames = {
			"Müller", "Schmidt", "Schneider", "Fischer", "Weber", "Schäfer", "Meyer", "Wagner", "Becker", "Bauer",
			"Hoffmann", "Schulz", "Koch", "Richter", "Klein", "Wolf", "Schröder", "Neumann", "Braun", "Werner",
			"Schwarz", "Hofmann", "Zimmermann", "Schmitt", "Hartmann", "Schmid", "Weiß", "Schmitz", "Krüger", "Lange",
			"Meier", "Walter", "Köhler", "Maier", "Beck", "König", "Krause", "Schulze", "Huber", "Mayer", "Frank",
			"Lehmann", "Kaiser", "Fuchs", "Herrmann", "Lang", "Thomas", "Peters", "Stein", "Jung", "Möller", "Berger",
			"Martin", "Friedrich", "Scholz", "Keller", "Groß", "Hahn", "Roth", "Günther", "Vogel", "Schubert",
			"Winkler", "Schuster", "Jäger", "Lorenz", "Ludwig", "Baumann", "Heinrich", "Otto", "Simon", "Graf", "Kraus",
			"Krämer", "Böhm", "Schulte", "Albrecht", "Franke", "Winter", "Schumacher", "Vogt", "Haas", "Sommer",
			"Schreiber", "Engel", "Ziegler", "Dietrich", "Brandt", "Seidel", "Kuhn", "Busch", "Horn", "Arnold", "Kühn",
			"Bergmann", "Pohl", "Pfeiffer", "Wolff", "Voigt", "Sauer"
	};

	@Override
	public String[] getLastNames() {
		return lastNames;
	}

	private static String[] prefixNames = {
			"an",
			"von"
	};

	@Override
	public String[] getPrefixNames() {
		return prefixNames;
	}

	private static String[] firstNamesFemale = {
			"Adelheid", "Agatha", "Agnes", "Alexandra", "Alheid", "Amalia", "Andrea", "Angelika", "Anja", "Anka",
			"Anke", "Antje", "Anna", "Anneliese", "Annette", "Arabella", "Asta", "Astrid", "Barbara", "Bärbel",
			"Beate", "Beatrix", "Berta", "Bertel", "Bettina", "Birgit", "Brigitte", "Brunhilde", "Charlotte", "Christa",
			"Christin", "Christina", "Claudia", "Dagmar", "Daniela", "Dora", "Doreen", "Dorle", "Dorothea", "Edda",
			"Edeltraud", "Effi", "Elfriede", "Elisabeth", "Elke", "Elsa", "Emma", "Erika", "Erna", "Eugenia", "Fieke",
			"Franziska", "Frieda", "Friedelinde", "Friederike", "Friedhilde", "Fritzi", "Gabi", "Gabriele", "Geli",
			"Gerda", "Gerlinde", "Gertraud", "Gertrud", "Gisela", "Gitta", "Gisela", "Gretchen", "Gusti", "Hannah",
			"Hannelore", "Hansi", "Hedda", "Hedwig", "Heide", "Heidemarie", "Heidi", "Heike", "Helga", "Helma", "Henni",
			"Herta", "Hilde", "Hildeberta", "Hildegard", "Ida", "Ilka", "Ilsa", "Ilse", "Ines", "Inge", "Inga",
			"Ingeborg", "Ingrid", "Irma", "Irmgard", "Irmhilde", "Irmtraud", "Isolde", "Jana", "Janina", "Jasmin",
			"Johanna", "Jolanda", "Julia", "Juliane", "Jutta", "Kai", "Kamilla", "Karin", "Karla", "Karolin",
			"Katharina", "Kathrin", "Katja", "Kerstin", "Kirsten", "Klara", "Klaudia", "Konstanze", "Kriemhilde",
			"Kristin", "Lara", "Lea", "Lena", "Lenore", "Letta", "Liese", "Lieselotte", "Lili", "Lilo", "Lotte",
			"Ludwiga", "Lulu", "Magda", "Magdalena", "Mandy", "Manuela", "Margaretha", "Margit", "Maria", "Marina",
			"Marlene", "Martina", "Mathilde", "Maxine", "Melanie", "Mila", "Minna", "Mirjam", "Mitzi", "Monika",
			"Nadine", "Nadja", "Nastasja", "Natascha", "Nicole", "Nina", "Ottilie", "Paula", "Pauline", "Petra", "Pia",
			"Renate", "Ria", "Romy", "Rosalinde", "Rosamunde", "Roswitha", "Sabine", "Sabrina", "Sandra", "Sara",
			"Seffi", "Senta", "Sigrid", "Sigrun", "Silke", "Simone", "Sophia", "Stefanie", "Steffi", "Susanne",
			"Tanja", "Theda", "Therese", "Traude", "Traute", "Trude", "Trudi", "Ulla", "Ulrike", "Uschi", "Ursula",
			"Uta", "Veronika", "Viktoria", "Walburga", "Waltraud", "Wendelin", "Wilfrieda", "Wilhelmina", "Wilma",
			"Winfried", "Yvonne"
	};

	@Override
	public String[] getFirstNamesFemale() {
		return firstNamesFemale;
	}

	private static String[] firstNamesMale = {
			"Abbo", "Achim", "Adolf", "Albrecht", "Alexander", "Alois", "Ambros", "Andreas", "Anselm", "Anton", "Armin",
			"Arnd", "Arno", "Arnold", "Arnulf", "Axel", "Augustus", "Axel", "Benjamin", "Bernd", "Bernhard", "Berthold",
			"Berti", "Bodo", "Bruno", "Carsten", "Christian", "Christof", "Clemens", "Conrad", "Curd", "Dagobert",
			"Detlef", "Dieter", "Dietrich", "Dierk", "Dolf", "Dominik", "Egon", "Elias", "Elmar", "Emil", "Emmerich",
			"Engelbert", "Erhard", "Erich", "Ernst", "Erwin", "Eugen", "Ewald", "Fabian", "Falco", "Felix", "Ferdinand",
			"Florian", "Franz", "Friedhelm", "Friedrich", "Fritz", "Gebhard", "Georg", "Gerhard", "Gernot", "Golo",
			"Gottfried", "Gotthold", "Gottlieb", "Gregor", "Günther", "Gustaf", "Hans", "Harald", "Hartmut", "Hartwig",
			"Heiner", "Heinrich", "Heinz", "Helge", "Helmut", "Herbert", "Hildebrand", "Holger", "Horst", "Hugbert",
			"Hugo", "Ignaz", "Ingemar", "Jan", "Jens", "Joachim", "Johann", "Johannes", "Jonas", "Jörg", "Jürgen",
			"Kai", "Karl", "Karlheinz", "Karsten", "Kaspar", "Klaus", "Knut", "Konrad", "Kristian", "Kristof", "Kurt",
			"Lars", "Laurenz", "Lenz", "Leon", "Leonhard", "Leopold", "Lothar", "Ludwig", "Lukas", "Luther", "Lutz",
			"Manfred", "Marcel", "Marco", "Mario", "Marius", "Markus", "Martin", "Matthäus", "Mathias", "Max",
			"Maximilian", "Meinhard", "Michael", "Nikolaus", "Nils", "Norbert", "Olof", "Oskar", "Oswald", "Oswin",
			"Otto", "Philipp", "Poldi", "Raimund", "Rainer", "Ralf", "Randolf", "Reinhard", "Reinhold", "René",
			"Richard", "Rüdiger", "Rudolf", "Rudi", "Rupert", "Schorsch", "Sebastian", "Sepp", "Siegfried", "Simon",
			"Stefan", "Steffen", "Sven", "Theodor", "Thomas", "Till", "Tim", "Timo", "Tobias", "Torsten", "Udo", "Ulf",
			"Ulrich", "Urban", "Urs", "Uwe", "Veit", "Viktor", "Vinzenz", "Volkard", "Volker", "Waldemar", "Walther",
			"Wendel", "Wenzel", "Werner", "Wilfried", "Wilhelm", "Wolfgang", "Wolfram"
	};

	@Override
	public String[] getFirstNamesMale() {
		return firstNamesMale;
	}
}
