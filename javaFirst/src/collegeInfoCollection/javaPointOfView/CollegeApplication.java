package collegeInfoCollection.javaPointOfView;

public class CollegeApplication {
    public Student setupStudentDetail(String location, int pincode, String name, String mobileNumber){
        Address address = new Address();
        Student student = new Student();

        address.setLocation(location);
        address.setPinCode(pincode);
        student.setAddress(address);
        student.setName(name);
        student.setMobileNumber(mobileNumber);
        return student;
    }

}
