package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SomeFunction()

        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
@Composable
fun SomeFunction() {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Row(modifier = Modifier.weight(1f)) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                        .weight(1f)
                        .background(Color.Green)
                        .fillMaxHeight()
                        .padding(16.dp)
            ) {
                Text(
                    fontWeight = FontWeight.Bold,
                    text = stringResource(R.string.TextComposableHeader),
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(id = R.string.TextComposableParagraph),
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                modifier = Modifier
                        .weight(1f)
                        .background(Color.Yellow)
                        .fillMaxHeight()
                        .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(
                    modifier = Modifier.padding(bottom = 16.dp) ,
                    text = stringResource(R.string.ImageComposableHeader),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(id = R.string.ImageComposableParagraph),
                    textAlign = TextAlign.Justify
                )
            }

        }
        Row(modifier = Modifier.weight(1f)) {
            Column(
                modifier = Modifier
                        .weight(1f)
                        .background(Color.Cyan)
                        .fillMaxHeight()
                        .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.RowComposableHeader),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(id = R.string.RowComposableParagraph),
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                modifier = Modifier
                        .weight(1f)
                        .background(Color.LightGray)
                        .fillMaxHeight()
                        .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.ColumnComposableHeader),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(id = R.string.ColumComposableParagraph),
                    textAlign = TextAlign.Justify
                )
            }
        }
        
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

        SomeFunction()

}