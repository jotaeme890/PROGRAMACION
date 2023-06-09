import java.text.DecimalFormat;

public class Movil extends Terminal{
    private String tarifa;
    private int total;

    public Movil(String numero, String tarifa){
        super(numero);
        this.tarifa = tarifa;
        this.total = 0;
    }

    @Override
    public String toString(){
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return super.toString() + " - tarificados " +  formatoEuros.format(this.total) + " euros";
    }

    @Override
    public void llama(Terminal movil, int tiempo){
        super.llama(movil, tiempo);
        double min = (double) tiempo/60;

        switch (this.tarifa) {
            case "rata":
                this.total += min * 0.06;
            break;
            case "mono":
                this.total += min * 0.12;
            break;
            case "bisonte":
                this.total += min * 0.30;
            break;
            default:
                break;
        }
        
    }
}
