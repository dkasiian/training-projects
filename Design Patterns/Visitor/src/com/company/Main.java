package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Element body = new BodyElement();
        Element engine = new EngineElement();
//        Visitor hooligan = new HooliganVisitor();
        Visitor mechanich = new MechanicVisitor();

        body.accept(mechanich);
        engine.accept(mechanich);
    }
}
