package application;

import boardgame.Board;
import chess.ChessMath;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMath chessMath = new ChessMath();
        while(true){
            UI.printBoard(chessMath.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMath.performChessMove(source,target);

        }
    }

}
