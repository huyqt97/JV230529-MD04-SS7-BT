package com.ra.controller;

import com.ra.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "EmployeeServlet", value = "/nhan-vien")
public class EmployeeServlet extends HttpServlet {
    private final List<Employee> employees = new ArrayList<>();

    @Override
    public void init() {
        employees.add(new Employee("P001", "Nguyen Van A", 15, 2000));
        employees.add(new Employee("P002", "Nguyen Van B", 20, 2400));
        employees.add(new Employee("P003", "Nguyen Van C", 21, 1900));
        employees.add(new Employee("P004", "Nguyen Van D", 27, 2200));
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            getList(req, resp);
        } else {
            switch (action) {
                case "edit":
                    Employee employee = getEmployeeById(req.getParameter("id"));
                    req.setAttribute("employee", employee);
                    req.getRequestDispatcher("views/edit.jsp").forward(req, resp);
                    break;
                case "delete":
                    String id = req.getParameter("id");
                    System.out.println(id);
                    Employee employee1 = getEmployeeById(id);
                    employees.remove(employee1);
                    getList(req,resp);
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        String id = req.getParameter("employeeCode");
        String fullName = req.getParameter("fullName");
        int age = Integer.parseInt(req.getParameter("age"));
        double salary = Double.parseDouble(req.getParameter("salary"));
        if (action == null) {
            employees.add(new Employee(id, fullName, age, salary));
        } else {
            Employee employee = getEmployeeById(id);

            employee.setFullName(fullName);
            employee.setAge(age);
            employee.setSalary(salary);
        }
       resp.sendRedirect("nhan-vien");
    }

    public void getList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listEmployee", employees);
        req.getRequestDispatcher("views/employee.jsp").forward(req, resp);
    }

    public Employee getEmployeeById(String id) {
        for (Employee employee : employees) {
            if (employee.getEplId().equals(id)) return employee;
        }
        return null;
    }

    @Override
    public void destroy() {
    }
}