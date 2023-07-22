public class Medic extends Hero {

    public int healPoints = 40;


    public void increaseExperience() {
        System.out.println("Now Medic experience = " + (this.healPoints + (this.healPoints * 10) / 100) + " points ");
    }

    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Medic применил суперспособность treatment");
    }
}
