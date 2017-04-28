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
 * @author Boss
 */
@Entity
@Table(name = "student_data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StudentData.findAll", query = "SELECT s FROM StudentData s"),
    @NamedQuery(name = "StudentData.findByStudentid", query = "SELECT s FROM StudentData s WHERE s.studentid = :studentid"),
    @NamedQuery(name = "StudentData.findByFirstName", query = "SELECT s FROM StudentData s WHERE s.firstName = :firstName"),
    @NamedQuery(name = "StudentData.findByLastName", query = "SELECT s FROM StudentData s WHERE s.lastName = :lastName"),
    @NamedQuery(name = "StudentData.findByEmail", query = "SELECT s FROM StudentData s WHERE s.email = :email"),
    @NamedQuery(name = "StudentData.findByGender", query = "SELECT s FROM StudentData s WHERE s.gender = :gender"),
    @NamedQuery(name = "StudentData.findByDateOfBirth", query = "SELECT s FROM StudentData s WHERE s.dateOfBirth = :dateOfBirth"),
    @NamedQuery(name = "StudentData.findByStreetaddress", query = "SELECT s FROM StudentData s WHERE s.streetaddress = :streetaddress"),
    @NamedQuery(name = "StudentData.findByCity", query = "SELECT s FROM StudentData s WHERE s.city = :city"),
    @NamedQuery(name = "StudentData.findByState", query = "SELECT s FROM StudentData s WHERE s.state = :state"),
    @NamedQuery(name = "StudentData.findByPassword", query = "SELECT s FROM StudentData s WHERE s.password = :password"),
    @NamedQuery(name = "StudentData.findByGpa", query = "SELECT s FROM StudentData s WHERE s.gpa = :gpa")})
public class StudentData implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Student_id")
    private String studentid;
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
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Basic(optional = false)
    @Column(name = "Street_address")
    private String streetaddress;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @Column(name = "State")
    private String state;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "GPA")
    private Double gpa;

    public StudentData() {
    }

    public StudentData(String studentid) {
        this.studentid = studentid;
    }

    public StudentData(String studentid, String firstName, String lastName, String email, String gender, String dateOfBirth, String streetaddress, String city, String state, String password) {
        this.studentid = studentid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.streetaddress = streetaddress;
        this.city = city;
        this.state = state;
        this.password = password;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        String oldStudentid = this.studentid;
        this.studentid = studentid;
        changeSupport.firePropertyChange("studentid", oldStudentid, studentid);
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        String oldDateOfBirth = this.dateOfBirth;
        this.dateOfBirth = dateOfBirth;
        changeSupport.firePropertyChange("dateOfBirth", oldDateOfBirth, dateOfBirth);
    }

    public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        String oldStreetaddress = this.streetaddress;
        this.streetaddress = streetaddress;
        changeSupport.firePropertyChange("streetaddress", oldStreetaddress, streetaddress);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        Double oldGpa = this.gpa;
        this.gpa = gpa;
        changeSupport.firePropertyChange("gpa", oldGpa, gpa);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentid != null ? studentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentData)) {
            return false;
        }
        StudentData other = (StudentData) object;
        if ((this.studentid == null && other.studentid != null) || (this.studentid != null && !this.studentid.equals(other.studentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studentdb.StudentData[ studentid=" + studentid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
