import java.util.*;

public class PatternGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n==================================================");
            System.out.println("          PATTERN GENERATOR");
            System.out.println("==================================================");
            System.out.println("1. Number Patterns");
            System.out.println("2. Star Patterns");
            System.out.println("3. Alphabet Patterns");
            System.out.println("4. Exit");
            System.out.println("==================================================");
            System.out.print("Enter your choice : ");
            int mainChoice = sc.nextInt();
            switch (mainChoice) {
                case 1:
                    while (true) {
                        System.out.println("\n========== NUMBER PATTERNS ==========");
                        System.out.println("1. Left Triangle");
                        System.out.println("2. Right Triangle");
                        System.out.println("3. Pyramid");
                        System.out.println("4. Inverted Pyramid");
                        System.out.println("5. Floyd's Triangle");
                        System.out.println("6. Pascal Triangle");
                        System.out.println("7. Square Pattern");
                        System.out.println("8. Diamond");
                        System.out.println("9. Back");
                        System.out.print("Choose Pattern : ");
                        int choice = sc.nextInt();
                        if (choice == 9)
                            break;
                        System.out.print("Enter rows (1-15): ");
                        int rows = sc.nextInt();
                        if (rows < 1 || rows > 15) {
                            System.out.println("Invalid number of rows!");
                            continue;
                        }
                        switch (choice) {
                            case 1:
                                for (int i = 1; i <= rows; i++) {
                                    for (int j = 1; j <= i; j++)
                                        System.out.print(j + " ");
                                    System.out.println();
                                }
                                break;
                            case 2:
                                for (int i = 1; i <= rows; i++) {
                                    for (int s = 1; s <= rows - i; s++)
                                        System.out.print("  ");
                                    for (int j = 1; j <= i; j++)
                                        System.out.print(j + " ");
                                    System.out.println();
                                }
                                break;
                            case 3:
                                for (int i = 1; i <= rows; i++) {
                                    for (int s = 1; s <= rows - i; s++)
                                        System.out.print(" ");
                                    for (int j = 1; j <= i; j++)
                                        System.out.print(j);
                                    for (int j = i - 1; j >= 1; j--)
                                        System.out.print(j);
                                    System.out.println();
                                }
                                break;
                            case 4:
                                for (int i = rows; i >= 1; i--) {
                                    for (int j = 1; j <= i; j++)
                                        System.out.print(j + " ");
                                    System.out.println();
                                }
                                break;
                            case 5:
                                int num = 1;
                                for (int i = 1; i <= rows; i++) {
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print(num + " ");
                                        num++;
                                    }
                                    System.out.println();
                                }
                                break;
                            case 6:
                                for (int i = 0; i < rows; i++) {
                                    int number = 1;
                                    for (int s = 0; s < rows - i; s++)
                                        System.out.print(" ");
                                    for (int j = 0; j <= i; j++) {
                                        System.out.print(number + " ");
                                        number = number * (i - j) / (j + 1);
                                    }
                                    System.out.println();
                                }
                                break;
                            case 7:
                                for (int i = 1; i <= rows; i++) {
                                    for (int j = 1; j <= rows; j++)
                                        System.out.print(j + " ");
                                    System.out.println();
                                }
                                break;
                            case 8:
                                for (int i = 1; i <= rows; i++) {
                                    for (int s = 1; s <= rows - i; s++)
                                        System.out.print(" ");
                                    for (int j = 1; j <= (2 * i - 1); j++)
                                        System.out.print("*");
                                    System.out.println();
                                }
                                for (int i = rows - 1; i >= 1; i--) {
                                    for (int s = 1; s <= rows - i; s++)
                                        System.out.print(" ");
                                    for (int j = 1; j <= (2 * i - 1); j++)
                                        System.out.print("*");
                                    System.out.println();
                                }
                                break;
                            default:
                                System.out.println("Invalid Choice!");
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("\n========== STAR PATTERNS ==========");
                        System.out.println("1. Left Triangle");
                        System.out.println("2. Right Triangle");
                        System.out.println("3. Pyramid");
                        System.out.println("4. Inverted Pyramid");
                        System.out.println("5. Diamond");
                        System.out.println("6. Hollow Square");
                        System.out.println("7. Back");
                        System.out.print("Choose Pattern : ");
                        int choice = sc.nextInt();
                        if (choice == 7)
                            break;
                        System.out.print("Enter rows (1-15): ");
                        int rows = sc.nextInt();
                        switch (choice) {
                            case 1:
                                for (int i = 1; i <= rows; i++) {
                                    for (int j = 1; j <= i; j++)
                                        System.out.print("* ");
                                    System.out.println();
                                }
                                break;
                            case 2:
                                for (int i = 1; i <= rows; i++) {
                                    for (int s = 1; s <= rows - i; s++)
                                        System.out.print("  ");
                                    for (int j = 1; j <= i; j++)
                                        System.out.print("* ");
                                    System.out.println();
                                }
                                break;
                            case 3:
                                for (int i = 1; i <= rows; i++) {
                                    for (int s = 1; s <= rows - i; s++)
                                        System.out.print(" ");
                                    for (int j = 1; j <= (2 * i - 1); j++)
                                        System.out.print("*");
                                    System.out.println();
                                }
                                break;
                            case 4:
                                for (int i = rows; i >= 1; i--) {
                                    for (int s = 1; s <= rows - i; s++)
                                        System.out.print(" ");
                                    for (int j = 1; j <= (2 * i - 1); j++)
                                        System.out.print("*");
                                    System.out.println();
                                }
                                break;
                            case 5:
                                for (int i = 1; i <= rows; i++) {
                                    for (int s = 1; s <= rows - i; s++)
                                        System.out.print(" ");
                                    for (int j = 1; j <= (2 * i - 1); j++)
                                        System.out.print("*");
                                    System.out.println();
                                }
                                for (int i = rows - 1; i >= 1; i--) {
                                    for (int s = 1; s <= rows - i; s++)
                                        System.out.print(" ");
                                    for (int j = 1; j <= (2 * i - 1); j++)
                                        System.out.print("*");
                                    System.out.println();
                                }
                                break;
                            case 6:
                                for (int i = 1; i <= rows; i++) {
                                    for (int j = 1; j <= rows; j++) {
                                        if (i == 1 || i == rows || j == 1 || j == rows)
                                            System.out.print("* ");
                                        else
                                            System.out.print("  ");
                                    }
                                    System.out.println();
                                }
                                break;
                            default:
                                System.out.println("Invalid Choice!");
                        }
                    }
                    break;
                case 3:

                    while (true) {
                        System.out.println("\n======= ALPHABET PATTERNS =======");
                        System.out.println("1. Increasing Alphabet");
                        System.out.println("2. Repeated Alphabet");
                        System.out.println("3. Reverse Alphabet");
                        System.out.println("4. Alphabet Pyramid");
                        System.out.println("5. Back");
                        System.out.print("Choose Pattern : ");
                        int choice = sc.nextInt();
                        if (choice == 5)
                            break;
                        System.out.print("Enter rows (1-26): ");
                        int rows = sc.nextInt();
                        switch (choice) {
                            case 1:
                                for (int i = 0; i < rows; i++) {
                                    for (char ch = 'A'; ch <= 'A' + i; ch++)
                                        System.out.print(ch + " ");
                                    System.out.println();
                                }
                                break;
                            case 2:
                                for (int i = 0; i < rows; i++) {
                                    for (int j = 0; j <= i; j++)
                                        System.out.print((char)('A' + i) + " ");
                                    System.out.println();
                                }
                                break;
                            case 3:
                                for (int i = rows; i >= 1; i--) {
                                    for (char ch = 'A'; ch < 'A' + i; ch++)
                                        System.out.print(ch + " ");
                                    System.out.println();
                                }
                                break;
                            case 4:
                                for (int i = 0; i < rows; i++) {
                                    for (int s = 0; s < rows - i; s++)
                                        System.out.print(" ");
                                    char ch = 'A';
                                    for (int j = 0; j <= i; j++) {
                                        System.out.print(ch++);
                                    }
                                    ch -= 2;
                                    for (int j = 0; j < i; j++) {
                                        System.out.print(ch--);
                                    }
                                    System.out.println();
                                }
                                break;
                            default:
                                System.out.println("Invalid Choice!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nThank you for using Pattern Generator.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
