package murach.controllers;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import murach.business.User;
//import murach.data.UserDB;

public class SurveyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String url = "/index.html";
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";// default action
        } // perform action and set URL to appropriate page 
        
        if (action.equals ("join")) { url = "/index.html"; 
            // the "join" page 
        }
        else if (action.equals("add")) {
             //get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dateofbirth = request.getParameter("dateofbirth");
            String hearAboutUs =  request.getParameter("hearAboutUs");
            String notify = request.getParameter("notify");
            String update = request.getParameter("update");
	    String contact =  request.getParameter("contact");
            
              
            if (hearAboutUs == null) {
            hearAboutUs = "NA";
            }
            if (update == null) {
                update = "No";
            }
            else {
                update = "Yes";
            }
            
            // store data in User object and save User object in db 
            User user = new User (firstName, lastName, email, dateofbirth, hearAboutUs, notify, update, contact); 
            
                       //UserDB. insert (user);
            // set User object in request object and set URL 
            request.setAttribute ("user", user); 
            url = "/survey.jsp"; // the "thanks" page
        }
        // forward request and response objects to specified URL 
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}