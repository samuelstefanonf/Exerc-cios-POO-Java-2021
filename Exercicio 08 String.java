import java.util.Scanner;
class Main {
  public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe uma forca: ");
        String palavra = teclado.nextLine();
        String secreta = "";
        int cont = 0;
        char asterisco = '*';
        while(cont < palavra.length()){
          secreta += asterisco;
          cont++;
        } 
        int tentativas = 3;
        boolean acertou = false;
       
        while(true){
            System.out.println("Palavra secreta: "+secreta);
            System.out.println("Tentativas restantes: "+tentativas);
            System.out.println("Informe uma letra:");
            String letra = teclado.nextLine();
            acertou = palavra.contains(letra);
            if(acertou){
                System.out.println("Você acertou!");
                int indice = palavra.indexOf(letra);
                while(indice >= 0){
                    secreta = secreta.substring(0,indice)
                            +letra
                            +secreta.substring(indice+1);
                    indice = palavra.indexOf(letra,indice+1);
                }
                  if(secreta.contains(palavra)){
                    System.out.println("Você Ganhou!");
                  break;
            }
                
            }else{
                System.out.println("Você errou!");
                tentativas--;
                if(tentativas == 0){
                    System.out.println("Você perdeu!");
                    break;
                }
            }
        }
    }

}
