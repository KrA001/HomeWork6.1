public class Main {
    public static void main(String[] args){
        Weapon weapon = new Weapon();
        weapon.setWeaponName("assaultRifles");
        weapon.setWeaponType("m16");
        Boss boss = new Boss();
        boss.setHeal(800);
        boss.setWeapon(weapon);
        boss.setDamage(70);
        boss.setSuperAbility("звездный луч");
        System.out.println("Heal - " + boss.getHeal()+ "; " + "damage - " + boss.getDamage()+ " " +
                " Weapon Name - " +  boss.getWeapon().getWeaponName() + "; " + "Wepon Type" + boss.getWeapon().getWeaponType()+ " "
                + "SuperAbility - " + boss.getSuperAbility() );
    }
}