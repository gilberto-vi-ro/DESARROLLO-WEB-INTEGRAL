package com.example.composeactivity1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeactivity1.ui.theme.ComposeActivity1Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myComponent()
        }
    }
}

@Composable
fun myImgMaxWidth(idResource: Int)
{
    Image(
        painterResource(id = idResource),
        contentDescription = "Img de prueba",
        contentScale = ContentScale.Crop,
        modifier = Modifier.padding(8.dp).fillMaxWidth()
    )
}

@Composable
fun myImg(idResource: Int)
{
    Image(
        painterResource(id = idResource),
        contentDescription = "Img de prueba",
        contentScale = ContentScale.Crop,
        modifier = Modifier.padding(top=16.dp).size( 20.dp )
    )
}

@Composable
fun textInRow(){
        Row(modifier=Modifier.padding(5.dp)){
            myImg(R.drawable.gl)
            textInColumn()
        }
}
@Composable
fun textInColumn(){
    Column(modifier=Modifier.padding(start = 8.dp, end = 8.dp)){
        Text(text="Gilberto")
        Text(text="Villarreal")
        Text(text="Rodriguez")
    }
}
@Composable
fun container(){
    Column{
        textInRow()
        myImgMaxWidth(R.drawable.gl)
    }
}
@Composable
fun myComponent(){
    container()
}

@Preview(showBackground = true)
@Composable
fun myPreview(){
    myComponent()
}