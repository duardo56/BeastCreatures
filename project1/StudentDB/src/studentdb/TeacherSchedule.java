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

/**
 *
 * @author jean
 */
@Entity
@Table(name = "teacher_schedule", catalog = "student_database", schema = "")
@NamedQueries({
    @NamedQuery(name = "TeacherSchedule.findAll", query = "SELECT t FROM TeacherSchedule t"),
    @NamedQuery(name = "TeacherSchedule.findByFacutlyid", query = "SELECT t FROM TeacherSchedule t WHERE t.facutlyid = :facutlyid"),
    @NamedQuery(name = "TeacherSchedule.findByCourses", query = "SELECT t FROM TeacherSchedule t WHERE t.courses = :courses")})
public class TeacherSchedule implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Facutly_id")
    private String facutlyid;
    @Basic(optional = false)
    @Column(name = "Courses")
    private String courses;

    public TeacherSchedule() {
    }

    public TeacherSchedule(String facutlyid) {
        this.facutlyid = facutlyid;
    }

    public TeacherSchedule(String facutlyid, String courses) {
        this.facutlyid = facutlyid;
        this.courses = courses;
    }

    public String getFacutlyid() {
        return facutlyid;
    }

    public void setFacutlyid(String facutlyid) {
        String oldFacutlyid = this.facutlyid;
        this.facutlyid = facutlyid;
        changeSupport.firePropertyChange("facutlyid", oldFacutlyid, facutlyid);
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        String oldCourses = this.courses;
        this.courses = courses;
        changeSupport.firePropertyChange("courses", oldCourses, courses);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facutlyid != null ? facutlyid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TeacherSchedule)) {
            return false;
        }
        TeacherSchedule other = (TeacherSchedule) object;
        if ((this.facutlyid == null && other.facutlyid != null) || (this.facutlyid != null && !this.facutlyid.equals(other.facutlyid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studentdb.TeacherSchedule[ facutlyid=" + facutlyid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
