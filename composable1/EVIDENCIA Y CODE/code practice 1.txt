package com.example.composeactivity1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeactivity1.ui.theme.ComposeActivity1Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //contenedor
        setContent {
            myTexts()

        }
    }
}
@Composable
fun myImg(idResource: Int)
{
    Image(
        painterResource(id = idResource),
        contentDescription = "Img de prueba",
        contentScale = ContentScale.Crop,
        modifier = Modifier.size( 20.dp )
    )
}


@Composable
fun textInColumn()
{
    Column {
        Text(text = "Parrafo 1")
        Text(text = "Parrafo 2")
        // MiImagen()
    }
}

@Composable
fun myColumn1()
{
    Column {
        Text(text = "Parrafo 1")
        myImg(R.drawable.delete)
        Text(text = "Parrafo 2")

    }
}

@Composable
fun myColumn2()
{
    Column {
        Text(text = "Parrafo 3")
        Text(text = "Parrafo 4")

    }
}

@Composable
fun myColumn3()
{
    Column {
        myImg(R.drawable.search)
        myImg(R.drawable.delete)
        Text(text = "Parrafo")
    }
}


@Composable
fun myTexts()
{
    //colocar en columna
    Row {
        myColumn1()
        myColumn2()
        myColumn3()
        //textInColumn()
    }

}

@Preview(showBackground = true)
@Composable
fun vistaPrevia()
{
    myTexts()

}