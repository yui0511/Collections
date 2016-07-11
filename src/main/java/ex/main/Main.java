package ex.main;

public class Main {

	public static void main(String[] args) {

		int index = 10;
		int random = 10000;


		// HashMaps
		new ExHashMaps("hash",index, random);

		new ExTreeMaps("tree", index, random);

		new ExLinkedMaps("linked", index, random);

	}

}
