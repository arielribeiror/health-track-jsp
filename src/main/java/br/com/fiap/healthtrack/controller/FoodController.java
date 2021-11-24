package br.com.fiap.healthtrack.controller;

import br.com.fiap.healthtrack.business.FoodBusiness;
import br.com.fiap.healthtrack.model.Food;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FoodController", value = "/food")
public class FoodController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("foodList", new FoodBusiness().getAll());
    List<Food> foodList = new FoodBusiness().getAll();
    String foodArray = new Gson().toJson(foodList);

    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(foodArray);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}
