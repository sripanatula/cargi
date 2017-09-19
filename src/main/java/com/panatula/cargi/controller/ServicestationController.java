package com.panatula.cargi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.panatula.cargi.model.Servicestation;
import com.panatula.cargi.repository.ServicestationRepository;

@RestController
@RequestMapping("api/v1/")
public class ServicestationController {

	private final Logger _logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ServicestationRepository serviceRepository;

	@RequestMapping(value = "servicestations", method = RequestMethod.GET)
	public @ResponseBody List<Servicestation> list() {

		_logger.debug("Received call to get all servicestations");
		return serviceRepository.findAll();

	}

	@RequestMapping(value = "servicestations", method = RequestMethod.POST)
	public Servicestation create(@RequestBody Servicestation newServicestation) {

		_logger.debug("Adding a new Servicestation " + newServicestation.getName());

		return serviceRepository.saveAndFlush(newServicestation);
	}

	@RequestMapping(value = "servicestations/{id}", method = RequestMethod.GET)
	public Servicestation get(@PathVariable Long id) {

		_logger.debug("Retrieveing Serviestation with an Id" + id);

		return serviceRepository.findOne(id);
	}

	@RequestMapping(value = "servicestations/{id}", method = RequestMethod.PUT)
	public Servicestation update(@PathVariable Long id, @RequestBody Servicestation servicestation) {
		Servicestation inDbStation = serviceRepository.findOne(id);
		BeanUtils.copyProperties(servicestation, inDbStation);

		return serviceRepository.saveAndFlush(inDbStation);
	}

	/*
	 * This method returns 200 OK on successful completion
	 * Returns null value when Item is not found to be deleted, and returns the deleted object after successful deletion
	 */
	@RequestMapping(value = "servicestations/{id}", method = RequestMethod.DELETE)
	public Servicestation delete(@PathVariable Long id) {

		_logger.debug("Received request to delete Serviestation with an Id :" + id);

		Servicestation inDbStation = serviceRepository.findOne(id);
		if (null == inDbStation) {
			_logger.error(" Could NOT Find Serviestation with an Id :" + id + " To delete");
			
		} else {
			_logger.debug("Found Serviestation with an Id :" + id + " To delete");
			serviceRepository.delete(inDbStation);
		}
		

		return inDbStation;

	}
}
