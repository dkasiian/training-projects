package com.company;

class MechanicVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Check in engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Clean body");
    }
}
