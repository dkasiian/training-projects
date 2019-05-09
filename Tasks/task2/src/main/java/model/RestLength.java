package model;

enum RestLength {
    SHORT(10), LONG(30);

    private int minLength;

    RestLength(int minLength) {
        this.minLength = minLength;
    }

    int getMinLength() {
        return minLength;
    }
}
