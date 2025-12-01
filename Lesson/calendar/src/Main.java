import jdk.incubator.vector.VectorOperators;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //实体类 Java web
        String text = "202504_N_0|202505_N_0|202506_1_100|202507_1_500|202508_3_1000|202509_N_2000|202510_4_5000|202511_N_0";

        String[] list = text.split("\\|");

        Status[] status = new Status[list.length];
        User user = new User(status);

        for (int i = 0; i < list.length; i++) {
            String[] items = list[i].split("_");

            status[i] = new Status();
            status[i].setDate(items[0]);
            status[i].setToalFatal(Integer.parseInt(items[2]));

            if(items[1].equals("N"))
            {
                status[i].setFatal(0);
            }
            else
            {
                status[i].setFatal(Integer.parseInt(items[1]));
            }

        }

        user.setStatus(status);

        int number  = 0;
        int big1000 = 0;

        int consistentFatal = 0;

        for(int i = 0; i < user.getStatus().length; i++)
        {
            if(user.getStatus()[i].getFatal() != 0)
            {
                number++;
            }
            if(user.getStatus()[i].getToalFatal() >= 1000)
            {
                big1000+=user.getStatus()[i].getToalFatal();
            }
            if(user.getStatus()[i].getFatal() > consistentFatal)
            {
                consistentFatal=user.getStatus()[i].getFatal();
            }
        }

        System.out.println("累计逾期"+number+"次");
        System.out.println("逾期大于1000元："+big1000+"元");


    }
}