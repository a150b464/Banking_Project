package com.john.purcell;

import java.util.Iterator;
import java.util.LinkedList;

class UrlLibrary implements Iterable<String> {

	private LinkedList<String> urls = new LinkedList<String>();

	public UrlLibrary(LinkedList<String> urls) {
		urls.add("ABC");
		urls.add("DEF");
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class IterableImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
