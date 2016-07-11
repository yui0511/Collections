package ex.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExHashMaps {

	// declarations
	ExUtil util;

	HashMap<Integer, String> hashMap;
	Iterator<Map.Entry<Integer, String>> iterator;

	long begin, end;
	String keys;

	public ExHashMaps(){
		// initialize
		hashMap = new HashMap<Integer, String>();
		util = new ExUtil();
		keys = "\n";

		//put values in hashmap
		begin = System.currentTimeMillis();

		for(int i = 0;i<20;i++){
			int key = (int) (Math.random() * 100);
			hashMap.put(key, "value");
			util.addKeys(keys, key);
		}

		end = System.currentTimeMillis();

		//
	}

}