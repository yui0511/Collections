package ex.main;

public class ExUtil {

	void printPerfomance(String mod, long start, long finish){
		System.out.println("\n");
		System.out.println(mod + " : start : " + start);
		System.out.println(mod + " : finish : " + finish);
		System.out.println(mod + " : " + (finish - start));
	}

	String addKeys(String keys, int key){

		keys += key + " ";

		return keys;
	}
}
