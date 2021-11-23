package br.com.fiap.healthtrack.controller;

import br.com.fiap.healthtrack.business.WeightBusiness;
import br.com.fiap.healthtrack.model.Weight;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "weight", value = "/weight")
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

  }
}
