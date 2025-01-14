package dev.spozap.feature.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun RowScope.TaskStatsItemContainer(content: @Composable () -> Unit) {
    Column(
        modifier = Modifier
            .weight(1f)
            .background(
                color = MaterialTheme.colorScheme.background,
                shape = RoundedCornerShape(16.dp)
            )
            .border(
                width = 4.dp,
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        content()
    }
}

@Composable
internal fun TaskStatsItemContent(
    title: String,
    footer: @Composable () -> Unit,
    icon: @Composable () -> Unit
) {
    Box(
        Modifier
            .background(MaterialTheme.colorScheme.primary, RoundedCornerShape(100))
            .padding(8.dp)
    ) {
        icon()
    }

    Text(title)
    footer()
}