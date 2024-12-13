package org.kontrolnaya.kontrolnaya.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.kontrolnaya.kontrolnaya.model.SportsEquipment;
import org.kontrolnaya.kontrolnaya.service.SportsEquipmentService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/sports_equipment")
public class SportsEquipmentServlet extends HttpServlet {
    private final SportsEquipmentService service = new SportsEquipmentService();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<SportsEquipment> sportsEquipmentList = service.getAll();
        request.setAttribute("sports_equipment_list", sportsEquipmentList);
        request.setAttribute("template", "all_sports_equipment.ftl");
        request.getRequestDispatcher("/templates/all_sports_equipment.ftl").forward(request, response);
    }


}

