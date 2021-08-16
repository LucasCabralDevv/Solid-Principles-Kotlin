package com.lucascabral.solidprinciples.openClosed

import org.junit.Test

class DrawShapesTest {

    private fun drawAllShapes(shapes: List<Shape>) {
        for (shape in shapes) {
            shape.draw()
        }
    }

    @Test
    fun main() {
        val shapes = listOf(
            DrawShapes.Square(),
            DrawShapes.Circle(),
            DrawShapes.Square(),
            DrawShapes.Square()
        )
        drawAllShapes(shapes)
    }
}