public class Main {
    public static void main(String[] args){
        Weapon weapon = new Weapon();
        weapon.setAssaultRifles("assaultRifles");
        weapon.setM16("m16");
        Boss boss = new Boss();
        boss.setHeal(800);
        boss.setDamage(70);
        System.out.println("Heal - " + boss.getHeal()+ "; " + "damage - " + boss.getDamage()+ " " +
                " " +  weapon.getAssaultRifles()+ "; " + weapon.getM16());
    }
}