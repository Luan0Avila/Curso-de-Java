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

    }
}
