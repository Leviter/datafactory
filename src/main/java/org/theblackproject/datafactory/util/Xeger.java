package org.theblackproject.datafactory.util;

import dk.brics.automaton.Automaton;
import dk.brics.automaton.RegExp;
import dk.brics.automaton.State;
import dk.brics.automaton.Transition;

import java.util.List;
import java.util.Random;

public class Xeger {
	private final Automaton automaton;
	private final Random random;

	public Xeger(String regex, Random random) {
		this.automaton = new RegExp(regex).toAutomaton();
		this.random = random;
	}

	public Xeger(String regex) {
		this(regex, new Random());
	}

	public String generate() {
		StringBuilder builder = new StringBuilder();
		generate(builder, automaton.getInitialState());
		return builder.toString();
	}

	private void generate(StringBuilder builder, State state) {
		List<Transition> transitions = state.getSortedTransitions(true);
		if (transitions.size() == 0) {
			return;
		}
		int nbOptions = state.isAccept() ? transitions.size() : transitions.size() - 1;
		int option = getRandomInt(0, nbOptions, random);
		if (state.isAccept() && option == 0) {          // 0 is considered stop
			return;
		}
		// Moving on to next transition
		Transition transition = transitions.get(option - (state.isAccept() ? 1 : 0));
		appendChoice(builder, transition);
		generate(builder, transition.getDest());
	}

	private void appendChoice(StringBuilder builder, Transition transition) {
		char c = (char) getRandomInt(transition.getMin(), transition.getMax(), random);
		builder.append(c);
	}

	private int getRandomInt(int min, int max, Random random) {
		int dif = max - min;
		float number = random.nextFloat();              // 0 <= number < 1
		return min + Math.round(number * dif);
	}
}