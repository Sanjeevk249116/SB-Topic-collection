import collegeInfoCollection.javaPointOfView.CollegeApplication;
import collegeInfoCollection.javaPointOfView.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CollegeApplication collegeApplication = new CollegeApplication();
    Student student = collegeApplication.setupStudentDetail("delhi",122002,"sanjeev kushwaha","8957937522");
    System.out.println(student.getAddress().getLocation());
}
