/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-26
 * Time: 19:00
 */
class LeaderHeader {
    String battleContent;

    public void giveCommand(Commander com) {
        com.battle(battleContent);
    }

    public void setBattleContent(String s) {
        battleContent = s;
    }

}
class ShiZhang implements Commander {

    final int MAXSoldierNumber = 1000;
    int soldierNumber = 1;
    String name;

    public ShiZhang(String name) {
        this.name = name;
    }

    @Override
    public void battle(String mess) {
        System.out.println(name+"接到作战命令："+mess);
        System.out.println(name+"指派"+soldierNumber);
        System.out.println(name+"保证完成任务");
    }

    public void setSoldierNumber(int soldierNumber) {
        if(soldierNumber > MAXSoldierNumber) {
            this.soldierNumber = MAXSoldierNumber;
        }else if(soldierNumber < MAXSoldierNumber && soldierNumber > 0) {
            this.soldierNumber = soldierNumber;
        }
    }
}
class LvZhang implements Commander {

    final int MAXSoldierNumber = 800;
    int soldierNumber = 1;
    String name;

    @Override
    public void battle(String mess) {
        System.out.println(name+"接到作战命令："+mess);
        System.out.println(name+"指派"+soldierNumber+"人参与作战");
        System.out.println(name+"保证完成任务");
    }

    public LvZhang(String name) {
        this.name = name;
    }

    public void setSoldierNumber(int soldierNumber) {
        if(soldierNumber > MAXSoldierNumber) {
            this.soldierNumber = MAXSoldierNumber;
        }else if(soldierNumber < MAXSoldierNumber) {
            this.soldierNumber = soldierNumber;
        }
    }
}
public class demo1 {
    public static void main(String[] args) {
        LeaderHeader leaderHeader = new LeaderHeader();
        ShiZhang one1 = new ShiZhang("第一师");
        one1.setSoldierNumber(986);
        leaderHeader.setBattleContent("进攻北城");
        leaderHeader.giveCommand(one1);
        LvZhang one2 = new LvZhang("第一旅");
        one2.setSoldierNumber(567);
        leaderHeader.setBattleContent("在2号公路狙击敌人");
        leaderHeader.giveCommand(one2);
    }
}
