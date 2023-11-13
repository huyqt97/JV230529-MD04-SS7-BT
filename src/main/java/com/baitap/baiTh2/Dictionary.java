package com.baitap.baiTh2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Dictionary", value = "/dictionary")
public class Dictionary extends HttpServlet {

    Map<String, String> dic = new HashMap<>();
    @Override
    public void init() {
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("baitap/baiTh2/dictionary.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String search = req.getParameter("search");
        String result = dic.get(search);
        req.setAttribute("result", result);
        req.getRequestDispatcher("baitap/baiTh2/result.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
    }
}