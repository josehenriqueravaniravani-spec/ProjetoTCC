/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoagrohad.controller.vacina;

import br.com.projetoagrohad.dao.VacinaDAO;
import br.com.projetoagrohad.model.Vacina;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JoseHenriqueRavani
 */
@WebServlet(name = "CadastrarVacina", urlPatterns = {"/CadastrarVacina"})
public class CadastrarVacina extends HttpServlet {

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
        try {
            int idVacina = request.getParameter("idVacina").isEmpty() ? 0 : Integer.parseInt(request.getParameter("idVacina"));
            String nomeVacina = request.getParameter("nomeVacina");
            String doseRecomendada = request.getParameter("doseRecomendada");
            
            //Construindo um novo Objeto do Tipo Profissao e 
            //armazenando os dados recebidos da View
            Vacina vacina = new Vacina(idVacina, nomeVacina, doseRecomendada);
            
            //Criando um novo objeto do tipo ProfissaoDAO para chamar  o método GRAVAR
            VacinaDAO profissaoDAO = new VacinaDAO();
            profissaoDAO.gravar(vacina);
            
            //Retornando para view
            request.setAttribute("mensagem", "Vacina gravada com sucesso!");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Problemas na Controller ao Cadastrar Vacina! ERRO: " + ex.getMessage());
            request.setAttribute("mensagem", ex.getMessage());
        }
        //Disparando o retorno para view
        request.getRequestDispatcher("NovaVacina").forward(request, response);
        
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
