package com.stevdza_san.game.domain.target

import androidx.compose.animation.core.Animatable
import androidx.compose.ui.graphics.Color

interface Target {
    val x: Float
    val y: Animatable<Float, *>
    val radius: Float
    val fallingSpeed: Float
    val color: Color
}