package dev.starsend.demo.crashdemo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.starsend.demo.crashdemo.ui.theme.CrashDemoTheme

@Composable
fun CrashControls(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Crash Demo Controls",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 32.dp)
        )

        Button(
            onClick = {
                throw RuntimeException("Test Crash from CrashDemo")
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error)
        ) {
            Text("Trigger Crash (Exception)")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                Thread.sleep(10000)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Trigger ANR (Sleep 10s)")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                Thread.sleep(2000)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Trigger Jank (Sleep 2s)")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CrashControlsPreview() {
    CrashDemoTheme {
        CrashControls()
    }
}
