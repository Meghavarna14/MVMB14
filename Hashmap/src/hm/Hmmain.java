package hm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hmmain {

	public static void main(String[] args) {
		HashMap<Integer,String> hashMap=new HashMap<Integer, String>();
		hashMap.put(1,"Puma");
		hashMap.put(2,"Allen solly");
		hashMap.put(3,"Levis");
		for (Entry<Integer, String> entry:hashMap.entrySet()) {
			System.out.println("Key-"+entry.getKey()+"-value-"+entry.getValue());
		}
			System.out.println(hashMap);
	}
}


