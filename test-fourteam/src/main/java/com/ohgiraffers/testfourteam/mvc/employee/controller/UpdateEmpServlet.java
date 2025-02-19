package com.ohgiraffers.testfourteam.mvc.employee.controller;

import com.ohgiraffers.testfourteam.mvc.employee.model.dto.EmployeeDTO;
import com.ohgiraffers.testfourteam.mvc.employee.model.service.EmployeeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/employee/update")
public class UpdateEmpServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String empId = request.getParameter("empId");
        java.sql.Date entDate = java.sql.Date.valueOf(request.getParameter("entDate"));

        EmployeeDTO emp = new EmployeeDTO();
        emp.setEmpId(empId);
        emp.setEntDate(entDate);



}
