public class Date {
    private int dia, mes, ano;

    public void initializeDate() {
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
    }

    // getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {

        return ano;
    }

    // setters
    public setDia (int dia){
        this.dia = dia;
    }

    public setMes (int mes){
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // verificação
    public boolean checkDate() {
        if ((dia && mes && ano) > 0) {
            return true;
        } else
            return false;
    }
}