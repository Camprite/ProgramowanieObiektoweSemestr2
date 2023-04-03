public class Liczby { //Stworzenie klasy narzędziowej (bez konstruktora)
    private Liczby() {
    }

    ; //Zablokowanie użycia konstruktora

    public static boolean isPerfectNumbers(int input) {
        int sumaDzielników = 0;
        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                sumaDzielników += i;
            }
        }
        if (sumaDzielników == input) {
            return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int input) {
        int score = 0;
        int inputCopy = input;
        int length = String.valueOf(input).length();
        while (input > 0) {
            int liczba = input % 10;
            score += Math.pow(liczba, length);
            input /= 10;
            System.out.println(liczba);
        }
        if (score == inputCopy && inputCopy >= 10) {
            return true;
        }
        return false;
    }

    public static boolean isFibbonacciNumber(int input) {
        if (input == 0 || input == 1) {
            return true;}
            int counter1 = 1;
            int counter2 = 1;

            do {
                int temp = counter2;
                counter2 = counter1 + counter2;
                counter1 = temp;
                if (counter2 == input) {
                    return true;
                }
            } while (counter2 < input);
        return false;
        }
        public static boolean isHappyNumber(int input) {
        int temporiginal = input;
        if (input == 1) {
                return true;
            }
            System.out.println("-----------" + input+"-----------");
        int firstScore = 0;
        int inputCopy = input;
            while (inputCopy > 0) {
                firstScore += Math.pow(inputCopy % 10, 2);
                inputCopy /= 10;
            }
            System.out.println("FIRSTSCORE- " + firstScore);

            input = firstScore;
            int score = 0;
            while (input!= 1) {
                score = 0;
                while (input > 0) {
                    score += Math.pow(input % 10, 2);
                    input /= 10;
                    System.out.println(input);
                }
                System.out.println("SCORE- "+score);
                System.out.println("FIRSTSCORE- "+firstScore);
                System.out.println("oryginal- "+temporiginal);
                if (score == firstScore) {
                    return false;
                }
                if (score == 1) {
                    return true;
                }

                input = score;


            }


        return false;
        }

    }





