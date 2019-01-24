/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courses;

/**
 *
 * @author ajay
 */
public class Course {
    private int courseId;
    private String courseName;
    private double creditHours;

    public Course(int courseId, String courseName, double creditHours) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(double creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
        return "courseId=" + courseId + ", courseName=" + courseName +
                ", creditHours=" + creditHours;
    }
    
    
    
}
