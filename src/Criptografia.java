public class Criptografia {
    public static String cifraDeCesar(String texto, int chave) {
        StringBuilder textoCriptografado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            // Verifica se o caractere é uma letra
            if (Character.isLetter(caractere)) {
                // Verifica se o caractere é maiúsculo ou minúsculo e ajusta a base de acordo
                char base = Character.isUpperCase(caractere) ? 'A' : 'a';
                // Aplica a cifra de César
                char novoCaractere = (char) (((caractere - base + chave) % 26) + base);
                textoCriptografado.append(novoCaractere);
            } else {
                System.out.println(" ");
                // Caso o caractere não seja uma letra, adiciona-o sem modificação
                textoCriptografado.append(caractere);
            }
        }

        return textoCriptografado.toString();
    }

    public static String codigoMorse(String texto) {
        StringBuilder resultado = new StringBuilder();

        for (char caractere : texto.toUpperCase().toCharArray()) {
            switch (caractere) {
                case 'A':
                    resultado.append(".- ");
                    break;
                case 'B':
                    resultado.append("-... ");
                    break;
                case 'C':
                    resultado.append("-.-. ");
                    break;
                case 'D':
                    resultado.append("-.. ");
                    break;
                case 'E':
                    resultado.append(". ");
                    break;
                case 'F':
                    resultado.append("..-. ");
                    break;
                case 'G':
                    resultado.append("--. ");
                    break;
                case 'H':
                    resultado.append(".... ");
                    break;
                case 'I':
                    resultado.append(".. ");
                    break;
                case 'J':
                    resultado.append(".--- ");
                    break;
                case 'K':
                    resultado.append("-.- ");
                    break;
                case 'L':
                    resultado.append(".-.. ");
                    break;
                case 'M':
                    resultado.append("-- ");
                    break;
                case 'N':
                    resultado.append("-. ");
                    break;
                case 'O':
                    resultado.append("--- ");
                    break;
                case 'P':
                    resultado.append(".--. ");
                    break;
                case 'Q':
                    resultado.append("--.- ");
                    break;
                case 'R':
                    resultado.append(".-. ");
                    break;
                case 'S':
                    resultado.append("... ");
                    break;
                case 'T':
                    resultado.append("- ");
                    break;
                case 'U':
                    resultado.append("..- ");
                    break;
                case 'V':
                    resultado.append("...- ");
                    break;
                case 'W':
                    resultado.append(".-- ");
                    break;
                case 'X':
                    resultado.append("-..- ");
                    break;
                case 'Y':
                    resultado.append("-.-- ");
                    break;
                case 'Z':
                    resultado.append("--.. ");
                    break;
                default:
                    resultado.append(caractere).append("/"); // Adiciona espaço entre palavras
                    break;
            }
        }

        return resultado.toString();
    }
}
