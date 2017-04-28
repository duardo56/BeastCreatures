/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdb;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author heavy_linux_guy
 */
@Entity
@Table(name = "teacher_schedule")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TeacherSchedule.findAll", query = "SELECT t FROM TeacherSchedule t")
    , @NamedQuery(name = "TeacherSchedule.findByTsSn", query = "SELECT t FROM TeacherSchedule t WHERE t.tsSn = :tsSn")
    , @NamedQuery(name = "TeacherSchedule.findByFacultyid", query = "SELECT t FROM TeacherSchedule t WHERE t.facultyid = :facultyid")
    , @NamedQuery(name = "TeacherSchedule.findByCourseId", query = "SELECT t FROM TeacherSchedule t WHERE t.courseId = :courseId")
    , @NamedQuery(name = "TeacherSchedule.findByCourseName", query = "SELECT t FROM TeacherSchedule t WHERE t.courseName = :courseName")})
public class TeacherSchedule implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ts_sn")
    private Integer tsSn;
    @Column(name = "Faculty_id")
    private String facultyid;
    @Basic(optional = false)
    @Column(name = "course_id")
    private String courseId;
    @Basic(optional = false)
    @Column(name = "course_name")
    private String courseName;

    public TeacherSchedule() {
    }

    public TeacherSchedule(Integer tsSn) {
        this.tsSn = tsSn;
    }

    public TeacherSchedule(Integer tsSn, String courseId, String courseName) {
        this.tsSn = tsSn;
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public Integer getTsSn() {
        return tsSn;
    }

    public void setTsSn(Integer tsSn) {
        Integer oldTsSn = this.tsSn;
        this.tsSn = tsSn;
        changeSupport.firePropertyChange("tsSn", oldTsSn, tsSn);
    }

    public String getFacultyid() {
        return facultyid;
    }

    public void setFacultyid(String facultyid) {
        String oldFacultyid = this.facultyid;
        this.facultyid = facultyid;
        changeSupport.firePropertyChange("facultyid", oldFacultyid, facultyid);
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        String oldCourseId = this.courseId;
        this.courseId = courseId;
        changeSupport.firePropertyChange("courseId", oldCourseId, courseId);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        String oldCourseName = this.courseName;
        this.courseName = courseName;
        changeSupport.firePropertyChange("courseName", oldCourseName, courseName);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tsSn != null ? tsSn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TeacherSchedule)) {
            return false;
        }
        TeacherSchedule other = (TeacherSchedule) object;
        if ((this.tsSn == null && other.tsSn != null) || (this.tsSn != null && !this.tsSn.equals(other.tsSn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studentdb.TeacherSchedule[ tsSn=" + tsSn + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
