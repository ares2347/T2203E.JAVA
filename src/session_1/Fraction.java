package session_1;

public class Fraction {
    int numerator;
    int denominator;

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }
    public void print(){
        System.out.println(this.denominator!=0? this.numerator/this.denominator: "400BadRequest");
    }
    public Fraction reduce(){
        Fraction f= new Fraction();
        for(int i=Math.abs(this.numerator)/2; i>0; i--){
            if (this.numerator%i==0 && this.denominator%i==0){
                f.setNumerator(this.numerator/i);
                f.setDenominator(this.denominator/i);
                f.print();
                break;
            }
        }
        return f;
    }

    public Fraction reverse () {
        Fraction f= new Fraction();
        int tmp = getDenominator();
        if (this.numerator!=0)
            f.setDenominator(this.numerator);
        else
            f.setDenominator(0);
        f.setNumerator(tmp);
        f.print();
        return f;
    }

    public Fraction add (Fraction x) {
        Fraction f= new Fraction();
        f.setNumerator(this.numerator* x.getDenominator() + this.denominator*x.getNumerator());
        f.setDenominator(this.denominator*x.getDenominator());
        f.reduce();
        return f;
    }

    public Fraction sub (Fraction x) {
        Fraction f= new Fraction();
        f.setNumerator(this.numerator* x.getDenominator() - this.denominator*x.getNumerator());
        f.setDenominator(this.denominator*x.getDenominator());
        f.reduce();
        return f;
    }
    public Fraction mul (Fraction x) {
        Fraction f= new Fraction();
        f.setNumerator(this.numerator*x.getNumerator());
        f.setDenominator(this.denominator*x.getDenominator());
        f.reduce();
        return f;
    }
    public Fraction div (Fraction x) {
        Fraction f= new Fraction();
        f.setNumerator(this.numerator*x.getDenominator());
        f.setDenominator(this.denominator*x.getNumerator());
        f.reduce();
        return f;
    }
}
