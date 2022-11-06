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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
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
            Column(modifier = Modifier.weight(1f).background(Color.Green).fillMaxHeight()) {
                Text(text = stringResource(R.string.TextComposableHeader))
                Text(text = stringResource(id = R.string.TextComposableParagraph))
            }
            Column(modifier = Modifier.weight(1f).background(Color.Yellow).fillMaxHeight()) {
                Text(text = stringResource(R.string.ImageComposableHeader))
                Text(text = stringResource(id = R.string.ImageComposableParagraph))
            }

        }
        Row(modifier = Modifier.weight(1f)) {
            Column(modifier = Modifier.weight(1f).background(Color.Cyan).fillMaxHeight()) {
                Text(text = stringResource(R.string.RowComposableHeader))
                Text(text = stringResource(id = R.string.RowComposableParagraph))
            }
            Column(modifier = Modifier.weight(1f).background(Color.LightGray).fillMaxHeight()) {
                Text(text = stringResource(R.string.ColumnComposableHeader))
                Text(text = stringResource(id = R.string.ColumComposableParagraph))
            }
        }
        
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

        SomeFunction()

}