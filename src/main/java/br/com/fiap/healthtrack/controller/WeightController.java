package br.com.fiap.healthtrack.controller;

import br.com.fiap.healthtrack.auth.User;
import br.com.fiap.healthtrack.business.WeightBusiness;
import br.com.fiap.healthtrack.model.Weight;
import br.com.fiap.healthtrack.util.UuidGenerator;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet(name = "WeightController", value = "/weight")
public class WeightController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("weightList", new WeightBusiness().getAll());
    List<Weight> weightList = new WeightBusiness().getAll();
    String weightArray = new Gson().toJson(weightList);

    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(weightArray);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Weight weightBean = new Weight();
    String uuid = new UuidGenerator().generateUuid();

    JsonObject formData = new Gson().fromJson(request.getReader(), JsonObject.class);

    weightBean.setWeightId(uuid);
    weightBean.setWeight(Double.valueOf(formData.get("weight").getAsString()));
    weightBean.setActualAt(Date.valueOf(formData.get("weightDate").getAsString()));

    User user = new User();

    WeightBusiness weightBusiness = new WeightBusiness();
    weightBusiness.insert(weightBean, "0375dabf-2a75-4083-90df-c8649b77d861");

    request.setAttribute("weightItem", weightBean);

    String weightItemArray = new Gson().toJson(weightBean);

    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(weightItemArray);
  }
}
