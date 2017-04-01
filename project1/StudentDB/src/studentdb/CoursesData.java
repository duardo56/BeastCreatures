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
@Table(name = "courses_data", catalog = "student_database", schema = "")
@NamedQueries({
    @NamedQuery(name = "CoursesData.findAll", query = "SELECT c FROM CoursesData c"),
    @NamedQuery(name = "CoursesData.findByCourseId", query = "SELECT c FROM CoursesData c WHERE c.coursesDataPK.courseId = :courseId"),
    @NamedQuery(name = "CoursesData.findByCourseName", query = "SELECT c FROM CoursesData c WHERE c.courseName = :courseName"),
    @NamedQuery(name = "CoursesData.findByTaughtby", query = "SELECT c FROM CoursesData c WHERE c.coursesDataPK.taughtby = :taughtby")})
public class CoursesData implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CoursesDataPK coursesDataPK;
    @Basic(optional = false)
    @Column(name = "Course_Name")
    private String courseName;

    public CoursesData() {
    }

    public CoursesData(CoursesDataPK coursesDataPK) {
        this.coursesDataPK = coursesDataPK;
    }

    public CoursesData(CoursesDataPK coursesDataPK, String courseName) {
        this.coursesDataPK = coursesDataPK;
        this.courseName = courseName;
    }

    public CoursesData(String courseId, String taughtby) {
        this.coursesDataPK = new CoursesDataPK(courseId, taughtby);
    }

    public CoursesDataPK getCoursesDataPK() {
        return coursesDataPK;
    }

    public void setCoursesDataPK(CoursesDataPK coursesDataPK) {
        this.coursesDataPK = coursesDataPK;
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
        hash += (coursesDataPK != null ? coursesDataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoursesData)) {
            return false;
        }
        CoursesData other = (CoursesData) object;
        if ((this.coursesDataPK == null && other.coursesDataPK != null) || (this.coursesDataPK != null && !this.coursesDataPK.equals(other.coursesDataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studentdb.CoursesData[ coursesDataPK=" + coursesDataPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
