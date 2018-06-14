
package JavaServletApp;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *
 * @author Renee
 * 
 * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
 * methods.
 * @param request Servlet request
 * @param response Servlet response
 * @throws ServletException if a Servlet-specific error occurs
 * @throws IOException if an I/O error occurs
*/
 
    
@WebServlet(name = "GroupSchedule", urlPatterns = {"/GroupSchedule"})
//Define Servlett class.
public class MyServlet extends HttpServlet {
    
    public static void MyServlet(String args[]){
    }        
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter pw = response.getWriter()) {
            response.setContentType("text/html;charset=UTF-8");//get response from the form.
        
            //Display the output from the parameters
            String Student1 = request.getParameter("KirkBrown");
            String Student2 = request.getParameter("PaulDarr");
            String Student3 = request.getParameter("EdwardWilson");
            String Student4 = request.getParameter("MasonRoller");
            String Student5 = request.getParameter("ReneeMitchell");
            //Get the context from the parameters passed.
            out.println("<h1>GroupSchedule</h1>" + request.getContextPath());

            String result = String.format(Student1, "KirkBrown") + String.format(Student2, "PaulDarr")
                    + String.format(Student3, "EdwardWilson") + String.format(Student4, "MasonRoller")
                    + String.format(Student5, "ReneeMitchell");
            pw.println("GroupSchedule" + result);
            pw.close();
        }
      
    }
}
