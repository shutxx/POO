/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livros;

/**
 *
 * @author shuttxx
 */
public class LivroClass {
    private String titulo;
    private String autor;
    private int ano;

    public LivroClass(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void detalhes(){
        System.out.println("Lorem Ipsum is simply dummy text of the printing "
                + "\nand typesetting industry. Lorem Ipsum has been the industry's"
                + "\nstandard dummy text ever since the 1500s, when an unknown"
                + "\nprinter took a galley of type and scrambled it to make a "
                + "\ntype specimen book. It has survived not only five centuries,"
                + "\nbut also the leap into electronic typesetting, remaining "
                + "\nessentially unchanged. It was popularised in the 1960s with "
                + "\nthe release of Letraset sheets containing Lorem Ipsum "
                + "\npassages, and more recently with desktop publishing software "
                + "\nlike Aldus PageMaker including versions of Lorem Ipsum.");
    }
}
