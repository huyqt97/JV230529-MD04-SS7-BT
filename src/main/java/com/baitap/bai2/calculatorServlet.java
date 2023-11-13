package com.baitap.bai2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "calculatorServlet", value = "/calculator")
public class calculatorServlet extends HttpServlet {
    double result;
    @Override
    public void init() {
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("baitap/bai2/calculator.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double firstOperand = Double.parseDouble(req.getParameter("first-operand"));
        double secondOperand = Double.parseDouble(req.getParameter("second-operand"));
        String operation = req.getParameter("operation");
        switch (operation) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;
                break;
            default:
                break;
        }
        req.setAttribute("result", result);
        req.getRequestDispatcher("baitap/bai2/result.jsp").forward(req, resp);

    }

    @Override
    public void destroy() {
    }
}