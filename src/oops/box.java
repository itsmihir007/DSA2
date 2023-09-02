package oops;

public class box {
    double l;
    double h;
    double w;

    box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    box(double side){
        this.l=l;
        this.h=h;
        this.w=w;
    }

    public box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    box(box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;

    }
    public void information(){
        System.out.println("running the boxl");
    }
}
