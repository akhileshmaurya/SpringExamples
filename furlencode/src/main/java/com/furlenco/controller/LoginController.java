package com.furlenco.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/** @author aKHILESH */
@Controller
public class LoginController {

  private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

  @Autowired Environment env;

  @RequestMapping(
      value = {"/"},
      method = RequestMethod.GET)
  public ModelAndView welcomePage() {
    ModelAndView model = new ModelAndView();
    model.setViewName("welcomePage");
    return model;
  }

  @RequestMapping(
      value = {"/homePage"},
      method = RequestMethod.GET)
  public ModelAndView homePage() {
    ModelAndView model = new ModelAndView();
    model.setViewName("homePage");
    return model;
  }

  @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
  public ModelAndView loginPage(
      @RequestParam(value = "error", required = false) String error,
      @RequestParam(value = "logout", required = false) String logout) {

    ModelAndView model = new ModelAndView();
    if (error != null) {
      model.addObject("error", "Invalid Credentials provided.");
    }

    if (logout != null) {
      model.addObject("message", "Logged out from JournalDEV successfully.");
    }

    model.setViewName("loginPage");
    return model;
  }
}
