public class palindromo {
    public static boolean Palindromo (String frase){
        int tamanhodafrase = frase.length() - 1,
        i = 0;
        boolean seforPalindromo = true;
        
        
        
        do {
        if (frase.charAt(i) != frase.charAt(tamanhodafrase)){
        seforPalindromo = false;}
        i++;
        tamanhodafrase--;
        }while (i < tamanhodafrase && seforPalindromo==true);
        
        
        
        return seforPalindromo;
        }
        
        public static boolean isFim(String frase){
        return (frase.length() >= 3 && frase.charAt(0) == 'F' && frase.charAt(1) == 'I' && frase.charAt(2) == 'M');
        }
        
        
        
        public static void Saida (boolean Palindromo)
        {
        if (Palindromo==true)
        {
        MyIO.println("SIM");
        }
        else MyIO.println("NAO");
        }
        
        public static void main (String[] args){
        String[] entrada = new String[1000];
        int numEntrada = 0;
        
        //Leitura da entrada padrao
        do {
        entrada[numEntrada] = MyIO.readLine();
        } while (isFim(entrada[numEntrada++]) == false);
        numEntrada--; //Desconsiderar ultima linha contendo a palavra FIM
        
        //Para cada linha de entrada, gerando uma de saida contendo o numero de letras maiusculas da entrada
        for(int i = 0; i < numEntrada; i++){
        Saida(Palindromo(entrada[i]));
        }
        }
        
}
