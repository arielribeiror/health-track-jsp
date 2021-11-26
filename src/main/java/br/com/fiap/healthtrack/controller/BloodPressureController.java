package br.com.fiap.healthtrack.controller;

import br.com.fiap.healthtrack.auth.User;
import br.com.fiap.healthtrack.business.BloodPressureBusiness;
import br.com.fiap.healthtrack.model.BloodPressure;
import br.com.fiap.healthtrack.util.UuidGenerator;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet(name = "BloodPressureController", value = "/blood-pressure")
public class BloodPressureController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("pressureList", new BloodPressureBusiness().getAll());
    List<BloodPressure> pressureList = new BloodPressureBusiness().getAll();
    String pressureArray = new Gson().toJson(pressureList);

    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(pressureArray);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    BloodPressure pressureBean = new BloodPressure();
    String uuid = new UuidGenerator().generateUuid();

    JsonObject formData = new Gson().fromJson(request.getReader(), JsonObject.class);

    pressureBean.setBloodPressureId(uuid);
    pressureBean.setSystolicPressure(Integer.valueOf(formData.get("systolic").getAsString()));
    pressureBean.setDiastolicPressure(Integer.valueOf(formData.get("diastolic").getAsString()));
    pressureBean.setActualAt(Date.valueOf(formData.get("pressureDate").getAsString()));

    User user = new User();

    BloodPressureBusiness pressureBusiness = new BloodPressureBusiness();
    pressureBusiness.insert(pressureBean, "0375dabf-2a75-4083-90df-c8649b77d861");

    request.setAttribute("pressureItem", pressureBean);

    String pressureItemArray = new Gson().toJson(pressureBean);

    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(pressureItemArray);
  }
}
