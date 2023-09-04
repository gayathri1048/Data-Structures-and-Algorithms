package DataStructures;
import java.util.*;
public class simpleHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> studentData =new Hashtable();
		studentData.put(1, "Gayathri");
		studentData.put(2, "indu");
		studentData.put(3, "afifa");
		int searchIndex=3;
		String name=studentData.get(searchIndex);
		System.out.println("Name is : "+name);
		

	}

}
