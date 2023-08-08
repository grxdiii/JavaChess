package Pieces;

public class Pawn extends Piece{
    public Pawn(String type, boolean color, int locationX, int locationY) {
        super(type, color, locationX, locationY);
    }

    @Override
    public Integer[] legalMoves() {
        return new Integer[4];
    }
}
