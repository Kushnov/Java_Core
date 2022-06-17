package Homework_4;

public class Main {

    public static void main(String[] args) {
        doPhoneBook();
        WordsArray wordsArray = new WordsArray(createArrayWords());
        wordsArray.doArrayWords();
    }

    private static void doPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoneBook("One","+1231234567");
        phoneBook.addElementPhoneBook("Two","+1234567890");
        phoneBook.addElementPhoneBook("One","81234561234");
        phoneBook.addElementPhoneBook("Two","+1231234567");
        phoneBook.addElementPhoneBook("Three","+1231234567");
        phoneBook.addElementPhoneBook("Three","81234561234");

        System.out.println("One: " + phoneBook.getPhonesByName("One"));
        System.out.println("Two: " + phoneBook.getPhonesByName("Two"));
        System.out.println("Three: " + phoneBook.getPhonesByName("Three"));
    }

    private static String[] createArrayWords() {
        String [] strings = new String[10];
        strings[0] = "One";
        strings[1] = "Two";
        strings[2] = "Three";
        strings[3] = "One";
        strings[4] = "Two";
        strings[5] = "Three";
        strings[6] = "Four";
        strings[7] = "Five";
        strings[8] = "Six";
        strings[9] = "Five";
        return strings;
    }

}

