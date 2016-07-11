package ex.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ExHashMaps {

	// declarations
	ExUtil util;

	HashMap<Integer, String> hashMap;
	Iterator<Map.Entry<Integer, String>> iterator;

	long begin, end;
	String keys;

	public ExHashMaps(int mapSize, int randomRange){

		// initialize
		hashMap = new HashMap<Integer, String>();
		util = new ExUtil();
		keys = "\n";

		//put values in hashmap
		begin = System.currentTimeMillis();

		for(int i = 0;i<mapSize;i++){
			int key = (int) (Math.random() * randomRange);
			hashMap.put(key, "value");
			keys = util.addKeys(keys, key);
		}

		end = System.currentTimeMillis();

		System.out.println("hashMap keys : " + keys);
		util.printPerfomance("put/hash", begin, end);

		// get entries from hashMap
		// iterator
		iterator = hashMap.entrySet().iterator();

		begin = System.currentTimeMillis();

		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey()+ " " + entry.hashCode());
		}

		end = System.currentTimeMillis();
		util.printPerfomance("get/hash", begin, end);
/*
		// get entries from hashmap
		// for loop
		System.out.println("");
		startTime = System.currentTimeMillis();
		for (int i : hashMap.keySet()){
			System.out.print(i + " ");
		}
		finishTime = System.currentTimeMillis();
		printPerfomance("get/hash", startTime, finishTime);
*/

	} // end constructor

}