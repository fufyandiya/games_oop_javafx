package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

public class LogicTest {

    @Test (expected = OccupiedCellException.class)
    public void occupiedWay() throws FigureNotFoundException {
        PawnBlack pawnBlack = new PawnBlack(Cell.E5);
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Logic logic = new Logic();
        logic.add(pawnBlack);
        logic.add(bishopBlack);
        logic.move(Cell.D4, Cell.E5);
    }

    @Test (expected = FigureNotFoundException.class)
    public void noFigure() throws FigureNotFoundException {
        BishopBlack bishopBlack = new BishopBlack(Cell.E5);
        Logic logic = new Logic();
        logic.add(bishopBlack);
        logic.move(Cell.D4, Cell.E5);
    }

    @Test (expected = ImpossibleMoveException.class)
    public void impossibleMove() throws FigureNotFoundException {
        BishopBlack bishopBlack = new BishopBlack(Cell.E5);
        Logic logic = new Logic();
        logic.add(bishopBlack);
        logic.move(Cell.E5, Cell.D5);
    }
}