package br.com.fiap.healthtrack.controller;

import br.com.fiap.healthtrack.business.BloodPressureBusiness;
import br.com.fiap.healthtrack.model.BloodPressure;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
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

  }
}
