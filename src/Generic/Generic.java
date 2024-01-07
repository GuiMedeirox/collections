package Generic;

public class Generic<T> {

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Generic(T valor) {
        this.valor = valor;
    }

    T valor;

}
