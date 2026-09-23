package collegeInfoCollection.springPointOfView;

import collegeInfoCollection.javaPointOfView.Address;
import collegeInfoCollection.javaPointOfView.Student;

public class CollegeApplication {
    public collegeInfoCollection.javaPointOfView.Student setupStudentDetail(String location, int pincode, String name, String mobileNumber){
        collegeInfoCollection.javaPointOfView.Address address = new Address();
        collegeInfoCollection.javaPointOfView.Student student = new Student();

        address.setLocation(location);
        address.setPinCode(pincode);
        student.setAddress(address);
        student.setName(name);
        student.setMobileNumber(mobileNumber);
        return student;
    }
}
