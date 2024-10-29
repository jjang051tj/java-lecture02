package problem;

public class Km2Mile extends Converter {
    public Km2Mile(double ratio) {
        this.ratio=ratio;
    }
    @Override
    protected double convert(double src) {
        return src/ratio;
    }
    @Override
    protected String getSrcString() {
        return "km";
    }
    @Override
    protected String getDestString() {
        return "mile";
    }
}
