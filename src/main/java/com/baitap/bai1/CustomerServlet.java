package com.baitap.bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "CustomerServlet", value = "/customers")
public class CustomerServlet extends HttpServlet {
    private List<Customer> customers = new ArrayList<>();
    @Override
    public void init() {
        customers.add(new Customer(1,"Nguyễn Văn A", "Hà Nội", "22-11-2000", "https://i.pinimg.com/236x/74/d4/e2/74d4e2fc85d73a4b2512f8e1d0170790.jpg"));
        customers.add(new Customer(2,"Nguyễn Văn B", "Đà Nẵng", "14-11-2003", "https://i.pinimg.com/236x/89/2e/09/892e09e926ffe775c07fe9fe0f9bb3fb.jpg"));
        customers.add(new Customer(3,"Nguyễn Văn C", "Nghệ An", "21-05-2005", "https://i.pinimg.com/236x/95/76/c7/9576c7b87d576bf39bf245210e7e9f11.jpg"));
        customers.add(new Customer(4,"Nguyễn Văn D", "Hồ Chí Minh", "06-03-1999", "https://i.pinimg.com/236x/11/b4/59/11b459c45b64bde27cb398a0dcf62dc5.jpg"));

    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("customers", customers);
        req.getRequestDispatcher("baitap/bai1/customer.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    public void destroy() {
    }
}