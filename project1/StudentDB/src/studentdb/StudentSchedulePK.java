/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author euclidesafonso
 */
@Embeddable
public class StudentSchedulePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "student_id")
    private String studentId;
    @Basic(optional = false)
    @Column(name = "Courses")
    private String courses;

    public StudentSchedulePK() {
    }

    public StudentSchedulePK(String studentId, String courses) {
        this.studentId = studentId;
        this.courses = courses;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentId != null ? studentId.hashCode() : 0);
        hash += (courses != null ? courses.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentSchedulePK)) {
            return false;
        }
        StudentSchedulePK other = (StudentSchedulePK) object;
        if ((this.studentId == null && other.studentId != null) || (this.studentId != null && !this.studentId.equals(other.studentId))) {
            return false;
        }
        if ((this.courses == null && other.courses != null) || (this.courses != null && !this.courses.equals(other.courses))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studentdb.StudentSchedulePK[ studentId=" + studentId + ", courses=" + courses + " ]";
    }
    
}
