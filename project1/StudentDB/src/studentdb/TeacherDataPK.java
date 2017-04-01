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
public class TeacherDataPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Faculty_id")
    private String facultyid;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @Column(name = "Courses_taught")
    private String coursestaught;

    public TeacherDataPK() {
    }

    public TeacherDataPK(String facultyid, String password, String coursestaught) {
        this.facultyid = facultyid;
        this.password = password;
        this.coursestaught = coursestaught;
    }

    public String getFacultyid() {
        return facultyid;
    }

    public void setFacultyid(String facultyid) {
        this.facultyid = facultyid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCoursestaught() {
        return coursestaught;
    }

    public void setCoursestaught(String coursestaught) {
        this.coursestaught = coursestaught;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facultyid != null ? facultyid.hashCode() : 0);
        hash += (password != null ? password.hashCode() : 0);
        hash += (coursestaught != null ? coursestaught.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TeacherDataPK)) {
            return false;
        }
        TeacherDataPK other = (TeacherDataPK) object;
        if ((this.facultyid == null && other.facultyid != null) || (this.facultyid != null && !this.facultyid.equals(other.facultyid))) {
            return false;
        }
        if ((this.password == null && other.password != null) || (this.password != null && !this.password.equals(other.password))) {
            return false;
        }
        if ((this.coursestaught == null && other.coursestaught != null) || (this.coursestaught != null && !this.coursestaught.equals(other.coursestaught))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studentdb.TeacherDataPK[ facultyid=" + facultyid + ", password=" + password + ", coursestaught=" + coursestaught + " ]";
    }
    
}
