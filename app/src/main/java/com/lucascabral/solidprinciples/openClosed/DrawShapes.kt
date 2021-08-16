package com.lucascabral.solidprinciples.openClosed

import android.graphics.Point
import kotlin.random.Random

class DrawShapes {

    enum class ShapeType { CIRCLE, SQUARE }

    data class Circle(
        val center: Point = Point(),
        val radius: Double = Random.nextDouble(),
        val type: DrawShapes.ShapeType
    )

    data class Square(
        val side: Double = Random.nextDouble(),
        val type: ShapeType
    )

    private fun drawAllShapes(shapes: List<Any>) {
        for (shape in shapes) {
            if (shape is Square) {
                println("square")
            }
            if (shape is Circle) {
                println("circle")
            }
        }
    }

    fun main() {
        val shapes = listOf(
            Square(type = ShapeType.SQUARE),
            Circle(type = ShapeType.CIRCLE),
            Square(type = ShapeType.SQUARE),
            Square(type = ShapeType.SQUARE)
        )
        drawAllShapes(shapes)
    }
}