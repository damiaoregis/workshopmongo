package com.damiaoregis.workshopmongo.dto;

import java.util.Date;

public class ComentDTO implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String text;
    private AutorDTO author;
    private Date date;

    public ComentDTO() {
    }

    public ComentDTO(String text, Date date, AutorDTO author) {
        this.text = text;
        this.author = author;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public AutorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AutorDTO author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
