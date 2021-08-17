package com.lucascabral.solidprinciples.openClosed

import android.graphics.Point
import kotlin.random.Random

class DrawShapes {

    data class Circle(
        val center: Point = Point(),
        val radius: Double = Random.nextDouble()
    ) : Shape() {
        override fun draw() {
            println("circle")
        }
    }

    data class Square(
        val side: Double = Random.nextDouble()
    ) : Shape() {
        override fun draw() {
            println("square")
        }
    }

    data class Triangle (
        val side: Double = Random.nextDouble()
    ) : Shape() {
        override fun draw() {
            println("triangle")
        }
    }

    data class Line(
        val side: Double = Random.nextDouble()
    ) : Shape() {
        override fun draw() {
            println("line")
        }
    }

    private fun drawAllShapes(shapes: ArrayList<Shape>) {
        shapes.sort()
        for (shape in shapes) {
            shape.draw()
        }
    }

    fun main() {
        val shapes = arrayListOf(
            Square(),
            Circle(),
            Square(),
            Square(),
            Line(),
            Triangle(),
            Line(),
            Triangle()
        )
        drawAllShapes(shapes)
    }
}