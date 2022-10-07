
package controladores;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.dao.ClienteDAO;
import modelos.dao.ParqueaderoDAO;

/**
 *
 * @author ediss
 */
@WebServlet(name = "ClientesController", urlPatterns = {"/ClientesController"})
public class ClientesController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       ClienteDAO clienteDao = new ClienteDAO();
       ParqueaderoDAO parqueaderoDao = new ParqueaderoDAO();
       String accion;
        RequestDispatcher dispatcher = null;
        accion = request.getParameter("accion");
       if(accion== null){
           dispatcher = request.getRequestDispatcher("Web Pages/index.html");
       }
       dispatcher.forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
