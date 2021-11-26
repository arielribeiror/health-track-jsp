package br.com.fiap.healthtrack.controller;

import br.com.fiap.healthtrack.auth.User;
import br.com.fiap.healthtrack.business.ActivityBusiness;
import br.com.fiap.healthtrack.business.ActivityTypeBusiness;
import br.com.fiap.healthtrack.business.FoodBusiness;
import br.com.fiap.healthtrack.business.FoodTypeBusiness;
import br.com.fiap.healthtrack.model.Activity;
import br.com.fiap.healthtrack.model.Food;
import br.com.fiap.healthtrack.util.UuidGenerator;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;
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
    Activity activityBean = new Activity();
    String uuid = new UuidGenerator().generateUuid();

    JsonObject formData = new Gson().fromJson(request.getReader(), JsonObject.class);

    activityBean.setActivityId(uuid);
    activityBean.setCaloricLoss(Integer.valueOf(formData.get("caloricLoss").getAsString()));
    activityBean.setDescription(formData.get("activityDescription").getAsString());
    activityBean.setType(formData.get("activityType").getAsString());
    activityBean.setActualAt(Date.valueOf(formData.get("activityDate").getAsString()));

    User user = new User();

    ActivityBusiness activityBusiness = new ActivityBusiness();
    ActivityTypeBusiness activityTypeBusiness = new ActivityTypeBusiness();
    activityBusiness.insert(activityBean, "0375dabf-2a75-4083-90df-c8649b77d861");
    activityTypeBusiness.insertJoinTable(activityBean.getActivityId(), activityBean.getType());

    request.setAttribute("activityItem", activityBean);

    String activityItemArray = new Gson().toJson(activityBean);

    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(activityItemArray);
  }
}
