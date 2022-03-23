package DZ4.Task2;

public class Main {
    public static void main(String[] args) {
        PhoneBook<String, String> phonebook = new PhoneBook<>();
        phonebook.put("89999", "Esenin");
        phonebook.put("88888", "Ivanov");
        phonebook.put("87777", "Petrov");
        phonebook.put("86666", "Sidorov");
        phonebook.put("85555", "Lermontov");
        phonebook.put("84444", "Tolstoy");
        phonebook.put("83333", "Esenin");
        phonebook.put("82222", "Petrov");
        phonebook.addRecord("81111", "Tolstoy");
        System.out.println(phonebook.getRecord("Esenin").toString());
        System.out.println(phonebook.getRecord("Pushkin").toString());
        System.out.println(phonebook.getRecord("Tolstoy").toString());
    }


}
