package com.example.fantasy_league.Metodos

import com.example.fantasy_league.Objetos.jugador

fun valorInicial(): ArrayList<jugador>{
    var listajugador =ArrayList<jugador>()
    var jugador = jugador("Cristriano Ronaldo","REAL MADRID", "EI", 5, "Barceponga", "29/10/2017")
    var jugador2 = jugador("Messi","Barcelona", "ED", 0, "Real Madrid", "29/10/2017")

    listajugador.add(jugador)
    listajugador.add(jugador2)

    return listajugador
}