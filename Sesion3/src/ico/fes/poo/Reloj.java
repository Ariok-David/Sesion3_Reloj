package ico.fes.poo;

public class Reloj {

    private int hora;
    private int minuto;
    private int segundo;

    public Reloj() {
    }

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    public void mostrarHora(){
        incrementarSegundo();
    }
    
    public void incrementarSegundo(){
        while (segundo <= 60) {
            segundo ++;
            try {

                Thread.sleep(1000);

            } catch (InterruptedException ex) {

                Thread.currentThread().interrupt();

            }
            if (segundo == 60){
                segundo = 0;
                incrementarMinuto();
            }
            System.out.println(this.hora+":"+this.minuto+":"+this.segundo);
        }
    }

    public void incrementarMinuto(){
        minuto ++;
        if (minuto == 60){
            minuto = 0;
            incrementarHora();
        }
    }
    
    public void incrementarHora(){
        hora ++;
        if (hora == 24){
            hora = 0;
        }
    }
}
