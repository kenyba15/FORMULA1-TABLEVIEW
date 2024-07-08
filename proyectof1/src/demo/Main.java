package demo;

import java.util.List;

import modelos.Driver;
import modelos.Constructors;
import repositorios.DriverRepository;
import repositorios.ConstructorsRepository;

public class Main {
    public static void main(String[] args) {
        DriverRepository driverRepository = new DriverRepository();
        List<Driver> drivers = driverRepository.getAllDrivers();

        System.out.println("Tabla de Conductores:");
        System.out.println("+------------+-----------------+---------+-------+-----------------+-----------------+------------+-----------------+--------------------------------+");
        System.out.println("| DriverId   | DriverRef       | Number  | Code  | Forename        | Surname         | DOB        | Nationality     | URL                            |");
        System.out.println("+------------+-----------------+---------+-------+-----------------+-----------------+------------+-----------------+--------------------------------+");

        for (Driver driver : drivers) {
            System.out.printf("| %-10d | %-15s | %-7d | %-5s | %-15s | %-15s | %-10s | %-15s | %-30s |\n",
                    driver.getDriverId(), driver.getDriverRef(), driver.getNumber(), driver.getCode(),
                    driver.getForename(), driver.getSurname(), driver.getDob(), driver.getNationality(), driver.getUrl());
        }

        System.out.println("+------------+-----------------+---------+-------+-----------------+-----------------+------------+-----------------+--------------------------------+");

        ConstructorsRepository constructorsRepository = new ConstructorsRepository();
        List<Constructors> constructors = constructorsRepository.getAllConstructors();

        System.out.println("\nTabla de Constructores:");
        System.out.println("+----------------+-----------------+---------------------+-----------------+--------------------------------+");
        System.out.println("| ConstructorId  | ConstructorRef  | Name                | Nationality     | URL                            |");
        System.out.println("+----------------+-----------------+---------------------+-----------------+--------------------------------+");

        for (Constructors constructor : constructors) {
            System.out.printf("| %-14d | %-15s | %-20s | %-15s | %-30s |\n",
                    constructor.getConstructorId(), constructor.getConstructorRef(), constructor.getName(),
                    constructor.getNationality(), constructor.getUrl());
        }

        System.out.println("+----------------+-----------------+---------------------+-----------------+--------------------------------+");
    }
}


