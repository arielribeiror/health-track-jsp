package br.com.fiap.healthtrack.controller;

import br.com.fiap.healthtrack.business.ActivityTypeBusiness;
import br.com.fiap.healthtrack.model.ActivityType;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ActivityTypeController", value = "/activity-type")
public class ActivityTypeController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("activityTypeList", new ActivityTypeBusiness().getAll());
    List<ActivityType> activityTypeList = new ActivityTypeBusiness().getAll();
    String activityTypeArray = new Gson().toJson(activityTypeList);

    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(activityTypeArray);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}
