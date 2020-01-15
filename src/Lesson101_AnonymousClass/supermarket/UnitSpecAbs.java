package Lesson101_AnonymousClass.supermarket;

public abstract class UnitSpecAbs {
    private double spec;
    private String producerStr;

    public UnitSpecAbs(double spec, String producer){
        this.spec = spec;
        this.producerStr = producer;
    }

    public double getSpec() {
        return spec;
    }

    public void setSpec(double spec) {
        this.spec = spec;
    }

    public String getProducerStr() {
        return producerStr;
    }

    public void setProducerStr(String producerStr) {
        this.producerStr = producerStr;
    }
}
