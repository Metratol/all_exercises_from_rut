package MIS;


import java.util.Scanner;

public class LW1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Что вам нужно?\n1) Зашифровать текст\n2) Расшифорвать текст");
            int choose = Integer.parseInt(scanner.nextLine());
            String[] alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".split("");
            if (choose == 1) {
                System.out.println("Введите текст для зашифровки");
                String enter = scanner.nextLine();
                enter = enter.toLowerCase();
                String[] array = enter.split("");
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == " ") continue;
                    int k = 0;
                    for (int y = 0; y < alphabet.length; y++) {
                        if (array[i].equals(alphabet[alphabet.length - 1]) && k == 0) {
                            array[i] = alphabet[2];
                            k = 1;
                        } else if (array[i].equals(alphabet[alphabet.length - 2]) && k == 0) {
                            array[i] = alphabet[1];
                            k = 1;
                        } else if (array[i].equals(alphabet[alphabet.length - 3]) && k == 0) {
                            array[i] = alphabet[0];
                            k = 1;
                        } else if (array[i].equals(alphabet[y]) && k == 0) {
                            array[i] = alphabet[y + 3];
                            k = 1;
                        }
                    }

                }
                System.out.println();
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]);

                }
            } else if (choose == 2) {
                System.out.println("Введите текст для расшифровки");
                String enter = scanner.nextLine();
                enter = enter.toLowerCase();
                String[] array = enter.split("");
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == " ") continue;
                    int k = 0;
                    for (int y = 0; y < alphabet.length; y++) {
                        if (array[i].equals(alphabet[0]) && k == 0) {
                            array[i] = alphabet[alphabet.length - 3];
                            k = 1;
                        } else if (array[i].equals(alphabet[1]) && k == 0) {
                            array[i] = alphabet[alphabet.length - 2];
                            k = 1;
                        } else if (array[i].equals(alphabet[2]) && k == 0) {
                            array[i] = alphabet[alphabet.length - 1];
                            k = 1;
                        } else if (array[i].equals(alphabet[y]) && k == 0) {
                            array[i] = alphabet[y - 3];
                            k = 1;
                        }
                    }

                }
                System.out.println();
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]);

                }

            }
        } catch (NumberFormatException e) {
            throw  new NumberFormatException("Перезапустите программу и введите число,a не цифру");
        }
    }
}
