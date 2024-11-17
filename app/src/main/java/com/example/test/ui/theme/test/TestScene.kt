package com.example.test.ui.theme.test

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test.ui.theme.TestTheme


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  var count by remember { mutableStateOf(0) }
  var list = listOf("asdf", "12", "asdfjaldfjaafd", "22")

  Row {
    list.forEach {
      AAAA(it)
    }
  }

  Column(
    modifier = Modifier
      .fillMaxSize()
      .padding(16.dp),
    verticalArrangement = Arrangement.Center
  ) {
    Text(text = "현재 이름: $count")
    Spacer(modifier = Modifier.height(16.dp))
    Button(onClick = { count++ }) {
      Text("카운트 증가")
    }
  }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  TestTheme {
    Greeting("Android")
  }
}

@Composable
fun AAAA(aa: String){
  Box(Modifier.clip(RoundedCornerShape(40.dp))
    .background(Color.Yellow)
  ){
    Text(aa, color = Color.Blue)
  }
}

@Preview
@Composable
private fun Preview1() {
  GreetingPreview()
}