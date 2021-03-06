package ex.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ExHashMaps extends AbstractedMaps {

	public ExHashMaps(String type, int mapSize, int randomRange){

		// initialize
		map = new HashMap<Integer, String>();
		util = new ExUtil();
		keys = "\n";

		//put values in hashmap
		begin = System.currentTimeMillis();

		for(int i = 0;i<mapSize;i++){
			int key = (int) (Math.random() * randomRange);
			map.put(key, "value");
			keys = util.addKeys(keys, key);
		}

		end = System.currentTimeMillis();

		System.out.println("map keys : " + keys);
		util.printPerfomance("put/" + type, begin, end);

		// get entries from map
		// iterator
		iterator = map.entrySet().iterator();

		begin = System.currentTimeMillis();

		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey()+ " " + entry.hashCode());
		}

		end = System.currentTimeMillis();
		util.printPerfomance("get/" + type, begin, end);
/*
		// get entries from map
		// for loop
		System.out.println("");
		startTime = System.currentTimeMillis();
		for (int i : map.keySet()){
			System.out.print(i + " ");
		}
		finishTime = System.currentTimeMillis();
		printPerfomance("get/hash", startTime, finishTime);
*/

	} // end constructor

}