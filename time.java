public class time {
    private  int hour;
    private  int mins;
    private  int secs;
    
    
    
    time(){
        hour = 0;
        mins = 0;
        secs = 0;
    }
    time(int h , int m , int s){
        hour = h;
        mins = m;
        secs = s;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return mins;
    }
    public int getSeconds(){
        return secs;
    }
    public void setHour(int h){
        hour = h;
    } 
    public void setMinute(int m){
        mins=m;
    }
    public void setSeconds(int s){
        secs=s;

    }

    public void display(){
        System.out.println(hour + ":" +mins +":"+secs);
    }
    public void increment(){
        secs++;
        if(secs==60){
            secs=0;
            mins++;
            if (mins == 60){
                mins = 0;
                hour++;
                if (hour == 24){
                    hour = 0;
                }
            }
        }
    }

    public boolean isEqual(time t){
        if(hour == t.hour&& mins == t.mins && secs== t.secs)
            return true;
        else 
                return false;    
                
    }
    public boolean isGreater(time t){
        if (hour > t.hour || hour == t.hour&&mins>t.mins|| hour ==t.hour&& mins==t.mins&& secs>t.secs)
            return true;
        else 
            return false;
    }
}
