package com.imran.validation;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imran.validation.RequestInfo;

@Controller
public class WebController {

	@RequestMapping(value = "/val", method = RequestMethod.GET)
	public String requestInfo(RequestInfo requestInfo) {
		return "request";
	}

	@RequestMapping(value = "/val", method = RequestMethod.POST)
	String requestInfo(@Valid @ModelAttribute("requestInfo") RequestInfo requestInfo, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "beanValidation/request";
		}

		System.out.println(requestInfo.toString());

		return "beanValidation/successful";
	}
}