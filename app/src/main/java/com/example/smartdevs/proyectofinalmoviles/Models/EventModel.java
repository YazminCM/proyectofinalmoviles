package com.example.smartdevs.proyectofinalmoviles.Models;

public class EventModel {
    private String id_evento;
    private String nombre;
    private String ubicacion;
    private String contacto;
    private String tipoEvento;
    private String fecha;

    public EventModel(String id_evento, String nombre, String ubicacion, String contacto, String tipoEvento, String fecha) {
        this.setIdEvento(id_evento);
        this.setNombre(nombre);
        this.setUbicacion(ubicacion);
        this.setContacto(contacto);
        this.setTipoEvento(tipoEvento);
        this.setFecha(fecha);
    }

    public String getIdEvento() {
        return id_evento;
    }

    public void setIdEvento(String id) {
        this.id_evento = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    private void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getContacto() {
        return contacto;
    }

    private void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    private void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getFecha() {
        return fecha;
    }

    private void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
