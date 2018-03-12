package com.devicemanager.main.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.devicemanager.main.model.EnrollDevice;
import com.devicemanager.main.repository.EnrollDeviceRepository;

@Controller
public class DeviceBasicInfoController {

	@Autowired
	EnrollDeviceRepository enrolldevicerepository;
	
	@GetMapping("/enrolldevice")
    public String greetingForm(Model model) {
        model.addAttribute("enrolldevice", new EnrollDevice());
        return "enrolldevice";
    }

    @PostMapping("/enrolldevice")
    public String greetingSubmit(@Valid EnrollDevice enrolldevice, BindingResult bindingResult) {
    	
    	
    	 if (bindingResult.hasErrors()) {
             return "enrolldevice";
         }

    	 enrolldevicerepository.save(enrolldevice);
    	 return "result";
    }
}
