import java.util.Scanner;

public class Hello {

public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		Scanner in = new Scanner(System.in);
		System.out.println("input score : ");
		double score = in.nextDouble();
		
		Grade grade = new Grade(score);
		System.out.println(grade.calculateGrade());
	}

}
