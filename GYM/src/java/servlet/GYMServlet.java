package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Adelgazar;
import logica.Cardio;
import logica.Ejercicio;
import logica.Pull;
import logica.Push;
import logica.Tonificar;
import logica.Usuario;

/**
 *
 * @author Laura Santana
 */
@WebServlet(name="GYMServlet",urlPatterns = {"/GYMServlet"})
public class GYMServlet extends HttpServlet {
    
    private Usuario user;
    private int contadorRutina = 0;
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String name = request.getParameter("usuario");
        
        String dia = request.getParameter("dias");
        int dia_entrenamiento;
        
        //validar numero de dias para que este entre 1 y 7 dias
        try {
            dia_entrenamiento = Integer.parseInt(dia);
            if (dia_entrenamiento < 1 || dia_entrenamiento > 7) {
                throw new NumberFormatException("El número de días debe estar entre 1 y 7.");
            }   
        } catch (NumberFormatException e) {
            // Generar script JavaScript para mostrar ventana emergente con el mensaje de error
            String errorMessage = "El número de días debe estar entre 1 y 7.";
            String script = "<script>alert('" + errorMessage + "');window.history.back();</script>";
            response.getWriter().println(script);
            return;
        }
                
        String rutina = request.getParameter("rutina");
        
        if(rutina.equals("Adelgazar") ){
            Adelgazar a = new Adelgazar(dia_entrenamiento);
            user = new Usuario(name,dia_entrenamiento,a);
        }
        else if(rutina.equals("Tonificar")){
            Tonificar t = new Tonificar(dia_entrenamiento);
            user = new Usuario(name, dia_entrenamiento, t);
        }
        
        // Validar que todos los campos estén llenos
        if (name == null || name.isEmpty() || dia == null || dia.isEmpty()) {
            // Generar script JavaScript para mostrar ventana emergente con el mensaje de error
            String errorMessage = "Todos los campos son obligatorios.";
            String script = "<script>alert('" + errorMessage + "');window.history.back();</script>";
            response.getWriter().println(script);
            return;
        }
        
        
        List<List<Ejercicio>> ejercicios = user.getRutina().getEjercicios();
                
        
    try (PrintWriter out = response.getWriter()) {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link href=\"css/style2.css\" rel=\"stylesheet\">");
        out.println("<title>Plan de entrenamiento</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1 id=\"usuario\">Usuario " + user.getNombre() + "</h1>");
        
        for (List<Ejercicio> ejercicio : ejercicios) {
            contadorRutina++;
            
            out.println("<h2 class=\"dia\">Rutina: " + contadorRutina + "</h2>");
            out.println("<div class=\"container\">");   
            for(Ejercicio e : ejercicio){
                out.println("<div class=\"card\">");
                    out.println("<div class=\"imagenejercicio\">");
                    out.println("<img src=\"img/" + e.getFoto() + "\">");
                    out.println("</div>");
                    out.println("<div class=\"contenido\">");
                    out.println("<h2 class=\"nombre-ejercicio\">" + e.getNombreEjercicio() + "</h2>");
                        if(e instanceof Cardio){
                            Cardio cardio = (Cardio) e;
                            out.println("<h3 class=\"duracion\">Duración: " + cardio.getDuracion() + "</h3>");
                        }
                        else if(e instanceof Push){
                            Push push = (Push)e;
                            out.println("<p class=\"repeticiones\">Repeticiones: " + push.getRepeticion() + "</p>");
                            out.println("<p class=\"series\">Series: " + push.getSerie() + "</p>");
                        }
                        else if(e instanceof Pull){
                            Pull pull = (Pull)e;
                            out.println("<p class=\"repeticiones\">Repeticiones: " + pull.getRepeticion() + "</p>");
                            out.println("<p class=\"series\">Series: " + pull.getSerie() + "</p>");
                        }
                        out.println("</div>");
                out.println("</div>");
            }
            out.println("</div>"); 
        }
        out.println("</body>");
        out.println("</html>");
    }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
