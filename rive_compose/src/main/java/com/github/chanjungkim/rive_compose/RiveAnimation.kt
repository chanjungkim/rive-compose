package com.github.chanjungkim.rive_compose

import androidx.annotation.RawRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import app.rive.runtime.kotlin.RiveAnimationView

@Composable
fun RiveAnimation(
    @RawRes riveResId: Int,
    modifier: Modifier = Modifier
) {
    val riveResId by remember { mutableStateOf(riveResId) }

    AndroidView(
        modifier = modifier,
        factory = { context ->
            RiveAnimationView(context).apply{

            }
        },
        update = { view ->
            view.setRiveResource(riveResId, artboardName = null)
        }
    )
}