package com.codelab.basiclayouts.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Default

class Greetings: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}
    @Preview
    @Composable
    fun MyApp(
        modifier: Modifier = Modifier,
        names :List<String> = listOf("World", "Compose")
    ) {
        Column(modifier) {
            for (name in names) {
                Greeting(name = name)
            }
        }
    }

@Composable
private fun Greeting(name:String) {
    Surface(color = MaterialTheme.colors.primary) {
        Column(modifier = Modifier.padding(24.dp)) {
            Text(text = "Hello.")
            Text(text = name)
        }

    }
}
@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    MaterialTheme() {
        MyApp()
    }
}


