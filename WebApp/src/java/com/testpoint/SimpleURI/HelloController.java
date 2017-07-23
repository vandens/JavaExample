package com.testpoint.SimpleURI;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.portlet.mvc.AbstractController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Vandens mc Maddens
 */
public class HelloController extends AbstractController {
    
   protected ModelAndView handleRequestInternal(HttpServletRequest request,
      HttpServletResponse response) throws Exception {
      ModelAndView model = new ModelAndView("hello");
      model.addObject("message", "Hello World!");
      return model;
   }
}
