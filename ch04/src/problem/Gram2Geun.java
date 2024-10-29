package problem;

public class Gram2Geun extends Converter {
    public Gram2Geun(double ratio) {
        this.ratio=ratio;
    }

    @Override
    protected double convert(double src) {
        return src/ratio;
    }

    @Override
    protected String getSrcString() {
        return "그램";
    }

    @Override
    protected String getDestString() {
        return "근";
    }
}
