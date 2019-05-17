package com.company.dependency_inversion;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new DataAccess());
        client.doJob();
    }
}
