public class JsonObject {
    String moneda;
    float valor;

    public JsonObject(String moneda, float valor) {
        this.moneda = moneda;
        this.valor = valor;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
