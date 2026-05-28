import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DeliveryService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Address address1 = new Address("Россия", "Москва");
        Address address2 = new Address("Россия", "Тула");
        Address address3 = new Address("Россия", "Орел");
        Address address4 = new Address("Россия", "Курск");
        Map<Address, Integer> costPerAddress = new HashMap<>();
        costPerAddress.put(address1, 1500);
        costPerAddress.put(address2, 1000);
        costPerAddress.put(address3, 800);
        costPerAddress.put(address4, 1250);
        int totalSum = 0;
        while (true) {
            System.out.println("\n--Заполнение нового заказа-- \n");
            System.out.println("Введите страну: ");
            String country = sc.nextLine();
            if (country.equals("end")) {
                break;
            }
            System.out.println("Введите город: ");
            String city = sc.nextLine();
            System.out.println("Введите вес (кг): ");
            int weight = sc.nextInt();
            sc.nextLine();
            Address newAddress = new Address(country, city);
            //проверяем в коллекции ключ newAddress
            if (costPerAddress.containsKey(newAddress)) {
                int pricePerKg = costPerAddress.get(newAddress);
                int deliveryCost = weight * pricePerKg;
                totalSum += deliveryCost;
                System.out.println("Стоимость доставки составит: " + deliveryCost + " руб");
                System.out.println("Общая стоимость всех доставок: " + totalSum + " руб");
            } else {
                System.out.println("Доставки по этому адресу нет");
            }

        }

    }
}