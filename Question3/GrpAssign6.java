
public class GrpAssign6 {

	interface pen {
		public void write();

		public void refill();
	}

	interface pencil {
		public void write();

		public void sharpen();
	}

	static class Student implements pen, pencil {

		@Override
		public void sharpen() {
		}

		@Override
		public void write() {

		}

		@Override
		public void refill() {

		}

		public String displayStudent() {
			return "Student is writing";
		}
	}

	public static void main(String[] args) {

		Student student1 = new Student();
		System.out.println(student1.displayStudent());
	}

}
