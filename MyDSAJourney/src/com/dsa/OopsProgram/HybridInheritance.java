package com.dsa.OopsProgram;

import java.util.Collection;

public class HybridInheritance {
    public static void main(String[] args) {
        Vijay Lap = new Lap();
        Lap.EMPID();
        Sales RecoveryAmount = new Sales();
        RecoveryAmount.Amount();
        GoldLoan GoldValue = new GoldLoan();
        GoldValue.DisAmount();
        TotalGold Goldloan = new TotalGold();
        Goldloan.GoldValue();

    }

}

class Vijay {
    String Name;
    int EMPID;

    void name() {
        System.out.println("Name");
    }

    void EMPID() {
        System.out.println("EMPID");
    }
}

class Sales extends Vijay {
    int CollectionAmount;

    void Amount() {
        System.out.println("Amount");
    }
}

class Lap extends Vijay {
    String Dis;

    void Dis() {
        System.out.println("Dis");
    }
}

class GoldLoan extends Vijay {
    int DisAmount;

    void DisAmount() {
        System.out.println("DisAmount");
    }
}


class Recovery extends Sales {
    void RecoveryAmount() {
        System.out.println("RecoveryAmount");
    }
}

class Pending extends Sales {
    void PendingAmount() {
        System.out.println("PendingAmount");
    }
}


class TotalDis extends Lap {
    void TotalDis() {
        System.out.println("Total Dis");
    }
}

class TotalGold extends GoldLoan {
    void GoldValue() {
        System.out.println("Gold 24 caret");
    }
}