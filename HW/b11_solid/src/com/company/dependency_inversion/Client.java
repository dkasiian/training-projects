package com.company.dependency_inversion;

class Client {
    private DAO dataAccess;

    Client(DAO dataAccess) {
        this.dataAccess = dataAccess;
    }

    void doJob(){
        dataAccess.execute();
    }
}
