package com.javapoint.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.javapoint.actionForm.LoginForm;

public class LoginAction extends Action {

	@Override
	public ActionForward execute( ActionMapping mapping
                                , ActionForm form
                                , HttpServletRequest request
                                , HttpServletResponse response ) throws Exception {
		String result = "";
		LoginForm loginForm = (LoginForm) form;
		result = validateAccount( loginForm.getUsername(), loginForm.getPassword() );
		return mapping.findForward( result );
	}

	private String validateAccount( String username, String password ) {
		if ( "admin".equals( username ) && "1234".equals( password ) ) {
			return  "success";
		}
		else {
			return  "failure";
		}
	}

}
