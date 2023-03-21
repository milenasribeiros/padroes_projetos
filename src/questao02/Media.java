package questao02;

public class Media {
    public int number1 = 2;
    public int number2 = 4;
    public int number3 = 5;
    public int number4 = 6;
    public int number5 = 6;
    public int number6 = 7;
    public double media1;
    public double media2;

    public void calcularMedia(){
        media1 = number1*number2*number3;
        System.out.println("Media 1: " + media1);
        media2 = number4*number5*number6;
        System.out.println("Media 2: " + media2);

        System.out.println("Soma das medias: " + (media1 + media2));
        System.out.println("Media das medias: " + (media1*media2)/2);
    }

}
