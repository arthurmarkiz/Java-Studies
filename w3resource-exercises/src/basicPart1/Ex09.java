package basicPart1;

public class Ex09 {
    public static void main(String[] args) {
        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        count(test);
    }

    public static void count(String string) {
        char[] ch = string.toCharArray();

        int letter = 0, space = 0, num = 0, other = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(ch[i]))
                letter++;
            else if (Character.isDigit(ch[i]))
                num++;
            else if (Character.isSpaceChar(ch[i]))
                space++;
            else
                other++;
        }

        System.out.println("Frase: " + string);
        System.out.println("Letras: " + letter);
        System.out.println("Números: " + num);
        System.out.println("Espaços: " + space);
        System.out.println("Outros: " + other);
    }
}
