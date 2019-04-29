package com.company;

public class Main {

    public static void main(String[] args) {
        // 1 inheritance
        VectorGraphics g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();

        // 2 composition
        VectorGraphics g2 = new VectorAdapterFromRaster2(new RasterGraphics());
        g2.drawLine();
        g2.drawSquare();
    }
}
