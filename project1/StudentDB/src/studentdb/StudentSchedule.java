/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdb;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author euclidesafonso
 */
@Entity
@Table(name = "student_schedule", catalog = "student_database", schema = "")
@NamedQueries({
    @NamedQuery(name = "StudentSchedule.findAll", query = "SELECT s FROM StudentSchedule s"),
    @NamedQuery(name = "StudentSchedule.findByStudentId", query = "SELECT s FROM StudentSchedule s WHERE s.studentSchedulePK.studentId = :studentId"),
    @NamedQuery(name = "StudentSchedule.findByCourses", query = "SELECT s FROM StudentSchedule s WHERE s.studentSchedulePK.courses = :courses")})
public class StudentSchedule implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StudentSchedulePK studentSchedulePK;

    public StudentSchedule() {
    }

    public StudentSchedule(StudentSchedulePK studentSchedulePK) {
        this.studentSchedulePK = studentSchedulePK;
    }

    public StudentSchedule(String studentId, String courses) {
        this.studentSchedulePK = new StudentSchedulePK(studentId, courses);
    }

    public StudentSchedulePK getStudentSchedulePK() {
        return studentSchedulePK;
    }

    public void setStudentSchedulePK(StudentSchedulePK studentSchedulePK) {
        this.studentSchedulePK = studentSchedulePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentSchedulePK != null ? studentSchedulePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentSchedule)) {
            return false;
        }
        StudentSchedule other = (StudentSchedule) object;
        if ((this.studentSchedulePK == null && other.studentSchedulePK != null) || (this.studentSchedulePK != null && !this.studentSchedulePK.equals(other.studentSchedulePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studentdb.StudentSchedule[ studentSchedulePK=" + studentSchedulePK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
