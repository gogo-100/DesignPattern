package State;

public class LunchState implements State {
    private static LunchState singleton = new LunchState();
    private LunchState() {                                // 构造函数的可见性是private
    }
    public static State getInstance() {                 // 获取唯一实例
        return singleton;
    }
    public void doClock(Context context, int hour) {    // 设置时间
        if(hour == 12){

        }
        else if (hour < 8 || 21 <= hour) {
            context.changeState(NightState.getInstance());
        }
        else{
            context.changeState(DayState.getInstance());
        }
    }
    public void doUse(Context context) {                // 使用金库
        context.callSecurityCenter("紧急：午餐时间使用金库！");
    }
    public void doAlarm(Context context) {              // 按下警铃
        context.callSecurityCenter("按下警铃(午餐时间)");
        context.changeState(UrgentState.getInstance());
    }
    public void doPhone(Context context) {              // 正常通话
        context.recordLog("午餐时间的通话录音");
    }
    public String toString() {                          // 显示表示类的文字
        return "[午餐]";
    }
}
