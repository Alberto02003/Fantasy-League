package com.example.fantasy_league

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.fantasy_league.Metodos.obtenerEquiposUnicos
import com.example.fantasy_league.Objetos.jugador
import com.example.fantasy_league.Objetos.jugadores
import com.example.fantasy_league.ui.theme.FantasyLeagueTheme
import java.util.function.Consumer

class MainActivity : ComponentActivity() {

    val equipois = obtenerEquiposUnicos(jugadores.listajugador)

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val ctx = LocalContext.current
            FantasyLeagueTheme {
                Column (modifier = Modifier.fillMaxSize()) {
                    Text(text = "Bienvenido a tu Fantasy")
                    val ctx = LocalContext.current
                    var listaFiltrada: ArrayList<jugador>
                    SeachBar(ctx)
                    Botones()
                    }
                }
        }
    }
}


@Composable
fun Botones(){
    Row (verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxSize()) {
        ExtendedFloatingActionButton(onClick = {

        }) {
            Text(text = "Add")
            Icon(painter = painterResource(id = R.drawable.anadir), modifier = Modifier
                .size(30.dp)
                .padding(horizontal = 5.dp), contentDescription ="" )
        }
        ExtendedFloatingActionButton(onClick = {
        }) {
            Text(text = "Delete")
            Icon(painter = painterResource(id = R.drawable.eliminar), modifier = Modifier
                .size(30.dp)
                .padding(horizontal = 5.dp), contentDescription ="" )
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SeachBar(Ctx:ctx){
    var query by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }
    SearchBar(
        query = query,
        onQueryChange = {query = it},
        onSearch = {
            Toast.makeText(ctx, query, Toast.LENGTH_SHORT).show()
            active = false
        },
        active = active,
        onActiveChange ={active = it},
        modifier = Modifier.fillMaxWidth(),
        trailingIcon = {
            IconButton(onClick = { active = false}) {
                Icon(painter = painterResource(id = R.drawable.buscar), contentDescription = "", modifier = Modifier.size(30.dp))
            }
        }
    ) {
        LazyColumn(){
            listaFiltrada =
                jugadores.listajugador.filter { it.equipo.startsWith(query, true) } as ArrayList<jugador>
            items(listaFiltrada){
                androidx.compose.material3.ListItem(modifier = Modifier.clickable { query = it.equipo },headlineContent = { Text(it.equipo)})
            }
        }

    }
}
@Composable
fun carta(jugador:jugador){
    Card (colors = CardDefaults.cardColors(
        containerColor = Color.Gray,
    ), modifier = Modifier
        .fillMaxWidth()
        .padding(top = 10.dp)) {
        Row  {
            Column {
                Image(painter = painterResource(id = R.drawable.cris) , contentDescription ="" , modifier = Modifier.size(150.dp))
            }
            Column (verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()){
                Text(text = jugador.nombre)
                Text(text = jugador.equipoEnContra)
                Text(text = jugador.goles.toString())
            }
        }
    }
}





