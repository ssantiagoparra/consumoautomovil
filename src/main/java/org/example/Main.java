package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        double distancia;
        double consumo100km;
        double precioLitro;
        double totalLitros;
        double costoTotalGasolina;

        // Se le solicita al usuario la distancia total del viaje
        System.out.print("Ingrese la distancia total del viaje (en kilómetros): ");
        distancia = leerTeclado.nextDouble();

        // Se le solicita al usuario el consumo de su automovil (litros por cada 100 km)
        System.out.print("Ingrese el consumo de combustible del automóvil (litros por cada 100 km): ");
        consumo100km = leerTeclado.nextDouble();

        // Se le solicita al usuario el precio por litros del combustible
        System.out.print("Ingrese el precio por litro de combustible: ");
        precioLitro = leerTeclado.nextDouble();

        // Calcular el total de litros de combustible que se necesitan para el viaje
        totalLitros = (distancia / 100.0) * consumo100km;

        // Calcular el costo total del combustible necesario para el viaje
        costoTotalGasolina = totalLitros * precioLitro;

        // Imprimir resultados
        System.out.println("Resumen del viaje:");
        System.out.println("Distancia del viaje: " + distancia + " km");
        System.out.println("Consumo de combustible del automóvil: " + consumo100km + " litros por cada 100 km");
        System.out.println("Precio por litro de combustible: $" + precioLitro);
        System.out.println("**************************************************");
        System.out.println("Consumo total de combustible: " + totalLitros + " litros");
        System.out.println("Costo total de combustible: $" + costoTotalGasolina);
    }
}