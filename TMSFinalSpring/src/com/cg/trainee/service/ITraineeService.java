package com.cg.trainee.service;

import java.util.List;

import com.cg.trainee.beans.TraineeBean;
import com.cg.trainee.exception.TraineeException;

public interface ITraineeService {
	public TraineeBean addTrainee(TraineeBean trainee) throws TraineeException;

	public List<TraineeBean> getAllTrainee() throws TraineeException;

	public boolean deleteTrainee(int traineeId) throws TraineeException;

	public TraineeBean searchTrainee(int traineeId) throws TraineeException;

	public boolean updateTrainee(TraineeBean trainee) throws TraineeException;

}
