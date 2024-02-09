package examenCL1.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_subject")
@NamedQuery(name= "Subject.findAll", query ="SELECT s from Subject s")
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idsubject")
	private int idsubject;
	
	@Column
	private String subjects;
	
	@Column
	private String credits;
	
	public Subject() {
		
	}

	public Subject(int idsubject, String subjects, String credits) {
		super();
		this.idsubject = idsubject;
		this.subjects = subjects;
		this.credits = credits;
	}

	public int getIdsubject() {
		return idsubject;
	}

	public void setIdsubject(int idsubject) {
		this.idsubject = idsubject;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public String getCredits() {
		return credits;
	}

	public void setCredits(String credits) {
		this.credits = credits;
	}
}
