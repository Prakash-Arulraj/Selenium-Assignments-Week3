package week3.day1.Assignments4;

public class Students {
	public void getstudentinfo(int id) {
		System.out.println("student id is"+" "+id);
	}

	public void getstudentinfo(int id, String name) {
		System.out.println("student id is"+" " +id+ ", "+ "student name is"+" "+name);

	}

	public void getstudentinfo(String mail, long phno) {
		System.out.println("student mail is"+" "+mail+", "+"student phone number is"+" "+phno);

	}

	public static void main(String[] args) {
		Students details = new Students();
		details.getstudentinfo(137);
		details.getstudentinfo(137, "prakash");
		details.getstudentinfo("xyz", 8973571004L);
	}

}
