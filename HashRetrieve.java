package AssignII;
import java.util.*;

public class HashRetrieve{
	public static void CreateHash(Hashtable <String, Integer> people){
		people.put("Jack", 21);
		people.put("Rose", 20);
		people.put("Mario", 16);
		people.put("Elliot", 23);
		people.put("Dendi", 27);
		people.put("Rtz", 23);
		people.put("Sumail", 17);
		people.put("Burning", 27);
		people.put("Iceiceice", 23);
		people.put("Pis", 24);
	}
	public static void main(String atgs[]){
		Hashtable <String, Integer> people = new Hashtable <String, Integer> ();
		CreateHash(people);
		//long start = System.currentTimeMillis();
		Random random = new Random();
		List <String> keys = new ArrayList <String>(people.keySet());
		String RandomName = keys.get(random.nextInt(keys.size()));
		int Age = people.get(RandomName);
		//long finish = System.currentTimeMillis();
		System.out.println("The age of " + RandomName + " is " + Age);
		//System.out.println("It takes " + (finish-start) + " seconds to get " + RandomName + "'s name");
	}
}
