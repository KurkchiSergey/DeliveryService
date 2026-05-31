import java.util.*;

public class DeliveryService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Address address1 = new Address("Россия", "Москва");
        Address address2 = new Address("Россия", "Тула");
        Address address3 = new Address("Россия", "Орел");
        Address address4 = new Address("Россия", "Курск");
        Address address5 = new Address("Франция", "Париж");
        Address address6 = new Address("Германия", "Берлин");
        Address address7 = new Address("Англия", "Лондон");
        Map<Address, Integer> costPerAddress = new HashMap<>();
        costPerAddress.put(address1, 1500);
        costPerAddress.put(address2, 1000);
        costPerAddress.put(address3, 800);
        costPerAddress.put(address4, 1250);
        costPerAddress.put(address5, 5000);
        costPerAddress.put(address6, 6000);
        costPerAddress.put(address7, 7000);
        int totalSum = 0;
        // создаем множество уникальных стран
        Set<String> uniqueCountries = new HashSet<>();
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
                //добавляем уникальные страны
                uniqueCountries.add(country);
                System.out.println("Стоимость доставки составит: " + deliveryCost + " руб");
                System.out.println("Общая стоимость всех доставок: " + totalSum + " руб");
                System.out.println("Общее количество уникальных стран составило: " + uniqueCountries.size());
            } else {
                System.out.println("Доставки по этому адресу нет");
            }

        }

    }
}