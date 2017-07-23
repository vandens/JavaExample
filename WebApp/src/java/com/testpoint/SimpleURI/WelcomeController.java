package com.testpoint.SimpleURI;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.portlet.mvc.AbstractController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Vandens mc Maddens
 */
public class WelcomeController extends AbstractController{
    
   protected ModelAndView handleRequestInternal(HttpServletRequest request,
      HttpServletResponse response) throws Exception {
      ModelAndView model = new ModelAndView("welcome");
      model.addObject("message", "Welcome!");
      return model;
   }
}
