package secao18;
 
 import java.util.regex.*;;

public class Regex {
    
    public static void main(String[] args) {
        
        // 1 - quantificadores
        // exp. reg, text, ver se no texto há a exp. reg.
        String regex =  "a*"; // zero ou mais "a"
        String texto = "b aaab aa ba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a*");
        while (matcher.find()) {
            
            // find = encontrar algo na string
            System.out.println("'" + matcher.group() + "'");
        }
        

        regex =  "a+"; // uma ou mais "a"
        texto = "b aaab aa ba";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a+");
        while (matcher.find()) {
            
            // find = encontrar algo na string
            System.out.println("'" + matcher.group() + "'");
        }

        regex =  "a{2,4}"; // entre 2 a 4 a's
        texto = "b aaab aa ba";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a{2,4}");
        while (matcher.find()) {
            
            // find = encontrar algo na string
            System.out.println("'" + matcher.group() + "'");
        }

        regex =  "a{2}"; // apenas com 2 a's
        texto = "b aaab aa ba";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a{2}");
        while (matcher.find()) {
            
            // find = encontrar algo na string
            System.out.println("'" + matcher.group() + "'");
        }

        // 2 - ancoras e fronteiras

        // ^ no inicio da string
        regex = "^c";
        texto = "carro casa cadeira";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencia para ^c");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }

        
        // $ no fim da string
        regex = "a$";
        texto = "carro casa cadeira";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencia para a$");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }

        // fronteira \b -> apenas o que está entre os \b
        regex = "\\bpalavra\\b";
        texto = "palavra compalavra palavras";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencia para \\bpalavra\\b");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }

        // fronteira \B -> string com fronteira com o texto a ser procurado
        regex = "\\Bpalavra";
        texto = "palavra compalavra palavras";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencia para \\Bpalavra");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }

        // 3 - grupos e captura
        regex = "(\\d{2})-(\\d{2})-(\\d{4})"; // (D)-(MM)-(AAAA)
        texto = "A data de hoje é 13-05-2026 e a data de ontem foi 12-05-2026";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println("Dia: " + matcher.group(1));
            System.out.println("Mês: " + matcher.group(2));
            System.out.println("Ano: " + matcher.group(3));
            System.out.println("Todos: " + matcher.group(0)); // 0 = todos os grupos
        }

        // Backreference para substituição
        // $1 = grupo 1, $2 = grupo 2 ...
        String textoSubstituido = texto.replaceAll("(\\d{2})-(\\d{2})-(\\d{4})", "$3/$2/$1");

        System.out.println("Texto após substituição: " + textoSubstituido);

    }
}
