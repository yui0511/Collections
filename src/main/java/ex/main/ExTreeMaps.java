package ex.main;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExTreeMaps {

	// define maps
	TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
	ExUtil util = new ExUtil();

	String keys = "\n";

	//declare iterator
	Iterator<Map.Entry<Integer, String>> iterator;

	// put values in treemap
	startTime = System.currentTimeMillis();
	for (int i = 0; i < 20; i++){
		int key = (int)(Math.random()*100);
		treeMap.put(key, "value");
		util.addKeys(keys, key);
	}

	finishTime = System.currentTimeMillis();
	util.printPerfomance("put/tree", startTime, finishTime);
	System.out.println("treeMap keys : " + keys);

	// get entries from treemap
	// iterator
	iterator = treeMap.entrySet().iterator();
	System.out.println("");
	startTime = System.currentTimeMillis();
	while(iterator.hasNext()){
		Entry<Integer, String> entry = iterator.next();
		System.out.println(entry.getKey() + " " + entry.hashCode());
	}
	finishTime = System.currentTimeMillis();
	util.printPerfomance("get/tree", startTime, finishTime);

}
