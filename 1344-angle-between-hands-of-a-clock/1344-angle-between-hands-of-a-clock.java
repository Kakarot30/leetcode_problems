class Solution {
    public double angleClock(int hour, int minutes) {
        hour = 30*hour;
        double ans ;
        double bigHand = hour + 0.5*minutes;
        if(bigHand>=360){
            bigHand = bigHand-360;
        }
        double smallHand = 6*minutes;
        // if(smallHand>180){
        //     smallHand = 360-smallHand;
        //     // ans = bigHand+smallHand;
        //     // return ans ;
        // }
        ans = Math.abs(bigHand-smallHand);
        double ans2 = Math.abs(ans-360);
        double res = Math.min(ans,ans2);
        return res;
    }
}