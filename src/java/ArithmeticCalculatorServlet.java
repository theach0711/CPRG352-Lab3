/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 847240
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first_number");
        String second = request.getParameter("second_number");
        String operator = request.getParameter("operator");
        System.out.println(operator);
        System.out.println(first);
        System.out.println(second);
        int answer = 1;

        request.setAttribute("firstNumber", first);
        request.setAttribute("secondNumber", second);
        try {
            int n1 = Integer.parseInt(first);
            int n2 = Integer.parseInt(second);

            if (operator.equals("+")) {
                answer = n1 + n2;
            } else if (operator.equals("-")) {
                answer = n1 - n2;
            } else if (operator.equals("*")) {
                answer = n1 * n2;
            } else if (operator.equals("%")) {
                answer = n1 % n2;
            }
            request.setAttribute("answer",answer);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        catch(Exception e){
            request.setAttribute("answer", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
        

    }
}
