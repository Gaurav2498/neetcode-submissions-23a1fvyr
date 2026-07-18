class Solution {
    public double myPow(double x, int n) {
        if(n<0) return 1/myPower(x,Math.abs(n));
        else return myPower(x,n);
    }

    private double myPower(double a,double b){
        if(b==0) return 1;

        if(b%2==0) return myPower(a,b/2)*myPower(a,b/2);
        else return myPower(a,b-1)*a;
    }
}
