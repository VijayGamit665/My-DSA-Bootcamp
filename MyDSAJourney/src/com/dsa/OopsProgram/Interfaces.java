package com.dsa.OopsProgram;

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
        King K = new King();
        K.moves();

    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up , Down, Left, right,  diagonal (in all 4 dirns)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up , Down, Left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up , Down, Left, right,  diagonal (by 1 Step)");
    }
}