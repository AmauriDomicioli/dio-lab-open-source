package utils; 

public class StringUtils {

    /**
     * Preenche uma string com um caractere especificado até atingir um comprimento mínimo.
     * Se a string já for maior ou igual ao comprimento mínimo, ela é retornada sem modificações.
     */
    public static String padString(String text, int minLength, char paddingChar) {
        // Verifica se a string é nula para evitar NullPointerException
        if (text == null) {
            text = ""; // Trata strings nulas como vazias para preenchimento
        }

        // Se o comprimento da string já for maior ou igual ao comprimento mínimo, retorna a string original
        if (text.length() >= minLength) {
            return text;
        }

        // Calcula quantos caracteres de preenchimento são necessários
        int charsToPad = minLength - text.length();

        // Cria um StringBuilder para construir a string preenchida de forma eficiente
        StringBuilder paddedText = new StringBuilder(text);

        // Adiciona os caracteres de preenchimento
        for (int i = 0; i < charsToPad; i++) {
            paddedText.append(paddingChar);
        }

        // Retorna a string preenchida
        return paddedText.toString();
    }


    public static void main(String[] args) {
        // Exemplo 1: Preenchendo uma string curta com '*'
        String original1 = "DIO";
        String padded1 = StringUtils.padString(original1, 5, '*');
        System.out.println("Original: '" + original1 + "', Preenchida: '" + padded1 + "'"); // Saída: 'DIO**'

        // Exemplo 2: String já no comprimento mínimo
        String original2 = "OpenSource";
        String padded2 = StringUtils.padString(original2, 5, '-');
        System.out.println("Original: '" + original2 + "', Preenchida: '" + padded2 + "'"); // Saída: 'OpenSource'

        // Exemplo 3: Preenchendo uma string vazia com '0'
        String original3 = "";
        String padded3 = StringUtils.padString(original3, 3, '0');
        System.out.println("Original: '" + original3 + "', Preenchida: '" + padded3 + "'"); // Saída: '000'

        // Exemplo 4: String nula
        String original4 = null;
        String padded4 = StringUtils.padString(original4, 7, '#');
        System.out.println("Original: '" + original4 + "', Preenchida: '" + padded4 + "'"); // Saída: '#######'
    }
}
