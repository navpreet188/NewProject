public class AustrailainTraffic implements TrafficRules,TrainRules{







    @Override
    public void GreenGo() {
        System.out.println("green go method");
    }

    @Override
    public void RedStop() {
        System.out.println("red stop method");
    }

    @Override
    public void WaitYellow() {

        System.out.println("wait yellow method");
    }
    public  void newRule() {
        System.out.println("implements new rule");


            }
    public static void main(String[] args) {
        TrafficRules d= new AustrailainTraffic();
        TrainRules e= new AustrailainTraffic();

        d.GreenGo();
        d.RedStop();
        d.WaitYellow();
        e.newRule();
    }


}

