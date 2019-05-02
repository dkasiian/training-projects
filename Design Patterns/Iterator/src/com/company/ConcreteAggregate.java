package com.company;

class ConcreteAggregate implements Aggregate {
    private String[] arr = {"element1", "element2", "element3"};

    @Override
    public Iterator getIterator() {
        return new ArrIterator();
    }

    private class ArrIterator implements Iterator{

        int index = 0;

        @Override
        public Object next() {
            return arr[index++];
        }

        @Override
        public boolean hasNext() {
            return index < arr.length;
        }
    }
}
