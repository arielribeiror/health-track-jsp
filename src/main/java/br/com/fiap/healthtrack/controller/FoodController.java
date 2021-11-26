package br.com.fiap.healthtrack.controller;

import br.com.fiap.healthtrack.auth.User;
import br.com.fiap.healthtrack.business.FoodBusiness;
import br.com.fiap.healthtrack.business.FoodTypeBusiness;
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
    Food foodBean = new Food();
    String uuid = new UuidGenerator().generateUuid();

    JsonObject formData = new Gson().fromJson(request.getReader(), JsonObject.class);

    foodBean.setFoodId(uuid);
    foodBean.setCaloricGain(Integer.valueOf(formData.get("caloricGain").getAsString()));
    foodBean.setDescription(formData.get("foodDescription").getAsString());
    foodBean.setType(formData.get("foodType").getAsString());
    foodBean.setActualAt(Date.valueOf(formData.get("foodDate").getAsString()));

    User user = new User();

    FoodBusiness foodBusiness = new FoodBusiness();
    FoodTypeBusiness foodTypeBusiness = new FoodTypeBusiness();
    foodBusiness.insert(foodBean, "0375dabf-2a75-4083-90df-c8649b77d861");
    foodTypeBusiness.insertJoinTable(foodBean.getFoodId(), foodBean.getType());

    request.setAttribute("foodItem", foodBean);

    String foodItemArray = new Gson().toJson(foodBean);

    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(foodItemArray);
  }
}
