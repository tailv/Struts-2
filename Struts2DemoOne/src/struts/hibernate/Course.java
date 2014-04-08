package struts.hibernate;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="Courses")
@Entity
public class Course {
	@Id
	@GeneratedValue
	int Id;
	String Name;
	double Schoolfee;
	int NoOfLearners;
	@Temporal (TemporalType.DATE)
	Date StartDate;
	boolean Finished;
	String Description;
}
