package testList.tset1;

public class Car {
    private int cid;
    private String cbrand;
    private String cNo;
    private double cprice;

    public Car(int cid, String cbrand, String cNo, double cprice) {
        this.cid = cid;
        this.cbrand = cbrand;
        this.cNo = cNo;
        this.cprice = cprice;
    }

    public Car() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCbrand() {
        return cbrand;
    }

    public void setCbrand(String cbrand) {
        this.cbrand = cbrand;
    }

    public String getcNo() {
        return cNo;
    }

    public void setcNo(String cNo) {
        this.cNo = cNo;
    }

    public double getCprice() {
        return cprice;
    }

    public void setCprice(double cprice) {
        this.cprice = cprice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cid=" + cid +
                ", cbrand='" + cbrand + '\'' +
                ", cNo='" + cNo + '\'' +
                ", cprice=" + cprice +
                '}';
    }
}
