package com.lucascabral.solidprinciples.openClosed

abstract class Shape : Comparable<Shape>{
    abstract fun draw()

    private fun precedes(shape: Shape) : Int {
        val shapeIndex = shapesOrdering.indexOfFirst { shape.javaClass.simpleName == it }
        val meIndex = shapesOrdering.indexOfFirst { this.javaClass.simpleName == it }

        return meIndex - shapeIndex
    }

    private val shapesOrdering = listOf("Square", "Circle", "Triangle", "Line")

    override fun compareTo(other: Shape): Int {
        return precedes(other)
    }
}