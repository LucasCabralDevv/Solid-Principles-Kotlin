package com.lucascabral.solidprinciples.openClosed

import android.graphics.Point
import kotlin.random.Random

class DrawShapes {

    data class Circle(
        val center: Point = Point(),
        val radius: Double = Random.nextDouble()
    ) : Shape {
        override fun draw() {
            println("circle")
        }
    }

    data class Square(
        val side: Double = Random.nextDouble()
    ) : Shape {
        override fun draw() {
            println("square")
        }
    }

    private fun drawAllShapes(shapes: List<Shape>) {
        for (shape in shapes) {
            shape.draw()
        }
    }

    fun main() {
        val shapes = listOf(
            Square(),
            Circle(),
            Square(),
            Square()
        )
        drawAllShapes(shapes)
    }
}