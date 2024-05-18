package main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AncestorFinder {

	public static void main(String[] args) {

		Map<String, List<String>> m = new HashMap<>();
		m.put("max", new ArrayList<>(Arrays.asList("Joseph")));
		m.put("Joseph", new ArrayList<>(Arrays.asList("jeff", "john", "cynthia")));
		m.put("jeff", new ArrayList<>(Arrays.asList("totoy", "yuna")));
		m.put("john", new ArrayList<>(Arrays.asList("john1", "john2", "john3")));
		m.put("john1", new ArrayList<>(Arrays.asList("john4")));
//		ancestors(m, "max");
		for (Person p : ancestors(m, "max")) {
			System.err.println(p.getName());
			printP(p.getChildren());
		}

		
		// List<Person> grand = ancestors(m, null); // start from level 0
	 //        for (Person p : grand) {
	 //            System.err.println(p.getName());
	 //            TreeNode parent = new DefaultTreeNode(p, root);
	 //            printP(p.getChildren(), parent); 
	 //        }
		
	}

	static void printP(List<Person> l) {
		if (l == null) {
			return;
		}

		for (Person p : l) {
			System.err.println(p);
			printP(p.getChildren());
		}

	}
	
	//  static void printP(List<Person> l, TreeNode parent) {
	//         if (l == null) {
	//                 return;
	//         }
	//         for (Person p : l) {
	//             TreeNode c = new DefaultTreeNode(p, parent);
	//             printP(p.getChildren(), c); 
	//         }
	// }

	public static List<Person> ancestors(Map<String, List<String>> g, String p) {
		if (g.containsKey(p)) {
			List<String> parents = g.get(p);
			List<Person> result = new ArrayList<>();
			for (String parent : parents) {
				Person person = new Person(parent);
				person.setChildren(ancestors(g, parent));
				result.add(person);
			}
			return result;
		}
		return new ArrayList<>();
	}

	public static class Person {
		private String name;
		private List<Person> children;

		public Person(String name) {
			this.name = name;
			this.children = new ArrayList<>();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Person> getChildren() {
			return children;
		}

		public void setChildren(List<Person> children) {
			this.children = children;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name + ":" + children;
		}
	}
}
