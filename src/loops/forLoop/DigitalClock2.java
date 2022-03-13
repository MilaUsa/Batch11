package loops.forLoop;

public class DigitalClock2 {
    public static void main(String[] args) {
        label:
        for (int hours = 0; hours < 12; hours++) {

            inner:
            for (int min = 0; min < 60; min++) {
                if(min>=10 && min <=12){
                    continue;

                }

                if(min>=30) {
                    break label;
                }
                for (int sec = 0; sec < 60; sec++) {
                    System.out.println(hours + ":" + min + ":" + sec);
                  if(sec==10)
                    break inner;
                }
            }
        }
    }}
