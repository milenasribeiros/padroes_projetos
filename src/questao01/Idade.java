package questao01;

public class Idade {
    final int diasAno = 365;
    final int diasMes = 30;
    int anos;
    int meses;
    int dias;

    public Idade (int anos, int meses, int dias){
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public void calcularDias(){
        dias += (anos * diasAno) + (meses * diasMes);
        System.out.println("\n A idade em dias é: " + dias);
    }
}
