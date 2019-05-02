package com.company;

interface Visitor {
    void visit(EngineElement engine);
    void visit(BodyElement body);
}
