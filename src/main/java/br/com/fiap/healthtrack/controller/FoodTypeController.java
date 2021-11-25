package br.com.fiap.healthtrack.controller;

import br.com.fiap.healthtrack.business.FoodTypeBusiness;
import br.com.fiap.healthtrack.model.FoodType;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FoodTypeController", value = "/food-type")
public class FoodTypeController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("foodTypeList", new FoodTypeBusiness().getAll());
    List<FoodType> foodTypeList = new FoodTypeBusiness().getAll();
    String foodTypeArray = new Gson().toJson(foodTypeList);

    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(foodTypeArray);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}
