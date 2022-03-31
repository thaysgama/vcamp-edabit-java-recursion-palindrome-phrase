
public class Phrase {
    public static boolean isPalindrome(String phrase) {
        //converte tudo para minúscula e deixa apenas letras e números na string.
        phrase = phrase.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        //condição de parada.
        if (phrase.length()<2){
            return true;
            //condição para verificar se a primeira letra é diferente da última.
        } else if (phrase.charAt(0) != phrase.charAt(phrase.length()-1)) {
            return false;
            //caso seja igual, a função é chamada novamente comparando a próxima letra do inicio e do final da string.
        } else return isPalindrome(phrase.substring(1, phrase.length() - 1)) ;
    }
}
