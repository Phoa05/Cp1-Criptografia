public class Descriptografias {

    public static String decifraCesar(String texto, int chave) {
        StringBuilder textoDecifrado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            // Verifica se o caractere é uma letra
            if (Character.isLetter(caractere)) {
                // Verifica se o caractere é maiúsculo ou minúsculo e ajusta a base de acordo
                char base = Character.isUpperCase(caractere) ? 'A' : 'a';
                // Aplica a decifra de César
                char novoCaractere = (char) (((caractere - base - chave + 26) % 26) + base);
                textoDecifrado.append(novoCaractere);
            } else {
                // Caso o caractere não seja uma letra, adiciona-o sem modificação
                textoDecifrado.append(caractere);
            }
        }

        return textoDecifrado.toString();
    }

    public static String decifraMorse(String texto) {
        StringBuilder resultado = new StringBuilder();
        StringBuilder morse = new StringBuilder();

        for (char caractere : texto.toUpperCase().toCharArray()) {
            if (Character.isLetter(caractere)) {
                morse.append(caractere);
            } else if (caractere == ' ') {
                if (!morse.isEmpty()) {
                    resultado.append(converteMorseParaLetra(morse.toString()));
                    morse.setLength(0);
                }
            }
        }

        // Processa o último caractere morse se houver
        if (!morse.isEmpty()) {
            resultado.append(converteMorseParaLetra(morse.toString()));
        }

        return resultado.toString();
    }

    private static char converteMorseParaLetra(String morse) {
        switch (morse) {
            case ".-":
                return 'A';
            case "-...":
                return 'B';
            case "-.-.":
                return 'C';
            case "-..":
                return 'D';
            case ".":
                return 'E';
            case "..-.":
                return 'F';
            case "--.":
                return 'G';
            case "....":
                return 'H';
            case "..":
                return 'I';
            case ".---":
                return 'J';
            case "-.-":
                return 'K';
            case ".-..":
                return 'L';
            case "--":
                return 'M';
            case "-.":
                return 'N';
            case "---":
                return 'O';
            case ".--.":
                return 'P';
            case "--.-":
                return 'Q';
            case ".-.":
                return 'R';
            case "...":
                return 'S';
            case "-":
                return 'T';
            case "..-":
                return 'U';
            case "...-":
                return 'V';
            case ".--":
                return 'W';
            case "-..-":
                return 'X';
            case "-.--":
                return 'Y';
            case "--..":
                return 'Z';
            default:
                return '/'; // Retorna espaço para caracteres não reconhecidos
        }
    }
}