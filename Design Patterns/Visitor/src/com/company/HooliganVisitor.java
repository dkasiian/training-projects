package com.company;

class HooliganVisitor implements Visitor{
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Start engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Knock the body");
    }
}
