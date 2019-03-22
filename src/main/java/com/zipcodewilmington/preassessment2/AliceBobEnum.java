package com.zipcodewilmington.preassessment2;

public enum  AliceBobEnum {
    ALICE,
    BOB;


    private String catchPhrase = "Hey, my name is " + name() + "!";





    public boolean isAlice() {
      return this.equals(ALICE);
    }

    public boolean isBob() {
        return this.equals(BOB);
    }


    public String getCatchPhrase() {
        return this.catchPhrase;

    }
}
