package main;

import clase.CardBancar;
import clase.Validator;

public class Program {
    public static void main(String[] args) {
        Validator validator = new Validator(10);
        validator.valideazaCalatorie();
        validator.setModPlata(new CardBancar());
        validator.valideazaCalatorie();
    }
}
