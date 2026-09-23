package collegeInfoCollection.springPointOfView;

import collegeInfoCollection.javaPointOfView.Address;

public class Student {
    private String name;
    private String mobileNumber;
    private collegeInfoCollection.javaPointOfView.Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public collegeInfoCollection.javaPointOfView.Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
