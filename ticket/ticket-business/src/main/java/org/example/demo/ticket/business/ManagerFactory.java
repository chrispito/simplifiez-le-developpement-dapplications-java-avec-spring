package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

public class ManagerFactory {
    private ProjetManager projetManager;
    private  TicketManager ticketManager;

    public void setProjetManager(ProjetManager projetManager) {
        this.projetManager = projetManager;
    }

    public ProjetManager getProjetManager() {
        return new ProjetManager();
    }

    public void setTicketManager(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }

    public TicketManager getTicketManager() {
        return new TicketManager();
    }
}
