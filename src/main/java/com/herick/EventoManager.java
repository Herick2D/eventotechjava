package com.herick;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class EventoManager {
    private List<Evento> eventos;

    public EventoManager() {
        eventos = new ArrayList<>();
    }

    public void cadastrarEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Evento> consultarEventos() {
        return eventos;
    }
}
