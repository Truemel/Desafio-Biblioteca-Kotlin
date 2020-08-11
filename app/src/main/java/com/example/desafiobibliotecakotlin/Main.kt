package com.example.desafiobibliotecakotlin

fun LibrosEscolares.precioFormateado():String{
    return "$${this.precio}"
}

fun imprimir(libro:LibrosEscolares){
    println("Nombre del libro: ${libro.nombre}, ISBN: ${libro.isbn}, Año publicación: ${libro.anno}, Editorial: ${libro.editorial}, Cantidad de páginas: ${libro.paginas}, Precio: ${libro.precioFormateado()}, Autor del libro: ${libro.autor}, Tipo de libro: ${libro.tipo}\n")
}

fun main(){
    var libro1:LibrosEscolares = LibrosEscolares("Libro 1", "qwerty", 1980, "Editorial 1", 2, 24, "Escritor 1", 'I')
    var libro2:LibrosEscolares = LibrosEscolares("Libro 2", "asdfg", 1970, "Editorial 2", 4, 12, "Escritor 2", 'I')
    var libro3:LibrosEscolares = LibrosEscolares("Libro 3", "zxcvb", 1990, "Editorial 3", 6, 15, "Escritor 3", 'I')
    val libro4:LibrosEscolares = LibrosEscolares("Libro 4", "q1w2e3r4t5y6", 2020, "Editorial 4", 20, 50, "Escritor 4", 'D')

    imprimir(libro1)
    imprimir(libro2)
    imprimir(libro3)
    imprimir(libro4)
}