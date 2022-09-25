package oop;

/**
 * @author TingxuanHu
 * @version 2022/9/25 8:55
 */

public class InnerClassExercise {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell(){
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        cellPhone.alarmClock(new Bell(){
            @Override
            public void ring() {
                System.out.println("小伙伴们上课了");
            }
        });

//        Bell bell = new Bell(){
//            @Override
//            public void ring() {
//                System.out.println("懒猪起床了");
//            }
//        };

    }
}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmClock(Bell bell) {
        bell.ring();
    }
}
