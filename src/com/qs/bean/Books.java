package com.qs.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Books {
    private int idBook;
    private String nameBook;
    private String classBook;
    private byte stateBook;

    @Id
    @Column(name = "id_book")
    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    @Basic
    @Column(name = "name_book")
    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    @Basic
    @Column(name = "class_book")
    public String getClassBook() {
        return classBook;
    }

    public void setClassBook(String classBook) {
        this.classBook = classBook;
    }

    @Basic
    @Column(name = "state_book")
    public byte getStateBook() {
        return stateBook;
    }

    public void setStateBook(byte stateBook) {
        this.stateBook = stateBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return idBook == books.idBook &&
                stateBook == books.stateBook &&
                Objects.equals(nameBook, books.nameBook) &&
                Objects.equals(classBook, books.classBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBook, nameBook, classBook, stateBook);
    }
}
