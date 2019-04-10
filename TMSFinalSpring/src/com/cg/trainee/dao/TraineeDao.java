package com.cg.trainee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.trainee.beans.TraineeBean;
import com.cg.trainee.exception.TraineeException;

@Repository
@Transactional
public class TraineeDao implements ITraineeDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public TraineeBean addTrainee(TraineeBean trainee) throws TraineeException {
		// TODO Auto-generated method stub
		try {
			entityManager.persist(trainee);
			entityManager.flush();
		} catch (Exception e) {
			throw new TraineeException("Exception found in Add Trainee Method . ." + e.getMessage());
		}
		return trainee;
	}

	@Override
	public List<TraineeBean> getAllTrainee() throws TraineeException {
		// TODO Auto-generated method stub
		TypedQuery<TraineeBean> query;
		try {

			query = entityManager.createQuery("SELECT t FROM TraineeBean t", TraineeBean.class);
		} catch (Exception e) {
			throw new TraineeException("Exception found in Get All Trainee Method . ." + e.getMessage());
		}
		return query.getResultList();
	}

	@Override
	public boolean deleteTrainee(int traineeId) throws TraineeException {
		// TODO Auto-generated method stub
		try {
			TraineeBean trainee = entityManager.find(TraineeBean.class, traineeId);
			if (trainee != null) {
				entityManager.remove(trainee);
				return true;
			}
		} catch (Exception e) {
			throw new TraineeException("Exception found in Delete Trainee nethod . ."+ e.getMessage());
		}
		return false;
	}

	@Override
	public TraineeBean searchTrainee(int traineeId) throws TraineeException{
		
		TraineeBean trainee;
		try {
			trainee = entityManager.find(TraineeBean.class, traineeId);
		} catch (Exception e) {
			throw new TraineeException("Exception found in Search Trainee nethod . ."+ e.getMessage());
		}
		
		return trainee;

	}

	@Override
	public boolean updateTrainee(TraineeBean trainee) throws TraineeException{

		try {
			TraineeBean temp = entityManager.find(TraineeBean.class, trainee.getTraineeId());
			temp.setTraineeDomain(trainee.getTraineeDomain());
			temp.setTraineeLocation(trainee.getTraineeLocation());
			temp.setTraineeName(trainee.getTraineeName());
		} catch (Exception e) {
			throw new TraineeException("Exception found in Update Trainee nethod . ."+ e.getMessage());

		}
		
		return false;
	}

}
