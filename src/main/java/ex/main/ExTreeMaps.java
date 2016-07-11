package ex.main;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExTreeMaps {

	//declare iterator
	 ExUtil util;

	 TreeMap<Integer, String> treeMap;
	 Iterator<Map.Entry<Integer, String>> iterator;

	long begin, end;
	String keys;

	public ExTreeMaps (int mapSize, int randomRange) {

		// initialize
		util = new ExUtil();

		treeMap = new TreeMap<Integer, String>();
		keys = "\n";

		// put values in treemap
		begin = System.currentTimeMillis();
		for (int i = 0; i < mapSize; i++){
			int key = (int)(Math.random()*randomRange);
			treeMap.put(key, "value");
			keys = util.addKeys(keys, key);
		}

		end = System.currentTimeMillis();
		util.printPerfomance("put/tree", begin, end);
		System.out.println("treeMap keys : " + keys);

		// get entries from treemap
		// iterator
		iterator = treeMap.entrySet().iterator();
		System.out.println("");
		begin = System.currentTimeMillis();
		while(iterator.hasNext()){
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.hashCode());
		}
		end = System.currentTimeMillis();
		util.printPerfomance("get/tree", begin, end);

	}


}
