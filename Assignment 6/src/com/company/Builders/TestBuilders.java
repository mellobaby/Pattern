package com.company.Builders;

public class TestBuilders {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder builder = new HouseBuilder();
        director.constructCastle(builder);
        House house = builder.getResult();
        System.out.println("House built material:\n" + house.getMaterialType());
        HouseManualBuilder manualBuilder = new HouseManualBuilder();
        director.constructCastle(manualBuilder);
        Manual houseManual = manualBuilder.getResult();
        System.out.println("\nHouse manual built:\n" + houseManual.print());
    }


}
