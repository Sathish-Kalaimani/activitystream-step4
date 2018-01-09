package com.stackroute.activitystream.controller;
 
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stackroute.activitystream.dao.CircleDAO;
import com.stackroute.activitystream.model.Circle;

@RestController
@RequestMapping("/api/circle")
public class CircleController {

	@Autowired
	private CircleDAO circleDAO;

	
	@PostMapping
	public ResponseEntity<Circle> createCircle(@RequestBody Circle circle, HttpSession session){

		String loggedInUserName = (String) session.getAttribute("loggedInUserName");
		if (loggedInUserName == null) {
			return new ResponseEntity<Circle>(HttpStatus.UNAUTHORIZED);
		}
		Circle c = circleDAO.get(circle.getCircleName());
		if (c != null) {
			return new ResponseEntity<Circle>(HttpStatus.CONFLICT);
		}
		circle.setCreatorId(loggedInUserName);
		boolean iscreated = circleDAO.save(circle);
		if (!iscreated) {
			return new ResponseEntity<Circle>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Circle>(circle, HttpStatus.CREATED);
	}

	
	@GetMapping
	public ResponseEntity<List<Circle>> getAllCircles(HttpSession session){
		String loggedInUserName = (String) session.getAttribute("loggedInUserName");
		if(loggedInUserName == null){
			return new ResponseEntity<List<Circle>>(HttpStatus.UNAUTHORIZED);
		}
			return new ResponseEntity<List<Circle>>(circleDAO.getAllCircles(),HttpStatus.OK);
	}
	
	@GetMapping (value = "/search/{searchString}")
	public ResponseEntity<List<Circle>> searchCircle(@PathVariable("searchString") String searchString, HttpSession session){
		String loggedInUserName = (String) session.getAttribute("loggedInUserName");
		if(loggedInUserName == null){
			return new ResponseEntity<List<Circle>>(HttpStatus.UNAUTHORIZED);
		}
		return new ResponseEntity<List<Circle>>(circleDAO.getAllCircles(searchString), HttpStatus.OK);
	}

}
