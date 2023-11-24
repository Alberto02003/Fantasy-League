package com.example.fantasy_league.Metodos

import com.example.fantasy_league.Objetos.jugador

fun valorInicial(): ArrayList<jugador>{
    var listajugador =ArrayList<jugador>()
    var jugador = jugador("Cristriano Ronaldo","REAL MADRID", "EI", 5, "Barceponga", "29/10/2017")
    var jugador2 = jugador("Messi","Barcelona", "ED", 0, "Real Madrid", "29/10/2017")
    var jugador3 = jugador("Joe Hart","Celtic Glashgow", "POR", 0 , "Real Madrid", "29/10/2017")


    listajugador.add(jugador)
    listajugador.add(jugador2)
    listajugador.add(jugador3)

    return listajugador
}

fun obtenerEquiposUnicos(listaJugadores: List<jugador>): List<String> {
    val equiposUnicos = mutableSetOf<String>()

    for (jugador in listaJugadores) {
        equiposUnicos.add(jugador.equipo)
    }

    return equiposUnicos.toList()
}
