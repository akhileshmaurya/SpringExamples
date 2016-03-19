package test.akhilesh.hackerearth.colabnet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonksSchool {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1[] = br.readLine().trim().split(" ");
		int n = Integer.parseInt(input1[0]);
		int m = Integer.parseInt(input1[1]);
		List<String> teachersName = new ArrayList<String>();
		Map<String, List<Student>> map = new HashMap<String, List<Student>>();
		for (int i = 0; i < n; i++) {
			String tName = br.readLine().trim();
			teachersName.add(tName);
			map.put(tName, new ArrayList<Student>());
		}
		String[] input2;
		for (int i = 0; i < m; i++) {
			input2 = br.readLine().trim().split(" ");
			map.get(input2[0].trim()).add(new Student(input2[1], Integer.parseInt(input2[2].trim())));
		}
		Collections.sort(teachersName);
		for (String tName : teachersName) {
			System.out.println(tName);
			List<Student> slist = map.get(tName);
			Collections.sort(slist);
			for (Student student : slist) {
				System.out.println(student.getName() + " " + student.getAge());
			}
		}
	}

}

class Student implements Comparable<Student> {
	String name;
	int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public int compareTo(Student s) {
		return this.age - s.age;
	}

}

/*
 * Today is the 25th anniversary of Berland International School in Berland. On
 * this auspicious Occasion, our friend Monk has been given the responsibility
 * of preparing the Inventory for his school. There are exactly N N teachers and
 * M M students in the school. Each of these teachers teaches arbitary number of
 * students. However, each student is taught by exactly one teacher. Monk has
 * been given the task of finding out for each teacher the Students he/she
 * teaches. For each student Monk has been given the Student's Name and Age.
 * However , Monk is too busy , So he has assigned this task to us. We need to
 * print the name of the Teacher and the Name and age of the students that
 * he/she teaches. However, there is a catch here. We need to print the list of
 * students of each Teacher in Lexicographical order of their names . That is
 * list of the teacher with lexicographically smaller name will appear before
 * other teachers with lexicographically greater names. In Addition , The
 * students appearing in a particular teachers list should appear in Increasing
 * order of their Age.
 * 
 * Input Format :
 * 
 * The first line contains two integers N N and M M denoting the number of
 * Teachers and number of Students respectively. Each of the next N N lines
 * contain a single string denoting a Teachers name.It is guaranteed that each
 * teachers name shall be unique. The next M M lines contain 2 Strings and an
 * Integer, denoting the Teachers name, a Student's name being taught by that
 * Teacher and that Student's Age. It is guaranteed that each Student's name
 * shall be unique and shall appear only once in the Input.
 * 
 * Output Format:
 * 
 * Print N + M N+M lines . Print the teachers name first and then the name and
 * age of each student taught by this teacher. The list of each teacher should
 * appear in order of their lexicographical rank in comparision to all other
 * teachers. For example the list of the teacher with lexicographically smallest
 * name should appear first, then the list of the teacher with the 2nd smallest
 * lexicographical name and so on. The students in a particular teachers list
 * should appear in the output in Increasing order of their Age.
 * 
 * Constraints:
 * 
 * 1 ≤ N ≤ 100 1≤N≤100
 * 
 * 1 ≤ M ≤ 10 5 1≤M≤105
 * 
 * 1 ≤ A g e 1≤Age o f of E a c h Each S t u d e n t ≤ 10 6 Student≤106
 * 
 * 1 ≤ L e n g t h 1≤Length o f of e a c h each S t u d e n t Student a n d and
 * T e a c h e r s Teachers N a m e ≤ 35 Name≤35
 * 
 * The Name of Each Teacher and Student will consist of Lowercase English
 * Alphabets only.
 * 
 * It is guaranteed that no two students with the same age shall appear in the
 * same Teacher's List.
 * 
 * Hint : You Need to Use Comparable Interface Here.
 * 
 * Sample Input(Plaintext Link) 3 4 vasya petya kolya vasya errichto 21 kolya
 * petr 22 petya egor 19 vasya tourist 19 Sample Output(Plaintext Link) kolya
 * petr 22 petya egor 19 vasya tourist 19 errichto 21
 */
