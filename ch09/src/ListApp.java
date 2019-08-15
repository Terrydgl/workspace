import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListApp {

	public static void main(String[] args) {
		
//		Vector<String> vector = new Vector<String>();
//		vector.add("1111");
//		vector.add("2222");
//		vector.add("33333");
		
		
		 testLinkedList();

		// testArrayList();
	}

	private static void testArrayList() {
		ArrayList<String> list = new ArrayList<String>(8);
		list.add("ABCD"); // 尾部顺序添加
		list.add("1234"); // 尾部顺序添加

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("\t%s", list.get(i));
		}

		System.out.println("\n\n");

		list.add(1, "中国"); // 插入
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("\t%s", list.get(i));
		}
		System.out.println();

		boolean flag = list.contains("中国");
		System.out.println("list集合包含字符串(中国): " + flag);
		System.out.println();

		list.set(1, "China"); // 替换
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("\t%s", list.get(i));
		}
		System.out.println();

		// 删除
		list.remove(1); // 通过指定下标删除
		list.remove("ABCD"); // 通过指定元素值,直接删除
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("\t%s", list.get(i));
		}
		System.out.println();

		System.out.println("list 為空: " + list.isEmpty());
		System.out.println();

		// 通过Arrays.asList 快速构架集合对象
		List<String> data = Arrays.asList("泰國", "新加坡", "印度尼西亞");

		list.addAll(data); // 加入已有集合
		System.out.println("list长度为: " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("\t%s", list.get(i));
		}
		System.out.println();

		// 清空所有數據
		list.clear();
		System.out.println("list.clear() 之後 為空: " + list.isEmpty());

		int index = data.indexOf("泰國");
		System.out.println("data.indexOf(\"泰國\") = " + index);
		System.out.println();

		/////////////////////////////////////////////////////////////////
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("张思德", 90, "男"));
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			System.out.printf("姓名%4s\t年龄%2d\t性别%s\n", student.getName(), student.getAge(), student.getSex());
		}
		System.out.println();
	}

	
	//LinkedList,无序排列
	private static void testLinkedList() {
		LinkedList<String> data = new LinkedList<String>();
		data.add("AAA"); //将指定元素添加到此列表的结尾
		data.push("BBB"); //将元素推入此列表所表示的堆栈。换句话说，将该元素插入此列表的开头。 
		data.addFirst("CCC");   //将指定元素插入此列表的开头
		
		
		for (int i = 0; i < data.size(); i++) {
			System.out.printf("%3s ", data.get(i));
		}
		System.out.println("\n");

		// 获取第一个元素
		System.out.println(data.element());
		System.out.println(data.get(0));
		System.out.println(data.getFirst());
		System.out.println(data.peek());
		System.out.println(data.peekFirst());

		// 获取最后一个元素
		System.out.println(data.get(data.size() - 1));
		System.out.println(data.getLast());
	}

}
