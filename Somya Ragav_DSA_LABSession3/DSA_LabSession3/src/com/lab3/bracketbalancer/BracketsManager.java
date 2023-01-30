package com.lab3.bracketbalancer;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BracketsManager {

	private static Set<BracketsDefiner> predefinedBracketsDefiners;

	static {

		predefinedBracketsDefiners = new LinkedHashSet<BracketsDefiner>();

		predefinedBracketsDefiners.add(new BracketsDefiner('(', ')'));

		predefinedBracketsDefiners.add(new BracketsDefiner('[', ']'));

		predefinedBracketsDefiners.add(new BracketsDefiner('{', '}'));

		predefinedBracketsDefiners.add(new BracketsDefiner('<', '>'));
	}

	public static Set<Character> getOpenBracketsDefinerCharsSet() {

		Set<Character> result = new LinkedHashSet<Character>();

		Iterator<BracketsDefiner> iterator = predefinedBracketsDefiners.iterator();

		while (iterator.hasNext()) {

			BracketsDefiner BracketsDefiner = iterator.next();

			result.add(BracketsDefiner.getOpenChar());
		}
		return result;
	}

	public static Set<Character> getCloseBracketsDefinerCharsSet() {

		Set<Character> result = new LinkedHashSet<Character>();

		Iterator<BracketsDefiner> iterator = predefinedBracketsDefiners.iterator();

		while (iterator.hasNext()) {

			BracketsDefiner BracketsDefiner = iterator.next();

			result.add(BracketsDefiner.getCloseChar());
		}
		return result;
	}

	public static BracketsDefiner getBracketsDefiner(Character closeBracketsDefiner) {

		for (BracketsDefiner predefinedBracketsDefiner : predefinedBracketsDefiners) {

			if (predefinedBracketsDefiner.getCloseChar().equals(closeBracketsDefiner)) {
				return predefinedBracketsDefiner;
			}
		}
		return null;
	}

}