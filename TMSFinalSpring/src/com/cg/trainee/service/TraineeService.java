package com.cg.trainee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.trainee.beans.TraineeBean;
import com.cg.trainee.dao.ITraineeDao;
import com.cg.trainee.exception.TraineeException;

@Service
public class TraineeService implements ITraineeService {

	@Autowired
	ITraineeDao traineeDao ;
	
	public ITraineeDao getTraineeDao() throws TraineeException{
		return traineeDao;
	}

	public void setTraineeDao(ITraineeDao traineeDao) throws TraineeException{
		this.traineeDao = traineeDao;
	}

	@Override
	public TraineeBean addTrainee(TraineeBean trainee) throws TraineeException{
		// TODO Auto-generated method stub
		return traineeDao.addTrainee(trainee);
	}

	@Override
	public List<TraineeBean> getAllTrainee() throws TraineeException{
		// TODO Auto-generated method stub
		return traineeDao.getAllTrainee();
	}

	@Override
	public boolean deleteTrainee(int traineeId) throws TraineeException{
		// TODO Auto-generated method stub
		return traineeDao.deleteTrainee(traineeId);
	}

	@Override
	public TraineeBean searchTrainee(int traineeId) throws TraineeException{
		// TODO Auto-generated method stub
		return traineeDao.searchTrainee(traineeId);
	}

	@Override
	public boolean updateTrainee(TraineeBean trainee) throws TraineeException{
		// TODO Auto-generated method stub
		return traineeDao.updateTrainee(trainee);
	}

}
