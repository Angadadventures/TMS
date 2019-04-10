package com.cg.trainee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.trainee.beans.TraineeBean;
import com.cg.trainee.exception.TraineeException;
import com.cg.trainee.service.ITraineeService;

@Controller
public class TraineeController {

	@Autowired
	ITraineeService traineeService;

	public ITraineeService getTraineeService() {
		return traineeService;
	}

	public void setTraineeService(ITraineeService traineeService) {
		this.traineeService = traineeService;
	}

	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
		return "loginForm";
	}

	@RequestMapping("/validateLogin")
	public String validateLogin(@RequestParam("username") String username, @RequestParam("password") String password) {

		if (username.equals("admin") && password.equals("root"))
			return "menu";
		else
			return "loginForm";
	}

	@RequestMapping("/menu")
	public String menu() {
		return "menu";
	}

	@RequestMapping("/addTraineeForm")
	public ModelAndView addTraineeForm() {
		TraineeBean trainee = new TraineeBean();
		// Add the attribute to the model and set the viewname and return it
		return new ModelAndView("addTraineeForm", "trainee", trainee);
	}

	@RequestMapping("/addTrainee")
	public ModelAndView addTrainee(@ModelAttribute("trainee") @Valid TraineeBean trainee, BindingResult result) {
		ModelAndView mv = null;

		if (!result.hasErrors()) {
			if(trainee.getTraineeDomain().equals("java")) {
			trainee = traineeService.addTrainee(trainee);
			mv = new ModelAndView("addSuccess");
			mv.addObject("traineeId", trainee.getTraineeId());
			mv.addObject("traineeName", trainee.getTraineeName());
			}else {
				throw new TraineeException("Java Developers Rule!!!");
			}
		} else {
			mv = new ModelAndView("addTraineeForm", "trainee", trainee);
		}

		return mv;
	}

	@RequestMapping("/showDeleteTraineeForm")
	public String deleteTraineeForm() {
		return "deleteTraineeForm";
	}

	@RequestMapping("/deleteTrainee")
	public ModelAndView deleteTrainee(@RequestParam("traineeId") int traineeId) {
		ModelAndView mv = null;
		if (traineeService.deleteTrainee(traineeId)) {
			mv = new ModelAndView("menu", "message", "Deleted successfully!!!!");
		} else
			mv = new ModelAndView("deleteTraineeForm", "message", "Please, Enter a valid Id or the id is not present");

		return mv;
	}

	@RequestMapping("/showAllTrainee")
	public ModelAndView showAllTrainee() {
		List<TraineeBean> trainees = traineeService.getAllTrainee();
		return new ModelAndView("showAllTraineePage", "trainees", trainees);
	}

	@RequestMapping("/showSearchTraineeForm")
	public String searchTraineeForm() {
		return "searchTraineeForm";
	}

	@RequestMapping("/searchTrainee")
	public ModelAndView searchTrainee(@RequestParam("traineeId") int traineeId) {
		ModelAndView mv = null;
		TraineeBean trainee = traineeService.searchTrainee(traineeId);
		if (trainee != null) {
			mv = new ModelAndView("showTraineePage", "trainee", trainee);
		} else
			mv = new ModelAndView("searchTraineeForm", "message", "Please, Enter a valid Id or the id is not present");

		return mv;
	}

	@RequestMapping("/showUpdateTraineeForm")
	public ModelAndView updateTraineeForm() {
		TraineeBean trainee = null;
		// Add the attribute to the model and set the viewname and return it
		return new ModelAndView("updateTraineeForm", "trainee", trainee);
	}

	@RequestMapping("/updateTrainee")
	public ModelAndView updateTrainee(@RequestParam("traineeId") int traineeId) {
		ModelAndView mv = null;
		TraineeBean trainee = traineeService.searchTrainee(traineeId);

		if (trainee != null) {
			trainee.setTraineeId(traineeId);
			mv = new ModelAndView("updateTraineeForm", "trainee", trainee);
		} else
			mv = new ModelAndView("updateTraineeForm", "message", "Please, Enter a valid Id or the id is not present");

		return mv;
	}

	@RequestMapping("/updateTraineeInDB")
	public ModelAndView updateTraineeInDB(@ModelAttribute("trainee") @Valid TraineeBean trainee, BindingResult result) {
		ModelAndView mv = null;
		System.out.println(trainee.getTraineeId() + "yoyohoneysingh");

		if (!result.hasErrors()) {
			// trainee.setTraineeId(trainee.getTraineeId());
			boolean status = traineeService.updateTrainee(trainee);
			mv = new ModelAndView("addSuccess");
			mv.addObject("traineeId", trainee.getTraineeId());
			mv.addObject("traineeName", trainee.getTraineeName());
		} else {
			mv = new ModelAndView("updateTraineeForm", "trainee", trainee);
		}

		return mv;
	}
	@RequestMapping("/showAllTraineeShowButton")
	public ModelAndView showAllTraineeShowButton() {
		List<TraineeBean> trainees = traineeService.getAllTrainee();
		return new ModelAndView("showAllTraineeShowButton", "trainees", trainees);
	}
	
	
	
}
