package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import context.Singleton;
import dao.IDAOInvite;

import model.Invite;


@WebServlet("/Invite")
public class InviteController extends HttpServlet {
//
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		IDAOInvite daoF = Singleton.getInstance().getDaoInvite();
//		IDAOStagiaire daoS = Singleton.getInstance().getDaoStagiaire();
//		//Si on ne recoit pas d'id => findAll
//		if(request.getParameter("id")==null) 
//		{
//			String recherche = request.getParameter("recherche");
//			List<Invite> Invites;
//			
//			if(recherche==null) {
//				Invites = daoF.findAllWithStagiaires();
//			}
//			else 
//			{
//				Invites = daoF.findAllByDateFilter(LocalDate.parse(recherche));
//				request.setAttribute("filtre", "( Filtrées )");
//			}
//			/*for(Invite f :  Invites) 
//			{
//				List<Stagiaire> stagiairesDeLaInvite = daoS.findAllByInvite(f.getId());
//				f.setStagiaires(stagiairesDeLaInvite);
//			}*/
//			
//			request.setAttribute("Invites", Invites);
//			this.getServletContext().getRequestDispatcher("/WEB-INF/Invites.jsp").forward(request, response);	
//		}
//		else 
//		{
//
//			//pas de param delete => findById
//			if(request.getParameter("delete")==null) 
//			{
//				int id = Integer.parseInt(request.getParameter("id"));
//				Invite f = daoF.findById(id);
//				request.setAttribute("Invite", f);
//				this.getServletContext().getRequestDispatcher("/WEB-INF/updateInvite.jsp").forward(request, response);	
//			}
//			//param id + delete => delete
//			else 
//			{
//				int id = Integer.parseInt(request.getParameter("id"));
//				Invite f = daoF.findById(id);
//				daoF.delete(f);
//				response.sendRedirect("Invite");
//			}
//		}
//
//
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//Si pas d'id en param => insert
//
//		IDAOInvite daoF = Singleton.getInstance().getDaoInvite();
//
//		if(request.getParameter("id")==null) 
//		{
//			String libelle = request.getParameter("libelle");
//			String debut = request.getParameter("debut");
//			String fin = request.getParameter("fin");
//			Invite f = new Invite(libelle, LocalDate.parse(debut), LocalDate.parse(fin));
//
//			daoF.save(f);	
//			response.sendRedirect("Invite");
//
//		}
//		//update"
//		else 
//		{
//			int id = Integer.parseInt(request.getParameter("id"));
//			int version = Integer.parseInt(request.getParameter("version"));
//			String libelle = request.getParameter("libelle");
//			String debut = request.getParameter("debut");
//			String fin = request.getParameter("fin");
//			Invite f = new Invite(id,libelle, LocalDate.parse(debut), LocalDate.parse(fin));
//			
//			f.setVersion(version);
//			daoF.save(f);
//			response.sendRedirect("Invite");
//
//		}
//	}
//
}
