package com.javapoint;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class HelloAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
	    HttpServletRequest request, HttpServletResponse response)
	    throws Exception {
		System.out.println( "HelloAction.execute() executed~~" );
		String username = request.getParameter( "user" );
	
		Map<String, String> model = new HashMap<String, String>();
	
		if(username != null) {
	    model.put("username", username);
	  }
	  else {
	    model.put("username", "nobody");
	  }
	
	  request.setAttribute("userInfo", model);
	
	  return mapping.findForward("helloUser");
	}
}
