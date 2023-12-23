public class Complexnumber implements Complexble {
    private double real;
    private double mnim;

    public Complexnumber(double real, double mnim) {
        this.real = real;
        this.mnim = mnim;
    }

    public double getReal() {
        return real;
    }

    public double getMnim() {
        return mnim;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setMnim(double mnim) {
        this.mnim = mnim;
    }

    @Override
    public Complexnumber sum(Complexnumber newvalue) {
        double realsum = this.real + newvalue.real;
        double mnimsum = this.mnim + newvalue.mnim;
        return new Complexnumber(realsum,mnimsum);
    }

    @Override
    public Complexnumber multiply(Complexnumber newvalue) {
        double realmult = this.real * newvalue.real - this.mnim * newvalue.mnim;
        double mnimmult = this.real * newvalue.real + this.mnim * newvalue.mnim;
        return new Complexnumber(realmult,mnimmult);
    }

    @Override
    public Complexnumber devided(Complexnumber newvalue) {
        double delitel = newvalue.real * newvalue.real + newvalue.mnim * newvalue.mnim;
        double realdev = (this.real * newvalue.real + this.mnim * newvalue.mnim) / delitel;
        double mnimdev = (newvalue.real * this.mnim - this.real * newvalue.mnim)/ delitel;
        return new Complexnumber(realdev,mnimdev);
    }

    @Override
    public String toString() {
        if ( mnim>=0){
            return real + "+" + mnim + "i";
        }else {
            return real+ "-" + Math.abs(mnim) + "i";
        }
    }
}
