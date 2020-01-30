package org.example.demo.ticket.model.bean;

import org.example.demo.ticket.model.dao.projet.Projet;
import org.example.demo.ticket.model.dao.projet.Version;
import org.example.demo.ticket.model.dao.ticket.*;
import org.example.demo.ticket.model.dao.utilisateur.Utilisateur;

public class ModelBeanFactory {
    private Projet projet;
    private Version version;
    private Bug bug;
    private BugNiveau bugNiveau;
    private Commentaire commentaire;
    private Evolution evolution;
    private HistoriqueStatut historiqueStatut;
    private Ticket ticket;
    private TicketStatut ticketStatut;
    private Utilisateur utilisateur;

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public Bug getBug() {
        return bug;
    }

    public void setBug(Bug bug) {
        this.bug = bug;
    }

    public BugNiveau getBugNiveau() {
        return bugNiveau;
    }

    public void setBugNiveau(BugNiveau bugNiveau) {
        this.bugNiveau = bugNiveau;
    }

    public Commentaire getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(Commentaire commentaire) {
        this.commentaire = commentaire;
    }

    public Evolution getEvolution() {
        return evolution;
    }

    public void setEvolution(Evolution evolution) {
        this.evolution = evolution;
    }

    public HistoriqueStatut getHistoriqueStatut() {
        return historiqueStatut;
    }

    public void setHistoriqueStatut(HistoriqueStatut historiqueStatut) {
        this.historiqueStatut = historiqueStatut;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public TicketStatut getTicketStatut() {
        return ticketStatut;
    }

    public void setTicketStatut(TicketStatut ticketStatut) {
        this.ticketStatut = ticketStatut;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
