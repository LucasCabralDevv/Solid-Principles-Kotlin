package com.lucascabral.solidprinciples.openClosed

import org.junit.Test

class DrawShapesTest {

    private fun drawAllShapes(shapes: List<Any>) {
        for (shape in shapes) {
            if (shape is DrawShapes.Square) {
                println("square")
            }
            if (shape is DrawShapes.Circle) {
                println("circle")
            }
        }
    }

    @Test
    fun main() {
        val shapes = listOf(
            DrawShapes.Square(type = DrawShapes.ShapeType.SQUARE),
            DrawShapes.Circle(type = DrawShapes.ShapeType.CIRCLE),
            DrawShapes.Square(type = DrawShapes.ShapeType.SQUARE),
            DrawShapes.Square(type = DrawShapes.ShapeType.SQUARE)
        )
        drawAllShapes(shapes)
    }
}