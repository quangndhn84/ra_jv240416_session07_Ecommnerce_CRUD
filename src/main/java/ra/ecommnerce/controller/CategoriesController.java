package ra.ecommnerce.controller;

import ra.ecommnerce.entity.Categories;
import ra.ecommnerce.service.CategoriesService;
import ra.ecommnerce.service.imp.CategoriesServiceImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CategoriesController", value = "/CategoriesController")
public class CategoriesController extends HttpServlet {
    private final CategoriesService categoriesService;

    public CategoriesController() {
        categoriesService = new CategoriesServiceImp();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Lây tham số action trên URL
        String action = request.getParameter("action");
        if (action.equals("findAll")) {
            List<Categories> listCategories = categoriesService.findAll();
            //add listCategories vào request để chuyển sang trang categories.jsp hiển thị
            request.setAttribute("listCategories", listCategories);
            //Chuyển sang trạng categories.jsp và forward cả request và response
            request.getRequestDispatcher("views/categories.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}