package alarmatemperaturapresion;

import java.util.Scanner;

public class AlarmaTemperaturaPresion {

    //SISTEMA DE ALARMA, ENCENDIDO Y APAGADO.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String Alarma;
        int Presion, Temperatura;
        System.out.println("Ingrese la Presion");
        Presion = sc.nextInt();
        System.out.println("Ingrese la Temperatura");
        Temperatura = sc2.nextInt();
        //Presión es por lo menos 35 libras o si la temperatura es mayor a 75 pero inferior a 95
        if (Presion >= 35 | Temperatura > 75 && Temperatura < 95) {
            Alarma = "Encendida";
        } else {
            Alarma = "Apagada";
        };
        
        //Si la alarma esta encedida mostrar por consola la cantidad de libras y temperaturas
        if (Alarma.equals("Encendida")){
            System.out.println("Alarma encedida");
            System.err.println("La temperatura es de: "+Temperatura+"C");
            System.err.println("La presion es de: "+Presion+" libras");
        } else if (Alarma.equals("Apagada")){
            System.out.println("Alarma Apagada");
        }
    }

}
