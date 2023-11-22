package com.example.fantasy_league

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.fantasy_league.ui.theme.FantasyLeagueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FantasyLeagueTheme {
                Column {
                    Row {
                        Text(text = "Bienvenido a tu Fantasy")
                    }
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
                                Text(text = "Cristiano Ronaldo")
                                Text(text = "vs Getafe 2017")
                                Text(text = "4 goles")
                            }
                        }
                    }
                    Card (colors = CardDefaults.cardColors(
                        containerColor = Color.Red,
                    ), modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)) {
                        Row  {
                            Column {
                                Image(painter = painterResource(id = R.drawable.messi) , contentDescription ="" , modifier = Modifier.size(150.dp))
                            }
                            Column (verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()){
                                Text(text = "Messi")
                                Text(text = "vs Real Madrid")
                                Text(text = "4 goles en propia")
                            }
                        }
                        Row (){
                            Column {
                                Button(onClick = {

                                }) {
                                    Text(text = "Add")
                                }
                            }
                            Column {
                                Button(onClick = {

                                }) {
                                    Text(text = "Delete")
                                }
                            }

                        }
                    }



                    }
                }
        }
    }
}





