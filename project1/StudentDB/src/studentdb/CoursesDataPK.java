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
public class CoursesDataPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Course_Id")
    private String courseId;
    @Basic(optional = false)
    @Column(name = "Taught_by")
    private String taughtby;

    public CoursesDataPK() {
    }

    public CoursesDataPK(String courseId, String taughtby) {
        this.courseId = courseId;
        this.taughtby = taughtby;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTaughtby() {
        return taughtby;
    }

    public void setTaughtby(String taughtby) {
        this.taughtby = taughtby;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (courseId != null ? courseId.hashCode() : 0);
        hash += (taughtby != null ? taughtby.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoursesDataPK)) {
            return false;
        }
        CoursesDataPK other = (CoursesDataPK) object;
        if ((this.courseId == null && other.courseId != null) || (this.courseId != null && !this.courseId.equals(other.courseId))) {
            return false;
        }
        if ((this.taughtby == null && other.taughtby != null) || (this.taughtby != null && !this.taughtby.equals(other.taughtby))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studentdb.CoursesDataPK[ courseId=" + courseId + ", taughtby=" + taughtby + " ]";
    }
    
}
