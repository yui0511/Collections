package ex.main;

import java.util.Map.Entry;
import java.util.TreeMap;

public class ExTreeMaps extends AbstractedMaps {

	public ExTreeMaps (String type, int mapSize, int randomRange) {

		// initialize
		util = new ExUtil();

		map = new TreeMap<Integer, String>();
		keys = "\n";

		// put values in map
		begin = System.currentTimeMillis();
		for (int i = 0; i < mapSize; i++){
			int key = (int)(Math.random()*randomRange);
			map.put(key, "value");
			keys = util.addKeys(keys, key);
		}

		end = System.currentTimeMillis();
		util.printPerfomance("put/" + type, begin, end);
		System.out.println("map keys : " + keys);

		// get entries from map
		// iterator
		iterator = map.entrySet().iterator();
		System.out.println("");
		begin = System.currentTimeMillis();
		while(iterator.hasNext()){
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.hashCode());
		}
		end = System.currentTimeMillis();
		util.printPerfomance("get/" + type, begin, end);

	}


}
