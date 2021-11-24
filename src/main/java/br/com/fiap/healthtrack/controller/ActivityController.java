package br.com.fiap.healthtrack.controller;

import br.com.fiap.healthtrack.business.ActivityBusiness;
import br.com.fiap.healthtrack.model.Activity;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ActivityController", value = "/activity")
public class ActivityController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("activityList", new ActivityBusiness().getAll());
    List<Activity> activityList = new ActivityBusiness().getAll();
    String activityArray = new Gson().toJson(activityList);

    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(activityArray);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}
