package model;

public class DoanTam {
    private String name;
    private String maso;
    private String mausac;
    private String gia;

    public DoanTam() {
    }

    public DoanTam(String name, String maso, String mausac, String gia) {
        this.name = name;
        this.maso = maso;
        this.mausac = mausac;
        this.gia = gia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
