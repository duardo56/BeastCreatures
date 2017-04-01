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
 * @author euclidesafonso
 */
@Entity
@Table(name = "tests_data", catalog = "student_database", schema = "")
@NamedQueries({
    @NamedQuery(name = "TestsData.findAll", query = "SELECT t FROM TestsData t"),
    @NamedQuery(name = "TestsData.findByCourseId", query = "SELECT t FROM TestsData t WHERE t.courseId = :courseId"),
    @NamedQuery(name = "TestsData.findByTest1", query = "SELECT t FROM TestsData t WHERE t.test1 = :test1"),
    @NamedQuery(name = "TestsData.findByTest2", query = "SELECT t FROM TestsData t WHERE t.test2 = :test2"),
    @NamedQuery(name = "TestsData.findByTest3", query = "SELECT t FROM TestsData t WHERE t.test3 = :test3")})
public class TestsData implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "course_id")
    private String courseId;
    @Basic(optional = false)
    @Column(name = "Test_1")
    private double test1;
    @Basic(optional = false)
    @Column(name = "Test_2")
    private double test2;
    @Basic(optional = false)
    @Column(name = "Test_3")
    private double test3;

    public TestsData() {
    }

    public TestsData(String courseId) {
        this.courseId = courseId;
    }

    public TestsData(String courseId, double test1, double test2, double test3) {
        this.courseId = courseId;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        String oldCourseId = this.courseId;
        this.courseId = courseId;
        changeSupport.firePropertyChange("courseId", oldCourseId, courseId);
    }

    public double getTest1() {
        return test1;
    }

    public void setTest1(double test1) {
        double oldTest1 = this.test1;
        this.test1 = test1;
        changeSupport.firePropertyChange("test1", oldTest1, test1);
    }

    public double getTest2() {
        return test2;
    }

    public void setTest2(double test2) {
        double oldTest2 = this.test2;
        this.test2 = test2;
        changeSupport.firePropertyChange("test2", oldTest2, test2);
    }

    public double getTest3() {
        return test3;
    }

    public void setTest3(double test3) {
        double oldTest3 = this.test3;
        this.test3 = test3;
        changeSupport.firePropertyChange("test3", oldTest3, test3);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (courseId != null ? courseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestsData)) {
            return false;
        }
        TestsData other = (TestsData) object;
        if ((this.courseId == null && other.courseId != null) || (this.courseId != null && !this.courseId.equals(other.courseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studentdb.TestsData[ courseId=" + courseId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
