package com.cg.trainee.dao;

import java.util.List;

import com.cg.trainee.beans.TraineeBean;

public interface ITraineeDao {
	public TraineeBean addTrainee(TraineeBean trainee);

	public List<TraineeBean> getAllTrainee();

	public boolean deleteTrainee(int traineeId);

	public TraineeBean searchTrainee(int traineeId);

	public boolean updateTrainee(TraineeBean trainee);
}
