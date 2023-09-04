package DataStructures;
import java.util.*;
public class customHashFunction {
	public static int simpleHashFunction(String input)
	{
		int hashCode=0;
		for(int i=0;i<input.length();i++)
		{
			hashCode +=input.charAt(i);
		}
		return hashCode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> datamap=new HashMap<>();
		String name;
		int hashCode;
		name="Gayathri";
		hashCode=name.hashCode();
		//key -> hashCode
		datamap.put(hashCode, name);
		name="Indu";
		hashCode=name.hashCode();
		//key -> hashCode
		datamap.put(hashCode, name);
	    name="Afifa";
		hashCode=name.hashCode();
		//key -> hashCode
		datamap.put(hashCode, name);
		// gives the last pushed name s


		String outputname=datamap.get(hashCode);
		System.out.println("Name : "+ outputname);

	}

}
