package Generic;

public class generic<T> {

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public generic(T valor) {
        this.valor = valor;
    }

    T valor;

}
