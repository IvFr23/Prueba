public abstract class Casa {
    private int superficie;
    private int nStanze;
    private int nBagni;

    public Casa(int superficie, int nStanze, int nBagni) {
        this.superficie = superficie;
        this.nStanze = nStanze;
        this.nBagni = nBagni;
    }

    public int getSuperficie() {
        return superficie;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "superficie=" + superficie +
                ", Numero di Staze=" + nStanze +
                ", Numero di Bagni=" + nBagni ;
    }
}
