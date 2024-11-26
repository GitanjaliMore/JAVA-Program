package conn;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
		public static void main(String[] args) {
			TreeMap<String,Integer> hm = new TreeMap<String,Integer>();
			hm.put("JFS",250);
			hm.put("PFS",220);
			hm.put("MEAN",150);
			hm.put("MERN",150);
		
			System.out.println(hm);
			hm.put("JFS", 300);
			System.out.println(hm);
			hm.put(null, null);
			System.out.println(hm);
			
			System.out.println(hm.keySet());
			System.out.println(hm.values());
			System.out.println(hm.entrySet());
			
			//Traverse
			for(Map.Entry<String, Integer> entry : hm.entrySet()){
				System.out.println(entry);
				System.out.println(entry.getKey()+"-----"+entry.getValue());
				
			}
		}

	}

