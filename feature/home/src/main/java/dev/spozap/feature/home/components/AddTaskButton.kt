package dev.spozap.feature.home.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
internal fun AddTaskButton(onClick: () -> Unit) {
    FloatingActionButton(onClick = onClick, shape = RoundedCornerShape(12.dp)) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Add button",
            tint = Color.White
        )
    }
}