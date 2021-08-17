package com.lucascabral.solidprinciples.openClosed

import org.junit.Test

class DrawShapesTest {

    private fun drawAllShapes(shapes: ArrayList<Shape>) {
        shapes.sort()
        for (shape in shapes) {
            shape.draw()
        }
    }

    @Test
    fun main() {
        val shapes = arrayListOf(
            DrawShapes.Square(),
            DrawShapes.Circle(),
            DrawShapes.Square(),
            DrawShapes.Square(),
            DrawShapes.Line(),
            DrawShapes.Triangle(),
            DrawShapes.Line(),
            DrawShapes.Triangle()
        )
        drawAllShapes(shapes)
    }
}