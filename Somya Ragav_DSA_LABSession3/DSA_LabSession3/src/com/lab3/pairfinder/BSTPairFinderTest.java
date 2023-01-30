package com.lab3.pairfinder;

import com.lab3.pairfinder.bst.BinarySearchTree;
import com.lab3.pairfinder.bst.TestDataUtils;

import internal.Log;

public class BSTPairFinderTest {

	public static void main(String[] args) {

		test(120);
	}

	private static void test(int sum) {

		// Log.ENABLE = true;

		BinarySearchTree tree = TestDataUtils.sampleBST1();

		Log.ENABLE = true;

		BSTPairFinder finder = new BSTPairFinder(tree);

		finder.findPair(sum);

		System.out.println("-----------------------");

		Log.ENABLE = false;

	}
}
