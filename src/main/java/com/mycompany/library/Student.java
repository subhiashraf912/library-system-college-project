package com.mycompany.library;

public class Student {

    private int id;
    private String fullName;
    private int nationalityId;
    private String college;
    private String specialist;
    private int attendanceYear;

    public Student(int id, String fullName, int nationalityId, String college, String specialist, int attendanceYear) {
        this.id = id;
        this.fullName = fullName;
        this.nationalityId = nationalityId;
        this.college = college;
        this.specialist = specialist;
        this.attendanceYear = attendanceYear;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(int nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public int getAttendanceYear() {
        return attendanceYear;
    }

    public void setAttendanceYear(int attendanceYear) {
        this.attendanceYear = attendanceYear;
    }

    @Override
    public String toString() {
        return "Student { "
                + "fullName: '" + fullName + '\''
                + ", nationalityId: " + nationalityId
                + ", ID: " + id
                + ", college: '" + college + '\''
                + ", specialist: '" + specialist + '\''
                + ", attendanceYear: " + attendanceYear
                + " }";
    }
}
