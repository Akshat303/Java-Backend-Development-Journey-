package com.day41_markerInterface;

public class DataCleaner {

	public void clean(Object obj) {

		if (obj instanceof Cleanable) {
			System.out.println("Allow to perform the data cleaing !!!");
		} else {
			System.err.println("Not Allow to perform the data cleaing activity....");

		}

	}
}
