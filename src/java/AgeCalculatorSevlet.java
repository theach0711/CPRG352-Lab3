/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 847240
 */
public class AgeCalculatorSevlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //age parameter
        String AGE = request.getParameter("age");

        request.setAttribute("Age", AGE);

        try {
            if (AGE == null || AGE.equals("")) {
                request.setAttribute("message", "You must give your current age");
            }
            int a = Integer.parseInt(AGE);
            int sum = a + 1;

            request.setAttribute("ageAfter", "Your age next birtday is " + sum);
        } catch (NumberFormatException nfe) {
            request.setAttribute("error", "You must enter the number");
        }

        request.setAttribute("URL", "/WEB-INF/arithmeticcalculator.jsp");

        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

    }

}
