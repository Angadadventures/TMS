package com.cg.trainee.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Trainees")
public class TraineeBean {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int traineeId;
	
	@NotEmpty(message="Please Enter Trainee Name")
	//@Pattern(regexp = "^[a-zA-Z]+$", message = "Username must contain only alphabets")
	private String traineeName;
	
	@NotEmpty(message="Please Enter Domain")
	private String traineeDomain;
	
	@NotEmpty(message="Please Enter Location")
	private String traineeLocation;

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}

	public String getTraineeLocation() {
		return traineeLocation;
	}

	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}
	
	
}
