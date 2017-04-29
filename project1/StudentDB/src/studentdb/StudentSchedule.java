/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Boss
 */
@Entity
@Table(name = "student_schedule")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StudentSchedule.findAll", query = "SELECT s FROM StudentSchedule s"),
    @NamedQuery(name = "StudentSchedule.findBySsSn", query = "SELECT s FROM StudentSchedule s WHERE s.ssSn = :ssSn"),
    @NamedQuery(name = "StudentSchedule.findByStudentId", query = "SELECT s FROM StudentSchedule s WHERE s.studentId = :studentId"),
    @NamedQuery(name = "StudentSchedule.findByFacultyid", query = "SELECT s FROM StudentSchedule s WHERE s.facultyid = :facultyid"),
    @NamedQuery(name = "StudentSchedule.findByCourseId", query = "SELECT s FROM StudentSchedule s WHERE s.courseId = :courseId"),
    @NamedQuery(name = "StudentSchedule.findByCourseName", query = "SELECT s FROM StudentSchedule s WHERE s.courseName = :courseName")})
public class StudentSchedule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ss_sn")
    private Integer ssSn;
    @Basic(optional = false)
    @Column(name = "student_id")
    private String studentId;
    @Basic(optional = false)
    @Column(name = "Faculty_id")
    private String facultyid;
    @Basic(optional = false)
    @Column(name = "course_id")
    private String courseId;
    @Basic(optional = false)
    @Column(name = "course_name")
    private String courseName;

    public StudentSchedule() {
    }

    public StudentSchedule(Integer ssSn) {
        this.ssSn = ssSn;
    }

    public StudentSchedule(Integer ssSn, String studentId, String facultyid, String courseId, String courseName) {
        this.ssSn = ssSn;
        this.studentId = studentId;
        this.facultyid = facultyid;
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public Integer getSsSn() {
        return ssSn;
    }

    public void setSsSn(Integer ssSn) {
        this.ssSn = ssSn;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFacultyid() {
        return facultyid;
    }

    public void setFacultyid(String facultyid) {
        this.facultyid = facultyid;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ssSn != null ? ssSn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentSchedule)) {
            return false;
        }
        StudentSchedule other = (StudentSchedule) object;
        if ((this.ssSn == null && other.ssSn != null) || (this.ssSn != null && !this.ssSn.equals(other.ssSn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studentdb.StudentSchedule[ ssSn=" + ssSn + " ]";
    }
    
}
