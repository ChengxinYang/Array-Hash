package AssignII;
import java.util.*;

public class ArrayRetrieve{
	public static void main (String args[]){
		String[][] people = {{"Jack", "21"},
							 {"Rose", "20"}, 
							 {"Mario", "16"}, 
							 {"Elliot", "24"}, 
							 {"Dendi", "27"},
							 {"Rtz", "23"},
							 {"Sumail", "17"},
							 {"Burning", "26"},
							 {"Iceiceic", "23"},
							 {"Pis", "24"}};
		Random random = new Random ();
		int RandomKey = random.nextInt(people.length);
		for(int i = 0; i < people.length; i++){
			if (people[i][0].equals(people[RandomKey][0])){
				System.out.println("the age of " + people[i][0] + " is " + people[i][1]);
			}
		}
	}
}
