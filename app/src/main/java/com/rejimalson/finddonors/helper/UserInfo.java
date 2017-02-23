package com.rejimalson.finddonors.helper;

/**
 * Created by REJIMALson on 2/23/2017.
 */

public class UserInfo {

    String fullName, bloodGroup, birthDay, gender;
    String phone, email;
    String country, state, district;
    String password;

    public UserInfo() {
      /*Blank default constructor essential for Firebase*/
    }

    public String getFullName() {
        return fullName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getDistrict() {
        return district;
    }

    public String getPassword() {
        return password;
    }
}
