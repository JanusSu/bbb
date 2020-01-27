<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <!-- /struts-1.3.10/login.do?username=XXX&password=yyy -->
        <form action="/struts-1.3.10/login.do" method="post">
            Username : <input type="text" id="username" name="username"/>
            &nbsp;
            Password : <input type="password" id="password" name="password"/>
            <input type="submit"/>
        </form>
    </body>
</html>