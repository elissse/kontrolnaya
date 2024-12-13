package org.kontrolnaya.kontrolnaya.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/view_sports_equipment")
public class ViewSportsEquipmentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("template", "view_sports_equipment.ftl");
        request.getRequestDispatcher("/templates/view_sports_equipment.ftl").forward(request, response);
    }


}