package com.baitap.baiTh1;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "converter", value = "/converter")
public class converter extends HttpServlet {
    @Override
    public void init() {
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("baitap/baiTh1/currency-converter.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float rate = Float.parseFloat(req.getParameter("rate"));
        float usd = Float.parseFloat(req.getParameter("usd"));
        float vnd = rate * usd;
        req.setAttribute("vnd", vnd);
        req.getRequestDispatcher("baitap/baiTh1/result.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
    }
}