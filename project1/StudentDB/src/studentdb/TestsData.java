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
 * @author Boss
 */
@Entity
@Table(name = "tests_data", catalog = "student_database", schema = "")
@NamedQueries({
    @NamedQuery(name = "TestsData.findAll", query = "SELECT t FROM TestsData t"),
    @NamedQuery(name = "TestsData.findByTdSn", query = "SELECT t FROM TestsData t WHERE t.tdSn = :tdSn"),
    @NamedQuery(name = "TestsData.findByStudentId", query = "SELECT t FROM TestsData t WHERE t.studentId = :studentId"),
    @NamedQuery(name = "TestsData.findByCourseId", query = "SELECT t FROM TestsData t WHERE t.courseId = :courseId"),
    @NamedQuery(name = "TestsData.findByTest1", query = "SELECT t FROM TestsData t WHERE t.test1 = :test1"),
    @NamedQuery(name = "TestsData.findByTest2", query = "SELECT t FROM TestsData t WHERE t.test2 = :test2"),
    @NamedQuery(name = "TestsData.findByTest3", query = "SELECT t FROM TestsData t WHERE t.test3 = :test3"),
    @NamedQuery(name = "TestsData.findByAverage", query = "SELECT t FROM TestsData t WHERE t.average = :average"),
    @NamedQuery(name = "TestsData.findByFinalGrade", query = "SELECT t FROM TestsData t WHERE t.finalGrade = :finalGrade")})
public class TestsData implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "td_sn")
    private Integer tdSn;
    @Basic(optional = false)
    @Column(name = "student_id")
    private String studentId;
    @Basic(optional = false)
    @Column(name = "course_id")
    private String courseId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Test_1")
    private Double test1;
    @Column(name = "Test_2")
    private Double test2;
    @Column(name = "Test_3")
    private Double test3;
    @Column(name = "Average")
    private Double average;
    @Column(name = "final_grade")
    private Double finalGrade;

    public TestsData() {
    }

    public TestsData(Integer tdSn) {
        this.tdSn = tdSn;
    }

    public TestsData(Integer tdSn, String studentId, String courseId) {
        this.tdSn = tdSn;
        this.studentId = studentId;
        this.courseId = courseId;
    }

    public Integer getTdSn() {
        return tdSn;
    }

    public void setTdSn(Integer tdSn) {
        Integer oldTdSn = this.tdSn;
        this.tdSn = tdSn;
        changeSupport.firePropertyChange("tdSn", oldTdSn, tdSn);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        String oldStudentId = this.studentId;
        this.studentId = studentId;
        changeSupport.firePropertyChange("studentId", oldStudentId, studentId);
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        String oldCourseId = this.courseId;
        this.courseId = courseId;
        changeSupport.firePropertyChange("courseId", oldCourseId, courseId);
    }

    public Double getTest1() {
        return test1;
    }

    public void setTest1(Double test1) {
        Double oldTest1 = this.test1;
        this.test1 = test1;
        changeSupport.firePropertyChange("test1", oldTest1, test1);
    }

    public Double getTest2() {
        return test2;
    }

    public void setTest2(Double test2) {
        Double oldTest2 = this.test2;
        this.test2 = test2;
        changeSupport.firePropertyChange("test2", oldTest2, test2);
    }

    public Double getTest3() {
        return test3;
    }

    public void setTest3(Double test3) {
        Double oldTest3 = this.test3;
        this.test3 = test3;
        changeSupport.firePropertyChange("test3", oldTest3, test3);
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        Double oldAverage = this.average;
        this.average = average;
        changeSupport.firePropertyChange("average", oldAverage, average);
    }

    public Double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Double finalGrade) {
        Double oldFinalGrade = this.finalGrade;
        this.finalGrade = finalGrade;
        changeSupport.firePropertyChange("finalGrade", oldFinalGrade, finalGrade);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tdSn != null ? tdSn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestsData)) {
            return false;
        }
        TestsData other = (TestsData) object;
        if ((this.tdSn == null && other.tdSn != null) || (this.tdSn != null && !this.tdSn.equals(other.tdSn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studentdb.TestsData[ tdSn=" + tdSn + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
