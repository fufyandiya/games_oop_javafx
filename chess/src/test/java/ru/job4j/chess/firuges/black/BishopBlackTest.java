package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.FigureNotFoundException;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.Logic;
import ru.job4j.chess.OccupiedCellException;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A4);
        assertEquals(bishopBlack.position(), Cell.A4);
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A4);
        BishopBlack bishopBlackTwo = (BishopBlack) bishopBlack.copy(Cell.B5);
        assertEquals(bishopBlackTwo.position(), Cell.B5);
    }

    @Test
    public void isDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D5);
        assertTrue(bishopBlack.isDiagonal(Cell.D5, Cell.B3));
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D5);
        assertArrayEquals(bishopBlack.way(Cell.B3), new Cell[] {Cell.C4, Cell.B3});
    }

    @Test (expected = ImpossibleMoveException.class)
    public void wrongWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D5);
        bishopBlack.way(Cell.E5);
    }
}