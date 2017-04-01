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
@Table(name = "teacher_data", catalog = "student_database", schema = "")
@NamedQueries({
    @NamedQuery(name = "TeacherData.findAll", query = "SELECT t FROM TeacherData t"),
    @NamedQuery(name = "TeacherData.findByFacultyid", query = "SELECT t FROM TeacherData t WHERE t.teacherDataPK.facultyid = :facultyid"),
    @NamedQuery(name = "TeacherData.findByPassword", query = "SELECT t FROM TeacherData t WHERE t.teacherDataPK.password = :password"),
    @NamedQuery(name = "TeacherData.findByFirstName", query = "SELECT t FROM TeacherData t WHERE t.firstName = :firstName"),
    @NamedQuery(name = "TeacherData.findByLastName", query = "SELECT t FROM TeacherData t WHERE t.lastName = :lastName"),
    @NamedQuery(name = "TeacherData.findByEmail", query = "SELECT t FROM TeacherData t WHERE t.email = :email"),
    @NamedQuery(name = "TeacherData.findByGender", query = "SELECT t FROM TeacherData t WHERE t.gender = :gender"),
    @NamedQuery(name = "TeacherData.findByCoursestaught", query = "SELECT t FROM TeacherData t WHERE t.teacherDataPK.coursestaught = :coursestaught"),
    @NamedQuery(name = "TeacherData.findByCourseId", query = "SELECT t FROM TeacherData t WHERE t.courseId = :courseId")})
public class TeacherData implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TeacherDataPK teacherDataPK;
    @Basic(optional = false)
    @Column(name = "first_name")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "course_id")
    private String courseId;

    public TeacherData() {
    }

    public TeacherData(TeacherDataPK teacherDataPK) {
        this.teacherDataPK = teacherDataPK;
    }

    public TeacherData(TeacherDataPK teacherDataPK, String firstName, String lastName, String email, String gender, String courseId) {
        this.teacherDataPK = teacherDataPK;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.courseId = courseId;
    }

    public TeacherData(String facultyid, String password, String coursestaught) {
        this.teacherDataPK = new TeacherDataPK(facultyid, password, coursestaught);
    }

    public TeacherDataPK getTeacherDataPK() {
        return teacherDataPK;
    }

    public void setTeacherDataPK(TeacherDataPK teacherDataPK) {
        this.teacherDataPK = teacherDataPK;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        String oldCourseId = this.courseId;
        this.courseId = courseId;
        changeSupport.firePropertyChange("courseId", oldCourseId, courseId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teacherDataPK != null ? teacherDataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TeacherData)) {
            return false;
        }
        TeacherData other = (TeacherData) object;
        if ((this.teacherDataPK == null && other.teacherDataPK != null) || (this.teacherDataPK != null && !this.teacherDataPK.equals(other.teacherDataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studentdb.TeacherData[ teacherDataPK=" + teacherDataPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
