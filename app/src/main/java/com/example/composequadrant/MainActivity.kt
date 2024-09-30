package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(Modifier.weight(1f)) {
            Column(Modifier.weight(1f)) {
                Quadrant(
                    modifier = Modifier,
                    stringResource(R.string.text_composable),
                    stringResource(R.string.description_text_composable),
                    backgroundColor = Color(0xFFEADDFF)
                )
            }
            Column(Modifier.weight(1f)) {
                Quadrant(
                    modifier = Modifier,
                    stringResource(R.string.image_composable),
                    stringResource(R.string.description_image_composable),
                    backgroundColor = Color(0xFFD0BCFF)
                )
            }
        }
        Row(Modifier.weight(1f)){
            Column(Modifier.weight(1f)) {
                Quadrant(
                    modifier = Modifier,
                    stringResource(R.string.row_composable),
                    stringResource(R.string.description_row_composable),
                    backgroundColor = Color(0xFFB69DF8)
                )
            }
            Column(Modifier.weight(1f)) {
                Quadrant(
                    modifier = Modifier,
                    stringResource(R.string.column_composable),
                    stringResource(R.string.description_column_composable),
                    backgroundColor = Color(0xFFF6EDFF)
                )
            }
        }
    }
}

@Composable
fun Quadrant(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    backgroundColor: Color
) {
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant()
    }
}