package pkg1;

public class assignment1 {
int age;
int enroll;
public void display1() {
	System.out.println("wellcome to all of you");
}
public void display2() {
	System.out.println("automation id=s very eaisy");
}
public static void main(String[] args) {
	assignment1 abc = new assignment1();
	abc.display1();
	abc.display2();
	abc.age = 23;
	abc.enroll = 45;
	System.out.println("The age of the student is"+ abc.age);
	System.out.println("The enroll of the student is"+ abc.enroll);
}
}
