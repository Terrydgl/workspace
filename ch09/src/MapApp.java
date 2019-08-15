import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapApp {

	public static void main(String[] args) {
		//testLinkedHashMap();
		
		 testHashMap();
	}

	/**
	 * 有序HashMap
	 */
	private static void testLinkedHashMap() {
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		linkedHashMap.put("C", 333);
		linkedHashMap.put("A", 111);
		linkedHashMap.put("B", 222);
		
		Set<Entry<String, Integer>> entrySet = linkedHashMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "  -- " + entry.getValue());
		}
		System.out.println();
	}

	private static void testHashMap() {
		//////////////////////////////////////////////////////////////
		Map<String, String> contact = new HashMap<String, String>(5);
		// put 往集合中存放数据
		contact.put("DAD", "11111111111");
		contact.put("MOM", "22222222222");
		contact.put("GRANDPA", "33333333333");
		contact.put("GRANDMA", "44444444444");
		contact.put("UNCLE", "55555555555");
		// get 取数据
		String val = contact.get("DAD");
		System.out.println(val);
		System.out.println("contact.containsKey(\"UNCLE\") = " + contact.containsKey("UNCLE"));
		System.out.println("contact.containsValue(\"33333333333\") = " + contact.containsValue("33333333333"));
		System.out.println("contact.isEmpty() = " + contact.isEmpty());
		// 获取所有key
		Set<String> keySet = contact.keySet();
		Set<String> keys = keySet;
		// 获取迭代器
		Iterator<String> keyIterator = keys.iterator();
		while(keyIterator.hasNext()) {
			System.out.println(keyIterator.next());
		}
		System.out.println();
		
		// 获取值
		Collection<String> values = contact.values();
		Iterator<String> valueIterator = values.iterator();
		while (valueIterator.hasNext()) {
			System.out.println(valueIterator.next());
		}
		System.out.println();
		
		contact.entrySet();  //ctrl+shift+l
		// Set<Map.Entry<String, String>> xx = contact.entrySet();

		
		// 遍历Map方法之 ---- 遍历entry
		Set<Entry<String, String>> entrys = contact.entrySet();
		Iterator<Entry<String, String>> entryIterator = entrys.iterator();
		while (entryIterator.hasNext()) {
			Entry<String, String> item = entryIterator.next();
			System.out.println(item.getKey() + "  :::  " + item.getValue());
		}
		System.out.println();
		// TODO 使用增强for循环,遍历上述entrys
		for(Map.Entry<String, String> entry: contact.entrySet()) {
	         System.out.println("Key: "+ entry.getKey()+ " Value: "+entry.getValue());

		}
		System.out.println();
		System.out.println("___________________________");
		
		// 遍历Map方法之 ---- 遍历key
		Set<String> keys1 = contact.keySet();
		for (String x : keys1) {
			System.out.println(x + "  :::  " + contact.get(x));
		}
		
		System.out.println("contact.size() = " + contact.size());
		contact.remove("UNCLE");
		System.out.println("contact.size() = " + contact.size());
		//  清空
		contact.clear();
		System.out.println("contact.isEmpty()  = " + contact.isEmpty());
	}

}

class Student {

	private String name;
	private int age;
	private String sex;

	public Student(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}