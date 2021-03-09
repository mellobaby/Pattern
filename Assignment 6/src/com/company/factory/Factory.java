package com.company.factory;



public class Factory {
    public static void main(String[] args) {
        Logistics logic = new RoadLogistics();
        Transport transport = logic.createTransport();



        transport.deliver();

    }


}
