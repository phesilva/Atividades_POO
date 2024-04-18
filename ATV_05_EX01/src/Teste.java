public class Teste{

    //metodo principal que ira iniciar a classe
    public static void main (String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }


    public static void metodo1(){
        System.out.println("Inicio do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }
    
    public static void metodo2(){

        System.out.println("Inicio do método 2");

        try {
            int[] vetor = new int[10];
            for (int i = 0 ; i <= 15; i++){
                vetor[i] = i;
                System.out.println(i);
                if (i == 9) {
                    int vlr = vetor[i] / vetor[0];
                    System.out.println(vlr);
                }
            }

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("Fim do método 2");
    }
}